package com.jakubzegar.pracadyplomowaserwer.domain.repository;

import com.jakubzegar.pracadyplomowaserwer.domain.entity.HeatmapData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HeatmapDataRepository extends JpaRepository<HeatmapData, Long>, CrudRepository<HeatmapData, Long> {

    @Query(value = "SELECT * FROM heatmap_data a WHERE a.api_key = :apiKey ", nativeQuery = true)
    List<HeatmapData> getHeatmapDataForUser(@Param("apiKey") String apiKey);
}

