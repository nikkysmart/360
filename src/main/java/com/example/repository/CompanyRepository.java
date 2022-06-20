package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {

}
