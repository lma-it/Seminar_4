package OOP_Task1.service;

import OOP_Task1.entity.Teacher;

public class TeacherService {
    
    public Teacher createTeacher(int id, String name, String lastName){
        return new Teacher(id, name, lastName);
    }
}
