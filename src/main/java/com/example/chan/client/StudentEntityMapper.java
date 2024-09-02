package com.example.chan.client;

import com.example.chan.domain.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "string")
public interface StudentEntityMapper {

    StudentEntity asStudentEntity(Student student);

    Student asStudent(StudentEntity studentEntity);
}
