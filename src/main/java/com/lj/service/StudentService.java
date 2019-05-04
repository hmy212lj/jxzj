package com.lj.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lj.bean.*;
import com.lj.bean.StudentExample.Criteria;
import com.lj.dao.StudentMapper;;

@Service
public class StudentService {

	@Autowired
	StudentMapper studentmapper;

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentmapper.selectByExample(null);
	}

/*	public Map<String, Object> loginValid(String login_name, String login_password, HttpServletRequest request) {
		Student stu = studentmapper.selectByName(login_name);
		Map<String, Object> map = new HashMap<String, Object>();
		if (stu == null) {
			map.put("status", "userNameOrPwdError");
		} else if (!stu.gettPassword().equals(login_password)) {
			map.put("status", "userNameOrPwdError");
		} else if (!"".equals(stu.getId())) {
			map.put("status", "ok");
			map.put("student", stu);
			request.getSession().setAttribute("stu", stu);
		}
		return map;

	}*/

	/**
	 * 学生保存方法
	 * 
	 * @param student
	 */
	public void saveStu(Student student) {
		studentmapper.insertSelective(student);
	}

	public boolean checkUser(String value) {
		// TODO Auto-generated method stub
		System.out.println(value);
       StudentExample example=new StudentExample();
       Criteria criteria = example.createCriteria();
       long count = studentmapper.countByExample(example);
       return count == 0;
	}

	public Student getStu(Integer id) {
		Student stu=studentmapper.selectByPrimaryKey(id);
		return stu;
	}
/**
 * 学生更新
 * @param student
 */

public void updata(Student student) {
	// TODO Auto-generated method stub
	studentmapper.updateByPrimaryKeySelective(student);
}

/**
 * 员工删除
 * @param id
 */
public void deleteStu(Integer id) {
	// TODO Auto-generated method stub
	studentmapper.deleteByPrimaryKey(id);
}
/**
 * 登陆校验
 * @param login_name
 * @param login_password
 * @param request
 * @return
 */
public Map<String, Object> loginValid(String login_name, String login_password, HttpServletRequest request) {
	 Student stu=studentmapper.selectByName(login_name);
	  Map<String, Object> map=new HashMap<String, Object>();
	  System.out.println(login_name);
	  if(stu==null){
		  
           map.put("status", "userNameOrPwdError");
	  }
	  else if(!stu.gettPassword().equals(login_password)){
		  map.put("status", "userNameOrPwdError");
	  }
	  else if(stu.getId()!=null){
           map.put("status", "ok");
           map.put("student", stu);
           request.getSession().setAttribute("stu", stu);
       }
	   return map;

}

public List<Student> selectAllName(String name) {
System.out.println(111111);
	StudentExample example = new StudentExample();
	Criteria criteria = example.createCriteria();
	//criteria.andNameEqualTo(name); 
	String name1 = "%"+name+"%";
	criteria.andTNameLike(name1);
	return studentmapper.selectByExample(example);
}

}
