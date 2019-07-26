package com.curd.services;

import java.util.List;

import com.curd.model.Person;

public interface PersonInf {
	public List<Person> getAllPerson();
	
	public Person getPerson(String id);
	
	public String addPerson(Person person);
	
	public void updatePerson(String id, Person person);
	
	public void deletePerson(String id);
}
