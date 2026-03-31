package coms.EmpJpaApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		return "redirect:/viewall";
	}
	
	@GetMapping("/viewall")
	public String ViewAllEmps(Model m)
	{
		List<Employee>  emplist = es.ViewAll();
		m.addAttribute("emplist", emplist);
		return "ViewAllEmps";
	}
	
	@GetMapping("/search")
	public String GetSearchPage(Model m)
	{
		return "SearchEmp";
	}
	
	@PostMapping("/search_emp")
	public String GetSearchPage(@RequestParam("txtEid") int eid, Model m)
	{
		Employee emp = es.SearchEmp(eid);
		if(emp!=null)
			m.addAttribute("emp", emp);
		else
			m.addAttribute("msg", "Employee Not Found");
		return "SearchEmp";
	}
	
	@GetMapping("/delemp/{eid}")
	public String DeleteEmpInfo(@PathVariable("eid") int eid, Model m)
	{
		es.DeleteEmp(eid);
		return "redirect:/viewall";
	}
	
	@GetMapping("/modemp/{eid}")
	public String UpdateEmpInfo(@PathVariable("eid") int eid, Model m)
	{
		Employee emp = es.SearchEmp(eid);
		m.addAttribute("empObj", emp);
		return "UpdateEmp";
	}

	@PostMapping("/modemp_upt")
	public String UpdateEmpInfo(@ModelAttribute("empObj") Employee emp, Model m)
	{
		es.UpdateEmp(emp);
		return "redirect:/viewall";
	}

}
