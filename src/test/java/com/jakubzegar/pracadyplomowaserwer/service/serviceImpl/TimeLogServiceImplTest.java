package com.jakubzegar.pracadyplomowaserwer.service.serviceImpl;

import com.jakubzegar.pracadyplomowaserwer.domain.dto.TimeLogDto;
import com.jakubzegar.pracadyplomowaserwer.service.TimeLogService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class TimeLogServiceImplTest {

    @Autowired
    private TimeLogService timeLogService;

    @Test
    void getUsersLogs() {
        List<TimeLogDto> timeLogDto = timeLogService.getUsersLogs("hgft4jdb6h3hjuemp9a1283jdk342");
        assertThat(timeLogDto.size()).isGreaterThan(0);
    }

    @Test
    void getAllBetweenDates() {
        List<TimeLogDto> timeLogDto = timeLogService.getAllBetweenDates("hgft4jdb6h3hjuemp9a1283jdk342", new Date(2020,01,01), new Date(2022, 01, 10));
        assertThat(timeLogDto.size()).isGreaterThan(-1);
    }
}