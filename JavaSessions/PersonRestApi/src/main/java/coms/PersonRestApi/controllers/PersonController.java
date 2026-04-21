package coms.PersonRestApi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import coms.PersonRestApi.bean.Person;
import coms.PersonRestApi.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService  ps;
	
	@PostMapping("/person")
	public ResponseEntity<String>  AddPerson(@RequestBody Person person)
	{
		ps.AddPerson(person);
		return new ResponseEntity<String>("New Person Added...", HttpStatus.CREATED);
	}
	
	@GetMapping("/person")
	public ResponseEntity<List<Person>> ViewAllInfo()
	{
		List<Person> lstPerson = ps.ViewAll();
		return new ResponseEntity<List<Person>>(lstPerson, HttpStatus.OK);
	}
	
	@GetMapping("/person/{pid}")
	public ResponseEntity<Object> SearchInfo(@PathVariable("pid") int pid)
	{
		System.out.println(pid);
		Person person = ps.SearchPerson(pid);
		if(person!=null)
			return new ResponseEntity<Object>(person, HttpStatus.OK);
		
		return new ResponseEntity<Object>("Person Not Found....", HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/person/{pid}")
	public ResponseEntity<Object> DelInfo(@PathVariable("pid") int pid)
	{
		Person person = ps.SearchPerson(pid);
		if(person!=null)
		{
			ps.DeletePerson(pid);
			return new ResponseEntity<Object>(person, HttpStatus.OK);
		}
		return new ResponseEntity<Object>("Person Not Found....", HttpStatus.NOT_FOUND);
	}

	@PutMapping("/person/{pid}")
	public ResponseEntity<Object> ModInfo(@PathVariable("pid") int pid, @RequestBody Person person)
	{
		ps.ModifyPerson(person);
		return new ResponseEntity<Object>("Person Modified....", HttpStatus.OK);
	}

}
