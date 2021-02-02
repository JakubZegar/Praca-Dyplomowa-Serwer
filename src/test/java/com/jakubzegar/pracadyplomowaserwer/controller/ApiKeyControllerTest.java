package com.jakubzegar.pracadyplomowaserwer.controller;

import com.jakubzegar.pracadyplomowaserwer.domain.entity.ApiKey;
import com.jakubzegar.pracadyplomowaserwer.domain.mapper.ObjectJsonMapper;
import com.jakubzegar.pracadyplomowaserwer.payload.LoginRequest;
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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class ApiKeyControllerTest {

    private LoginRequest loginRequest = new LoginRequest();

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getKey() throws Exception {
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
        mockMvc.perform(MockMvcRequestBuilders.get("/apiKey/get/1")
                .header("Authorization", "Bearer " + token))
                .andExpect(status().isOk());
    }

    @Test
    void createApiKey() throws Exception {
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
        ApiKey apiKey = new ApiKey();
        apiKey.setApiKey("af4wf333");
        apiKey.setUserId(2L);
        mockMvc.perform(MockMvcRequestBuilders.post("/apiKey/create")
                .content(ObjectJsonMapper.asJsonString(apiKey))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + token))
                .andExpect(status().isCreated());
    }
}