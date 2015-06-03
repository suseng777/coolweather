package com.coolweather.app.model;

public class Province {
	private int id;
	private String provinceNameString;
	private String provinceCode;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getProvinceName() {
		return this.provinceNameString;
	}
	
	public String getProvinceCode() {
		return this.provinceCode;
	}
	
	public void setProvinceName(String name) {
		this.provinceNameString = name;
	}
	
	public void setProvinceCode(String code) {
		this.provinceCode = code;
	}
}
