package com.jakubzegar.pracadyplomowaserwer.domain.mapper;

import com.jakubzegar.pracadyplomowaserwer.domain.converter.Converter;
import com.jakubzegar.pracadyplomowaserwer.domain.dto.TimeLogDto;
import com.jakubzegar.pracadyplomowaserwer.domain.entity.TimeLog;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TimeLogListMapper implements Converter<List<TimeLog>, List<TimeLogDto>> {
    @Override
    public List<TimeLogDto> convert(List<TimeLog> from) {
        return from.stream().map(
                timeLog -> new TimeLogDto.Builder()
                        .apiKey(timeLog.getApiKey())
                        .timeSpent(timeLog.getTimeSpent())
                        .date(timeLog.getDate())
                        .build()
        ).collect(Collectors.toList());
    }
}
