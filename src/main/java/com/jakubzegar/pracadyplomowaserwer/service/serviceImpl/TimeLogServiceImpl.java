package com.jakubzegar.pracadyplomowaserwer.service.serviceImpl;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateTimeLogDto;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.TimeLogDto;
import com.jakubzegar.pracadyplomowaserwer.domain.mapper.CreateTimeLogMapper;
import com.jakubzegar.pracadyplomowaserwer.domain.mapper.TimeLogListMapper;
import com.jakubzegar.pracadyplomowaserwer.domain.repository.TimeLogRepository;
import com.jakubzegar.pracadyplomowaserwer.service.TimeLogService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TimeLogServiceImpl implements TimeLogService {

    private final TimeLogRepository timeLogRepository;
    private final CreateTimeLogMapper createTimeLogMapper;
    private final TimeLogListMapper timeLogListMapper;

    public TimeLogServiceImpl(TimeLogRepository timeLogRepository, CreateTimeLogMapper createTimeLogMapper, TimeLogListMapper timeLogListMapper) {
        this.timeLogRepository = timeLogRepository;
        this.createTimeLogMapper = createTimeLogMapper;
        this.timeLogListMapper = timeLogListMapper;
    }


    @Override
    public void save(CreateTimeLogDto createTimeLogDto) {
        timeLogRepository.save(createTimeLogMapper.createTimeLogDtoToTimeLog(createTimeLogDto));
    }

    @Override
    public List<TimeLogDto> getUsersLogs(String apiKey) {
        return timeLogListMapper.convert(timeLogRepository.getUsersLogs(apiKey));
    }

    @Override
    public List<TimeLogDto> getAllBetweenDates(String apiKey, Date startDate, Date endDate) {
        return timeLogListMapper.convert(timeLogRepository.getAllBetweenDates(apiKey, startDate, endDate));
    }
}