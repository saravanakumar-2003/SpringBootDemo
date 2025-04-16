package com.student.crud.Contoller;

import com.student.crud.Service.StudentService;
import com.student.crud.StudentEntity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

//    public StudentController() throws SQLException, ClassNotFoundException {
//        studentService = new StudentService();
//    }


    public void insertStudent(StudentEntity student) throws SQLException {

        studentService.insertStudent(student);
    }

    public ResultSet displayStudents() throws SQLException {
        return studentService.displayStudents();
    }

    @GetMapping("/display")
    public String displayName() throws SQLException {
        return studentService.getName();
    }
}
