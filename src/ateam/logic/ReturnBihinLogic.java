package ateam.logic;

import ateam.dao.DAO;

public class ReturnBihinLogic {
	public static void ReturnBihin(String bihin) {
		DAO dao = new DAO();
		dao.update(bihin);
	}
}
