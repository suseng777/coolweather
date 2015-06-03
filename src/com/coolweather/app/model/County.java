package com.coolweather.app.model;

public class County {
	private int id;
	private String countyNameString;
	private String countyCode;
	private int cityId;
	
	public int getId() {
		return this.id;
	}
	
	public int getcityId() {
		return this.cityId;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getcountyName() {
		return this.countyNameString;
	}
	
	public String getcountyCode() {
		return this.countyCode;
	}
	
	public void setcountyName(String name) {
		this.countyNameString = name;
	}
	
	public void setcountyCode(String code) {
		this.countyCode = code;
	}
	
	public void setcityId(int id) {
		this.cityId= id;
	}
}


