package coms.PersonRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonRestApiApplication.class, args);
		System.out.println("Server Started...");
	}

}
