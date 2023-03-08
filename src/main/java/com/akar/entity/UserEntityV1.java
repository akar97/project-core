package com.akar.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class UserEntityV1 {
    private String name;

    @Builder
    public UserEntityV1(String name) {
        this.name = name;
    }
}
