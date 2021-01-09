package com.jakubzegar.pracadyplomowaserwer.domain.repository;

import com.jakubzegar.pracadyplomowaserwer.domain.entity.ApiKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ApiKeyRepository extends JpaRepository<ApiKey, Long>, CrudRepository<ApiKey, Long> {

    @Query(value = "SELECT * FROM ApiKey a WHERE a.userId = :userId ", nativeQuery = true)
    ApiKey getApiKeyForExactUser(@Param("userId") Long userId);
}
