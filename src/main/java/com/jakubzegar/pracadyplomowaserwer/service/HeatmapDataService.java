package com.jakubzegar.pracadyplomowaserwer.service;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateHeatmapDataDto;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.HeatmapDataDto;

import java.util.List;

public interface HeatmapDataService {

    void save(CreateHeatmapDataDto createHeatmapDataDto);
    List<HeatmapDataDto> getHeatmapDataForUser(String apiKey);
}
