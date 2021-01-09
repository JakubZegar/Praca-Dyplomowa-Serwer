package com.jakubzegar.pracadyplomowaserwer.domain.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "apiKey")
public class ApiKey implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "api_key")
    private String apiKey;

    public ApiKey() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
