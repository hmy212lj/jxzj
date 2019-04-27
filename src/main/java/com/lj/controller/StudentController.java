package com.lj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lj.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lj.bean.*;

/**
 * 处理学生增删改查
 * 
 * @author liu
 *
 */

@Controller
public class StudentController {
	@Autowired
	StudentService studentservice;

	/**
	 * 查询学生数据
	 * 
	 * @return
	 */
	/**
	 * 导入jackson包 
	 * @param pn
	 * @return
	 */
	@RequestMapping(value="/stus")
	@ResponseBody
	public Msg getstujson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 10);
		// startpage紧跟的查询时分页查询
		List<Student> stu = studentservice.getAll();
		// 封装了详细的分页信息
		PageInfo page = new PageInfo(stu,5);
		return Msg.success().add("pageInfo", page);
	}

/*	// @RequestMapping(value="/stus")
	public String getStu(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		// 这不是分页查询，
		// 引入pagehelper分页
		// 查询之前
		PageHelper.startPage(pn, 10);
		// startpage紧跟的查询时分页查询
		List<Student> stu = studentservice.getAll();
		// 封装了详细的分页信息
		PageInfo page = new PageInfo(stu, 10);
		model.addAttribute("pageInfo", page);
		return "list";
	}*/
}
