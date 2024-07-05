package OOP_Task1;
import static print_module.print_library.println;

import OOP_Task1.Controller.StudentGroupController;
// import OOP_Task1.Entity.Student;
import OOP_Task1.Entity.StudentGroup;
// import OOP_Task1.Entity.Teacher;
import OOP_Task1.Service.StudentGroupService;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        println("Hello");

        StudentGroupController controller = new StudentGroupController(new StudentGroupService(new StudentGroup()));


    }
}