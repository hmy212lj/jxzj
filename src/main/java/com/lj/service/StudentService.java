package com.lj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lj.bean.*;
import com.lj.dao.StudentMapper;;

@Service
public class StudentService {

	@Autowired
	StudentMapper studentmapper;

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentmapper.selectByExample(null);
	}

}
