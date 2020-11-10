package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private long id;
	@Getter @Setter private String lastName;
	@Getter @Setter private String firstName;
	@Getter @Setter private String phone;
	@Autowired
	@Getter @Setter private Department department;
	
	//Constructors
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}
	public Employee(String lastName, String firstName, String phone) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
	}
	public Employee(long id, String lastName, String firstName, String phone) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Employee [Id = " + id + ", Last Name = " + lastName + ", First Name = " 
				+ firstName + ", Phone = " + phone + ", Department = " + department;
	}
	
	
	

}
