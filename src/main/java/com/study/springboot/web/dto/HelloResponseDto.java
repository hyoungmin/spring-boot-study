package com.study.springboot.web.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
class HelloResponseDto {
    private final String name;
    private final int amount;
}
