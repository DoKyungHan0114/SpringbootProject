package com.example.demo;

import com.example.demo.model.AgentProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentProfileRepository extends JpaRepository<AgentProfile, Long> {
}