package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Value;
//import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
@RestController
public class DemoApplication {
	@Value("${TEST2}")
	private String testEnv;

	public static void main(String[] args) {
//		Dotenv dotenv = Dotenv.configure().load();
		// Set the environment variables as system properties
//		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println(testEnv);
		return String.format("Hello %s! %s", name, testEnv);
	}

	@GetMapping("/test/{id}")
	public String getTest(@PathVariable("id") String id) {
		return String.format("Test!".concat(id));
	}

	@PostMapping("/test/{id}")
	public String postTest(@PathVariable("id") String id) {
		System.out.println(String.format("Error!".concat(id)));
		return "Success!";
	}
}
