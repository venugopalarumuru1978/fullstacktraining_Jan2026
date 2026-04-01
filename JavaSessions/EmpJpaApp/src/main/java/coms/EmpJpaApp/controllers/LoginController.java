package coms.EmpJpaApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import coms.EmpJpaApp.beans.Employee;
import coms.EmpJpaApp.service.EmpService;

@Controller
public class LoginController {

	@Autowired
	EmpService es;
	
	@GetMapping("/login")
	public String LoginPage(Model m)
	{
		return "Login";
	}

	@PostMapping("/loginProcess")
	public String LoginPage(@RequestParam("txtUname") String uname,
			@RequestParam("txtPwd") String pwd, Model m)
	{
		if(uname.equals("Administrator") && pwd.equals("admin@123"))
			return "redirect:/viewall";
		else
		{
			Employee emp = es.UserCheck(uname, pwd);
			System.out.println(uname + "  " + pwd);
			if(emp!=null)
			{
				
				return "redirect:/welcome/" + emp.getEid();
			}
			else
				m.addAttribute("msg", "Please check username/password");
		}
		return "Login";
	}

	@GetMapping("/welcome/{eid}")
	public String GetWelcomePage(@PathVariable("eid") int eno, Model m)
	{
		Employee emp = es.SearchEmp(eno);
		m.addAttribute("emp", emp);
		return "EmpWelcome";
	}
}
