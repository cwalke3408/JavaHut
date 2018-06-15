package com.javaHut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.javaHut.model.Person;
import com.javaHut.service.PersonService;


@RestController
public class PersonController {

	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/selectPerson")
	public Person selectPersonService() {
		return personService.thePerson().getPersonById();
	}
	
//	@RequestMapping("/addPerson")
//	public void addPersonService() {
//		
//		Person person = new Person();
//		
//		person.setPersonid(9);
//		person.setLastname("Walker");
//		person.setFirstname("Christian");
//		person.setAddress("Smyrna");
//		person.setCity("Atlanta");
//		
//		personService.thePerson().addPersonToTable(person);
//	}
	
	
	/* 	Add params in Postman Body
		
		{
			"personid" : "9",
			"lastname" : "Walker",
			"firstname": "Christian9",
			"address"  : "Smynra1",
			"city"     : "Atlanta"
		}
		
	
	 	Send localhost:8080/addPerson
		* This creates a new Person object with the set params above
	*/
	@RequestMapping(name = "/addPerson", method = RequestMethod.POST)
	public void addPersonService(@RequestBody Person person) {

		// Person obj. has now been created
		// Now I can do anything with like insert it into my database table
		personService.thePerson().addPersonToTable(person);
		System.out.println("Receiving a New Person");
	}

	@RequestMapping("/updatePerson")
	public void updatePersonService() {
		personService.thePerson().updatePersonById(3);
	}
	
	@RequestMapping("/deletePerson")
	public void deletePersonService() {
		personService.thePerson().deletePersonById(3);
	}

	@RequestMapping("/countLastName")
	public void countOfLastName() {
		personService.thePerson().countOfLastName("Walker");
	}
	
	@RequestMapping("/countFirstName")
	public void countOfFirstName() {
		personService.thePerson().countOfFirstName("Christan");
	}

	@RequestMapping("/restPersonById")
	public void restPersonById() {
		personService.thePerson().restPersonById();
	}
	
}
