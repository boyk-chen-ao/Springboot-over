package com.mybatis.code.demo.config.redis;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@EnableCaching // 缓存配置
public class RedisConfig extends CachingConfigurerSupport{

    /**
     * 在实际使用中，我们大多不会直接使用RedisTemplate<Object,Object>，而是会对key,value进行序列化，所以我们还需要新增一个配置类
     */

    // 新增配置类生成自定义序列化的RedisTemplate
    @Bean("objectRedisTemplate")
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<String,Object> template = new RedisTemplate<>();

        Jackson2JsonRedisSerializer<Object> value = new Jackson2JsonRedisSerializer<Object>(Object.class);

        template.setValueSerializer(value);
        template.setHashValueSerializer(value);

        template.setKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());

        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }

}
