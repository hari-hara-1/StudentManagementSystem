package com.hari.studentmgtsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "subject")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectId;

    private String subjectName;

    @OneToMany(mappedBy = "subject")
    private List<SubjectAssignment> subjectAssignments = new ArrayList<>();

    @OneToMany(mappedBy = "subject")
    private List<Marks> marks = new ArrayList<>();
}

