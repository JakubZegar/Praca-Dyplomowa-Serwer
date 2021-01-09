package com.jakubzegar.pracadyplomowaserwer.controller;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateHeatmapDataDto;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.HeatmapDataDto;
import com.jakubzegar.pracadyplomowaserwer.service.HeatmapDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/heatmapData")
public class HeatmapDataController {

    @Autowired
    private HeatmapDataService heatmapDataService;

    @CrossOrigin
    @PostMapping(value = "/get")
    public ResponseEntity<List<HeatmapDataDto>> getHeatmap(@RequestBody String apiKey) {
        List<HeatmapDataDto> heatmapDto = heatmapDataService.getHeatmapDataForUser(apiKey);
        return new ResponseEntity<>(heatmapDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(value = "/create")
    public ResponseEntity<?> createHeatmapData(@RequestBody CreateHeatmapDataDto createHeatmapDataDto) {
        heatmapDataService.save(createHeatmapDataDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
