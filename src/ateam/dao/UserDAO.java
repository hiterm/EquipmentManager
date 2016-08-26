package ateam.dao;

import java.sql.SQLException;

import ateam.model.User;

public class UserDAO {
    private static UserDAO instance = new UserDAO();
    private static UserBeansMapping mapping = new UserBeansMapping();

    private UserDAO() {
    }

    public static UserDAO getInstance() {
        return instance;
    }

    public User getUser(String userID) {
        String sql = "SELECT *  FROM UserKanri WHERE userID = ?";
        try {
            return DBManager.getObject(sql, userID, mapping);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
