package OOP_Task1.util;

import OOP_Task1.entity.Student;
import OOP_Task1.entity.StudentGroup;
import OOP_Task1.entity.Teacher;
import OOP_Task1.entity.TeacherGroup;
import OOP_Task1.service.StudentGroupService;
import OOP_Task1.service.TeacherGroupService;

public class UsersGenerator {

    private StudentGroupService studentGroupService;
    private TeacherGroupService teacherGroupService;

    public UsersGenerator(StudentGroupService studentGroupService, TeacherGroupService teacherGroupService) {
        this.studentGroupService = studentGroupService;
        this.teacherGroupService = teacherGroupService;
    }

    public void StudentGenereate(){
        studentGroupService.addStudent(new Student("Tom", "William"));
        studentGroupService.addStudent(new Student("Alice", "Ivanova"));
        studentGroupService.addStudent(new Student("Bill", "Jhonson"));
        studentGroupService.addStudent(new Student("Lari", "Spirit"));
        studentGroupService.addStudent(new Student("Oleg", "Naumov"));
        studentGroupService.addStudent(new Student("Olga", "Li"));
        studentGroupService.addStudent(new Student("Tanya", "Sergeeva"));
        studentGroupService.addStudent(new Student("Viola", "Olegova"));
        studentGroupService.addStudent(new Student("Alex", "Stepanov"));
    }

    public void TeacherGenerate(){
        teacherGroupService.addTeacher(new Teacher("Konstantin", "Viktorovich"));
        teacherGroupService.addTeacher(new Teacher("Nikolay", "Vasilevich"));
        teacherGroupService.addTeacher(new Teacher("Anna", "Smith"));
        teacherGroupService.addTeacher(new Teacher("Lin", "Chi"));
        teacherGroupService.addTeacher(new Teacher("Anatoliy", "Ivanovich"));
        teacherGroupService.addTeacher(new Teacher("Eduard", "Sergeevich"));
    }
}
