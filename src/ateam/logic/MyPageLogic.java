package ateam.logic;

import java.util.List;

import ateam.model.Bihin;

public class MyPageLogic {
	public static List<Bihin> getBihinList(String id) {
		ateam.dao.BihinDAO dao = new ateam.dao.BihinDAO();
		List <Bihin> list = dao.getBihinList(id);

		return list;
	}
}
