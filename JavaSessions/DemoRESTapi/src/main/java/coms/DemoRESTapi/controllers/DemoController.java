package coms.DemoRESTapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import coms.DemoRESTapi.bean.Student;

@RestController
public class DemoController {

	
	@GetMapping("/test1")
	public String Test1()
	{
		return "This is Rest API App";
	}
	
	@GetMapping("/test2")
	public ResponseEntity<List<String>>  Test2()
	{
		List<String> lstStr = new ArrayList<String>();
		lstStr.add("Kiran");
		lstStr.add("Karan");
		lstStr.add("Kamal");
		lstStr.add("Komali");
		lstStr.add("Kiranmayee");
		
		return new ResponseEntity<List<String>>(lstStr, HttpStatus.CREATED);
	}
	
	@PostMapping("/getdata")
	public ResponseEntity<Student>  InputData(@RequestBody  Student std)
	{
		System.out.println("Student Name : " + std.getSname());
		System.out.println("Student Name : " + std.getCourse());
		
		return new ResponseEntity<Student>(std, HttpStatus.OK);
	}
	
}
