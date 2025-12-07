package com.hari.studentmgtsystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassroomDTO {
    private Long classId;
    private String className;
    private Long facultyId;
    private Integer strength;
}
