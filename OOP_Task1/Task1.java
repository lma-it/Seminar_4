package OOP_Task1;
import static print_module.print_library.println;

import java.util.List;

import OOP_Task1.controller.StudentController;
import OOP_Task1.entity.Student;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {

        println("Hello");
        new StudentController().setOnConsole(getStudent());
    }

    public static List<Student> getStudent(){
        Student s1 = new Student(1, "Sasha", "Ivanov");
        Student s2 = new Student(2, "Ira", "Ivanova");
        Student s3 = new Student(3, "Inna", "Leonova");
        return List.of(s1, s2, s3);
    }
}