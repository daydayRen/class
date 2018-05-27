package com.oneday.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.oneday.mapper.PersonMapper;
import com.oneday.pojo.Person;
import com.oneday.pojo.PersonExample;
import com.oneday.pojo.PersonExample.Criteria;

@Service
public class PersonServiceImp implements PersonService {
	@Autowired
	private PersonMapper mapper;

	public List<Person> findAll() {
		PersonExample example = new PersonExample();

		List<Person> list = mapper.selectByExample(example);
		return list;
	}

}
