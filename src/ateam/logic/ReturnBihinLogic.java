package ateam.logic;

import ateam.dao.BihinDAO;

public class ReturnBihinLogic {
	public static void ReturnBihin(String bihin) {
		BihinDAO dao = new BihinDAO();
		dao.update(bihin);
	}
}
