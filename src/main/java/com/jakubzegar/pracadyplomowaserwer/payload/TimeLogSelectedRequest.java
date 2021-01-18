package com.jakubzegar.pracadyplomowaserwer.payload;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class TimeLogSelectedRequest {
    @NotBlank
    private String apiKey;

    @NotBlank
    private Date startDate;

    @NotBlank
    private Date endDate;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}