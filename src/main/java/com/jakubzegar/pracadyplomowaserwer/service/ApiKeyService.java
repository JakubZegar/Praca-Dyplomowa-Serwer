package com.jakubzegar.pracadyplomowaserwer.service;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.ApiKeyDto;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateApiKeyDto;

public interface ApiKeyService {
    void save(CreateApiKeyDto createApiKeyDto);
    void deleteById(Long userId);
    ApiKeyDto getApiKeyForExactUser(Long userId);
}
