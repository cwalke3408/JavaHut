package com.javaHut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaHut.dao.MenuDao;
import com.javaHut.dao.PersonDao;
import com.javaHut.model.Menu;
import com.javaHut.model.Person;
import com.javaHut.model.Pizza;
import com.javaHut.service.PersonService;


@RestController
public class MenuController {
	//MenuDao menu = new MenuDao();
	
//	@RequestMapping(value = "/getMenu", method = RequestMethod.GET, headers = "Accept=aplication/json")
//	public MenuDao getTheMenu() {
//		return new MenuDao();
//	}
	
//	private MenuDao menuDao = new MenuDao();
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/selectPerson")
	public Person selectPersonService() {
		return personService.thePerson().getPersonById();
	}
	
	@RequestMapping("/addPerson")
	public void addPersonService() {
		
		Person person = new Person();
		
		person.setPersonid(9);
		person.setLastname("Walker");
		person.setFirstname("Christian");
		person.setAddress("Smyrna");
		person.setCity("Atlanta");
		
		personService.thePerson().addPersonToTable(person);
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
	
//	@RequestMapping("/getPerson")
//	public Person thePerson() {
//		return personDao.getPersonById();
//	}

//	@RequestMapping("/getTheMenu1")
//	public MenuController menu() {
//		return new MenuController();
//	}
//	
//	@RequestMapping("/getTheMenu")
//	public MenuDao theMenu() {
//		return menuDao;
//	}
//	
//	@RequestMapping("/addToMenu/{pizzaName}/{price}")
//	public MenuDao addMenu(@PathVariable String pizzaName, @PathVariable Double price) {
//		Pizza pizza = new Pizza(pizzaName, price);
//		menuDao.addToMenu(pizza);
//		return menuDao;
//	}
//	
//	
//	@RequestMapping("/addToMenu/{pizzaName}")
//	public MenuDao addMenu(@PathVariable String pizzaName) {
//		Pizza pizza = new Pizza(pizzaName, 12.5);
//		menuDao.addToMenu(pizza);
//		return menuDao;
//	}
//	
//	@RequestMapping("/addToMenu")
//	public MenuDao addMenu() {
//		Pizza pizza = new Pizza("pizzaName", 12.5);
//		menuDao.addToMenu(pizza);
//		return menuDao;
//	}
//	
//	@RequestMapping("/pizza")
//	public Pizza pizza(@RequestParam(value="name", defaultValue="Pineapple") String name) {	
//		return new Pizza(name, 15.0);
//	}
}
