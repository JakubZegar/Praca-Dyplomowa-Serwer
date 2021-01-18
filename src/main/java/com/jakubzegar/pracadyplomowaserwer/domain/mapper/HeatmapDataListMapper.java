package com.jakubzegar.pracadyplomowaserwer.domain.mapper;

import com.jakubzegar.pracadyplomowaserwer.domain.converter.Converter;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.HeatmapDataDto;
import com.jakubzegar.pracadyplomowaserwer.domain.entity.HeatmapData;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HeatmapDataListMapper implements Converter<List<HeatmapData>, List<HeatmapDataDto>> {
    @Override
    public List<HeatmapDataDto> convert(List<HeatmapData> from) {

        return from.stream()
                .map(heatmapData -> new HeatmapDataDto.Builder()
                        .apiKey(heatmapData.getApiKey())
                        .coordinateX(heatmapData.getCoordinateX())
                        .coordinateY(heatmapData.getCoordinateY())
                        .date(heatmapData.getDate())
                        .build()
                )
                .collect(Collectors.toList());
    }
}
