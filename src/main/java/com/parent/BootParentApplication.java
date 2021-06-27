package com.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootParentApplication {

private static final String REST_URL="https://findrestapis.com/findurls";
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootParentApplication.class, args);
		context.getClass();
		// changes for 123
	}

}
