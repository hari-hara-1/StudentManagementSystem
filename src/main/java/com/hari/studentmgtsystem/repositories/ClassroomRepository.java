package com.hari.studentmgtsystem.repositories;

import com.hari.studentmgtsystem.entities.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
