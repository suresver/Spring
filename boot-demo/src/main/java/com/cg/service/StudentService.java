package com.cg.service;

import java.util.List;

import com.cg.entites.Student;


public interface StudentService {

	public void save(Student student);
	public Student findById(Integer studentId);
	public void update(Student student);
	public void delete(Integer studentId);
	public List<Student> findAll(); 
}
