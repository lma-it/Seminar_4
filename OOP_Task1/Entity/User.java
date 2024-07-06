package OOP_Task1.entity;

import OOP_Task1.util.UserComparator;
import java.util.Scanner;

public abstract class User implements UserComparator<User>, Comparable<User>{

    protected int id;
    protected String name;
    protected String lastName;
    private static int count = 0;

    public User(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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
        return String.format("Student_%d: ID: %d, Name: %s, Last_Name: %s", ++count, getId(), getName(), getLastName());
    }

    public void editUser(){
        System.out.println(this.toString());
        System.out.println("Что именно вы хотите редактировать? Введите номер пункта для редактирования...");
        System.out.println("1. Редактировать id.");
        System.out.println("2. Редактировать name.");
        System.out.println("3. Редактировать lastName.");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        switch (value) {
            case 1:
                try {
                    System.out.println("Введите новый id.");
                    this.setId(Integer.parseInt(scanner.nextLine()));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не число!");
                }
            case 2:
                System.out.println("Введите новое имя.");
                this.setName(scanner.nextLine());
                break;
            case 3:
                System.out.println("Введите новую фамилию.");
                this.setLastName(scanner.nextLine());
                break;
            default:
                scanner.close();
        }

        scanner.close();

    }
    
}
