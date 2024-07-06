package OOP_Task1.controller;

import java.util.List;

import OOP_Task1.entity.Student;
import OOP_Task1.entity.User;
import OOP_Task1.view.StudentView;
import OOP_Task1.view.UserView;

public class StudentController implements UserController{

    private UserView<Student> view = new StudentView();

    @Override
    public <T extends User> User create(T user) {
        return (User) user;
    }

    public void setOnConsole(List<Student> students){
        view.setOnConsole(students);
    }
}
