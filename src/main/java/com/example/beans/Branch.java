package com.example.beans;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import lombok.Data;

@Entity
@Data
@Table(name = "BRANCH")
public class Branch {
	
	 //Mapping the column companyId of company to this table 
    @ManyToOne
    @JoinColumn(name = "company_id")//Adding the name to column
    private Company company;
  
    //linking oneBranchDetails to Many Recruiters...
    @OneToMany(cascade = CascadeType.ALL)
	 private Set<Employee> employeeObj;
	
  //linking oneBranchDetails to Many InterviewPanel...
    @OneToMany(cascade = CascadeType.ALL)
	 private Set<InterviewPanel> interviewPanel;
	
    
	@Id
	@NonNull
	@Column(name="branch_id")
	public int branchId;
	
	@NonNull
	@Column(name="branch_name")
	public String branchName;
	
	@NonNull
	@Column(name="branch_address")
	public String branchAddress;
	
	@NonNull
	@Column(name="email_id")
	public String emailId;
	
	@NonNull
	@Column(name="password")
	//@Size(min=6, max=30)
	private String password;
	
	
	@NonNull
	@Column(name="mobileNo")
	public long mobileNo;
	
	
	@Column(name="isActive",columnDefinition=" character(1) DEFAULT'Y'::bpchar")
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
