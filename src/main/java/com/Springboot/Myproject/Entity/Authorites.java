package com.Springboot.Myproject.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Authorites {
	@Autowired
	@Id
	private int Id;
	private String Authority;
	private String password;

	public Authorites() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Authorites(int id, String authority, String password) {
		super();
		Id = id;
		Authority = authority;
		this.password = password;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAuthority() {
		return Authority;
	}

	public void setAuthority(String authority) {
		Authority = authority;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Authorites [Id=" + Id + ", Authority=" + Authority + ", password=" + password + "]";
	}

}
