package ateam.logic;

import ateam.dao.BihinDAO;

public class ReturnBihinLogic {
	public static void returnBihin(String bihin) {
		BihinDAO dao = new BihinDAO();
		dao.update(bihin);
	}
}
