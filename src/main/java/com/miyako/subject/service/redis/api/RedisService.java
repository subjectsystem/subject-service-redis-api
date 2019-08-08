package com.miyako.subject.service.redis.api;

import com.miyako.subject.service.redis.key.KeyPrefix;

/**
 * ClassName RedisService
 * Description //TODO
 * Author weila
 * Date 2019-08-08-0008 15:26
 */
public interface RedisService{

    public <T> T get(KeyPrefix prefix, String key, Class data); // 根据key取得缓存中值（根据传入的前缀）
    public boolean delete(KeyPrefix prefix,String key); // 删除key
    public <T> boolean set(KeyPrefix prefix,String key,T value); // 根据key设置缓存中值
    public Long decr(KeyPrefix prefix,String key); // 自减
    public Long incr(KeyPrefix prefix,String key); //	自增
    public boolean exitsKey(KeyPrefix prefix,String key); // 是否存在key
    public <T> boolean set(String key,T value);
    public <T> T get(String key,Class<T> data);
}
