package com.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootParentApplication {

private Map<String, Object> cache = new HashMap<String, Object>();

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootParentApplication.class, args);
		context.getClass();
		// changes for 123
	}
	//HIS-301 changes
	public void loadDataToCache(){
		//logic to retrieve the data from database.
	}

}
