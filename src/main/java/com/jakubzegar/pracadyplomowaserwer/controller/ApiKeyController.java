package com.jakubzegar.pracadyplomowaserwer.controller;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.ApiKeyDto;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateApiKeyDto;
import com.jakubzegar.pracadyplomowaserwer.service.ApiKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/key")
public class ApiKeyController {

    @Autowired
    ApiKeyService apiKeyService;

    @CrossOrigin
    @PostMapping(value = "/get")
    public ResponseEntity<ApiKeyDto> getKey(@RequestBody Long id) {
        ApiKeyDto apiKeyDto = apiKeyService.getApiKeyForExactUser(id);
        return new ResponseEntity<>(apiKeyDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping( value="/create")
        public ResponseEntity<?> createApiKey(@RequestBody CreateApiKeyDto createApiKeyDto) {
        apiKeyService.save(createApiKeyDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
