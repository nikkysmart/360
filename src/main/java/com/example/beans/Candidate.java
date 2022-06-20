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
@Table(name="candidate")
@Data
public class Candidate {
	
	//linking with InterviewSchedule...
	@OneToMany(cascade=CascadeType.ALL)
	private Set<InterviewSchedule> interviewSchedule;
	
	
	
	@Id
	@Column(name="candidate_id")
	private int candidateId;
	
	@NonNull
	@Column(name="candidate_name")
	private String candidateName;
	
	@Column(name="gender")
	private String gender;
	
	@NonNull
	@Column(name="email")
	private String email;
	
	@NonNull
	@Column(name="password")
	private String password;
	
	@Column(name="mobile_number")
	private long mobile_number;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="year_of_pass")
	private int yearOfPass;
	
	@Column(name="skills")
	private String skills;
	
	@Column(name="year_of_experience")
	private int yearsOfExperience;
	
	@Column(name="address")
	private String adderss;
	
	@Column(name="location")
	private String location;
	
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


