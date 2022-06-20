package com.example.beans;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
@Table(name = "INTERVIEWER_AVAILABILITY")
public class InterviewerAvailability {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "INTERVIEWER_ID")
	private int InterviewerId;
	
	@Column(name = "WORKING_DAYS")
	private String WorkingDays;
	
	@Column(name = "TIMINGS")
	private String Timings;
	
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
