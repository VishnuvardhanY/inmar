package com.example.Inmar.inmar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Locations")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "location_generator")
	private long id;

	private String locationName;

	public Location() {

	}

	public Location(long id, String locationName) {
		super();
		this.id = id;
		this.locationName = locationName;
	}

	public long getLocationId() {
		return id;
	}

	public void setLocationId(long locationId) {
		this.id = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
