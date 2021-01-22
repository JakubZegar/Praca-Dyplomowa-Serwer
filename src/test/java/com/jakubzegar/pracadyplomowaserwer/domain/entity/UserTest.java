package com.jakubzegar.pracadyplomowaserwer.domain.entity;

import com.jakubzegar.pracadyplomowaserwer.domain.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void checkUsernameAndEmailAvalibility() {
        // given
        // when
        Boolean foundByEmail = userRepository.existsByEmail("vastar0@gmail.com");
        Boolean foundByUsername = userRepository.existsByUsername("vastar");

        // then
        assertThat(foundByEmail).isTrue();
        assertThat(foundByUsername).isTrue();
    }
}