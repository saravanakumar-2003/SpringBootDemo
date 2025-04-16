package com.student.crud.DAO;

import com.student.crud.StudentEntity.StudentEntity;
import com.student.crud.util.StudentUtil;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StudentDAO {

    StudentUtil studentUtil = new StudentUtil();
    Connection conn;

    public StudentDAO() throws SQLException, ClassNotFoundException {
        conn = studentUtil.connection();
    }

    public void insertStudent(StudentEntity student) throws SQLException {
        String insertQuery = "INSERT into students (Name,RollNo,Age) VALUES (?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(insertQuery);
        pstmt.setString(1, student.getName());
        pstmt.setInt(2, student.getRollNo());
        pstmt.setInt(3, student.getAge());
        pstmt.executeUpdate();
        System.out.println("Insert success");
    }

    public ResultSet displayStudents() throws SQLException {
        String displayQuery = "SELECT * from students";
        PreparedStatement pstmt = conn.prepareStatement(displayQuery);
        ResultSet rs = pstmt.executeQuery();
        return rs;
    }

    public String getName() throws SQLException {

        String query = "select * from students where id =1";

        PreparedStatement pstmt = conn.prepareStatement(query);

        ResultSet rs = pstmt.executeQuery();

        String name = "";
        while(rs.next()) {
            name = rs.getString("Name");
        }
return name;
    }
}
