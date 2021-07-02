package com.parent.beans;

import org.springframework.stereotype.Component;

@Component
public class Machine{

	public void start(){
		System.out.println("machine started...");
	}	
}