package com.example.Inmar.inmar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Inmar.inmar.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	List<Category> findByDeptId(Long dId);
	 // List<Location> findByPublished(boolean published);

	  //List<Location> findByTitleContaining(String title);
}