//package com.example.demo.controller;
//
//import com.example.demo.controller.UserProfileService;
//import com.example.demo.model.UserProfile;
//import com.example.demo.UserProfileRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import static org.mockito.Mockito.when;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static javax.management.Query.times;
//import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.*;
//
//@ExtendWith(MockitoExtension.class)
//public class UserProfileServiceTest {
//
//    @Mock
//    private UserProfileRepository userProfileRepository;
//
//    @InjectMocks
//    private UserProfileService userProfileService;
//
//    @Test
//    public void testSaveUserProfile() {
//        UserProfile userProfile = new UserProfile();
//        userProfile.setId(1L);
//        userProfile.setName("Test User");
//
//        when(userProfileRepository.save(userProfile)).thenReturn(userProfile);
//
//        UserProfile result = userProfileService.saveUserProfile(userProfile);
//
//        verify(userProfileRepository, times(1)).save(userProfile);
//        assertEquals(userProfile, result);
//    }
//}