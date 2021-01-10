package com.jakubzegar.pracadyplomowaserwer.domain.repository;

import com.jakubzegar.pracadyplomowaserwer.domain.entity.TimeLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface TimeLogRepository extends JpaRepository<TimeLog, Long>, CrudRepository<TimeLog, Long> {
    @Query(value = "SELECT * FROM time_log t WHERE t.api_key = :apiKey ", nativeQuery = true)
    List<TimeLog> getUsersLogs(@Param("apiKey") String apiKey);

    @Query(value = "SELECT * FROM time_log t WHERE t.api_key = :apiKey AND t.date BETWEEN :startDate AND :endDate", nativeQuery = true)
    List<TimeLog> getAllBetweenDates(@Param("apiKey") String apiKey, @Param("startDate") Date startDate, @Param("endDate")Date endDate);
}
