package com.example.Inmar.inmar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SKU_DATA")
public class SkuData {
	@Id
	private Integer sku;
	private String name;
	private String location;
	private String department;
	private String catagory;
	private String subCategory;
	
	public SkuData() {
		
	}
	public SkuData(Integer sku, String name, String location, String department, String catagory, String subCategory) {
		super();
		this.sku = sku;
		this.name = name;
		this.location = location;
		this.department = department;
		this.catagory = catagory;
		this.subCategory = subCategory;
	}
	public Integer getSku() {
		return sku;
	}
	public void setSku(Integer sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	
	

}
