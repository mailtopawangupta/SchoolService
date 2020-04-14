package com.springboot.schoolservice.modal;

public class Teacher {
	private Integer teacherId;
	private String teacherName;
	private String teacherSubject;
	
	public Teacher(Integer teacherId, String teacherName, String teacherSubject) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherSubject = teacherSubject;
	}
	
	public Teacher() {
		
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherSubject() {
		return teacherSubject;
	}

	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}
	
	

}
