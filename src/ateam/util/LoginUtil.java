package ateam.util;

import javax.servlet.http.HttpSession;

public class LoginUtil {
    public static boolean searchSession(HttpSession session) {
        if ( session != null) {
            return true;
        }
        else {
            return false;
        }
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