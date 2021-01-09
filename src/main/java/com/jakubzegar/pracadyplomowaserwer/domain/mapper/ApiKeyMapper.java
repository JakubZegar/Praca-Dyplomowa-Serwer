package com.jakubzegar.pracadyplomowaserwer.domain.mapper;

import com.jakubzegar.pracadyplomowaserwer.domain.converter.Converter;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.ApiKeyDto;
import com.jakubzegar.pracadyplomowaserwer.domain.entity.ApiKey;
import org.springframework.stereotype.Component;

@Component
public class ApiKeyMapper implements Converter<ApiKey, ApiKeyDto> {
    @Override
    public ApiKeyDto convert(ApiKey from) {
        return new ApiKeyDto.Builder()
                .apiKey(from.getApiKey())
                .userId(from.getUserId())
                .build();
    }
}