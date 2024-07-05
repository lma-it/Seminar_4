package OOP_Task1.Entity;

import OOP_Task1.util.UserComparator;

public abstract class User implements UserComparator<User>, Comparable<User>{

    protected int id;
    protected String name;
    protected String lastName;

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
        return String.format("ID: %d Name: %s Last_Name: %s", getId(), getName(), getLastName());
    }
    
}
