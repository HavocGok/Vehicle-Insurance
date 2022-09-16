package com.Springboot.Myproject.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleModel {
	@Id
	private int id;
	private String source;
	private String categeory;
	private String plateNumber;
	private String type;
	private String color;
	private Date regDate;
	private double pendingfines;
	private UserModel user;

	public VehicleModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleModel(int id, String source, String categeory, String plateNumber, String type, String color,
			Date regDate, double pendingfines, UserModel user) {
		super();
		this.id = id;
		this.source = source;
		this.categeory = categeory;
		this.plateNumber = plateNumber;
		this.type = type;
		this.color = color;
		this.regDate = regDate;
		this.pendingfines = pendingfines;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCategeory() {
		return categeory;
	}

	public void setCategeory(String categeory) {
		this.categeory = categeory;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public double getPendingfines() {
		return pendingfines;
	}

	public void setPendingfines(double pendingfines) {
		this.pendingfines = pendingfines;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "VehicleModel [id=" + id + ", source=" + source + ", categeory=" + categeory + ", plateNumber="
				+ plateNumber + ", type=" + type + ", color=" + color + ", regDate=" + regDate + ", pendingfines="
				+ pendingfines + ", user=" + user + "]";
	}

}
