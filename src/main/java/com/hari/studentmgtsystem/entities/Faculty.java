package com.hari.studentmgtsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "faculty")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facultyId;

    private String name;

    @OneToMany(mappedBy = "faculty")
    private List<SubjectAssignment> subjectAssignments = new ArrayList<>();

    @OneToMany(mappedBy = "faculty")
    private List<Exam> exams = new ArrayList<>();
}
