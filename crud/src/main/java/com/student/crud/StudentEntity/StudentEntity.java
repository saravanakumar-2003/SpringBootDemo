package com.student.crud.StudentEntity;

public class StudentEntity {

    private int id,rollNo,age;
    private String name;

    public StudentEntity(String name, int rollNo, int age) {

        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    public StudentEntity() {

    }



    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
