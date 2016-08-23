package ateam.logic;

import ateam.model.User;

public class LoginLogic {
		public static User login(String id , String pass) {
			ateam.dao.DAO dao = new ateam.dao.DAO();
			return dao.canLogin(id , pass);
		}

}
