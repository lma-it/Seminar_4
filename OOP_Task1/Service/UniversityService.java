package OOP_Task1.service;

import static print_module.print_library.printf;
import static print_module.print_library.println;
import java.util.Scanner;

import OOP_Task1.controller.StudentGroupController;
import OOP_Task1.entity.Student;
import OOP_Task1.entity.StudentGroup;
import OOP_Task1.entity.Teacher;
import OOP_Task1.entity.TeacherGroup;
import OOP_Task1.util.MenuStrings;
import OOP_Task1.util.UsersGenerator;
import OOP_Task1.view.StudentView;
import OOP_Task1.view.TeacherView;
import OOP_Task1.view.UniversityView;

public class UniversityService {

    protected Scanner scanner = new Scanner(System.in);
    protected boolean setStudent = true;
    protected boolean setTeacher = true;
    protected StudentGroup studentGroup = new StudentGroup();
    protected StudentGroupService studentGroupService = new StudentGroupService(studentGroup);
    protected TeacherGroup teachGroup = new TeacherGroup();
    protected TeacherGroupService teacherGroupService = new TeacherGroupService(teachGroup);
    protected StudentGroupController studentGroupController = new StudentGroupController(studentGroupService);
    private boolean exit = false;

    public void menu(){

        generate();

        println(MenuStrings.MAIN_MENU.getDescription());
        println("1. " + MenuStrings.BE_STUDENT.getDescription());
        println("2. " + MenuStrings.BE_TEACHER.getDescription());
        println("3. " + MenuStrings.ABOUT_INFO.getDescription());
        println("4. " + MenuStrings.EXIT.getDescription());
        int value = scanner.nextInt();

        while(!exit){

            switch(value){
                case 1:
                    scanner.nextLine();
                    while(setStudent){
                        studentGroupService.newStudent();
                        println(MenuStrings.ADD_FRIEND.getDescription() + " y/n");
                        if((scanner.nextLine()).charAt(0) == 'n'){
                            setStudent = false;
                            value = 4;
                        }
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    while(setTeacher){
                        teacherGroupService.newTeacher();
                        println(MenuStrings.BE_TEACHER.getDescription() + " y/n");
                        if((scanner.nextLine()).charAt(0) == 'n'){
                            setTeacher = false;
                            value = 4;
                        }
                    }
                    break;
                case 3:
                    scanner.nextLine();
                    new UniversityView().showInfo();
                    println(MenuStrings.IS_CONTINUE.getDescription());
                    if((scanner.nextLine()).charAt(0) != 'n'){
                        value = 4;
                        this.additionalMenu();
                    } else { 
                        value = 4;
                        exit = true;
                    }
                    break;
                case 4:
                    scanner.nextLine();
                    println(MenuStrings.IS_CONTINUE.getDescription());
                    if((scanner.nextLine()).charAt(0) != 'n'){
                        this.additionalMenu();
                    }else{
                        scanner.close();
                        exit = true;
                    }
                    break;
            }
        }
        println(MenuStrings.BYE.getDescription());

    }


    private void additionalMenu(){

        int paragraph = 0;
        println(MenuStrings.ADDITIONAL_MENU.getDescription());
        printf("%d. %s", ++paragraph, MenuStrings.ADD_STUDENT.getDescription());
        printf("%d. %s", ++paragraph, MenuStrings.ADD_TEACHER.getDescription());

        if(studentGroupService.size() != 0){
            printf("%d. %s", ++paragraph, MenuStrings.OUR_STUDENTS.getDescription());
        }else{
            printf("%d. %s (%s)", ++paragraph, MenuStrings.OUR_STUDENTS.getDescription(), " Сейчас список пустой.");
        }

        if(teacherGroupService.size() != 0){
            printf("%d. %s", ++paragraph, MenuStrings.OUR_TEACHERS.getDescription());
        }else{
            printf("%d. %s (%s)", ++paragraph, MenuStrings.OUR_TEACHERS.getDescription(), " Сейчас список пустой.");
        }

        if(studentGroupService.size() == 0 && teacherGroupService.size() == 0){
            printf("5. %s%s", MenuStrings.EDIT_PROFILE.getDescription(), ". (Сейчас профилей для редактирования нет.)");
        }else{
            println("5. " + MenuStrings.EDIT_PROFILE.getDescription());
        }
        
        
        println("0. " + MenuStrings.EXIT.getDescription());

        int value = scanner.nextInt();

        switch (value) {
            case 1:
                scanner.nextLine();
                while(setStudent){
                    studentGroupService.newStudent();
                    println(MenuStrings.ADD_FRIEND.getDescription() + " y/n");
                    if((scanner.nextLine()).charAt(0) == 'n'){
                        setStudent = false;
                        value = 5;
                    }
                }
                break;
            case 2:
                scanner.nextLine();
                while(setTeacher){
                    teacherGroupService.newTeacher();
                    println(MenuStrings.BE_TEACHER.getDescription() + " y/n");
                    if((scanner.nextLine()).charAt(0) == 'n'){
                        setTeacher = false;
                        value = 5;
                    }
                }
                break;
            case 3:
                if (studentGroupService.size() != 0) {
                    new StudentView().setOnConsole(studentGroup.students);
                }
                
                break;
            case 4:
                if(teacherGroupService.size() != 0){
                    new TeacherView().setOnConsole(teachGroup.teach);
                }
                break;
            case 5:
                scanner.nextInt();
                if(studentGroupService.size() == 0 && teacherGroupService.size() != 0){

                    println(MenuStrings.EDIT_PROFILE.getDescription() + " учителя.");
                    println("1. " + MenuStrings.FIND_BI_ID.getDescription());
                    println("2. " + MenuStrings.EXIT.getDescription());
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            int id = scanner.nextInt();
                            Teacher temp = (Teacher) teacherGroupService.findByID(teachGroup.teach, id);
                            teachGroup.teach.remove(temp);
                            temp.editUser();
                            teachGroup.teach.add(temp);
                            break;
                        case 2:
                            break;
                    }

                }else if(studentGroupService.size() != 0 && teacherGroupService.size() == 0){

                    println(MenuStrings.EDIT_PROFILE.getDescription() + " студента.");
                    println("1. " + MenuStrings.FIND_BI_ID.getDescription());
                    println("2. " + MenuStrings.EXIT.getDescription());
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            int id = scanner.nextInt();
                            Student temp = (Student) teacherGroupService.findByID(studentGroup.students, id);
                            studentGroup.students.remove(temp);
                            temp.editUser();
                            studentGroup.students.add(temp);
                            break;
                        case 2:
                        break;
                    }
                }else if(studentGroupService.size() != 0 && teacherGroupService.size() != 0){
                    println("1. " + MenuStrings.EDIT_PROFILE.getDescription() + " учителя.");
                    println("2. " + MenuStrings.EDIT_PROFILE.getDescription() + " студента.");
                    println("3. " + MenuStrings.EXIT.getDescription());
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            println(MenuStrings.FIND_BI_ID.getDescription());
                            int id = scanner.nextInt();
                            Teacher tempT = (Teacher) teacherGroupService.findByID(teachGroup.teach, id);
                            if(tempT != null){
                                teachGroup.teach.remove(tempT);
                            tempT.editUser();
                            teachGroup.teach.add(tempT);
                            }
                            break;
                        case 2:
                            println(MenuStrings.FIND_BI_ID.getDescription());
                            id = scanner.nextInt();
                            Student tempS = (Student) teacherGroupService.findByID(studentGroup.students, id);
                            if(tempS != null){
                                studentGroup.students.remove(tempS);
                                tempS.editUser();
                                studentGroup.students.add(tempS);
                            }
                            break;
                        case 3:
                            break;
                    }
                }
                break;
            case 0:
                break;
        }
    }

    public void generate(){
        new UsersGenerator(studentGroupService, teacherGroupService).StudentGenereate();
        new UsersGenerator(studentGroupService, teacherGroupService).TeacherGenerate();
    }
}
