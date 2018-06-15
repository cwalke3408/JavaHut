package com.javaHut.service;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.hibernate.validator.internal.util.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaHut.dao.PersonDao;
import com.javaHut.model.Person;


@Component
public class PersonService {

	private static final Logger log = LoggerFactory.getLogger(PersonService.class);
	
	@Autowired
	private SimpleDateFormat dateFormat;
	
	@Autowired
	PersonDao personDao;
	
	public PersonDao thePerson() {
		return personDao;
	}
	
	//@Scheduled(cron = "${cron.schedule}")
//	@Scheduled(fixedRate = 5000)
//	public void reportCurrentTimeAgain() {
//		System.out.println("Hello World");
//		log.info("The time is now {}", dateFormat);
//		//log.debug("Debug goes here");
//	}
	
}
