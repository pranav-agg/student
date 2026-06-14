package com.sample.student.repository;

import com.sample.student.model.StudentResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentResultRepository extends JpaRepository<StudentResult, Long> {
    // Basic CRUD operations are inherently available
}