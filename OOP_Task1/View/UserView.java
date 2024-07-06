package OOP_Task1.view;

import java.util.List;

import OOP_Task1.entity.User;

public interface UserView<T extends User> {
    void setOnConsole(List<T> users);
}
