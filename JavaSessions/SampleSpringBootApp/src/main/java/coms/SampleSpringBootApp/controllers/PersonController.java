package coms.SampleSpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import coms.SampleSpringBootApp.beans.Person;

@Controller
public class PersonController {

	@GetMapping("/pinfo")
	public String personPage(Model m)
	{
		Person  perObj = new Person();
		m.addAttribute("perObj", perObj);
		return "PersonReg";
	}

	@PostMapping("/pinfoProcess")
	public String personPage(@ModelAttribute("perObj") Person pObj, Model m)
	{		
		System.out.println("Person name : " + pObj.getPname());
		System.out.println("Person Gender : " + pObj.getGender());
		System.out.println("Person Location : " + pObj.getLocation());
		Person  perObj = new Person();
		m.addAttribute("perObj", perObj);
		return "PersonReg";
	}
}
