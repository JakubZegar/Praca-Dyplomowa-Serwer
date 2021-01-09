package com.jakubzegar.pracadyplomowaserwer.domain.mapper;

import com.jakubzegar.pracadyplomowaserwer.domain.converter.Converter;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.TimeLogDto;
import com.jakubzegar.pracadyplomowaserwer.domain.entity.TimeLog;
import org.springframework.stereotype.Component;

@Component
public class TimeLogMapper implements Converter<TimeLog, TimeLogDto> {
    @Override
    public TimeLogDto convert(TimeLog from){
        return new TimeLogDto.Builder()
                .timeLogId(from.getTimeLogId())
                .apiKey(from.getApiKey())
                .timeSpent(from.getTimeSpent())
                .date(from.getDate())
                .build();
    }
}
