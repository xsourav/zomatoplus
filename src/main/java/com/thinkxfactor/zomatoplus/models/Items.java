package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="tbl_items")
public class Items{
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="Item_id")
	private long id;
	
	@Column(name="restaurant_id")
	private String restaurantId;
	
	@Column(name="iname")
	private String Iname;
	
	@Column(name="iprice")
	private Double Iprice;
	
	@Column(name="descrption")
	private String description;
	
	public Items()
	{
		
	}

	public Items(long id, String restaurantId, String iname, Double iprice, String description) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		Iname = iname;
		Iprice = iprice;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getInamee() {
		return Iname;
	}

	public void setInamee(String iname) {
		Iname = iname;
	}

	public Double getIprice() {
		return Iprice;
	}

	public void setIprice(Double iprice) {
		Iprice = iprice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
