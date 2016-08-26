package ateam.util;

import ateam.dao.DepartmentDAO;
import ateam.model.Department;

public class DepartmentUtil {
    public static String getDeptName(String deptID) {
        DepartmentDAO dao = DepartmentDAO.getInstance();
        Department dept = dao.getDepartment(deptID);
        if (dept != null) {
            return dept.getDeptName();
        } else {
            return "未所属";
        }
    }
}