package com.miyako.subject.service.redis.key;

import java.io.Serializable;

/**
 * ClassName KeyPrefix
 * Description //TODO
 * Author weila
 * Date 2019-08-08-0008 15:26
 */
public interface KeyPrefix extends Serializable{

    //有效期
    public int expireSeconds();
    //前缀
    public String getPrefix();
}
