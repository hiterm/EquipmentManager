package ateam.util;

import ateam.dao.UserDAO;
import ateam.model.User;

public class UserUtil {
    // nullのときは???を返す
    public static String getUserName(String userID) {
        UserDAO dao = UserDAO.getInstance();
        User user = dao.getUser(userID);
        if (user != null) {
            return user.getUserName();
        } else {
            return "???";
        }
    }
}
