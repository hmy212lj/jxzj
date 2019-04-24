package com.lj.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageInfo;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
		"file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml" })
public class MvcTest {
	// 传入spring mvc的ioc
	@Autowired
	WebApplicationContext context;
	// 虚拟mvc请求，获取处理结果
	MockMvc mockmvc;

	// 模拟获取请求
	@Before
	public void initmockmvc() {
		mockmvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	// 编写测试分页的方法
	@Test
	public void testPage() throws Exception {
		MvcResult result = mockmvc.perform(MockMvcRequestBuilders.get("/stus").param("pn", "1")).andReturn();
	    //
		MockHttpServletRequest request=result.getRequest();
		PageInfo pi=(PageInfo)request.getAttribute("pageInfo"); 
		System.out.println(pi.getTotal());
	}
}
