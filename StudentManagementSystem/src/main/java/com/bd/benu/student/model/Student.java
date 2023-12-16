package com.bd.benu.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENT_MASTER")
public class Student {
	
	@Id
	@Column(name = "SID")
	private Integer sId;
	
	@Column(name = "S_NAME")
	private String sname;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "MOBILE")
	private String mobile;

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
