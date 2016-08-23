package ateam.logic;

public class LoginLogic {
		public static int myUser(String id , String pass) {
			ateam.dao.DAO dao = new ateam.dao.DAO();
			int cnt = dao.canLogin(id , pass);

			return cnt;
		}

}
