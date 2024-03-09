package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {
	Student save(Student s);
	List<Student> findAll();
	int deleteById(int Id);
}
