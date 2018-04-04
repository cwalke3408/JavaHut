package com.javaHut.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.javaHut.dao.MenuDao;
import com.javaHut.dao.PizzaDao;
import com.javaHut.model.Menu;
import com.javaHut.model.Pizza;
import com.javaHut.service.PizzaCompService;



//@Controller
//@RequestMapping(value = "/menu")
//public class Pizzas {
//	MenuDao menu = new MenuDao();
//	
//	@RequestMapping(value = "/menu2", method = RequestMethod.GET, headers = "Accept=aplication/json")
//	public Menu getTheMenu() {
//		return menu.getMenu();
//	}
//}

//@RestController
//public class Pizzas {
//	
////	@Autowired
////	private PizzaCompService pizzaCompService;
//	
//	@Autowired
//	PizzaCompService pizzaService = new PizzaCompService();
//	
////	public Pizzas(PizzaCompService pizzaService) {
////		this.pizzaService = pizzaService;
////	}
//	
//	@RequestMapping(value="/add")
//	public Map<String, Double> addPizza(@RequestParam(value="pizzaName", defaultValue="PineApple") String pizzaName) {
//		
//		Pizza pizza = new Pizza();
//		
//		pizza.setPizzaName(pizzaName);
//		pizza.setPrice(15.0);
//		
//		return pizzaService.addingPizza(pizza);
//	}
//	
////	@RequestMapping(value = "view", method = RequestMethod.GET)
////	public String Pizzas
//	
//	

//@RequestMapping("/menu1")
//public PizzaDao pizzaMenu() {
//	return new PizzaDao();
//}
////	PizzaCompService pizzaService = new PizzaCompService();
////	
////	public Pizzas(PizzaCompService pizzaService) {
////		this.pizzaService = pizzaService;
////	}
////	
//
////	public Map<String, Double> Menu() {	
////		return pizzaService.getMenu();
////	}
//
//	@RequestMapping("/pizza")
//	public Pizza pizza(@RequestParam(value="name", defaultValue="Pineapple") String name) {	
//		return new Pizza(name, 15.0);
//	}
//}
