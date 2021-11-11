package com.rab3tech.controller.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerDTO {
	private int cid;
	private String name;
	private String email;
	private int mobile;
	private String photo;
	private String gender;
	private String education;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	@Override
	public String toString() {
		return "CustomerDTO [cid=" + cid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", photo="
				+ photo + ", gender=" + gender + ", education=" + education + "]";
	}
	
	

}
