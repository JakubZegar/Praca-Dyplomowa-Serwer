package com.jakubzegar.pracadyplomowaserwer.controller;

import com.jakubzegar.pracadyplomowaserwer.domain.mapper.ObjectJsonMapper;
import com.jakubzegar.pracadyplomowaserwer.payload.LoginRequest;
import com.jakubzegar.pracadyplomowaserwer.payload.TimeLogSelectedRequest;
import com.jakubzegar.pracadyplomowaserwer.security.JwtTokenProvider;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class TimeLogControllerTest {
    private LoginRequest loginRequest = new LoginRequest();

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAllLogs() throws Exception {
        loginRequest.setUsernameOrEmail("Vastar");
        loginRequest.setPassword("admin");
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsernameOrEmail(),
                        loginRequest.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtTokenProvider.generateToken(authentication);
        assertNotNull(token);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/timeLog/getAll").header("Authorization", "Bearer " + token)
                .content("hgft4jdb6h3hjuemp9a1283jdk342"))
                .andExpect(status().isOk());
    }

    @Test
    void getSelectedLogs() throws Exception {
        TimeLogSelectedRequest timeLogSelectedRequest = new TimeLogSelectedRequest();
        timeLogSelectedRequest.setApiKey("hgft4jdb6h3hjuemp9a1283jdk342");
        timeLogSelectedRequest.setStartDate(new Date(2021,01,01));
        timeLogSelectedRequest.setEndDate(new Date(20201,01,10));
        loginRequest.setUsernameOrEmail("Vastar");
        loginRequest.setPassword("admin");
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsernameOrEmail(),
                        loginRequest.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtTokenProvider.generateToken(authentication);
        assertNotNull(token);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/timeLog/getDate").header("Authorization", "Bearer " + token)
                .content(ObjectJsonMapper.asJsonString(timeLogSelectedRequest))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void createTimeLog() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/timeLog/create")
                .content("{\"apiKey\":\"hgft4jdb6h3hjuemp9a1283jdk342\",\"timeSpent\":\"80\",\"date\":\"2021-01-01T13:28:06.419Z\"}")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }
}