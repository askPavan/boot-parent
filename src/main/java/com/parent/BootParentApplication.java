package com.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootParentApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootParentApplication.class, args);
		context.getClass();
		// changes for 123
	}
	
	//HIS-200 related changes.
	public void doProcess(){
	/logic goes here
	}

}
