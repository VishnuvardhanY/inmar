package com.example.Inmar.inmar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Inmar.inmar.entity.Category;
import com.example.Inmar.inmar.entity.Department;
import com.example.Inmar.inmar.entity.Location;
import com.example.Inmar.inmar.entity.SubCategory;
import com.example.Inmar.inmar.repository.DepartmentRepository;
import com.example.Inmar.inmar.repository.LocationRepository;
import com.example.Inmar.inmar.service.LocationService;

@RestController
@RequestMapping("/api/v1")
public class LocationController {

	@Autowired
	private LocationService locationService;

	@Autowired
	private LocationRepository locationRepo;

	@Autowired
	private DepartmentRepository deptRepo;

	@GetMapping("/location")
	public List<Location> getLocations() {
		return locationService.getLocations();
	}

	@GetMapping("/location/{location_id}/department")
	public ResponseEntity<List<Department>> getAllDepartmentsByLocationId(
			@PathVariable(value = "location_id") Long locId) throws Exception {
		List<Department> departments = locationService.getAllDepartmentsByLocationId(locId);
		return new ResponseEntity<>(departments, HttpStatus.OK);
	}
	
	@GetMapping("/location/{location_id}/department/{department_id}/category")
	public ResponseEntity<List<Category>> getAllCategoryByLocIdandDepId(
			@PathVariable(value = "location_id") Long locId,
			@PathVariable(value = "department_id") Long deptId) throws Exception {
		List<Category> comments = locationService.getAllCategorysByDeptId(locId, deptId);
		return new ResponseEntity<>(comments, HttpStatus.OK);
	}
	
	@GetMapping("/location/{location_id}/department/{department_id}/category/{category_id}/subcategory")
	public ResponseEntity<List<SubCategory>> getAllSubCategorysByLocIdAndDepIdAndCategoryId(
			@PathVariable(value = "location_id") Long locId,
			@PathVariable(value = "department_id") Long deptId,
			@PathVariable(value = "category_id") Long catId) throws Exception {
		List<SubCategory> subCategories = locationService.getAllSubCategorysByCategoryId(locId, deptId,catId);
		return new ResponseEntity<>(subCategories, HttpStatus.OK);
	}
	
	@GetMapping("/location/{location_id}/department/{department_id}/category/{category_id}/subcategory/{subcategory_id}")
	public ResponseEntity<SubCategory> getSubCategorysByLocIdAndDepIdAndCategoryIdAndSubCatId(
			@PathVariable(value = "location_id") Long locId,
			@PathVariable(value = "department_id") Long deptId,
			@PathVariable(value = "category_id") Long catId,
			@PathVariable(value = "subcategory_id") Long subCatId) throws Exception {
		SubCategory SubCategory = locationService.getSubCategorysBySUbCategoryId(locId, deptId,catId,subCatId);
		return new ResponseEntity<>(SubCategory, HttpStatus.OK);
	}

}
