package ateam.logic;

import ateam.model.User;

public class LoginLogic {
	public static User login(String id , String pass) {
		ateam.dao.UserDAO dao = new ateam.dao.UserDAO();
		User user = dao.getUser(id);

		if(user.getPassword().equals(pass)) {
			return user;
		}
		else {
			return null;
		}
	}

}
