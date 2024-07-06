package OOP_Task1.controller;

import OOP_Task1.entity.Student;
import OOP_Task1.service.StudentGroupService;

public class StudentGroupController {

    private StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }
    
    public void addStudent(Student student){
        service.addStudent(student);
    }
}
