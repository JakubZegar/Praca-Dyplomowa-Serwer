package com.jakubzegar.pracadyplomowaserwer.domain.dto;

import java.util.Date;

public class TimeLogDto {

    private Long timeLogId;
    private String apiKey;
    private String timeSpent;
    private Date date;

    public TimeLogDto() {}

    private TimeLogDto(Builder builder) {
        this.timeLogId = builder.timeLogId;
        this.apiKey = builder.apiKey;
        this.timeSpent = builder.timeSpent;
        this.date = builder.date;
    }

    public Long getTimeLogId() {
        return timeLogId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public Date getDate() {
        return date;
    }

    public static final class Builder {
        private Long timeLogId;
        private String apiKey;
        private String timeSpent;
        private Date date;

        public Builder timeLogId(Long timeLogId) {
            this.timeLogId = timeLogId;
            return this;
        }

        public Builder apiKey(String apiKey){
            this.apiKey = apiKey;
            return this;
        }

        public Builder timeSpent(String timeSpent){
            this.timeSpent = timeSpent;
            return this;
        }

        public Builder date(Date date){
            this.date = date;
            return this;
        }

        public TimeLogDto build() {
            return new TimeLogDto(this);
        }
    }
}
