package OOP_Task1.service;

import static print_module.print_library.println;
import java.util.Scanner;

import OOP_Task1.util.MenuStrings;

public class UniversityService {

    public void menu(){

        Scanner scanner = new Scanner(System.in);

        do{
            println(MenuStrings.MAIN_MENU.getDescription());
            println("1. " + MenuStrings.BE_STUDENT.getDescription());
            println("2. " + MenuStrings.BE_TEACHER.getDescription());
            println("3. " + MenuStrings.INFO.getDescription());
            println("4. " + MenuStrings.EXIT.getDescription());

            switch(scanner.nextInt()){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    
            }
        } while((scanner.nextLine()).charAt(0) != 'n');

        scanner.close();

    }
}
