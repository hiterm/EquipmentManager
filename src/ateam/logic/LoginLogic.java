package ateam.logic;

import ateam.dao.UserDAO;
import ateam.model.User;

public class LoginLogic {
	public static User login(String id , String pass) {
		ateam.dao.UserDAO dao = UserDAO.getInstance();
		User user = dao.getUser(id);

		if(user.getPassword().equals(pass)) {
			return user;
		}
		else {
			return null;
		}
		}

}
