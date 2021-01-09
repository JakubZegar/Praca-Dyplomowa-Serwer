package com.jakubzegar.pracadyplomowaserwer.domain.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "timeLog")
public class TimeLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timeLogId")
    private Long timeLogId;

    @Column(name = "apiKey")
    private String apiKey;

    @Column(name = "timeSpent")
    private String timeSpent;

    @Column(name = "date")
    @CreatedDate
    private Date date;

    public TimeLog() {
    }

    public Long getTimeLogId() {
        return timeLogId;
    }

    public void setTimeLogId(Long timeLogId) {
        this.timeLogId = timeLogId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
