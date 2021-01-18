package com.jakubzegar.pracadyplomowaserwer.domain.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectJsonMapper {
    public static String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            System.out.println(mapper.writeValueAsString(obj));
            return mapper.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
