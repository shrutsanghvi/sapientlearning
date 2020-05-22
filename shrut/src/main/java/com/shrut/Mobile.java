package com.shrut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	
	
	@Autowired
	Camera cam;
	
	@Autowired
	Screen scre;
	
	@Autowired
	Speaker spk; 
	
	public void watch() {
		System.out.println("The specs are");
		cam.capture();
		scre.show(); 
		spk.play();
	}
	
	
	
}