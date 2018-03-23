package com.example.demo;

public class User {
	
	private String username;
	private long salary;
	
	public User(String username,long salary) {
		this.username=username;
		this.salary=salary;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}

	
	

}
