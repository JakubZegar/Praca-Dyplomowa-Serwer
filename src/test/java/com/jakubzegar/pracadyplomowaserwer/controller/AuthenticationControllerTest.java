package com.jakubzegar.pracadyplomowaserwer.controller;

import com.jakubzegar.pracadyplomowaserwer.domain.mapper.ObjectJsonMapper;
import com.jakubzegar.pracadyplomowaserwer.payload.LoginRequest;
import com.jakubzegar.pracadyplomowaserwer.payload.SignUpRequest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class AuthenticationControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void authenticateUser() throws Exception {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsernameOrEmail("Vastar");
        loginRequest.setPassword("admin");
        mockMvc.perform(MockMvcRequestBuilders.post("/api/auth/signin")
                .content(ObjectJsonMapper.asJsonString(loginRequest))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void authenticateUserWrongCredentials() throws Exception {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsernameOrEmail("brak");
        loginRequest.setPassword("brak");
        mockMvc.perform(MockMvcRequestBuilders.post("/api/auth/signin")
                .content(ObjectJsonMapper.asJsonString(loginRequest))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError());
    }

    @Test
    void registerUser() throws Exception {
        SignUpRequest signUpRequest = new SignUpRequest();
        signUpRequest.setName("testowanazwa");
        signUpRequest.setUsername("TestowyUzytkownik");
        signUpRequest.setEmail("email@email.pl");
        signUpRequest.setPassword("test");
        mockMvc.perform(MockMvcRequestBuilders.post("/api/auth/signup")
                .content(ObjectJsonMapper.asJsonString(signUpRequest))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError());
    }

    @Test
    void registerUsernameWrongCredentials() throws  Exception {
        SignUpRequest wrongSignUpRequest = new SignUpRequest();
        wrongSignUpRequest.setName("Vastar");
        wrongSignUpRequest.setUsername("Vastar");
        wrongSignUpRequest.setEmail("test@test.pl");
        wrongSignUpRequest.setPassword("test");
        mockMvc.perform(MockMvcRequestBuilders.post("/api/auth/signup")
                .content(ObjectJsonMapper.asJsonString(wrongSignUpRequest))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError());
    }
}