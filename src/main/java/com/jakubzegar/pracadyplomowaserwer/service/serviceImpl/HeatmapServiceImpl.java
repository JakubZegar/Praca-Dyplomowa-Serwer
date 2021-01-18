package com.jakubzegar.pracadyplomowaserwer.service.serviceImpl;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateHeatmapDto;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.HeatmapDto;
import com.jakubzegar.pracadyplomowaserwer.domain.mapper.CreateHeatmapMapper;
import com.jakubzegar.pracadyplomowaserwer.domain.mapper.HeatmapMapper;
import com.jakubzegar.pracadyplomowaserwer.domain.repository.HeatmapRepository;
import com.jakubzegar.pracadyplomowaserwer.service.HeatmapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeatmapServiceImpl implements HeatmapService {

    private final HeatmapRepository heatmapRepository;
    private final HeatmapMapper heatmapMapper;
    private final CreateHeatmapMapper createHeatmapMapper;

    @Autowired
    public HeatmapServiceImpl(HeatmapRepository heatmapRepository,
                              HeatmapMapper heatmapMapper,
                              CreateHeatmapMapper createHeatmapMapper) {
        this.heatmapRepository = heatmapRepository;
        this.heatmapMapper =  heatmapMapper;
        this.createHeatmapMapper = createHeatmapMapper;
    }

    @Override
    public void deleteById(Long heatmapId) {

    }

    @Override
    public void save(CreateHeatmapDto createHeatmapDto) {
        heatmapRepository.save(createHeatmapMapper.createHeatmapDtoToHeatmap(createHeatmapDto));
    }

    @Override
    public HeatmapDto getUsersHeatmap(String apiKey) {
        return heatmapMapper.convert(heatmapRepository.getUsersHeatmap(apiKey));
    }
}
