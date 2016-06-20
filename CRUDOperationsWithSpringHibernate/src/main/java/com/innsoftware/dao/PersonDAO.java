/**
 * 
 */
package com.innsoftware.dao;

import java.util.List;

import com.innsoftware.model.Person;



/**
 * @author Srinivas Kummari
 *
 */
public interface PersonDAO {
 
	public void addPerson(Person person);
	public void updatePerson(Person person);
	public Person getPersonByID(int personId);
	public void removePerson(int personId);
	public List<Person> listPersons();
}
