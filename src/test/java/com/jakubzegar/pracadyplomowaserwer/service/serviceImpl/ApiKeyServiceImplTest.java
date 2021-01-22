package com.jakubzegar.pracadyplomowaserwer.service.serviceImpl;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.ApiKeyDto;
import com.jakubzegar.pracadyplomowaserwer.service.ApiKeyService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SpringRunner.class)
@SpringBootTest
class ApiKeyServiceImplTest {

    @Autowired
    private ApiKeyService apiKeyService;

    @Test
    void getApiKeyForExactUser() {
        ApiKeyDto found = apiKeyService.getApiKeyForExactUser(1L);
        assertThat(found.getApiKey()).isEqualTo("hgft4jdb6h3hjuemp9a1283jdk342");
    }

    @Test
    void save() {
    }

    @Test
    void deleteById() {
    }
}