package com.intrebari.model;

import javax.persistence.*;

@Entity
public class CourseGrade {
    @EmbeddedId
    CourseGradeKey id;

    private int grade;

    @ManyToOne
    @MapsId("course_id")
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @MapsId("student_id")
    @JoinColumn(name = "student_id")
    private Student student;

    public CourseGradeKey getId() {
        return id;
    }

    public void setId(CourseGradeKey id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
