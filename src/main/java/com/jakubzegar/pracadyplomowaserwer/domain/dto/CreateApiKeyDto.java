package com.jakubzegar.pracadyplomowaserwer.domain.dto;

public class CreateApiKeyDto {

    private Long userId;
    private String apiKey;

    public CreateApiKeyDto() {
    }

    public Long getUserId() {
        return userId;
    }

    public String getApiKey() {
        return apiKey;
    }

    @Override
    public String toString() {
        return "CreateApiKeyDto{" +
                "userId='" + userId + '\'' +
                ", apiKey='" + apiKey + '\'' +
                '}';
    }
}
