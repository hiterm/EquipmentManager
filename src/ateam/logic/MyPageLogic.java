package ateam.logic;

import java.util.List;

import ateam.dao.BihinDAO;
import ateam.dao.DepartmentDAO;
import ateam.model.Bihin;
import ateam.model.Department;

public class MyPageLogic {
    public static List<Bihin> getBihinList(String id) {
        BihinDAO dao = BihinDAO.getInstance();
        List<Bihin> list = dao.getBihinList(id);

        return list;
    }

    public static Department getDepartment(String id) {
        DepartmentDAO dao = DepartmentDAO.getInstance();
        Department dept  = dao.getDepartment(id);

        return dept;

    }
}
