/**
 * 
 */
package com.innsoftware.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.innsoftware.model.Person;

/**
 * @author Ravali Nuka
 *
 */
@Repository
public class PersonDAOImpl implements PersonDAO {

	private static final Logger logger= LoggerFactory.getLogger(PersonDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/* (non-Javadoc)
	 * @see com.innsoftware.dao.PersonDAO#addPerson(com.innsoftware.model.Person)
	 */
	@Override
	public void addPerson(Person person) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(person);
		logger.info("Person is added "+person);	
	}

	/* (non-Javadoc)
	 * @see com.innsoftware.dao.PersonDAO#updatePerson(com.innsoftware.model.Person)
	 */
	@Override
	public void updatePerson(Person person) {
		Session session=sessionFactory.getCurrentSession();
		session.update(person);
		logger.info("Person updated successfully "+ person);

	}

	/* (non-Javadoc)
	 * @see com.innsoftware.dao.PersonDAO#getPersonByID(int)
	 */
	@Override
	public Person getPersonByID(int personId) {
		Session session=sessionFactory.getCurrentSession();
		Person person=(Person)session.load(Person.class, personId);
		logger.info("Received person "+ person);
		return person;
		
	}

	/* (non-Javadoc)
	 * @see com.innsoftware.dao.PersonDAO#removePerson(int)
	 */
	@Override
	public void removePerson(int personId) {
		Session session=sessionFactory.getCurrentSession();
		Person person=(Person)session.load(Person.class, personId);
		if(person !=null){
			session.delete(person);
		}
		logger.info("Person with Id:"+personId+
				" is deleted and the details of the person is: "+person);
	}

	/* (non-Javadoc)
	 * @see com.innsoftware.dao.PersonDAO#listPersons()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Person> listPersons() {
		Session session=sessionFactory.getCurrentSession();
		List<Person> persons=(List<Person>)session.createQuery("from Person").list();
		if(!persons.isEmpty()){
			for(Person person: persons){
				logger.info("person info is: "+person);
			}
		}
		return persons;
	}

}
