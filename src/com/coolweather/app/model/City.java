package com.coolweather.app.model;

public class City {
	private int id;
	private String cityNameString;
	private String cityCode;
	private int provinceId;
	
	public int getId() {
		return this.id;
	}
	
	public int getProvinceId() {
		return this.provinceId;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCityName() {
		return this.cityNameString;
	}
	
	public String getCityCode() {
		return this.cityCode;
	}
	
	public void setCityName(String name) {
		this.cityNameString = name;
	}
	
	public void setCityCode(String code) {
		this.cityCode = code;
	}
	
	public void setProvinceId(int id) {
		this.provinceId= id;
	}
}

