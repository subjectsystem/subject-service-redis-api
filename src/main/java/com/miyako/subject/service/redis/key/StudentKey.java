package com.miyako.subject.service.redis.key;

/**
 * ClassName StudentKey
 * Description //TODO
 * Author weila
 * Date 2019-08-08-0008 15:41
 */
public class StudentKey extends Prefix{

    public static final int TOKEN_EXPIRE=3600*24*2;//3600S*24*2    =2天

    public StudentKey(int expireSeconds,String prefix) {
        super(expireSeconds,prefix);
    }
    //根据登陆token获取学生信息
    public static StudentKey token=new StudentKey(TOKEN_EXPIRE,"student_token");
    //对象缓存一般没有有效期，永久有效
    public static StudentKey getById=new StudentKey(0,"student_id");
}
