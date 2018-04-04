package com.javaHut.dao;

import java.util.HashMap;
import java.util.Map;

import com.javaHut.model.Pizza;

public class PizzaDao {
	
	Map<String, Double> pizzaMenu; 

	public  Map<String,Double> getMenu() {

		this.pizzaMenu = new HashMap<String, Double>();

		Pizza peperoni = new Pizza("Peperoni",12.00);
		Pizza sausage = new Pizza("Sausage",11.00);
		Pizza cheese = new Pizza("Cheese",10.00);

		pizzaMenu.put(peperoni.getPizzaName(), peperoni.getPrice());
		pizzaMenu.put(sausage.getPizzaName(), sausage.getPrice());
		pizzaMenu.put(cheese.getPizzaName(), cheese.getPrice());

		return pizzaMenu;

	}

	public Map<String, Double> getPizzaMenu() {
		return pizzaMenu;
	}

	public void setPizzaMenu(Map<String, Double> pizzaMenu) {
		this.pizzaMenu = pizzaMenu;
	}
	
	
		
		

}
