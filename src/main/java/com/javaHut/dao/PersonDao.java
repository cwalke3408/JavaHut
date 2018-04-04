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
		private final String SQL2 = "insert into Christian values(?, ?, ?, ?, ?)";
		private final String SQL3 = "update christian set lastname='Walker' where personid=?";
		private final String SQL4 = "delete from christian where personid=?";
		
		public Person getPersonById(){
			List<Person> m = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Person.class));
			System.out.println(m.get(0));
					return m.get(0);			
		}
		
		public void addPersonToTable(Person person) {
			int rows = jdbcTemplate.update(SQL2, person.getPersonid(), person.getLastname(), person.getFirstname(), person.getAddress(), person.getCity());
			System.out.println("Number of rows added: " + rows);

		}

		public void updatePersonById(int id) {
			jdbcTemplate.update(SQL3, id);
		}
		
		public void deletePersonById(int id) {
			jdbcTemplate.update(SQL4, id);
		}
}
