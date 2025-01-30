package com.specs.cars;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class black implements paint {

	public void metallicpaint() {
		System.out.println("I am metallic black");
		
	}

}
