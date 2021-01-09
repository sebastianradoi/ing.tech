package com.ing.tech.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String username;
	private String pass;

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

	public User() {
		super();
	}

	public User(String firstName, String lastName, String username, String pass) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ ", pass=" + pass + ", role=" + "]";
	}

}
