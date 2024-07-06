package OOP_Task1.entity;

import OOP_Task1.util.UserComparator;

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
    
}
