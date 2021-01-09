package com.jakubzegar.pracadyplomowaserwer.domain.dto;

import java.io.Serializable;

public class CreateHeatmapDto implements Serializable {

    private String apiKey;
    private String background;
    private String date;

    public CreateHeatmapDto() {}

    public String getApiKey() {
        return apiKey;
    }

    public String getBackground() {
        return background;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "CreateHeatmapDto{" +
                "apiKey='" + apiKey + '\'' +
                ", background='" + background + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}