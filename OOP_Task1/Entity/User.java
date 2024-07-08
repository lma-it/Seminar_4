package OOP_Task1.entity;

import OOP_Task1.util.MenuStrings;
import OOP_Task1.util.UserComparator;
import java.util.Scanner;

public abstract class User implements UserComparator<User>, Comparable<User>{

    private final int id;
    private String name;
    private String lastName;
    private static int count = 1;

    public User(String name, String lastName) {
        this.id = count++;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(User o) {
        return compare(this, o);
    }

    @Override
    public String toString() {
        return String.format("\n%s: ID: %d, Name: %s, Last_Name: %s",this.getClass().getSimpleName(), this.getId(), this.getName(), this.getLastName());
    }

    public void editUser(){

        System.out.println(this.toString());
        System.out.println("Что именно вы хотите редактировать? Введите номер пункта для редактирования...");
        System.out.println("1. " + MenuStrings.EDIT_NAME.getDescription());
        System.out.println("2. " + MenuStrings.EDIT_LASTNAME.getDescription());
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        switch (value) {
            case 1:
                System.out.println("Введите новое имя.");
                scanner.nextLine();
                this.setName(scanner.nextLine());
                break;
            case 2:
                System.out.println("Введите новую фамилию.");
                scanner.nextLine();
                this.setLastName(scanner.nextLine());
                break;
            default:
                scanner.close();
        }

    }
}
