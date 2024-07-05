package OOP_Task1.Controller;

import java.util.List;

import OOP_Task1.Entity.Student;
import OOP_Task1.Entity.User;
import OOP_Task1.View.StudentView;
import OOP_Task1.View.UserView;

public class StudentController implements UserController{

    private UserView<Student> view = new StudentView();

    @Override
    public <T extends User> User create(T user) {
        return (User) user;
    }
    // Annotation: POST "https://expamle/student/create"
    //create student(Student student) -> вызвать сервис который сохранит в БД.

    public void setOnConsole(List<Student> students){
        view.setOnConsole(students);
    }
}
