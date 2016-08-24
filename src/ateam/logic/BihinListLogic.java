package ateam.logic;

import java.util.List;

import ateam.dao.BihinDAO;
import ateam.model.Bihin;

public class BihinListLogic {
	public static List<Bihin> getAllBihinList () {
	    BihinDAO dao = BihinDAO.getInstance();
        List <Bihin> list = dao.getBihinList();
		return list;
	}
}
