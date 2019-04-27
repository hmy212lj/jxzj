package com.lj.bean;

public class Student {
    public Student() {
		super();
		
	}

	public Student(Integer id, String tName, String studentClass, String studentNumbert, String tPassword,
			Integer teaId) {
		super();
		this.id = id;
		this.tName = tName;
		this.studentClass = studentClass;
		this.studentNumbert = studentNumbert;
		this.tPassword = tPassword;
		this.teaId = teaId;
	}

	private Integer id;

    private String tName;

    private String studentClass;

    private String studentNumbert;

    private String tPassword;

    private Integer teaId;
    
    private Teacher teacher;

    public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass == null ? null : studentClass.trim();
    }

    public String getStudentNumbert() {
        return studentNumbert;
    }

    public void setStudentNumbert(String studentNumbert) {
        this.studentNumbert = studentNumbert == null ? null : studentNumbert.trim();
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword == null ? null : tPassword.trim();
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }
}