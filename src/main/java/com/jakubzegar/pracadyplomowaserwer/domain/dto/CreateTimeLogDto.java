package com.jakubzegar.pracadyplomowaserwer.domain.dto;

import java.util.Date;

public class CreateTimeLogDto {
    private String apiKey;
    private String timeSpent;
    private Date date;

    public CreateTimeLogDto() {}

    public String getApiKey() {
        return apiKey;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "CreateTimeLogDto{" +
                "apiKey='" + apiKey + '\'' +
                ", timeSpent='" + timeSpent + '\'' +
                ", date=" + date +
                '}';
    }
}