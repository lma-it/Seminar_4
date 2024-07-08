package OOP_Task1.service;

import OOP_Task1.entity.Teacher;
import OOP_Task1.entity.TeacherGroup;
import OOP_Task1.entity.User;
import OOP_Task1.util.MenuStrings;

import java.util.List;
import java.util.Scanner;

import static print_module.print_library.println;

import java.util.Collections;


public class TeacherGroupService {
    
    private TeacherGroup teachers;
    private Scanner scanner = new Scanner(System.in);

    public TeacherGroupService(TeacherGroup teach) {
        this.teachers = teach;
    }

    public void addTeacher(Teacher teacher){
        teachers.teach.add(teacher);
    }

    public List<Teacher> sort(){
        Collections.sort(teachers.teach);
        return teachers.teach;
    }

    public int size(){
        return teachers.teach.size();
    }

    public void newTeacher(){
        println(MenuStrings.NEW_NAME.getDescription());
        String name = this.scanner.nextLine();
        println(MenuStrings.NEW_LASTNAME.getDescription());
        String lastName = this.scanner.nextLine();
        this.addTeacher(new Teacher(name, lastName));
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
