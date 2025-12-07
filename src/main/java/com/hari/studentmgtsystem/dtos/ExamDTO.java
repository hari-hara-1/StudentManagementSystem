package com.hari.studentmgtsystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExamDTO {
    private Long examId;
    private String examName;
    private LocalDate examDate;
}
