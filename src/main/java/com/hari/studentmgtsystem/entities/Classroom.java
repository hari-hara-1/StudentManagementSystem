package com.hari.studentmgtsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "classroom")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classId;

    private String className;

    @OneToOne
    @JoinColumn(name = "class_teacher_id")
    private Faculty classTeacher;

    private Integer strength;

    @OneToMany(mappedBy = "classroom")
    private List<Student> students = new ArrayList<>();

    @OneToMany(mappedBy = "classroom")
    private List<SubjectAssignment> subjectAssignments = new ArrayList<>();

    @OneToMany(mappedBy = "classroom")
    private List<Exam> exams = new ArrayList<>();
}

