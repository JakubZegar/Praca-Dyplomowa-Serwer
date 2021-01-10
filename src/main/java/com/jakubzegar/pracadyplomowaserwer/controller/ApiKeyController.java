package com.jakubzegar.pracadyplomowaserwer.controller;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.ApiKeyDto;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateApiKeyDto;
import com.jakubzegar.pracadyplomowaserwer.service.ApiKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apiKey")
public class ApiKeyController {

    @Autowired
    ApiKeyService apiKeyService;

    @CrossOrigin
    @GetMapping(value = "/get/{userId}")
    public ResponseEntity<ApiKeyDto> getKey(@PathVariable Long userId) {
        ApiKeyDto apiKeyDto = apiKeyService.getApiKeyForExactUser(userId);
        return new ResponseEntity<>(apiKeyDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping( value="/create")
        public ResponseEntity<?> createApiKey(@RequestBody CreateApiKeyDto createApiKeyDto) {
        apiKeyService.save(createApiKeyDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
