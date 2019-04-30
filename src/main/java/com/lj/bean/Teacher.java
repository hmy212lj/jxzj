package com.lj.bean;

public class Teacher {
    private Integer tIds;

    private String teacherName;

    private String teacherCount;

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

    public String getTeacherCount() {
        return teacherCount;
    }

    public void setTeacherCount(String teacherCount) {
        this.teacherCount = teacherCount == null ? null : teacherCount.trim();
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