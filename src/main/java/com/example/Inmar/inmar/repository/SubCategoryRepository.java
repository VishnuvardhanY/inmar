package com.example.Inmar.inmar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Inmar.inmar.entity.Category;
import com.example.Inmar.inmar.entity.SubCategory;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
	
	List<SubCategory> findByCategoryId(Long cId);
	 // List<Location> findByPublished(boolean published);

	  //List<Location> findByTitleContaining(String title);
}