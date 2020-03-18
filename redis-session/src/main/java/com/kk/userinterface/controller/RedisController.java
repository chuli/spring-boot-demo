package com.kk.userinterface.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: kk
 * @Date: 2020-03-18 11:34
 */

@RestController
@RequestMapping("/redis")
public class RedisController {

    private final String cacheKey = "redis:cache:key:userid";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/stringset")
    public String stringSetAction(@RequestParam String key, @RequestParam String value) {
        stringRedisTemplate.opsForValue().set(key, value);
        return stringRedisTemplate.opsForValue().get(key);
    }

    @RequestMapping("/cache")
    @Cacheable(value = cacheKey)
    public String cacheIndex() {
        System.out.println("set cache");
        return "set cache";
    }

    @RequestMapping("/put")
    @CachePut(value = cacheKey)
    public String putAction() {
        System.out.println("update cache");
        return "update cache";
    }

    @RequestMapping("/del")
    @CacheEvict(value = cacheKey)
    public String delAction() {
        System.out.println("delete cache");
        return "delete cache";
    }
}
