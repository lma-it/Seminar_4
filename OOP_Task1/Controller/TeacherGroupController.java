package OOP_Task1.controller;

import OOP_Task1.entity.Teacher;
import OOP_Task1.service.TeacherGroupService;

public class TeacherGroupController {
    
    private TeacherGroupService service;

    public TeacherGroupController(TeacherGroupService service) {
        this.service = service;
    }
    
    public void addTeacher(Teacher teacher){
        service.addTeacher(teacher);
    }
}
