package ateam.util;

import ateam.dao.UserDAO;
import ateam.model.User;

public class UserUtil {
    public static String getUserName(String userID) {
        UserDAO dao = UserDAO.getInstance();
        User user = dao.getUser(userID);
        return user.getUserName();
    }
}
