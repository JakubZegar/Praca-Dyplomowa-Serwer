package com.jakubzegar.pracadyplomowaserwer.domain.converter;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
