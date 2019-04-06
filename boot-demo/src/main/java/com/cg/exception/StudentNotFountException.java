package com.cg.exception;

public class StudentNotFountException extends RuntimeException {

	public StudentNotFountException(int code) {
		// TODO Auto-generated constructor stub
		super("Student by id"+code+"not found");
	}
	
}
