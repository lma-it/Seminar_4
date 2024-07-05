package OOP_Task1.Controller;

import OOP_Task1.Entity.Student;
import OOP_Task1.Service.StudentGroupService;

public class StudentGroupController {

    private StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }
    
    public void addStudent(Student student){
        service.addStudent(student);
    }
}
