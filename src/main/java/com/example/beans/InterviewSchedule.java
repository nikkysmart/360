package com.example.beans;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "INTERVIEWSCHEDULE")
public class InterviewSchedule {
	
	
	//Mapping the column of this table 
    @ManyToOne
    //Adding the name
    @JoinColumn(name = "interviewer_id")
    InterviewPanel interviewPanel;
  
    //mapping the candidateDetails column to this table
    @ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
    
    
    //mapping the recruiterDetails column to this table
    @ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;
    
	
	@Id
	private int interviewScheduleId;
	
	
	
	//private int candidateId;
	
	
	//private InterviewFeedback interviewFeedback;
	//private int recruiterId;
	//private int interviewerId;

	private Date date;
	private Time time;

	private String typeOfInterview;
	private String venue;

	@Column(columnDefinition = "character(1) DEFAULT 'Y'")
	private char isActive;
	private String createdBy;
	private Date created;
	private String updatedBy;
	private Date updatedDate;

//	public int getCandidateId() {
//		return candidateId;
//	}
//
//	public void setCandidateId(int candidateId) {
//		this.candidateId = candidateId;
//	}

	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getTypeOfInterview() {
		return typeOfInterview;
	}

	public void setTypeOfInterview(String typeOfInterview) {
		this.typeOfInterview = typeOfInterview;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public char getIsActive() {
		return isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public int getInterviewScheduleId() {
		return interviewScheduleId;
	}

	public void setInterviewScheduleId(int interviewScheduleId) {
		this.interviewScheduleId = interviewScheduleId;
	}

}
