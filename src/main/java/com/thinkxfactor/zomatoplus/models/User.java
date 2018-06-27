package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="tbl_user")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="user_id")
	private Long id;
	
	@Column(name="uname")
	private String uname;
	
	@Column(name="password")
	private String password;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="address")
	private String address;
	
	@Column(name="landmark")
	private String landmark;
	
	@Column(name="pincode")
	private String pincode;
	
	public User() {
		super();
	}
	
	
	public User(Long id, String uname, String password, String mobile, String address, String landmark,
			String pincode) {
		super();
		this.id = id;
		this.uname = uname;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
		this.landmark = landmark;
		this.pincode = pincode;
	}
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMobule() {
		return mobile;
	}
	public void setMobule(String mobule) {
		this.mobile = mobule;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
