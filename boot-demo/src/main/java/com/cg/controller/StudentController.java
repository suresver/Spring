package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entites.Student;
import com.cg.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired private StudentService service;
	
	@RequestMapping("/find")
	public Student findById(@RequestParam("studentId") Integer studentId) {
		return service.findById(studentId);
	}
	
	@RequestMapping("/find-all")
	public List<Student> findAll(){
		return service.findAll();
	}
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST, consumes="application/json")
	public ResponseEntity<String> save(@RequestBody Student student){
		try {
			service.save(student);
			return new ResponseEntity<>("Response Saved!", HttpStatus.OK);
		}catch(Exception ex) {
			return new ResponseEntity<>("Response can not Save!"+ex.getMessage(),HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping("/update")
	
	public ResponseEntity <String> update(@RequestBody Student student){
		try {
			service.save(student);
			return new ResponseEntity<>("Response updated!",HttpStatus.OK);
			
		}catch(Exception ex) {
			return new ResponseEntity<>("Response can Not update!"+ex.getMessage(),HttpStatus.CONFLICT);
		}
	}
	
	@DeleteMapping("/delete")
	
	public ResponseEntity<String> delete(@RequestParam("stuId") Integer studentId){
		try {
			service.delete(studentId);
			return new ResponseEntity<>("Data Deleted",HttpStatus.OK);
		}catch(Exception ex) {
			return new ResponseEntity<>("Data not Deleted!"+ex.getMessage(),HttpStatus.CONFLICT);
		}
		
	}
}
