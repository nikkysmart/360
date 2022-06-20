package com.example.beans;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name="company")
@Data
public class Company {
	
	
	
	 @OneToMany(cascade = CascadeType.ALL)
	 private Set<Branch> branchObj;
	    
	
	@Id
	@Column(name="company_id")
	private int companyId;
	
	@NonNull
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_address")
	private String address;
	
	@NonNull
	@Column(name="email")
	private String email;
	
	@NonNull
	@Column(name="password")
	private String password;
	
	@Column(name="mobileNumber")
	private long mobileNumber;
	
	@Column(name="year_Of_Established")
	private int yearOfEstablished;
	
	@Column(name="isActive",columnDefinition= "character(1) DEFAULT 'Y'")
	private char isActive;
	
	@Column(name="createdBy")
	private String createdBy;
	
	@Column(name="createdDate",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@DateTimeFormat(pattern="dd-mm-yyyy'T'HH:mm")
	private Timestamp createDate;
	
	@Column(name="updatedBy")
	private String updatedBy;
	
	@Column(name="updatedDate",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@DateTimeFormat(pattern="dd-mm-yyyy'T'HH:mm")
	private Timestamp updatedDate;
}
