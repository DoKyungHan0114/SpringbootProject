package com.example.demo;

import com.example.demo.model.ContractorProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractorProfileRepository extends JpaRepository<ContractorProfile, Long> {
}