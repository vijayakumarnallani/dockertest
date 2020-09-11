package com.dockerpoc.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockertestApplication {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String test_get() {
		System.out.println("Hello World");
		return "Hello World Vijay";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockertestApplication.class, args);
	}

}
