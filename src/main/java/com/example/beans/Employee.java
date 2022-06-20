package com.example.beans;


import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import lombok.Data;

@Entity
@Table(name = "Employee")
@Data
public class Employee {
	
// Mapping the column of branchDetilas to this table 
    @ManyToOne
    //Adding the name to column
    @JoinColumn(name = "branch_id")
    private Branch branch;
    
//Linking RecruiterDetails to the Client
    @OneToMany(cascade = CascadeType.ALL)
	 private Set<Client> clientObj;
	
  //linking with InterviewSchedule...
  	@OneToMany(cascade=CascadeType.ALL)
  	private Set<InterviewSchedule> interviewSchedule;
  	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="recruiter_id")
	@NonNull
	public int recruiterId;

	@NonNull
	@Column(name="reccuiter_name")
	private String recruiterName;
	
	@NonNull
	@Column(name="email_id")
	private String emailId;
	
	@NonNull
	@Column(name="password")
	//@Size(min=6, max=30)
	private String password;
	
	
	@NonNull
	@Column(name="mobileNo")
	private long mobileNo;
	
	
	@Column(name="isActive" ,columnDefinition="character(1) DEFAULT 'Y'")
	private char isActive;
	
	@Column(name="createdby")
	private String createdby; //character varying(45),
	 
    @Column(name="createdDate" ,columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")      
  //@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern="dd-MM-yyyy'T'HH:mm")
	private Timestamp createdDate; // DEFAULT now(),
	
	@Column(name="updatedby")	
	private String updatedby; //character varying(45),
	
    @Column(name="updatedDate", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")      
  // @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern="dd-MM-yyyy'T'HH:mm")
	private Timestamp updatedDate;
	
	
}
