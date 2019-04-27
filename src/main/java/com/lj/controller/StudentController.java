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
 * ����ѧ����ɾ�Ĳ�
 * 
 * @author liu
 *
 */

@Controller
public class StudentController {
	@Autowired
	StudentService studentservice;

	/**
	 * ��ѯѧ������
	 * 
	 * @return
	 */
	/**
	 * ����jackson�� 
	 * @param pn
	 * @return
	 */
	@RequestMapping(value="/stus")
	@ResponseBody
	public Msg getstujson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 10);
		// startpage�����Ĳ�ѯʱ��ҳ��ѯ
		List<Student> stu = studentservice.getAll();
		// ��װ����ϸ�ķ�ҳ��Ϣ
		PageInfo page = new PageInfo(stu,5);
		return Msg.success().add("pageInfo", page);
	}

/*	// @RequestMapping(value="/stus")
	public String getStu(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		// �ⲻ�Ƿ�ҳ��ѯ��
		// ����pagehelper��ҳ
		// ��ѯ֮ǰ
		PageHelper.startPage(pn, 10);
		// startpage�����Ĳ�ѯʱ��ҳ��ѯ
		List<Student> stu = studentservice.getAll();
		// ��װ����ϸ�ķ�ҳ��Ϣ
		PageInfo page = new PageInfo(stu, 10);
		model.addAttribute("pageInfo", page);
		return "list";
	}*/
}
