package com.xworkz.mouse.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mousedetails")
public class MouseDTO implements java.io.Serializable {
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="M_ID")
	private int mouseId;
	@Column(name="NAME")
private String name;
	@Column(name="SIZE")
private String size;
	@Column(name="COLOR")
private String color;
	@Column(name="PRICE")
private double price;
	@Column(name="IS_WIRED")
private boolean isWired;
public int getMouseId() {
	return mouseId;
}
public void setMouseId(int mouseId) {
	this.mouseId = mouseId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public boolean isWired() {
	return isWired;
}
public void setWired(boolean isWired) {
	this.isWired = isWired;
}
public MouseDTO(int mouseId,String name, String size, String color, double price, boolean isWired) {
	super();
	this.mouseId=mouseId;
	this.name = name;
	this.size = size;
	this.color = color;
	this.price = price;
	this.isWired = isWired;
}
public MouseDTO() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "the details of mouse is" + mouseId + ", name=" + name + ", size=" + size + ", color=" + color + ", price="
			+ price + ", isWired=" + isWired + "]";
}


}
