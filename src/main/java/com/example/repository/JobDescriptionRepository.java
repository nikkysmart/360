package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.InterviewFeedback;
import com.example.beans.JobDescription;

public interface JobDescriptionRepository extends JpaRepository<JobDescription, Integer>{

}
