package com.jakubzegar.pracadyplomowaserwer.domain.dto;

public class HeatmapDataDto {
//    private Long heatmapDataId;
    private String apiKey;
    private String coordinateX;
    private String coordinateY;
    private String date;

    public HeatmapDataDto() {
    }

    public HeatmapDataDto(Builder builder) {
//        this.heatmapDataId = builder.heatmapDataId;
        this.apiKey = builder.apiKey;
        this.coordinateX = builder.coordinateX;
        this.coordinateY = builder.coordinateY;
        this.date = builder.date;
    }

//    public Long getHeatmapDataId() {
//        return heatmapDataId;
//    }

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

    public static final class Builder {
//        private Long heatmapDataId;
        private String apiKey;
        private String coordinateX;
        private String coordinateY;
        private String date;

        public Builder() {
        }

//        public Builder heatmapDataId(Long heatmapDataId){
//            this.heatmapDataId = heatmapDataId;
//            return this;
//        }

        public Builder apiKey(String apiKey){
            this.apiKey = apiKey;
            return this;
        }

        public Builder coordinateX(String coordinateX){
            this.coordinateX = coordinateX;
            return this;
        }

        public Builder coordinateY(String coordinateY){
            this.coordinateY = coordinateY;
            return this;
        }

        public Builder date(String date){
            this.date = date;
            return this;
        }

        public HeatmapDataDto build(){
            return new HeatmapDataDto(this);
        }
    }
}
