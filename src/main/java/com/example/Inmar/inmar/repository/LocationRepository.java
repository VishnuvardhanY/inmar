package com.example.Inmar.inmar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Inmar.inmar.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
	 // List<Location> findByPublished(boolean published);

	  //List<Location> findByTitleContaining(String title);
}