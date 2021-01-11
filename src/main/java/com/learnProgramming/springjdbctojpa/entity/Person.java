package com.learnProgramming.springjdbctojpa.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
//Here we are using jpql to query the Person Entity. to get find all results from person entity.
@NamedQuery(name="find_all_persons",query="select p from Person p")
public class Person {
	@Id
	private int id;
	private String location;
	private String name;
	private Date birthDate;
	
	public Person() {
		
	}
	
	public Person(int id, String location, String name, Date birthDate) {
		super();
		this.id = id;
		this.location = location;
		this.name = name;
		this.birthDate = birthDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return String.format("\nPerson [id=" + id + ", location=" + location + ", name=" + name + ", birthDate=" + birthDate + "]");
	}
	
	
	

}
