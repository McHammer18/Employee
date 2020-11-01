package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String lastName;
	private String firstName;
	private String phone;
	@Autowired
	private Department department;
	
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
	
	//getters and setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [Id = " + id + ", Last Name = " + lastName + ", First Name = " 
				+ firstName + ", Phone = " + phone + ", Department = " + department;
	}
	
	
	

}
