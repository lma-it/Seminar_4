package OOP_Task1.View;

import java.util.List;

import OOP_Task1.Entity.Student;

public class StudentView implements UserView<Student>{

    @Override
    public void setOnConsole(List<Student> students) {
        System.out.println(students);
    }
    
}
