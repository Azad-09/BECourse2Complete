package com.azad.RESTAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestapiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RestapiApplication.class, args);
		System.out.println(context);
	}

}
