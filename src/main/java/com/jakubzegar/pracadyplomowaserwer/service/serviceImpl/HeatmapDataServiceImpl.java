package com.jakubzegar.pracadyplomowaserwer.service.serviceImpl;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateHeatmapDataDto;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.HeatmapDataDto;
import com.jakubzegar.pracadyplomowaserwer.domain.mapper.CreateHeatmapDataMapper;
import com.jakubzegar.pracadyplomowaserwer.domain.mapper.HeatmapDataListMapper;
import com.jakubzegar.pracadyplomowaserwer.domain.repository.HeatmapDataRepository;
import com.jakubzegar.pracadyplomowaserwer.service.HeatmapDataService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeatmapDataServiceImpl implements HeatmapDataService {

    private final HeatmapDataRepository heatmapDataRepository;
    private final CreateHeatmapDataMapper createHeatmapDataMapper;
    private final HeatmapDataListMapper heatmapDataListMapper;

    public HeatmapDataServiceImpl(HeatmapDataRepository heatmapDataRepository,
                                  CreateHeatmapDataMapper createHeatmapDataMapper,
                                  HeatmapDataListMapper heatmapDataListMapper) {
        this.heatmapDataRepository = heatmapDataRepository;
        this.createHeatmapDataMapper = createHeatmapDataMapper;
        this.heatmapDataListMapper = heatmapDataListMapper;
    }


    @Override
    public void save(CreateHeatmapDataDto createHeatmapDataDto) {
        heatmapDataRepository.save(createHeatmapDataMapper.createHeatmapDtoToHeatmap(createHeatmapDataDto));
    }

    @Override
    public List<HeatmapDataDto> getHeatmapDataForUser(String apiKey) {
        return heatmapDataListMapper.convert(heatmapDataRepository.getHeatmapDataForUser(apiKey));
    }
}