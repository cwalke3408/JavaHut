package com.javaHut.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.javaHut.model.Person;

@Component
public class PersonDao {

		 
		@Autowired
		private JdbcTemplate jdbcTemplate;
		@Autowired
		private RestTemplate restTemplate;

		
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
			System.out.println("New peson: " + person.getFirstname());

		}

		public void updatePersonById(int id) {
			jdbcTemplate.update(SQL3, id);
		}
		
		public void deletePersonById(int id) {
			jdbcTemplate.update(SQL4, id);
		}
		
		
		// Count the amount of the given lastname in the database
		public void countOfLastName(String lastname) {		
			String sql = "select count(*) from christian where lastname = ?";
			
			// Search the table Christian for lastname
			// Returns each row entry that matches into an index e.g. ['row1 that matched', 'row2 that matched', ... , queryForMap]
			// Returns each col entry that matches into an entry in a map {'col name' : result } ...
			List<Map <String, Object>> count = jdbcTemplate.queryForList(sql, lastname);
			System.out.println( "----- Amount of " + lastname+ " = " + count.get(0).get("count") + " ---------");
		}
		
		// Count the amount of the given firstname in the database
		public void countOfFirstName(String firstname) {
			String sql = "select count(*) from christian where firstname = ?";

			// Search the table 'Christian' for the param 'firstname' and expect the result as a 'Interger.class'
			int count = jdbcTemplate.queryForObject(sql, Integer.class, firstname);
			System.out.println( "----- Amount of " + firstname + " = "+ count + " ---------");		
		}
		
		public Person restPersonById() {
			Person person = restTemplate.getForObject("http://192.168.88.81:8080/getPersonById", Person.class);
			return person;
		}
		
	
}
