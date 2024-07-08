package OOP_Task1.entity;

public class Student extends User{
    
    public Student(String name, String lastName) {
        super(name, lastName);
    }

    public Student addFriend(String name, String lastName){
        return new Student(name, lastName);
    }

}
