package com.example.chan.controller.mapper;

import com.example.chan.controller.dto.StudentDto;
import com.example.chan.domain.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentDtoMapper {

    StudentDto astudentDTO(Student student);

    Student asStudent(StudentDto studentDto);
}
