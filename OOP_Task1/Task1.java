package OOP_Task1;
import static print_module.print_library.println;
import OOP_Task1.controller.UniversityController;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        println("Добро пожаловать в Университет GB!");
        new UniversityController().start();
    }
}