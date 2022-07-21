package com.intrebari.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CourseGradeKey implements Serializable {
    @Column(name="student_id")
    private Long student_id;
    @Column(name="course_id")
    private Long course_id;
}
