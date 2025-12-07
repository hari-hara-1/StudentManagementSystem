package com.hari.studentmgtsystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarksDTO {
    private Long id;
    private Long studentId;
    private Long examId;
    private Long subjectId;
    private Integer marksObtained;
}
