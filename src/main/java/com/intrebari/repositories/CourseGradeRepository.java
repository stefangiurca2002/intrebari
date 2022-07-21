package com.intrebari.repositories;

import com.intrebari.model.CourseGrade;
import com.intrebari.model.CourseGradeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseGradeRepository extends JpaRepository<CourseGrade, CourseGradeKey> {
}
