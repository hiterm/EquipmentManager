package ateam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import ateam.model.User;

public class UserBeansMapping implements ResultSetBeanMapping<User> {
	public User createFromResultSet(ResultSet rs) throws SQLException {
		User bean = new User();
		bean.setUserID(rs.getString("userID"));
		bean.setPassword(rs.getString("password"));
		bean.setUserName(rs.getString("userName"));
		bean.setUserKana(rs.getString("userKana"));
		bean.setDeptID(rs.getString("deptID"));
		bean.setAuthority(rs.getInt("authority"));
		return bean;
	}
}
