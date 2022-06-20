package com.example.beans;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
@Table(name = "JOB_DESCRIPTION")
public class JobDescription  {
	
	 @ManyToOne
	    @JoinColumn(name="ClientId")
	    private Client objClient;
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "ClientId")
		private int clientId; //foreign Key
	 
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "JD_ID")
	private int JdId; //Primary Key
	
	
	
	@Column(name = "PROCESS")
	private String process;
	
	@Column(name = "DEPARTMENT")
	private String department;
	
	
	@Column(name = "POSITION")
	private String position;
	
	@Column(name = "CTC")
	private String ctc;
	
	@Column(name = "VACANCIES")
	private int No_of_Vacancies;
	
	@Column(name = "LOCATION")
	private String location;
	
	@Column(name = "KEYSKILLS")
	private String keySkills;
	
	@Column(name = "QUALIFICATION")
	private String qualification;
	
	@Column(name = "YEAR_OF_PASSING")
	private String yearOfPassing;
	
	@Column(name = "SHIFTS")
	private String shifts;
	
	@Column(name = "EXPERIENCE")
	private float experience_In_Yrs;
	
	@Column(name = "COMMENTS")
	private String comments;
	
	
	
	
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
