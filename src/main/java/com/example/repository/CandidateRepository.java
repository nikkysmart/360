package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}
