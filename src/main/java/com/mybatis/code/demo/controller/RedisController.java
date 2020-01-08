package com.mybatis.code.demo.controller;

import com.mybatis.code.demo.entity.Admin;
import com.mybatis.code.demo.entity.SysUser;
import com.mybatis.code.demo.entity.User;
import com.mybatis.code.demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
public class RedisController {

    // 在SpringBoot2.0之后，spring容器是自动的生成了StringRedisTemplate和RedisTemplate<Object,Object>，可以直接注入
    /**
     * StringRedisTemplate与RedisTemplate:
     *
     * 1.两者的关系是StringRedisTemplate继承RedisTemplate。
     * 2.两者的数据是不共通的；也就是说StringRedisTemplate只能管理StringRedisTemplate里面的数据，RedisTemplate只能管理RedisTemplate中的数据。
     * 3.SDR默认采用的序列化策略有两种，一种是String的序列化策略，一种是JDK的序列化策略。
     *   StringRedisTemplate默认采用的是String的序列化策略，保存的key和value都是采用此策略序列化保存的。
     *   RedisTemplate默认采用的是JDK的序列化策略，保存的key和value都是采用此策略序列化保存的。
     */
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    // 自定义的redisTemplate<String,Object>
    @Autowired
    @Qualifier("objectRedisTemplate")
    private RedisTemplate<String,Object> redisTemplateObject;

    @Autowired(required=false)
    private UserMapper userMapper;

    /**
     * 插入key，value形如： <String,String>类型
     */
    @GetMapping("/redisSetString")
    public Object redisSetString(){
        stringRedisTemplate.opsForValue().set("aaa", "111");

        // 打印数据：111
        System.out.println(stringRedisTemplate.opsForValue().get("aaa"));
        return "插入redis-String成功！";
    }

    /**
     * 不进行序列化，redis中存的值：
     * key：\xAC\xED\x00\x05t\x00\x04user
     * value：\xAC\xED\x00\x05sr\x00!com.mybatis.code.demo.entity.User\x8A\xDC\x17\x12[+:u\x02\x00\x03L\x00\x03aget\x00\x13Ljava/lang/Integer;L\x00\x02idt\x00\x10Ljava/lang/Long;L\x00\x04namet\x00\x12Ljava/lang/String;xpsr\x00\x11java.lang.Integer\x12\xE2\xA0\xA4\xF7\x81\x878\x02\x00\x01I\x00\x05valuexr\x00\x10java.lang.Number\x86\xAC\x95\x1D\x0B\x94\xE0\x8B\x02\x00\x00xp\x00\x00\x00\x12sr\x00\x0Ejava.lang.Long;\x8B\xE4\x90\xCC\x8F#\xDF\x02\x00\x01J\x00\x05valuexq\x00~\x00\x06\x00\x00\x00\x00\x00\x00\x00\x01t\x00\x03Csa
     */
    @GetMapping("/redisSetUser")
    public Object redisSetUser(){

        User user = new User();
        user.setId(1L);
        user.setAge(18);
        user.setName("Csa");
        System.out.println(user.toString());

        redisTemplate.opsForValue().set("user",user);

        // 插入redis中的值为对象的toString();
        // 打印出的值：User{id=1, name='Csa', age=18}
        System.out.println( redisTemplate.opsForValue().get("user"));

        return "插入redis-User成功！";
    }

    /**
     * 进行序列化后的，redis中存储的值：
     * key：Admin
     * value：{
     *   "username": "Csa",
     *   "password": "123456"
     * }
     */
    @GetMapping("/redisSetObject")
    public Object redisSetObject(){

        User user = new User();
        user.setId(1L);
        user.setAge(18);
        user.setName("Csa");

        Admin admin = new Admin();
        admin.setPassword("123456");
        admin.setUsername("Csa");

        redisTemplateObject.opsForValue().set("Object",user);
        redisTemplateObject.opsForValue().set("Admin",admin);

        System.out.println( redisTemplateObject.opsForValue().get("Object"));
        System.out.println( redisTemplateObject.opsForValue().get("Admin"));

        return "插入redis-Object成功！";
    }

    /**
     * 查看数据是从redis 还是 mysql 中获取；
     * 设置数据过期时间为1min，过了1min数据会从redis中消失
     */
    @GetMapping("/redisGetFrom")
    public Object redisGetFrom(){

        //查询缓存中是否存在
        boolean hasKey = redisTemplateObject.hasKey("userEntity");

        // 获取缓存数据
        if (hasKey){
            Object object = redisTemplateObject.opsForValue().get("userEntity");
            log.info("从缓存获取的数据"+ object);
        }
        // 获取数据库数据
        else {
            //从数据库中获取信息
            User userEntity = userMapper.queryUserById(5L);
            log.info("从数据库中获取数据"+ userEntity);
            // 数据插入缓存（set中的参数含义：key值，user对象，缓存存在时间10（long类型），时间单位）
            redisTemplateObject.opsForValue().set("userEntity",userEntity,1L, TimeUnit.MINUTES);
            log.info("数据插入缓存" + userEntity);
        }
        return "查看数据是从redis 还是 mysql 中获取";
    }

    // List
    // leftPush(K key, V value)
    @GetMapping("/redisSetList")
    public Object redisSetList(){
        List<SysUser> sysUser=userMapper.querySysUser();
        redisTemplateObject.opsForList().leftPush("sysUserList",sysUser);
        redisTemplateObject.opsForList().leftPush("sysUserList",1);
        return "";
    }

    // Hash
    // put(H key, HK hashKey, HV value)
    @GetMapping("/redisSetHash")
    public Object redisSetHash(){
        User user = new User();
        user.setId(1L);
        user.setAge(18);
        user.setName("Csa");

        redisTemplateObject.opsForHash().put("HashValue","user",user);
        redisTemplateObject.opsForHash().put("HashValue","user2",user);

        redisTemplateObject.opsForHash().put("HashValue","userId",user.getId());
        redisTemplateObject.opsForHash().put("HashValue","userAge",user.getAge());
        redisTemplateObject.opsForHash().put("HashValue","userName",user.getName());

        return redisTemplateObject.opsForHash().get("HashValue","user");
    }

    // Set
    // add(K key, V... values)
    @GetMapping("/redisSetSet")
    public Object redisSetSet(){
        User user = new User();
        user.setId(1L);
        user.setAge(18);
        user.setName("Csa");

        redisTemplateObject.opsForSet().add("SetValue","1","2","3",user);

        return null;
    }

    // ZSet
    // add(K key, V value, double score)
    @GetMapping("/redisSetZSet")
    public Object redisSetZSet(){
        User user = new User();
        user.setId(1L);
        user.setAge(18);
        user.setName("Csa");

        redisTemplateObject.opsForZSet().add("ZSetValue","1",1);
        redisTemplateObject.opsForZSet().add("ZSetValue",user,2);
        redisTemplateObject.opsForZSet().add("ZSetValue","7",2);
        redisTemplateObject.opsForZSet().add("ZSetValue","2",4);

        return redisTemplateObject.opsForZSet().rangeByScore("ZSetValue",1,2);
    }

    /**
     * 测试取User对象的速度
     */
    @GetMapping("/programSpeedTest")
    public Object programSpeedTest(){
        User user = new User();
        user.setId(1L);
        user.setAge(18);
        user.setName("Csa");

        // 字符串json格式获取速度
        long start = System.currentTimeMillis();
        redisTemplateObject.opsForValue().set("stringJsonUser",user);
        System.out.println("字符串json格式获取:"+redisTemplateObject.opsForValue().get("stringJsonUser"));
        long end = System.currentTimeMillis();
        System.out.println("字符串json格式获取总时间："+(end-start)+"ms");

        // Hash方式存放对象获取速度
        long startHash = System.currentTimeMillis();
        redisTemplateObject.opsForHash().put("HashValueUser","user",user);
        System.out.println("Hash方式存放对象获取"+redisTemplateObject.opsForHash().get("HashValueUser","user"));
        long endHash = System.currentTimeMillis();
        System.out.println("Hash方式存放对象获取总时间："+(endHash-startHash)+"ms");

        /**
         * 字符串json格式获取:{id=1, name=Csa, age=18}
         * 字符串json格式获取总时间：489
         * Hash方式存放对象获取{id=1, name=Csa, age=18}
         * Hash方式存放对象获取总时间：11
         */
        // 测试结果：Hash方式存放对象，对象的获取速度更快！！！

        return null;
    }

}
