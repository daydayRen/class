package com.oneday.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oneday.pojo.Person;
import com.oneday.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	private PersonService personService;

	@RequestMapping("/all")
	public String findAll(Model model) {
		List<Person> list = personService.findAll();
		System.out.println(list.get(0).getBirthday());
		model.addAttribute("list", list);
		return "personList";
	}
}
