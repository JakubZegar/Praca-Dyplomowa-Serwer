package com.jakubzegar.pracadyplomowaserwer.service;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateHeatmapDto;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.HeatmapDto;

public interface HeatmapService {

    void deleteById(Long heatmapId);
    void save(CreateHeatmapDto createHeatmapDto);
    HeatmapDto getUsersHeatmap(String apiKey);
}
