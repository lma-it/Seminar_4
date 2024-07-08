package OOP_Task1.service;

import OOP_Task1.entity.Student;

public class StudentService {

    public Student createStudent(String name, String lastName){
        return new Student(name, lastName);
    }
}
