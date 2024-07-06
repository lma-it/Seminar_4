package OOP_Task1.controller;

import OOP_Task1.entity.User;

public interface UserController {
    <T extends User> User create(T user);
}
