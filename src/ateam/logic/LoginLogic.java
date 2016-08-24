package ateam.logic;

import ateam.model.User;

public class LoginLogic {
		public static User login(String id , String pass) {
			ateam.dao.BihinDAO dao = new ateam.dao.BihinDAO();
			return dao.canLogin(id , pass);
		}

}
