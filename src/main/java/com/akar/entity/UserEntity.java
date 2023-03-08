package com.akar.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class UserEntity {
    private String name;

    @Builder
    public UserEntity(String name) {
        this.name = name;
    }
}
