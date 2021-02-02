package com.jakubzegar.pracadyplomowaserwer.service.serviceImpl;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.HeatmapDataDto;
import com.jakubzegar.pracadyplomowaserwer.service.HeatmapDataService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class HeatmapDataServiceImplTest {

    @Autowired
    private HeatmapDataService heatmapDataService;

    @Test
    void getHeatmapDataForUser() {
        List<HeatmapDataDto> heatmapDataDto = heatmapDataService.getHeatmapDataForUser("hgft4jdb6h3hjuemp9a1283jdk342");
        assertThat(heatmapDataDto.size()).isGreaterThan(0);
    }
}