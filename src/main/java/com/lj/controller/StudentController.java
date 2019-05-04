package com.lj.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lj.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lj.bean.*;

/**
 * @author liu
 *
 */

@Controller
public class StudentController {
	@Autowired
	StudentService studentservice;

	@ResponseBody
	@RequestMapping(value = "/addstu", method = RequestMethod.POST)
	public Msg saveStu(Student student) {
		studentservice.saveStu(student);
		return Msg.success();
	}

	@ResponseBody
	@RequestMapping(value = "/stu/{id}", method = RequestMethod.GET)
	public Msg getStu(@PathVariable("id") Integer id) {
		Student student = studentservice.getStu(id);
		return Msg.success().add("stu", student);
	}

	/**
	 * ��ѯѧ������
	 * 
	 * @return
	 */
	/**
	 * ����jackson��
	 * 
	 * @param pn
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/delstu/{id}", method = RequestMethod.DELETE)
	public Msg deleteStuById(@PathVariable("id") Integer id) {
		studentservice.deleteStu(id);
		return Msg.success();
	}

	@RequestMapping(value = "/stus", method = RequestMethod.GET)
	@ResponseBody
	public Msg getstujson(@RequestParam(value = "pn", defaultValue = "1") Integer pn,String tName) {
		PageHelper.startPage(pn, 10);
		System.out.println(tName);
		List<Student> stu=new ArrayList<Student>();
        if("".equals(tName)){
		stu = studentservice.getAll();
        }
        else {
        	System.out.println(222222);
        	 stu = studentservice.selectAllName(tName);
        }
        

		PageInfo page = new PageInfo(stu, 5);
		return Msg.success().add("pageInfo", page);
	}

	/**
	 * 检查用户名是否可用
	 * 
	 * @param name
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/checkuser")
	public Msg checkhuser(@RequestParam("stuName") String stuName) {
		System.out.println(stuName);
		boolean b = studentservice.checkUser(stuName);
		if (!b) {
			return Msg.success();
		} else
			return Msg.fail();

	}
/**
 * 学生登陆
 * @param login_name
 * @param login_password
 * @param request
 * @return
 */
	   @RequestMapping(value="loginstu",method=RequestMethod.POST)
	    @ResponseBody
	    public Map<String,Object> login(String login_name,String login_password,HttpServletRequest request){
	        return studentservice.loginValid(login_name, login_password, request);
	    }

	/**
	 * 保存学生
	 */
	@ResponseBody
	@RequestMapping(value = "/stu/{id}", method = RequestMethod.PUT)
	public Msg saveStus(Student student) {
		System.out.println(student);
		studentservice.updata(student);
		return Msg.success();
	}
	/*
	 * @RequestMapping(value="/stus") public String getStu(@RequestParam(value =
	 * "pn", defaultValue = "1") Integer pn, Model model) { // �ⲻ�Ƿ�ҳ��ѯ�� //
	 * ����pagehelper��ҳ // ��ѯ֮ǰ PageHelper.startPage(pn, 10); //
	 * startpage�����Ĳ�ѯʱ��ҳ��ѯ List<Student> stu = studentservice.getAll(); //
	 * ��װ����ϸ�ķ�ҳ��Ϣ PageInfo page = new PageInfo(stu, 10);
	 * model.addAttribute("pageInfo", page); return "list"; }
	 */

}
