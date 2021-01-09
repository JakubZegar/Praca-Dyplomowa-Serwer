package com.jakubzegar.pracadyplomowaserwer.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "heatmap")
public class Heatmap implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "heatmapId")
    private Long heatmapId;

    @Column(name = "apiKey")
    private String apiKey;

    @Column(name = "backgorund")
    private String background;

    @Column(name = "date")
    private String date;

    public Heatmap() {
    }

    public Long getHeatmapId() {
        return heatmapId;
    }

    public void setHeatmapId(Long heatmapId) {
        this.heatmapId = heatmapId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
