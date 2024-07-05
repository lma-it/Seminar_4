package OOP_Task1.View;

import java.util.List;
import OOP_Task1.Entity.User;

public interface UserView<T extends User> {
    void setOnConsole(List<T> users);
}
