package com.jakubzegar.pracadyplomowaserwer.service.serviceImpl;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.HeatmapDto;
import com.jakubzegar.pracadyplomowaserwer.service.HeatmapService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class HeatmapServiceImplTest {

    @Autowired
    private HeatmapService heatmapService;

    @Test
    void getUsersHeatmap() {
        HeatmapDto heatmapDto = heatmapService.getUsersHeatmap("hgft4jdb6h3hjuemp9a1283jdk342");
        assertThat(heatmapDto.getHeatmapId()).isEqualTo(1L);
    }
}