package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class Department {
	@Getter @Setter private String type;	
	@Getter @Setter private String location;
	
	//Constructors
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String type, String location) {
		super();
		this.type = type;
		this.location = location;
	}
	

	@Override
	public String toString() {
		return "Department [Type = " + type + ", Location = " + location; 
	}
	
	
	
	
	
	
	
}
