package coms.ProviderApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

	@GetMapping("/test1")
	public String TestMethod()
	{
		return "This is Provider App";
	}
}
