package com.hari.studentmgtsystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private Long studentId;
    private String name;
    private Integer rollNo;
    private Long classId;
}
