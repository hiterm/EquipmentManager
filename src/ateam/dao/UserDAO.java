package ateam.dao;

import java.sql.SQLException;

import ateam.model.User;

public class UserDAO {
	private static UserDAO instance = new UserDAO();

	private UserDAO() {}

	public static synchronized UserDAO getInstance() {
		return instance;
	}

	public User getUser(String userID) {
		String sql = "SELECT *  FROM UserKanri WHERE userID = '" + userID +"';";
		try {
			return DBManager.getObject(sql , new UserBeansMapping());
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
}
