package com.hari.studentmgtsystem.repositories;

import com.hari.studentmgtsystem.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
