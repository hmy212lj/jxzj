package com.lj.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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

	public Map<String, Object> loginValid(String login_name, String login_password, HttpServletRequest request) {
		 Student stu=studentmapper.selectByName(login_name);
		  Map<String, Object> map=new HashMap<String, Object>();
		  if(stu==null){
	            map.put("status", "userNameOrPwdError");
		  }
		  if(stu!=null&&!"".equals(stu.getId())){
	            map.put("status", "ok");
	            map.put("student", stu);
	            request.getSession().setAttribute("stu", stu);
	        }
		   return map;
	
	}

}
