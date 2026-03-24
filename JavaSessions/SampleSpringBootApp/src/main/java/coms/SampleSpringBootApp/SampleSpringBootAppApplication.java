package coms.SampleSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootAppApplication.class, args);
		System.out.println("App Started...");
	}
}
