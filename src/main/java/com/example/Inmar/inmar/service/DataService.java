package com.example.Inmar.inmar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Inmar.inmar.entity.MetaData;
import com.example.Inmar.inmar.entity.SkuData;


public interface DataService {
	
	public List<MetaData> getLocations();
	public MetaData findLocationById(String id);
	public List<SkuData> getDepartmentByLocId(String locId) throws Exception;

}
