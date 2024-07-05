package OOP_Task1.util;

import java.util.Comparator;

import OOP_Task1.Entity.User;

public interface UserComparator<T extends User> extends Comparator<T>{

    @Override
    default int compare(T o1, T o2) {
        return o1.getId() - o2.getId();
    }
    
}
