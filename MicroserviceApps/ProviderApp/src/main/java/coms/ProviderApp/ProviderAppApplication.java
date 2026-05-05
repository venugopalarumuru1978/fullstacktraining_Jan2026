package coms.ProviderApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderAppApplication.class, args);
		System.out.println("Provider App Started....");
	}

}
