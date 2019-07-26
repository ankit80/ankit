package com.curd.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.model.Person;

@Service
public class PersonService implements PersonInf {
	
	static private List<Person> persons = new ArrayList<Person>();
	
	
	public PersonService(){
		//super();
		persons.add(new Person("12","hello"));
		persons.add(new Person("02", "anil"));
		}
	
	
	
	//static
		//private List<Person> persons ;//= Arrays.asList(new Person("01", "abhi"), new Person("02", "anil"));
//private ArrayList<Person> persons = new ArrayList<>();
	
	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return persons;
	}

	@Override
	public Person getPerson(String id) {
		return persons.stream().filter(p -> p.getId().equals(id)).findFirst().get();

	}
	
	@Override
	public String addPerson(Person person) {
		persons.add(person);
		return "true";

	}

	@Override
	public void updatePerson(String id, Person person) {
		for (int i=0 ;i<persons.size();i++) {
			Person p = persons.get(i);
			if(p.getId().equals(id)) {
				persons.set(i, person);
				return;
			}
		}	
	}

	@Override
	public void deletePerson(String id) {
		for (int i =0; i<persons.size(); i++) {
			Person p = persons.get(i);
			if(p.getId().equals(id)) {
				persons.remove(i);
				return;
			}
		}
		
	}

}
