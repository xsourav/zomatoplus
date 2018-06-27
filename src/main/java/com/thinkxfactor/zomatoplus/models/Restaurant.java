package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_restaurant")
public class Restaurant implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="rid")
	private long rid;
	
	@Column(name="city")
	private String city;
	
	@Column(name="rname")
	private String rname;
	
	@Column(name="raddress")
	private String raddress;
	
	@Column(name="rwebsite")
	private String rwebsite;
	
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="description")
	private String descrption;
	
	@Column(name="website")
	private String website;
	
	@Column(name="like_count")
	private String likecount;
	
	public Restaurant() {
		super();
	}

	public long getRid() {
		return rid;
	}

	public void setRid(long rid) {
		this.rid = rid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRaddress() {
		return raddress;
	}

	public void setRaddress(String raddress) {
		this.raddress = raddress;
	}

	public String getRwebsite() {
		return rwebsite;
	}

	public void setRwebsite(String rwebsite) {
		this.rwebsite = rwebsite;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLikecount() {
		return likecount;
	}

	public void setLikecount(String likecount) {
		this.likecount = likecount;
	}

	public Restaurant(long rid, String city, String rname, String raddress, String rwebsite, String contact,
			String descrption, String website, String likecount) {
		super();
		this.rid = rid;
		this.city = city;
		this.rname = rname;
		this.raddress = raddress;
		this.rwebsite = rwebsite;
		this.contact = contact;
		this.descrption = descrption;
		this.website = website;
		this.likecount = likecount;
	}	
}
