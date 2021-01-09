package com.jakubzegar.pracadyplomowaserwer.domain.mapper;

import com.jakubzegar.pracadyplomowaserwer.domain.converter.Converter;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.HeatmapDataDto;
import com.jakubzegar.pracadyplomowaserwer.domain.entity.HeatmapData;
import org.springframework.stereotype.Component;

@Component
public class HeatmapDataMapper implements Converter<HeatmapData, HeatmapDataDto> {
    @Override
    public HeatmapDataDto convert(HeatmapData from){
        return new HeatmapDataDto.Builder()
                .heatmapDataId(from.getHeatmapDataId())
                .apiKey(from.getApiKey())
                .coordinateX(from.getCoordinateX())
                .coordinateY(from.getCoordinateY())
                .date(from.getDate())
                .build();
    }
}