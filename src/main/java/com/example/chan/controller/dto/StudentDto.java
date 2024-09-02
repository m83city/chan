package com.example.chan.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDto {

    private Long id;

    private String name;

    private String secondName;

    private Integer age;

    private Integer course;
}
