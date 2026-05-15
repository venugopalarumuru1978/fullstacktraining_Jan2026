package coms.TestProviderApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestProviderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProviderAppApplication.class, args);
		System.out.println("Provider App Started....");
	}
}
