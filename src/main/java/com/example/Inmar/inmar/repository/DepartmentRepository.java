package com.example.Inmar.inmar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Inmar.inmar.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	List<Department> findByLocationId(Long lid);
	  //List<Department> findByPublished(boolean published);
	  //List<Department> findByTitleContaining(String title);
}