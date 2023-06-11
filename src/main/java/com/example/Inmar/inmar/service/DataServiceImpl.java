package com.example.Inmar.inmar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Inmar.inmar.entity.MetaData;
import com.example.Inmar.inmar.entity.SkuData;
import com.example.Inmar.inmar.repository.MetaDataRepository;
import com.example.Inmar.inmar.repository.SkuDataRepository;


@Service
public class DataServiceImpl implements DataService{
	
	@Autowired
	private MetaDataRepository metaDataRepo;
	
	@Autowired
	private SkuDataRepository skuDataRepo;

	@Override
	public List<MetaData> getLocations() {
		return metaDataRepo.findAll();
	}

	@Override
	public MetaData findLocationById(String id) {
		
		return metaDataRepo.findById(Integer.valueOf(id)).get();
	}

	@Override
	public List<SkuData> getDepartmentByLocId(String locId) throws Exception {
		
		MetaData data = findLocationById(locId);
		String locationName;
		if(null != data) {
			locationName=data.getLocation();
			return skuDataRepo.findByLocation(locationName);
		}else {
			throw new Exception("location not found for given location id");
		}
	}
	
	

}
