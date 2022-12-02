package com.subhamb.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.subhamb.sms.entity.Student;
import com.subhamb.sms.repository.StudentRepository;
import com.subhamb.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {

		
		return studentRepository.findAll();
	}

}
