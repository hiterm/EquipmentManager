package ateam.dao;

import java.sql.SQLException;

import ateam.model.User;

public class UserDAO {
	private static UserDAO instance;

	private UserDAO() {}

	public static synchronized UserDAO getInstance() {
		if (instance == null) {
			instance = new UserDAO();
		}
		return instance;
	}

	public User getUser(String userID) {
		String sql = "SELECT *  FROM UserKanri WHERE userID = '" + userID +"';";
		if(sql != null){
		try {
			return DBManager.getObject(sql , new UserBeansMapping());
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
		}else{
        return null;
		}
	}
}
