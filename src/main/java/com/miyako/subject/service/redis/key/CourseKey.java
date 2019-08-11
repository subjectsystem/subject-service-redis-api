package com.miyako.subject.service.redis.key;

/**
 * ClassName CourseKey
 * Description //TODO
 * Author weila
 * Date 2019-08-08-0008 15:43
 */
public class CourseKey extends Prefix{

    public static final int TOKEN_EXPIRE=3600*24*2;//3600S*24*2    =2天

    public CourseKey(int expireSeconds,String prefix) {
        super(expireSeconds,prefix);
    }
    //所有课表
    public static CourseKey getCourselist=new CourseKey(0,"courselist");
    //对象缓存一般没有有效期，永久有效
    public static CourseKey getCourseStudentById=new CourseKey(0,"courseStudent_id");

    public static CourseKey getCourseSurplus = new CourseKey(0, "course_surplus");

    public static CourseKey getCourseById= new CourseKey(0,"course_id");

}
