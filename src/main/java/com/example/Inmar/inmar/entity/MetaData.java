package com.example.Inmar.inmar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="META_DATA")
public class MetaData {
	
	@Id
	private Integer id;
	private String Location;
	private String Department;
	private String Category;
	private String SubCategory;
	
	public MetaData() {
		
	}
	public MetaData(Integer id, String location, String department, String category, String subCategory) {
		super();
		this.id = id;
		Location = location;
		Department = department;
		Category = category;
		SubCategory = subCategory;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getSubCategory() {
		return SubCategory;
	}
	public void setSubCategory(String subCategory) {
		SubCategory = subCategory;
	}
	
	

}
