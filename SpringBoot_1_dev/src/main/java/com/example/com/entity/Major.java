package com.example.com.entity;

public class Major {
	private Integer majorId;
	private String majorName;
	
	public Integer getMajorId() {
		return majorId;
	}
	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public String getMajorInfo() {
		return majorId+","+majorName;
	}
}