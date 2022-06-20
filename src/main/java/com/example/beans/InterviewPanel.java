package com.example.beans;

import java.time.LocalDateTime;
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

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import lombok.Data;

@Entity
@Table(name="InterviewPanel")
@Data

public class InterviewPanel {
	
	 // Mapping to the other table
    @OneToMany(cascade = CascadeType.ALL)
    private Set<InterviewSchedule> interviewSchedule;
    

	// Mapping the column of InterviewFeedBack to this table 
    @ManyToOne
    //Adding the name to column
    @JoinColumn(name = "feedback_id")
    private InterviewFeedback interviewFeedback;

    
    
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NonNull
	//@OneToOne(mappedBy="InterviewPanel",cascade=CascadeType.PERSIST,fetch=FetchType.LAZY)
	//private InterviewSchedule InterviewPanel;
	@Column(name="InterviewerId")
	private int interviewerId;
	
	
	//@OneToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="BranchId")
	//private Branch Branch;
	@Column(name="InterviewerName")
	private String interviewerName;
	
	@NonNull
	@Column(name="Email")
	private int email;
	
	@Column(name="MobileNo")
	private long mobileNo;
	
	@NonNull
	@Column(name="Password")
	private String password;
	
	@Column(name="Department")
	private String department;
	
	@Column(name="Technology")
	private String technology;
	
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
