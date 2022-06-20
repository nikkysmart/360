package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer>{

}
