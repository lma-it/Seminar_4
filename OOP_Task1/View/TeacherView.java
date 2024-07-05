package OOP_Task1.View;

import java.util.List;

import OOP_Task1.Entity.Teacher;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void setOnConsole(List<Teacher> teachers) {
        System.out.println(teachers);
    }
    
}
