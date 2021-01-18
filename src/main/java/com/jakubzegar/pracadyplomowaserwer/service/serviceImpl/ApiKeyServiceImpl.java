package com.jakubzegar.pracadyplomowaserwer.service.serviceImpl;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.ApiKeyDto;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateApiKeyDto;
import com.jakubzegar.pracadyplomowaserwer.domain.mapper.ApiKeyMapper;
import com.jakubzegar.pracadyplomowaserwer.domain.mapper.CreateApiKeyMapper;
import com.jakubzegar.pracadyplomowaserwer.domain.repository.ApiKeyRepository;
import com.jakubzegar.pracadyplomowaserwer.service.ApiKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiKeyServiceImpl implements ApiKeyService {
    private final ApiKeyRepository apiKeyRepository;
    private final ApiKeyMapper apiKeyMapper;
    private final CreateApiKeyMapper createApiKeyMapper;

    @Autowired
    public ApiKeyServiceImpl(ApiKeyRepository apiKeyRepository,
                             ApiKeyMapper apiKeyMapper,
                             CreateApiKeyMapper createApiKeyMapper) {
        this.apiKeyRepository = apiKeyRepository;
        this.apiKeyMapper = apiKeyMapper;
        this.createApiKeyMapper = createApiKeyMapper;
    }

    @Override
    public ApiKeyDto getApiKeyForExactUser(Long userId) {
        return apiKeyMapper.convert(apiKeyRepository.getApiKeyForExactUser(userId));
    }

    @Override
    public void save(CreateApiKeyDto createApiKeyDto) {
        apiKeyRepository.save(createApiKeyMapper.createApiKeyDtoToApiKey(createApiKeyDto));
    }

    @Override
    public void deleteById(Long id){
        apiKeyRepository.deleteById(id);
    }

}
