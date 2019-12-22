package com.mybatis.code.demo.mapper;

import com.mybatis.code.demo.DemoApplicationTests;
import com.mybatis.code.demo.entity.SysUser;
import com.mybatis.code.demo.entity.TestUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class TestUserMapper extends DemoApplicationTests {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    public void testExtends(){
        System.out.println("继承成功!-----------------");
    }

    @Test
    public void testInsertUserGetId(){
        SysUser user = new SysUser();
        user.setUserName ("test_l");
        user.setUserPassword ("123456");
        user.setUserEmail ("test@mybatis.tk") ;
        user.setUserinfo ("test info");
        user.setHeadimg(new byte[] {1 , 2 , 3});
        user.setCreateTime(new Date());

        int result = userMapper.insertUser(user);
        Assert.assertNotNull(user.getId());
        System.out.println(user.getId());
    }

    @Test
    public void testDeleteById(){

        int result = userMapper.deleteById(1036L);

    }

    @Test
    public void testUser(){

        TestUser user = new TestUser();
        user.setName("AnyCode");
        user.setAge(20);
        System.err.println(user.toString());

    }
}
