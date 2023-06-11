package com.example.Inmar.inmar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Inmar.inmar.entity.SkuData;

public interface SkuDataRepository extends JpaRepository<SkuData,Integer>{

	List<SkuData> findByLocation(String location);

}
