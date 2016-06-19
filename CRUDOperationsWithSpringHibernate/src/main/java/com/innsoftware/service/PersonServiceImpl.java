/**
 * 
 */
package com.innsoftware.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.innsoftware.dao.PersonDAO;
import com.innsoftware.model.Person;

/**
 * @author Ravali Nuka
 *
 */
@Service
public class PersonServiceImpl implements PersonService {
	
	private PersonDAO PersonDAO;
	
	

	/**
	 * @param personDAO the personDAO to set
	 */
	public void setPersonDAO(PersonDAO personDAO) {
		PersonDAO = personDAO;
	}

	/* (non-Javadoc)
	 * @see com.innsoftware.service.PersonService#addPerson(com.innsoftware.model.Person)
	 */
	@Override
	@Transactional
	public void addPerson(Person person) {
		PersonDAO.addPerson(person);

	}

	/* (non-Javadoc)
	 * @see com.innsoftware.service.PersonService#updatePerson(com.innsoftware.model.Person)
	 */
	@Override
	@Transactional
	public void updatePerson(Person person) {
		PersonDAO.updatePerson(person);

	}

	/* (non-Javadoc)
	 * @see com.innsoftware.service.PersonService#listPersons()
	 */
	@Override
	@Transactional
	public List<Person> listPersons() {
		return PersonDAO.listPersons();
	}

	/* (non-Javadoc)
	 * @see com.innsoftware.service.PersonService#getPersonById(int)
	 */
	@Override
	@Transactional
	public Person getPersonById(int personId) {
		return PersonDAO.getPersonByID(personId);
	}

	/* (non-Javadoc)
	 * @see com.innsoftware.service.PersonService#removePerson(int)
	 */
	@Override
	@Transactional
	public void removePerson(int personId) {
		PersonDAO.removePerson(personId);

	}

}
