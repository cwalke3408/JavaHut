package com.javaHut.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.javaHut.model.Menu;
import com.javaHut.model.Person;

@Component
public class PersonDao {

		 
		@Autowired
		private JdbcTemplate jdbcTemplate;

		
		private final String SQL = "SELECT personid, lastname, firstname, address, city FROM public.christian where personid = 1";

		public Person getPersonById(){
			List<Person> m = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Person.class));
			System.out.println(m.get(0));
					return m.get(0);			
		}
		
		public void addPersonToTable() {
			
		}

		public void updatePersonById() {
			
		}
		
		public void deletePersonById() {
			
		}
}
