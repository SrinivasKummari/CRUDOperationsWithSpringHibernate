/**
 * 
 */
package com.innsoftware.service;

import java.util.List;

import com.innsoftware.model.Person;

/**
 * @author Srinivas Kummari
 *
 */
public interface PersonService {
	
	public void addPerson(Person person);
	public void updatePerson(Person person);
	public List<Person> listPersons();
	public Person getPersonById(int personId);
	public void removePerson(int personId);

}
