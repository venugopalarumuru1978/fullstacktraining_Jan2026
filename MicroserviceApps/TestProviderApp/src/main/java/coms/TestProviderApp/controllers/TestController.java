package coms.TestProviderApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test1")
	public String TestMap()
	{
		return "This is Microservice Map";
	}
}
