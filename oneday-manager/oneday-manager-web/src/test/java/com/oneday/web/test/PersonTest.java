package com.oneday.web.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oneday.mapper.PersonMapper;
import com.oneday.pojo.PersonExample;

public class PersonTest {

	@Test
	public void test() {
		// 创建一个spring容器
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext-*.xml");
		// 从spring容器中获得Mapper的代理对象t
		PersonMapper mapper = applicationContext.getBean(PersonMapper.class);
		PersonExample example = new PersonExample();
		System.out.println(mapper.selectByExample(example));
		/*
		 * List<Person> list=Service.findAll(); System.out.println(list);
		 */
	}

}
