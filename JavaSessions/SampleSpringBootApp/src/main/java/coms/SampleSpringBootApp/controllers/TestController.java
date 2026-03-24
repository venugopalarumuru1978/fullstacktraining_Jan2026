package coms.SampleSpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/home")
	public String getPage1()
	{
		return "homepage";
	}
	
	@GetMapping("/test")
	public String getpage2()
	{
		return "testpage";
	}
}
