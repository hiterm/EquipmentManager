package ateam.util;

import javax.servlet.http.HttpSession;

public class LoginUtil {

    public static boolean isLogined(HttpSession session){
        return session != null && session.getAttribute("user") != null;
    }

    public static boolean searchUser(HttpSession session){
        return session.getAttribute("user") != null;
    }
}