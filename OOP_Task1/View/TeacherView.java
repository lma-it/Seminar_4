package OOP_Task1.view;

import java.util.List;

import OOP_Task1.entity.Teacher;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void setOnConsole(List<Teacher> teachers) {
        System.out.println(teachers);
    }
    
}
