package com.student.crud.Service;

import com.student.crud.DAO.StudentDAO;
import com.student.crud.StudentEntity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class StudentService {

    @Autowired
    StudentDAO studentDAO;

//    public StudentService() throws SQLException, ClassNotFoundException {
//        studentDAO = new StudentDAO();
//    }

    public void insertStudent(StudentEntity student) throws SQLException {
        studentDAO.insertStudent(student);
    }

    public ResultSet displayStudents() throws SQLException {
        return studentDAO.displayStudents();
    }

    public String getName() throws SQLException {

        return studentDAO.getName();
    }
}
