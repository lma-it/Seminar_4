package OOP_Task1.view;

import java.util.List;

import OOP_Task1.entity.Student;

public class StudentView implements UserView<Student>{

    @Override
    public void setOnConsole(List<Student> students) {
        System.out.println(students);
    }
    
}
