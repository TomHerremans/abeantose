package spring.abeantose;

import org.springframework.stereotype.Component;

@Component
public class CarStereotype {
	
	private String name;
	
	// G&S
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
