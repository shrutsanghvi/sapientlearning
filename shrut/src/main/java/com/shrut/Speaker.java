package com.shrut;
import java.lang.String;
import org.springframework.stereotype.Component;

@Component
public class Speaker {
int vol_levels=50; 
String type="Acoustic";
	public void play() {
	System.out.println("Available volumes levels are "+ vol_levels);
	System.out.println("Speaker type: "+ type);
		
	}

}
