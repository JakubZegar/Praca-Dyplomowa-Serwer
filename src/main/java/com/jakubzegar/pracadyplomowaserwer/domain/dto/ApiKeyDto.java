package com.jakubzegar.pracadyplomowaserwer.domain.dto;

import java.io.Serializable;

public class ApiKeyDto implements Serializable {

    private Long userId;
    private String apiKey;

    public ApiKeyDto() {

    }

    private ApiKeyDto(Builder builder) {
        this.userId = builder.userId;
        this.apiKey = builder.apiKey;
    }

    public Long getUserId() {
        return userId;
    }

    public String getApiKey() {
        return apiKey;
    }


    public static final class Builder {
        private Long userId;
        private String apiKey;

        public Builder() {
        }

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
        }

        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public ApiKeyDto build() {
            return new ApiKeyDto(this);
        }
    }
}
