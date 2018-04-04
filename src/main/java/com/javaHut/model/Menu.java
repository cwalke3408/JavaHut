package com.javaHut.model;

import java.util.HashMap;
import java.util.Map;

public class Menu {

	Map<String, Double> pizzaMenu = new HashMap<>();

	public Menu() {
	}

	public Map<String, Double> getPizzaMenu() {
		return pizzaMenu;
	}

	public void setPizzaMenu(Map<String, Double> pizzaMenu) {
		this.pizzaMenu = pizzaMenu;
	}
	
	public Map<String, Double> addToMenu(Pizza pizza) {
		pizzaMenu.put(pizza.getPizzaName(), pizza.getPrice());
		return pizzaMenu;
	}
}
