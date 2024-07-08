package OOP_Task1.entity;

import OOP_Task1.util.MenuStrings;

public class Teacher extends User {

    // Резюме
    private String summary = String.format(MenuStrings.SUMMARY.getDescription(), this.getName());

    public Teacher(String name, String lastName) {
        super(name, lastName);
    }

    public String getSummary() {
        return summary;
    }

}
