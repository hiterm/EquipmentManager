package ateam.dao;

import java.sql.SQLException;

import ateam.model.Department;

public class DepartmentDAO {
    private static DepartmentDAO instance = new DepartmentDAO();
    private static DepartmentBeansMapping mapping = new DepartmentBeansMapping();

    private DepartmentDAO() {
    }

    public static DepartmentDAO getInstance() {
        return instance;
    }

    public Department getDepartment(String deptID) {
        String sql = "SELECT *  FROM DepartmentKanri WHERE deptID = ?";
        try {
            return DBManager.getObject(sql,deptID,mapping);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
