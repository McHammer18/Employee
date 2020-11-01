package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Department {
	private String type;	
	private String location;
	
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
	
	//getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [Type = " + type + ", Location = " + location; 
	}
	
	
	
	
	
	
	
}
