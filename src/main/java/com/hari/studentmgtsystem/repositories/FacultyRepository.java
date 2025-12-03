package com.hari.studentmgtsystem.repositories;

import com.hari.studentmgtsystem.entities.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
