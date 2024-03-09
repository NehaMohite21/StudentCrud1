package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao sd;

	
	public Student save(Student s) {
		
		return sd.save(s);
	}

	
	public List<Student> findAll() {
		
		return sd.findAll();
	}

	
	public int deleteById(int Id) {
		
		return sd.deleteById(Id);
	}
	
}
