package coms.ConsumerApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	DiscoveryClient  cinfo;
	
	@GetMapping("/testpro")
	public String TestProvider()
	{
		RestTemplate rt = new RestTemplate();
		List<ServiceInstance> list = cinfo.getInstances("PROVIDER-APP");

		System.out.println(list);
		System.out.println(list.get(0).getUri());
		ResponseEntity<String>  resp = rt.getForEntity(list.get(0).getUri() + "/test1", String.class);
		return "Provider from Consumer : " + resp.getBody();
	}
}
