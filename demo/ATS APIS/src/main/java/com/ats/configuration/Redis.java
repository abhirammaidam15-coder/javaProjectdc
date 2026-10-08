package com.ats.configuration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.JacksonJsonRedisSerializer;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableCaching
public class Redis {

    @Bean
    public CacheManager cacheManager(
            RedisConnectionFactory connectionFactory) {

        RedisCacheConfiguration cache = cacheConfiguration();

        Map<String, RedisCacheConfiguration> caching = new HashMap<>();

        caching.put(
                "save",
                cache.entryTtl(Duration.ofSeconds(240))
        );

        caching.put(
                "login",
                cache.entryTtl(Duration.ofMinutes(22))
        );

        caching.put(
                "billFinalizer",
                cache.entryTtl(Duration.ofSeconds(220))
        );

        return RedisCacheManager.builder(connectionFactory)
                .cacheDefaults(cache)
                .withInitialCacheConfigurations(caching)
                .build();
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate(
            RedisConnectionFactory connectionFactory) {

        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        return template;
    }

    private RedisCacheConfiguration cacheConfiguration() {

        return RedisCacheConfiguration
                .defaultCacheConfig()
                .serializeValuesWith(
                        RedisSerializationContext.SerializationPair.fromSerializer(
                                new GenericJackson2JsonRedisSerializer()
                        )
                );
    }
}

