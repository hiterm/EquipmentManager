package ateam.logic;

import java.util.List;

import ateam.dao.BihinDAO;
import ateam.model.Bihin;

public class MyPageLogic {
	public static List<Bihin> getBihinList(String id) {
		BihinDAO dao = BihinDAO.getInstance();
		List <Bihin> list = dao.getBihinList(id);

		return list;
	}
}
