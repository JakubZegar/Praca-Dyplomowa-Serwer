package com.jakubzegar.pracadyplomowaserwer.domain.repository;

import com.jakubzegar.pracadyplomowaserwer.domain.entity.Heatmap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface HeatmapRepository extends JpaRepository<Heatmap, Long>, CrudRepository<Heatmap, Long> {

    @Query(value = "SELECT * FROM heatmap a WHERE a.api_key = :apiKey ", nativeQuery = true)
    Heatmap getUsersHeatmap(@Param("apiKey") String apiKey);
}
