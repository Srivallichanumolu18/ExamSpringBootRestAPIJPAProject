package com.klef.jfsd.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "order_table")
public class Order 
{
	@Id
	 @Column(name = "oid")
	  private int id;
	  @Column(name = "oname",nullable = false,length = 50)
	  private String name;
	  @Column(name = "oquantity",nullable = false,length = 50)
	  private Double quantity;
	  @Column(name = "sdate",nullable = false,length = 50)
	  private String date;
	  @Column(name = "cname",nullable = false,length = 50)
	  private String cname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	  

}
