package com.jakubzegar.pracadyplomowaserwer.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "heatmapData")
public class HeatmapData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "heatmapDataId")
    private Long heatmapDataId;

    @Column(name = "heatmapId")
    private String apiKey;

    @Column(name = "coordinateX")
    private String coordinateX;

    @Column(name = "coordinateY")
    private String coordinateY;

    @Column(name = "date")
    private String date;

    public HeatmapData() {
    }

    public Long getHeatmapDataId() {
        return heatmapDataId;
    }

    public void setHeatmapDataId(Long hetmapDataId) {
        this.heatmapDataId = hetmapDataId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(String coordinateX) {
        this.coordinateX = coordinateX;
    }

    public String getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(String coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
