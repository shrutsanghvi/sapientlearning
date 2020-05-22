package com.shrut;

import org.springframework.stereotype.Component;

@Component
public class Screen {
	int len=24; 
	int bre=36;
	public void show() {
		
		System.out.println("The screen size is "+len+"X"+bre);
	}

}
