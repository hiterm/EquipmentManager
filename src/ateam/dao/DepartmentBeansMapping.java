package ateam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import ateam.model.Department;

public class DepartmentBeansMapping implements ResultSetBeanMapping<Department> {
    public Department createFromResultSet(ResultSet rs) throws SQLException {
        Department bean = new Department();
        bean.setDeptID(rs.getString("DeptID"));
        bean.setDeptName(rs.getString("DeptName"));
        bean.setDeptKana(rs.getString("DeptKana"));

        return bean;
    }
}
