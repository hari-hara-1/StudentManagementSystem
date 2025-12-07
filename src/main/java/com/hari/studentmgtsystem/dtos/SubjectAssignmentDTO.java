package com.hari.studentmgtsystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectAssignmentDTO {
    private Long id;
    private Long classroomId;
    private Long subjectId;
    private Long facultyId;
}
