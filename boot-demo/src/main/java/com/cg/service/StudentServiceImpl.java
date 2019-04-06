package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.StudentDAO;
import com.cg.entites.Student;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired  
	StudentDAO dao;
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
     dao.save(student);
	}

	@Override
	public Student findById(Integer studentId) {
		// TODO Auto-generated method stub
		Optional<Student>stu= dao.findById(studentId);
		return stu.get();
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
     Optional<Student>stu=dao.findById(student.getStudentId());
     if(stu.isPresent()) {
    	 dao.save(student);
 	}
     }
     

	@Override
	public void delete(Integer studentId) {
		// TODO Auto-generated method stub
      Optional<Student>stu=dao.findById(studentId);
      if(stu.isPresent()) {
    	  dao.deleteById(studentId);
      }
    	 
	}

	@Override
	public List<Student> findAll() {
		System.out.println("Invoking dao.findAll");
		return dao.findAll();
	}

}
