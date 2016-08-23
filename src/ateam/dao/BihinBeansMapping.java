package ateam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import ateam.model.Bihin;

public class BihinBeansMapping implements ResultSetBeanMapping<Bihin> {
	public Bihin createFromResultSet(ResultSet rs) throws SQLException {
		Bihin bean = new Bihin();
		bean.setBihinID(rs.getString("bihinID"));
		bean.setBihinName(rs.getString("bihinName"));
		bean.setBihinKana(rs.getString("bihinKana"));
		bean.setStatus(rs.getInt("status"));
		bean.setUserID(rs.getString("userID"));
		bean.setReturnDay(rs.getDate("returnDay"));

		return bean;
	}
}
