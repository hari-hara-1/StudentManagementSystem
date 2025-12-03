package com.hari.studentmgtsystem.repositories;

import com.hari.studentmgtsystem.entities.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
