package ateam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultSetBeanMapping<T> {
	public T createFromResultSet(ResultSet rs) throws SQLException;
}
