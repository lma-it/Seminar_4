package OOP_Task1.service;

import OOP_Task1.entity.Student;

public class StudentService {

    public Student createStudent(int id, String name, String lastName){
        return new Student(id, name, lastName);
    }
}
