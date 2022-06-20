package com.example.beans;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
@Table(name = "EMPLOYEE_CLIENT_ASSOCIATION")
public class EmployeeClientAssociation{
	
   // Mapping to the other table
    @ManyToOne
    @JoinColumn(name="ClientId")
    private Client client;
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ClientId")
	private int ClientId; //foreign Key
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID")
	private int employeeId; //Primary Key
	
	@Column(name = "CLIENT_NAME")
	private String clientName;
	
	@Column(name = "OPENINGS")
	private boolean openings;
	
	
	@Column(name = "PROCESS")
	private String process;
	
	@Column(name = "TECHNOLOGIES")
	private String technologies;
	
	@Column(name = "ID_LINK")
	private String jd_Link;
	
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
