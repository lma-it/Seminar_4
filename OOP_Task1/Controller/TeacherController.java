package OOP_Task1.controller;
import java.util.List;
import OOP_Task1.entity.Teacher;
import OOP_Task1.entity.User;
import OOP_Task1.view.TeacherView;
import OOP_Task1.view.UserView;

public class TeacherController implements UserController{

    private UserView<Teacher> view = new TeacherView();

    @Override
    public <T extends User> User create(T user) {
        return (User) user;
    }

    public void sendOnConsole(List<Teacher> teachers){
        view.setOnConsole(teachers);
    }
    
}
