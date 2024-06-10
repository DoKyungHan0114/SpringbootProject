package com.example.demo.controller;


import com.example.demo.model.AgentProfile;
import com.example.demo.model.ContractorProfile;
import com.example.demo.model.TravelProfile;
import com.example.demo.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/profile")
public class UserProfileController {
    private final Logger logger = LoggerFactory.getLogger(UserProfileController.class);

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<Long> createUserProfile(@RequestBody UserProfile userProfile) {
        try {
            logger.info("Creating user profile for: {}", userProfile);
            UserProfile createdUserProfile = userProfileService.saveUserProfile(userProfile);
            return ResponseEntity.ok(createdUserProfile.getId());
        } catch (Exception e) {
            logger.error("Error creating user profile: {}", e.toString());
            return ResponseEntity.badRequest().body(-1L);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserProfile> updateUserProfile(@PathVariable Long id, @RequestBody UserProfile userProfile) {
        try {
            UserProfile updatedUserProfile = userProfileService.updateUserProfile(id, userProfile);
            return ResponseEntity.ok(updatedUserProfile);
        } catch (Exception e) {
            logger.error("Error updating user profile: {}", e.toString());
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping("/agent")
    public ResponseEntity<Long> createAgentProfile(@RequestBody AgentProfile agentProfile) {
        try {
            logger.info("Creating agent profile for: {}", agentProfile);
            AgentProfile createdAgentProfile = userProfileService.saveAgentProfile(agentProfile);
            return ResponseEntity.ok(createdAgentProfile.getId());
        } catch (Exception e) {
            logger.error("Error creating agent profile: {}", e.toString());
            return ResponseEntity.badRequest().body(-1L);
        }
    }

    @PostMapping("/travel")
    public ResponseEntity<Long> createTravelProfile(@RequestBody TravelProfile travelProfile) {
        try {
            logger.info("Creating travel profile for: {}", travelProfile);
            TravelProfile createdTravelProfile = userProfileService.saveTravelProfile(travelProfile);
            return ResponseEntity.ok(createdTravelProfile.getId());
        } catch (Exception e) {
            logger.error("Error creating travel profile: {}", e.toString());
            return ResponseEntity.badRequest().body(-1L);
        }
    }

    @PostMapping("/contractor")
    public ResponseEntity<Long> createContractorProfile(@RequestBody ContractorProfile contractorProfile) {
        try {
            logger.info("Creating contractor profile for: {}", contractorProfile);
            ContractorProfile createdContractorProfile = userProfileService.saveContractorProfile(contractorProfile);
            return ResponseEntity.ok(createdContractorProfile.getId());
        } catch (Exception e) {
            logger.error("Error creating contractor profile: {}", e.toString());
            return ResponseEntity.badRequest().body(-1L);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserProfile(@PathVariable Long id) {
        try {
            userProfileService.deleteUserProfile(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            logger.error("Error deleting user profile: {}", e.toString());
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserProfile> getUserProfile(@PathVariable Long id) {
        try {
            UserProfile userProfile = userProfileService.getUserProfile(id);
            if (userProfile != null) {
                return ResponseEntity.ok(userProfile);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            logger.error("Error retrieving user profile: {}", e.toString());
            return ResponseEntity.badRequest().body(null);
        }
    }




}



