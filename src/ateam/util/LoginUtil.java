package ateam.util;

import javax.servlet.http.HttpSession;

public class LoginUtil {

    public static boolean isLogined(HttpSession session){
        return session != null && session.getAttribute("user") != null;
    }

 /*   public static boolean searchUser(User user){
        if (user != null) {
            return true;
        }
        else {
            return false;
        }
    }*/
}