package com.example.demo;

import com.example.demo.model.TravelProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelProfileRepository extends JpaRepository<TravelProfile, Long> {
}