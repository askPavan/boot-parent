package com.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootParentApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootParentApplication.class, args);
	}

}
