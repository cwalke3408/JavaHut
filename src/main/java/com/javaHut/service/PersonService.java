package com.javaHut.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaHut.dao.PersonDao;
import com.javaHut.model.Person;

@Component
public class PersonService {


	@Autowired
	PersonDao personDao;
	
	public PersonDao thePerson() {
		return personDao;
	}
	
}
