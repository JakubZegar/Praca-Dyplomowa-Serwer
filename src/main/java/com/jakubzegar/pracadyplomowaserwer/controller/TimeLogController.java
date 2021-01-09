package com.jakubzegar.pracadyplomowaserwer.controller;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateTimeLogDto;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.TimeLogDto;
import com.jakubzegar.pracadyplomowaserwer.payload.TimeLogSelectedRequest;
import com.jakubzegar.pracadyplomowaserwer.service.TimeLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/timeLog")
public class TimeLogController {

    @Autowired
    private TimeLogService timeLogService;

    @CrossOrigin
    @PostMapping(value = "/getAll")
    public ResponseEntity<List<TimeLogDto>> getAllLogs(@RequestBody String apiKey) {
        List<TimeLogDto> timeLogDtos = timeLogService.getUsersLogs(apiKey);
        return new ResponseEntity<>(timeLogDtos, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(value = "/getDate")
    public ResponseEntity<List<TimeLogDto>> getSelectedLogs(@RequestBody TimeLogSelectedRequest timeLogSelectedRequest) {
        List<TimeLogDto> timeLogDtos = timeLogService.getAllBetweenDates(timeLogSelectedRequest.getApiKey(), timeLogSelectedRequest.getStartDate(), timeLogSelectedRequest.getEndDate());
        return new ResponseEntity<>(timeLogDtos, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(value = "/create")
    public ResponseEntity<?> createHeatmapData(@RequestBody CreateTimeLogDto createTimeLogDto) {
        timeLogService.save(createTimeLogDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
