package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	@PostMapping(value="/studentinsert")
	public Student m1(@RequestBody Student s) {
		return ss.save(s);
	}
	
	@GetMapping(value = "/displayallstudent")
	public List<Student> m2(){
		return ss.findAll();
	}
	
	@DeleteMapping(value="/deletebyid/{id}")
	public int m3(@PathVariable int id) {
		return ss.deleteById(id);
	}
	
	@PutMapping(value = "/studentupdate/{Id}")
	public Student updateUser(@PathVariable int Id, @RequestBody Student updatedStudent) {
	    updatedStudent.setId(Id);
	    return ss.save(updatedStudent);
	}
}
