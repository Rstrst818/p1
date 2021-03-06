package com.cg.jh2.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees3")
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private Long empId;
	
	@Column(name="first_name",length=15)
	private String firstname;
	
	@Column(name="last_name",length=15)
	private String lastname;
	
	@OneToOne
	private Laptop laptop;
	
	public Employee() {
		
	}

	public Employee(String firstname, String lastname, Laptop laptop) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.laptop = laptop;
	}

	public Long getEmpId() {
		return empId;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return String.format("empId=%s, firstname=%s, lastname=%s, laptop=%s", empId, firstname, lastname,
				laptop);
	}
	
	

}