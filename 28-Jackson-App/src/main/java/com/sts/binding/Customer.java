package com.sts.binding;

public class Customer {

	private Integer id;
	private String name;
	private Integer phno;
	
	public Customer() {
		
		
	}
	
	
	
	public Customer(Integer id, String name, Integer phno) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getPhno() {
		return phno;
	}



	public void setPhno(Integer phno) {
		this.phno = phno;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phno=" + phno + "]";
	}



	
	
	
}
