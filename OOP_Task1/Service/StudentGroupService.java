package OOP_Task1.service;

import static print_module.print_library.println;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import OOP_Task1.entity.Student;
import OOP_Task1.entity.StudentGroup;
import OOP_Task1.entity.User;
import OOP_Task1.util.MenuStrings;

public class StudentGroupService {

    private StudentGroup studentGroup;
    private Scanner scanner = new Scanner(System.in);

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student){
        studentGroup.students.add(student);
    }

    public List<Student> sort(){
        Collections.sort(studentGroup.students);
        return studentGroup.students;
    }

    public int size(){
        return studentGroup.students.size();
    }

    public void newStudent(){
        println(MenuStrings.NEW_NAME.getDescription());
        String name = this.scanner.nextLine();
        println(MenuStrings.NEW_LASTNAME.getDescription());
        String lastName = this.scanner.nextLine();
        this.addStudent(new Student(name, lastName));
    }

    public Object findByID(List<? extends User> users, int id){

        for (User user : users) {
            if (user.getId() == id){
                return user;
            }
        }       
        println("Пользователя с таким id нет в базе данных.");
        return null;
    }

}
