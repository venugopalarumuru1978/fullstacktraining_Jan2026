package coms.EmpJpaApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import coms.EmpJpaApp.beans.Employee;
import coms.EmpJpaApp.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService  es;
	
	@GetMapping("/newemp")
	public String newEmp(Model m)
	{
		m.addAttribute("empObj", new Employee());
		return "AddEmployee";
	}
	
	@PostMapping("/newemp_add")
	public String newEmp(@ModelAttribute("empObj") Employee emp,  Model m)
	{
		es.AddEmp(emp);		
		m.addAttribute("empObj", new Employee());
		return "AddEmployee";
	}
}
