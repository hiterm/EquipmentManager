package ateam.logic;

import java.util.List;

import ateam.model.User;

public class LoginLogic {
		public static List<User> myUser(String id , String pass) {
			ateam.dao.sample_DAO dao = new ateam.dao.sample_DAO();
			List <User> list = dao.canLogin(id , pass);

			return list;
		}

}
