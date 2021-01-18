package com.jakubzegar.pracadyplomowaserwer.domain.dto;

import java.io.Serializable;

public class CreateHeatmapDataDto implements Serializable {
    private String apiKey;
    private String coordinateX;
    private String coordinateY;
    private String date;

    public CreateHeatmapDataDto() {
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getCoordinateX() {
        return coordinateX;
    }

    public String getCoordinateY() {
        return coordinateY;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "CreateHeatmapDto{" +
                "apiKey='" + apiKey + '\'' +
                ", coordinateX='" + coordinateX + '\'' +
                ", coordinateY='" + coordinateY + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
