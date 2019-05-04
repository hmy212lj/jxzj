package com.lj.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lj.bean.Student;
import com.lj.bean.StudentExample;
import com.lj.bean.Teacher;
import com.lj.bean.StudentExample.Criteria;
import com.lj.dao.StudentMapper;
import com.lj.dao.TeacherMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapperTest {

	@Autowired
	StudentMapper studentmapper;
	@Autowired
	SqlSession sqlsession;
	@Autowired
	TeacherMapper teachermapper;

	@Test
	public void test() {
	//	studentmapper.insertSelective(new Student(null, "123", "5", "123456", "123456", 5));
		//System.out.println(teachermapper);
	//	System.out.println(teachermapper);
/*	StudentMapper mapper=sqlsession.getMapper(StudentMapper.class);
		/*for(int i=0;i<100;i++){
			String uid=UUID.randomUUID().toString().substring(0,5);
			mapper.insertSelective(new Student(null, uid, "5", uid+"@ssmlj.com", "123456", 6));
			
		}
*/   
		//System.out.println(studentmapper.selectByPrimaryKey(5).getStudentNumbert());
		Student student=studentmapper.selectByName("demo1");
		//System.out.println(studentmapper);
		//Teacher teacher=teachermapper.selectByCount("liuhao");
      // Teacher teacher=teachermapper.selectByCount("liuhao");
     
   //   System.out.println(teacher.getTeacherNum());
		
		System.out.println(111111);
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		//criteria.andNameEqualTo(name); 
		String name1 = "%liu%";
		criteria.andTNameLike(name1);
		
		System.out.println(studentmapper.selectByExample(example));	
	}
}
