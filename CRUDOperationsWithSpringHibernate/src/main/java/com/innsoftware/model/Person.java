/**
 * 
 */
package com.innsoftware.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ravali Nuka
 *
 */

@Entity
@Table(name="PERSON")
public class Person {
	@Id
	@Column(name="PERSON_ID")
	private int personId;
	@Column(name="NAME")
	private String name;
	
	@Column(name="COUNTRY")
	private String country;
	/**
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}
	/**
	 * @param id the id to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the coutnry
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param coutnry the coutnry to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id: "+personId+" Name: "+name+" Country: "+country;
	}

}
