package com.hari.studentmgtsystem.repositories;

import com.hari.studentmgtsystem.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
