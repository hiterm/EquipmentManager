package ateam.logic;

import ateam.dao.UserDAO;
import ateam.model.User;

public class LoginLogic {
	public static User login(String id , String password) {
		UserDAO dao = UserDAO.getInstance();
		User user = dao.getUser(id);

		if (user != null && user.getPassword().equals(password)) {
		    return user;
		} else {
		    return null;
		}
	}
}
