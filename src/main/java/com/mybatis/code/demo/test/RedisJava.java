package com.mybatis.code.demo.test;

import redis.clients.jedis.Jedis;

/**
 * E:\redis>redis-cli.exe -h 127.0.0.1 -p 6379
 * 127.0.0.1:6379>
 * 127.0.0.1:6379> set myKey abc
 * OK
 * 127.0.0.1:6379> get myKey
 * "abc"
 * 127.0.0.1:6379>
 */
public class RedisJava {
    public static void main(String[] args) {
        String S = new String();
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("myKey"));
    }
}
