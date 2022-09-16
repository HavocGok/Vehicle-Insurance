package com.Springboot.Myproject.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel {
	
	private int id;
	@Id
	private String name;
	private String password;
	private String gender;
	private String nationality;
	private String license;
	private Authorites authority;
	private InsuranceModel insuranceModel;
	private VehicleModel vehicleModel;

}
