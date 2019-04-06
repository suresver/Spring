package com.cg.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stu")
public class Student {

	@Id
	@Column(name="STUDENTID")
	private Integer studentId;
	
	@Column(name="STUDENTNAME")
	private String studentName;
	
	@Column(name="STUDENTCITY")
	private String studentCity;
	
	@Column(name="CODE")
	private Integer code;

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Student(Integer studentId, String studentName, String studentCity, Integer code) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.code = code;
	}



	public Integer getStudentId() {
		return studentId;
	}


	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentCity() {
		return studentCity;
	}


	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}


	public Integer getCode() {
		return code;
	}


	public void setCode(Integer code) {
		this.code = code;
	}

		
}
