package com.hari.studentmgtsystem.repositories;

import com.hari.studentmgtsystem.entities.Marks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarksRepository extends JpaRepository<Marks, Long> {
}
