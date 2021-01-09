package com.jakubzegar.pracadyplomowaserwer.service;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateTimeLogDto;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.TimeLogDto;

import java.util.Date;
import java.util.List;

public interface  TimeLogService {
    void save(CreateTimeLogDto createTimeLogDto);
    List<TimeLogDto> getUsersLogs(String apiKey);
    List<TimeLogDto> getAllBetweenDates(String apiKey, Date startDate, Date endDate);
}
