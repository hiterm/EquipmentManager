package ateam.logic;

import java.util.List;

import ateam.model.Bihin;

public class StateDisplayLogic {
	public static List<Bihin> myBihin(String id) {
		ateam.dao.DAO dao = new ateam.dao.DAO();
		List <Bihin> list = dao.myFindAll(id);

		return list;
	}
}
