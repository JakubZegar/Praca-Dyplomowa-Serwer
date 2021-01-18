package com.jakubzegar.pracadyplomowaserwer.domain.dto;

import java.io.Serializable;

public class HeatmapDto implements Serializable {

    private Long heatmapId;
    private String apiKey;
    private String background;
    private String date;

    public HeatmapDto() {
    }

    public HeatmapDto(Builder builder) {
        this.heatmapId = builder.heatmapId;
        this.apiKey = builder.apiKey;
        this.background = builder.background;
        this.date = builder.date;
    }

    public Long getHeatmapId() {
        return heatmapId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getBackground() {
        return background;
    }

    public String getDate() {
        return date;
    }

    public static final class Builder {
        private Long heatmapId;
        private String apiKey;
        private String background;
        private String date;

        public Builder() {
        }

        public Builder heatmapId(Long heatmapId) {
            this.heatmapId = heatmapId;
            return this;
        }

        public Builder apiKey( String apiKey ){
            this.apiKey = apiKey;
            return this;
        }

        public Builder background( String background ){
            this.background = background;
            return this;
        }

        public Builder date( String date ){
            this.date = date;
            return this;
        }

        public HeatmapDto build(){
            return new HeatmapDto(this);
        }
    }
}
