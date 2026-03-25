package coms.SampleSpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String loginPage(Model m)
	{
		return "LoginPage";
	}
	
	@PostMapping("/loginProcess")
	public String loginPage(@RequestParam("txtUname") String uname,
			@RequestParam("txtPass") String pwd, Model m)
	{
		if(uname.equals("Venugopal") &&  pwd.equals("v@123"))
			return "WelcomePage";
		else
			m.addAttribute("info", "Please check username / password");
		return "LoginPage";
	}
}
