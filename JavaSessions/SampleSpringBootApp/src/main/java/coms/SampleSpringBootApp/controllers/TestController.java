package coms.SampleSpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@GetMapping("/home")
	public String getPage1(Model m)
	{
		m.addAttribute("msg", "This is Spring Boot App");
		return "homepage";
	}
	
	@GetMapping("/test")
	public String getpage2(Model m)
	{
		int x = 100;
		m.addAttribute("xVal", x);
		float y = 12.56f;
		m.addAttribute("yVal", y);
		return "testpage";
	}
	@GetMapping("/demo")
	public String getPage3(Model m)
	{
		return "demopage";
	}
	
	@PostMapping("/demopost")
	public String getPage3(@RequestParam("txtName") String name,  Model m)
	{
		System.out.println("Demo Page Submit" + name);
		m.addAttribute("msg", name);
		return "demopage";
	}
}
