package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.EmployeeClientAssociation;

public interface EmployeeClientAssociationRepository extends JpaRepository<EmployeeClientAssociation, Integer> {

}
