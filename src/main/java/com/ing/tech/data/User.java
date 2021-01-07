package com.ing.tech.data;

public class User {
	private String firstName;
	private String lastName;
	private int age;
	private String username;
	private String pass;
	private String role;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User() {
		super();
	}

	public User(String firstName, String lastName, int age, String username, String pass, String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.username = username;
		this.pass = pass;
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", username=" + username
				+ ", pass=" + pass + ", role=" + role + "]";
	}

}
