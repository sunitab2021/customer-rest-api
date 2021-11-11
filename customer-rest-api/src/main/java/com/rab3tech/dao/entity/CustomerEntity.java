package com.rab3tech.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_tbl")
public class CustomerEntity {
	private int cid;
	private String name;
	private String email;
	private int mobile;
	private String photo;
	private String gender;
	private String education;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Column(name="Name",length = 100)
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
		return "CustomerEntity [cid=" + cid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", photo="
				+ photo + ", gender=" + gender + ", education=" + education + "]";
	}
	
	

}
