package com.jakubzegar.pracadyplomowaserwer.domain.mapper;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateHeatmapDto;
import com.jakubzegar.pracadyplomowaserwer.domain.entity.Heatmap;
import org.springframework.stereotype.Component;

@Component
public class CreateHeatmapMapper {
    public Heatmap createHeatmapDtoToHeatmap(CreateHeatmapDto createHeatmapDto) {
    Heatmap heatmap = new Heatmap();
        heatmap.setApiKey(createHeatmapDto.getApiKey());
        heatmap.setBackground(createHeatmapDto.getBackground());
        heatmap.setDate(createHeatmapDto.getDate());

        return heatmap;
    }
}
