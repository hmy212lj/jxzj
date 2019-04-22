package com.lj.bean;

import java.util.Date;

public class Teacher {
    private Integer tIds;

    private String teacherName;

    private Date teacherBir;

    private String teacherDept;

    private String teacherNum;

    private String teacherEmils;

    public Integer gettIds() {
        return tIds;
    }

    public void settIds(Integer tIds) {
        this.tIds = tIds;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Date getTeacherBir() {
        return teacherBir;
    }

    public void setTeacherBir(Date teacherBir) {
        this.teacherBir = teacherBir;
    }

    public String getTeacherDept() {
        return teacherDept;
    }

    public void setTeacherDept(String teacherDept) {
        this.teacherDept = teacherDept == null ? null : teacherDept.trim();
    }

    public String getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        this.teacherNum = teacherNum == null ? null : teacherNum.trim();
    }

    public String getTeacherEmils() {
        return teacherEmils;
    }

    public void setTeacherEmils(String teacherEmils) {
        this.teacherEmils = teacherEmils == null ? null : teacherEmils.trim();
    }
}