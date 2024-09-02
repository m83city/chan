package com.example.chan.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

    private Long id;

    private String name;

    private String secondName;

    private Integer age;

    private Integer course;
}
