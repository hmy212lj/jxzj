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
	// ����spring mvc��ioc
	@Autowired
	WebApplicationContext context;
	// ����mvc���󣬻�ȡ������
	MockMvc mockmvc;

	// ģ���ȡ����
	@Before
	public void initmockmvc() {
		mockmvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	// ��д���Է�ҳ�ķ���
	@Test
	public void testPage() throws Exception {
		MvcResult result = mockmvc.perform(MockMvcRequestBuilders.get("/stus").param("pn", "1")).andReturn();
	    //
		MockHttpServletRequest request=result.getRequest();
		PageInfo pi=(PageInfo)request.getAttribute("pageInfo"); 
		System.out.println(pi.getTotal());
	}
}
