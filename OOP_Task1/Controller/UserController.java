package OOP_Task1.Controller;

import OOP_Task1.Entity.User;

public interface UserController {
    <T extends User> User create(T user);
}
