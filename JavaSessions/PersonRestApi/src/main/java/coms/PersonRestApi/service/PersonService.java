package coms.PersonRestApi.service;

import java.util.List;

import coms.PersonRestApi.bean.Person;

public interface PersonService 
{
	public void AddPerson(Person person);
	public List<Person>  ViewAll();
	public Person SearchPerson(int pid);
	public void DeletePerson(int pid);
	public void ModifyPerson(Person person);
}