package com.student.crud;

import com.student.crud.Contoller.StudentController;
import com.student.crud.StudentEntity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

@SpringBootApplication
public class StudentCrudApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		ApplicationContext context = SpringApplication.run(StudentCrudApplication.class, args);


		Scanner in = new Scanner(System.in);


		StudentController studentController =  context.getBean(StudentController.class);

		while(true) {
			System.out.println("1.Insert Student\n2.Display students\nEnter choice: ");
			int ch = in.nextInt();
			try {
				switch (ch) {
					case 1:
						System.out.println("Enter student name: ");
						String name = in.next();
						System.out.println("Roll No: ");
						int rollNo = in.nextInt();
						System.out.println("AGE : ");
						int age = in.nextInt();
						StudentEntity student = new StudentEntity(name, rollNo, age);
						studentController.insertStudent(student);
						break;

					case 2:
						ResultSet rs = studentController.displayStudents();
						System.out.println("ID\tName\tRoll NO\tAge");
						while(rs.next()){
							int ID = rs.getInt("id");
							String Name = rs.getString("Name");
							int RollNo = rs.getInt("rollNo");
							int Age = rs.getInt("age");
							System.out.println(ID + "\t" + Name + "\t" + RollNo + "\t" + Age);
						}
						break;
					default:
						System.out.println("Invalid choice");
						break;
				}

			} catch (SQLException e) {
				System.out.println(e);
			}
        }
	}

}
