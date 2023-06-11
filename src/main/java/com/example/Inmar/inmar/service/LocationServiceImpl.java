package com.example.Inmar.inmar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Inmar.inmar.entity.Category;
import com.example.Inmar.inmar.entity.Department;
import com.example.Inmar.inmar.entity.Location;
import com.example.Inmar.inmar.entity.SubCategory;
import com.example.Inmar.inmar.repository.CategoryRepository;
import com.example.Inmar.inmar.repository.DepartmentRepository;
import com.example.Inmar.inmar.repository.LocationRepository;
import com.example.Inmar.inmar.repository.SubCategoryRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepo;
	
	@Autowired
	private DepartmentRepository deptRepo;
	
	@Autowired
	private CategoryRepository cateRepo;
	
	@Autowired
	private SubCategoryRepository subCateRepo;

	@Override
	public List<Location> getLocations() {
		return locationRepo.findAll();
	}
	
	@Override
	public List<Department> getAllDepartmentsByLocationId(long locId) throws Exception {
		if (!locationRepo.existsById(locId)) {
		      throw new Exception("Not found location id with id = " + locId);
		    }

		    return deptRepo.findByLocationId(locId);
	}

	@Override
	public List<Category> getAllCategorysByDeptId(long locId,long deptId) throws Exception {

		if (!locationRepo.existsById(locId) || !deptRepo.existsById(deptId) || !deptRepo.findByLocationId(locId).stream().anyMatch(dept -> dept.getId() == deptId)) {
			
		      throw new Exception("Given LocationId/DeptId Not Present or deptId not under Location or viceversa Location ="+locId+"DeptId="+deptId);
		    }
		return cateRepo.findByDeptId(deptId);
	}
	
	@Override
	public List<SubCategory> getAllSubCategorysByCategoryId(long locId,long deptId,long catId) throws Exception {

		if (!locationRepo.existsById(locId) || !deptRepo.existsById(deptId) || !cateRepo.existsById(locId) 
			 ||!deptRepo.findByLocationId(locId).stream().anyMatch(dept -> dept.getId() == deptId)
			 ||!cateRepo.findByDeptId(deptId).stream().anyMatch(cat -> cat.getId() == catId) ) {
			
		      throw new Exception("Given LocationId/DeptId Not Present or deptId not under Location or viceversa Location ="+locId+"DeptId="+deptId);
		    }
		return subCateRepo.findByCategoryId(catId);
	}

	@Override
	public SubCategory getSubCategorysBySUbCategoryId(long locId, long deptId, long catId, long subCatId)
			throws Exception {
		Optional<SubCategory> subCat=getAllSubCategorysByCategoryId(locId,deptId,catId).stream().filter(subCat1 -> subCat1.getId() == subCatId).findFirst();
		
		if(subCat.isPresent()) {
			return subCat.orElseThrow(() -> new Exception("SubCatory not found for given subcat Id"));
		}
		return null;
	}

}
