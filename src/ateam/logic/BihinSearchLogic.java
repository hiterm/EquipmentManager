package ateam.logic;

import java.util.List;

import ateam.dao.BihinDAO;
import ateam.model.Bihin;

public class BihinSearchLogic {
    public static List<Bihin> getBihinSearchList(String id) {
        ateam.dao.BihinDAO dao = BihinDAO.getInstance();
        List<Bihin> list = dao.getBihinList(id);

        return list;
    }

}
