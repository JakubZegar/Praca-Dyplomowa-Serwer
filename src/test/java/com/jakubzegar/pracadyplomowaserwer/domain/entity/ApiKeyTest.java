package com.jakubzegar.pracadyplomowaserwer.domain.entity;

import com.jakubzegar.pracadyplomowaserwer.domain.repository.ApiKeyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApiKeyTest {
    @Autowired
    private ApiKeyRepository apiKeyRepository;

    @Test
    public void checkIfApiKeyIsCorrect() {
        // given
        ApiKey apiKey = new ApiKey();
        apiKey.setApiKey("hgft4jdb6h3hjuemp9a1283jdk342");
        apiKey.setUserId(1L);
        // when
        ApiKey found = apiKeyRepository.getApiKeyForExactUser(1L);

        // then
        assertThat(found.getApiKey()).isEqualTo(apiKey.getApiKey());
    }
}