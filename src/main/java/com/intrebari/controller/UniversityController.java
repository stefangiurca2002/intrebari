package com.intrebari.controller;

import com.intrebari.model.Course;
import com.intrebari.model.CourseGrade;
import com.intrebari.model.Student;
import com.intrebari.repositories.CourseGradeRepository;
import com.intrebari.repositories.CourseRepository;
import com.intrebari.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UniversityController {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CourseGradeRepository courseGradeRepository;

    @PostMapping("/new-student")
    public Student saveNewStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @PostMapping("/new-course")
    public Course saveNewCourse(@RequestBody Course course){
        return courseRepository.save(course);
    }

    @PutMapping("/put-student-grade")
    public CourseGrade putStudentGrade(
            @RequestParam("student-id") Long studentId,
            @RequestParam("course-id") Long courseId,
            @RequestParam("grade") int grade
    ){
        Student student = studentRepository.findById(studentId).get();
        Course course = courseRepository.findById(courseId).get();
        CourseGrade courseGrade = new CourseGrade();
        courseGrade.setCourse(course);
        courseGrade.setStudent(student);
        courseGrade.setGrade(grade);
        return courseGradeRepository.save(courseGrade);
    }
}
