package com.jakubzegar.pracadyplomowaserwer.domain.entity;

import com.jakubzegar.pracadyplomowaserwer.domain.repository.HeatmapRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HeatmapTest {
    @Autowired
    private HeatmapRepository heatmapRepository;

    @Test
    public void checkCorrectionOfGivenHeatmap() {
        // given
        Heatmap heatmap = new Heatmap();
        heatmap.setDate("2021-01-05");
        heatmap.setApiKey("hgft4jdb6h3hjuemp9a1283jdk342");
        heatmap.setHeatmapId(1L);
        // when
        Heatmap found = heatmapRepository.getUsersHeatmap("hgft4jdb6h3hjuemp9a1283jdk342");

        // then
        assertThat(found.getHeatmapId()).isEqualTo(heatmap.getHeatmapId());
    }
}