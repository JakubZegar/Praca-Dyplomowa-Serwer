package com.jakubzegar.pracadyplomowaserwer.domain.mapper;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateHeatmapDataDto;
import com.jakubzegar.pracadyplomowaserwer.domain.entity.HeatmapData;
import org.springframework.stereotype.Component;

@Component
public class CreateHeatmapDataMapper {
    public HeatmapData createHeatmapDtoToHeatmap(CreateHeatmapDataDto createHeatmapDataDto) {
        HeatmapData heatmapData = new HeatmapData();
        heatmapData.setApiKey(createHeatmapDataDto.getApiKey());
        heatmapData.setCoordinateX(createHeatmapDataDto.getCoordinateX());
        heatmapData.setCoordinateY(createHeatmapDataDto.getCoordinateY());
        heatmapData.setDate(createHeatmapDataDto.getDate());

        return heatmapData;
    }
}