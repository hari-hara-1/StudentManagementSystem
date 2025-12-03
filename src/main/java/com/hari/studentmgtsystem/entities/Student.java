package com.hari.studentmgtsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String name;

    private Integer rollNo;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private Classroom classroom;

    @OneToMany(mappedBy = "student")
    private List<Marks> marks = new ArrayList<>();
}



