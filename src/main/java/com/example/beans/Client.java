package com.example.beans;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import lombok.Data;

@Entity
@Table(name="Client")
@Data
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NonNull
	//@OneToOne(mappedBy="Client",cascade=CascadeType.PERSIST,fetch=FetchType.LAZY)
	//private InterviewSchedule interviewSchedule;
	
	@OneToMany(mappedBy="Client",cascade=CascadeType.ALL)
	//Set<EmployeeClientAssociation> EmployeeClientAssociation;
	private Set<EmployeeClientAssociation> employeeClientAssociation;
	
	
	
	@Column(name="ClientId")
	private int clientId;
	
	@Column(name="ClientName")
    private String clientName;
	
	@Column(name="MobileNo")
    private long mobileNo;
	
	@NonNull
	@Column(name="Email")
    private String email;
	
	@NonNull
	@Column(name="Password")
    private String password;
	
	
	//@OneToOne(fetch=FetchType.LAZY)
		//@JoinColumn(name="RecruitmentId")
		//private Recruiter recruiter;
	@Column(name="isActive",columnDefinition=" character(1) DEFAULT'Y'::bpchar")
	private char isActive;
	
	
	@Column(name="createdby")
	private String createdby;
	
	 @Column(name="createdDate",columnDefinition="TIMESTAMP")      
	  //@Temporal(TemporalType.TIMESTAMP)
	    @DateTimeFormat(pattern="dd-MM-yyyy'T'HH:mm")
		private LocalDateTime createdDate; // DEFAULT now(),
		
		@Column(name="updatedby")	
		private String updatedby; //character varying(45),
		
		@Column(name="updatedDate",columnDefinition="TIMESTAMP")      
	  // @Temporal(TemporalType.TIMESTAMP)
	    @DateTimeFormat(pattern="dd-MM-yyyy'T'HH:mm")
		private LocalDateTime updatedDate;
    
}
