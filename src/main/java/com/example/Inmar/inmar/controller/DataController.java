//package com.example.Inmar.inmar.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.Inmar.inmar.entity.MetaData;
//import com.example.Inmar.inmar.entity.SkuData;
//import com.example.Inmar.inmar.service.DataService;
//
//@RestController
//@RequestMapping("/api/v1")
//public class DataController {
//	
//	@Autowired
//	private DataService dataService;
//	
//	@GetMapping("/location")
//	public List<MetaData> getLocations(){
//		return dataService.getLocations();
//	}
//	
//	@GetMapping("/location/{id}")
//	public MetaData getLocations(@PathVariable String id){
//		return dataService.findLocationById(id);
//	}
//	
//	
//	@GetMapping("/location/{location_id}/department")
//	public List<SkuData> getDepartmentByLocId(@PathVariable("location_id") String id) throws Exception{
//		return dataService.getDepartmentByLocId(id);
//	}
//
//}
