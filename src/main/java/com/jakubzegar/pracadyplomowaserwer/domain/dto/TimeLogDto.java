package com.jakubzegar.pracadyplomowaserwer.domain.dto;

import java.util.Date;

public class TimeLogDto {

    private String apiKey;
    private String timeSpent;
    private Date date;

    public TimeLogDto() {}

    private TimeLogDto(Builder builder) {
        this.apiKey = builder.apiKey;
        this.timeSpent = builder.timeSpent;
        this.date = builder.date;
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
        private String apiKey;
        private String timeSpent;
        private Date date;

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
