package OOP_Task1.Entity;

import java.time.LocalDate;

public abstract class User<T> {

    protected int id;
    protected String name;
    protected String lastName;
    protected LocalDate birthDay;
    
    public abstract T getName();

    public abstract T getLastName();
    
}
