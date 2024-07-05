package OOP_Task1.Entity;


public class Student extends User<String>{
    


    public Student() {
    }


    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public String getLastName() {
        return this.lastName;
    }

    

}
