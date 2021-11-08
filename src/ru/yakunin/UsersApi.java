package ru.yakunin;

import java.util.ArrayList;
import java.util.List;


public class UsersApi {

    public static List<User> createUsers (List<String> users) {
        List<User> userList = new ArrayList<>();
        for (int i=0; i<users.size(); i+=3) {
            if (users.get(i+2).equals("")) {
                userList.add(new User(users.get(i),users.get(i+1), null));
            } else {
                userList.add(new User(users.get(i),users.get(i+1),Integer.parseInt(users.get(i+2))));
            }
        }
        return userList;
    }
}
