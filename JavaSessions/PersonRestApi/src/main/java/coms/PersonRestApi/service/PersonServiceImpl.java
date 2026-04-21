package coms.PersonRestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.PersonRestApi.bean.Person;
import coms.PersonRestApi.repo.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository  pr;
	
	@Override
	public void AddPerson(Person person) {
		// TODO Auto-generated method stub
		pr.save(person);
	}

	@Override
	public List<Person> ViewAll() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Person SearchPerson(int pid) {
		// TODO Auto-generated method stub
		Optional<Person>  per = pr.findById(pid);
		if(per.isPresent())
			return per.get();
		
		return null;
	}

	@Override
	public void DeletePerson(int pid) {
		// TODO Auto-generated method stub
		pr.deleteById(pid);
	}

	@Override
	public void ModifyPerson(Person person) {
		// TODO Auto-generated method stub
		pr.saveAndFlush(person);
	}
}
