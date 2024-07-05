package OOP_Task1.Entity;

public class Teacher extends User<String>{

    public Teacher() {
        this.name = "Some Teacher";
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
