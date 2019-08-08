package com.miyako.subject.service.redis.key;

/**
 * ClassName Prefix
 * Description //TODO
 * Author weila
 * Date 2019-08-08-0008 15:40
 */
public abstract class Prefix implements KeyPrefix{
    //redis存储格式：key:prefix
    //              value:字段值，用'-'字符分割

    private int expireSeconds;
    private String prefix;

    public Prefix() {

    }
    public Prefix(String prefix) {
        //this(0, prefix);//默认使用0，不会过期
        this.expireSeconds=0;
        this.prefix=prefix;
    }
    public Prefix(int expireSeconds,String prefix) {//覆盖了默认的构造函数
        this.expireSeconds=expireSeconds;
        this.prefix=prefix;
    }
    //默认为0代表永不过期
    public int expireSeconds() {
        return expireSeconds;
    }

    //前缀为类名:+prefix
    public String getPrefix() {
        String className=getClass().getSimpleName();
        return className+":"+prefix;
    }
}
