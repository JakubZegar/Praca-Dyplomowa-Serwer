package com.jakubzegar.pracadyplomowaserwer.controller;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateHeatmapDto;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.HeatmapDto;
import com.jakubzegar.pracadyplomowaserwer.service.HeatmapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/heatmap")
public class HeatmapController {

    @Autowired
    private HeatmapService heatmapService;

    @CrossOrigin
    @GetMapping(value = "/get")
    public ResponseEntity<HeatmapDto> getHeatmap(@RequestBody String apiKey) {
        HeatmapDto heatmapDto = heatmapService.getUsersHeatmap(apiKey);
        return new ResponseEntity<>(heatmapDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(value = "/create")
    public ResponseEntity<?> createHeatmap(@RequestBody CreateHeatmapDto createHeatmapDto) {
        heatmapService.save(createHeatmapDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
