package OOP_Task1.Service;

import OOP_Task1.Entity.Student;

public class StudentService {

    public Student createStudent(int id, String name, String lastName){
        return new Student(id, name, lastName);
    }
}
