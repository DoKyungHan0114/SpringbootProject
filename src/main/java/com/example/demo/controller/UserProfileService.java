package com.example.demo.controller;

import com.example.demo.model.AgentProfile;
import com.example.demo.model.ContractorProfile;
import com.example.demo.model.TravelProfile;
import com.example.demo.AgentProfileRepository;
import com.example.demo.ContractorProfileRepository;
import com.example.demo.TravelProfileRepository;
import com.example.demo.UserProfileRepository;
import com.example.demo.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService{

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Autowired
    private AgentProfileRepository agentProfileRepository;

    @Autowired
    private ContractorProfileRepository contractorProfileRepository;

    @Autowired
    private TravelProfileRepository travelProfileRepository;

    public UserProfile saveUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public UserProfile updateUserProfile(Long id, UserProfile userProfile) {
        if (userProfileRepository.existsById(id)) {
            userProfile.setId(id);
            return userProfileRepository.save(userProfile);
        }
        return null;
    }

//    public UserProfile getUserProfile(Long id) {
//        return userProfileRepository.findById(id).orElse(null);
//    }

    public UserProfile getUserProfile(Long id) {
        UserProfile userProfile = userProfileRepository.findById(id).orElse(null);
        if (userProfile instanceof AgentProfile) {
            return agentProfileRepository.findById(id).orElse(null);
        } else if (userProfile instanceof ContractorProfile) {
            return contractorProfileRepository.findById(id).orElse(null);
        } else if (userProfile instanceof TravelProfile) {
            return travelProfileRepository.findById(id).orElse(null);
        }
        return userProfile;
    }

    public void deleteUserProfile(Long id) {
        userProfileRepository.deleteById(id);
    }

    public AgentProfile saveAgentProfile(AgentProfile agentProfile) {
        return agentProfileRepository.save(agentProfile);
    }

    public ContractorProfile saveContractorProfile(ContractorProfile contractorProfile) {
        return contractorProfileRepository.save(contractorProfile);
    }

    public TravelProfile saveTravelProfile(TravelProfile travelProfile) {
        return travelProfileRepository.save(travelProfile);
    }

    // Add similar methods for updating and retrieving specific profile types...
}