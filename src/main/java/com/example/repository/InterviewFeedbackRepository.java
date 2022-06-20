package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.InterviewFeedback;
@Repository
public interface InterviewFeedbackRepository extends JpaRepository<InterviewFeedback, Integer>{

}
