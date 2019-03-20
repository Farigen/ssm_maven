package com.mybatis.domain;

/**
 * @program: ssm_1
 * @description: Student
 * @author: Mr.Wang
 * @create: 2019-03-19 22:05
 **/
public class Student {
    private Integer stuid;
    private  String name;
    private Integer Chinese;
    private Integer Math;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChinese() {
        return Chinese;
    }

    public void setChinese(Integer chinese) {
        Chinese = chinese;
    }

    public Integer getMath() {
        return Math;
    }

    public void setMath(Integer math) {
        Math = math;
    }
}
