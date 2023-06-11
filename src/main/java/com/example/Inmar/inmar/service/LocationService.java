package com.example.Inmar.inmar.service;

import java.util.List;

import com.example.Inmar.inmar.entity.Category;
import com.example.Inmar.inmar.entity.Department;
import com.example.Inmar.inmar.entity.Location;
import com.example.Inmar.inmar.entity.SubCategory;

public interface LocationService {

	public List<Location> getLocations();
	List<Department> getAllDepartmentsByLocationId(long locId) throws Exception;
	List<Category> getAllCategorysByDeptId(long locId,long deptId) throws Exception;
	public List<SubCategory> getAllSubCategorysByCategoryId(long locId,long deptId,long catId) throws Exception;
	public SubCategory getSubCategorysBySUbCategoryId(long locId,long deptId,long catId,long subCatId) throws Exception;

}
