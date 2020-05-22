package com.shrut;

import org.springframework.stereotype.Component;

@Component
public class Camera {

	int no_of_mgpixels=25;
	
	
	public void capture() {
		System.out.println("The number of megapixels is "+ no_of_mgpixels);
	}

}
