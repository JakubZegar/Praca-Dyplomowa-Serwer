package com.jakubzegar.pracadyplomowaserwer.domain.mapper;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.CreateTimeLogDto;
import com.jakubzegar.pracadyplomowaserwer.domain.entity.TimeLog;
import org.springframework.stereotype.Component;

@Component
public class CreateTimeLogMapper {
    public TimeLog createTimeLogDtoToTimeLog(CreateTimeLogDto createTimeLogDto){
        TimeLog timeLog = new TimeLog();
        timeLog.setApiKey(createTimeLogDto.getApiKey());
        timeLog.setTimeSpent(createTimeLogDto.getTimeSpent());
        timeLog.setDate(createTimeLogDto.getDate());
        return timeLog;
    }
}
