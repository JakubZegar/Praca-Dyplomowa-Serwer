package com.jakubzegar.pracadyplomowaserwer.domain.mapper;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateApiKeyDto;
import com.jakubzegar.pracadyplomowaserwer.domain.entity.ApiKey;
import org.springframework.stereotype.Component;

@Component
public class CreateApiKeyMapper {
    public ApiKey createApiKeyDtoToApiKey(CreateApiKeyDto createApiKeyDto) {
        ApiKey apiKey = new ApiKey();
        apiKey.setUserId(createApiKeyDto.getUserId());
        apiKey.setApiKey(createApiKeyDto.getApiKey());
        return apiKey;
    }
}
