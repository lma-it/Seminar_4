package OOP_Task1.service;

import OOP_Task1.entity.Teacher;

public class TeacherService {

    public Teacher createTeacher(String name, String lastName){
        return new Teacher(name, lastName);
    }

    public String showResume(Teacher teacher){
        return teacher.getSummary();
    }
}
