package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.InterviewSchedule;
@Repository
public interface InterviewScheduleRepository extends JpaRepository <InterviewSchedule,Integer>{

}
