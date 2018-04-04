package com.javaHut.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.javaHut.model.Menu;
import com.javaHut.model.Pizza;



public class MenuDao {

//	@Qualifier("dataSource")
//	@Autowired
//	private DataSource dataSource;
//
//	private JdbcTemplate jdbcTemplate;
//
//	@PostConstruct
//	public void initDataSource() {
//		jdbcTemplate = new JdbcTemplate(dataSource);
//		
//	}

	//private final String SQL = "SELECT personid, lastname, firstname, address, city FROM public.branden where personid = 1";

//	public Menu getPersonById(){
//		List<Menu> m = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Menu.class));
//				return m.get(0);
//	}
	
	private Menu menu;

	public MenuDao() {


		menu = new Menu();
		
		Pizza pizza1 = new Pizza("Pineapple", 21.0);
		Pizza pizza2 = new Pizza("BBQ", 22.0);
		Pizza pizza3 = new Pizza("Deep Dish", 23.0);
		
		this.menu.addToMenu(pizza1);
		this.menu.addToMenu(pizza2);
		this.menu.addToMenu(pizza3);
	}
	
	public MenuDao(Menu menu) {
		this.menu = menu;
		
		Pizza pizza1 = new Pizza("Cheese", 21.0);
		Pizza pizza2 = new Pizza("Pepperoni", 22.0);
		Pizza pizza3 = new Pizza("Sausage", 23.0);
		
		this.menu.addToMenu(pizza1);
		this.menu.addToMenu(pizza2);
		this.menu.addToMenu(pizza3);
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public void addToMenu(Pizza pizza) {
		menu.addToMenu(pizza);
	}
	
	
	
}
