package com.javaHut.test

import com.javaHut.dao.PersonDao
import com.javaHut.model.Person
import spock.lang.Specification
class personDaoSpec extends Specification {

	def "Selecting an entry in the the database by ID"() {
		
		given: "Given an ID"
		Person person = new Person();
		person.setPersonid(1);
		person.setLastname("Walker");
		person.setFirstname("Christian");
		person.setAddress("Lake Drive");
		person.setCity("Smyrna");
		
		//List<Person> m =  
		when: "SQL entry is entered"
		//PersonDao personDao = new PersonDao();
		List<Person> m = Stub(List)
		// >> {person};
		
		then: "Return that person class"
		[person] == personDao.getPersonById();
	}
	
}
