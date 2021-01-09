package com.jakubzegar.pracadyplomowaserwer.domain.mapper;

import com.jakubzegar.pracadyplomowaserwer.domain.converter.Converter;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.HeatmapDto;
import com.jakubzegar.pracadyplomowaserwer.domain.entity.Heatmap;
import org.springframework.stereotype.Component;

@Component
public class HeatmapMapper implements Converter<Heatmap, HeatmapDto> {
    @Override
    public HeatmapDto convert(Heatmap from){
        return new HeatmapDto.Builder()
                .heatmapId(from.getHeatmapId())
                .apiKey(from.getApiKey())
                .background(from.getBackground())
                .date(from.getDate())
                .build();
    }
}
