package ateam.logic;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import ateam.model.Bihin;
import ateam.model.User;

public class StateDisplayLogic {
	public static List<Bihin> getBorrowingBihin(User user) {
		List<Bihin> list = new ArrayList<Bihin>();

		// 適当な備品を追加
		Bihin bihin = new Bihin();
		bihin.setBihinID("bihinID");
		bihin.setBihinKana("ツクエ");
		bihin.setBihinName("机");
		bihin.setReturnDay(Date.valueOf("2016-8-30"));
		bihin.setStatus(2);
		bihin.setUserID("00001");
		list.add(bihin);

		Bihin bihin2 = new Bihin();
		bihin2.setBihinID("bihin2ID");
		bihin2.setBihinKana("ホワイトボード");
		bihin2.setBihinName("ホワイトボード");
		bihin2.setReturnDay(Date.valueOf("2016-9-10"));
		bihin2.setStatus(2);
		bihin2.setUserID("00002");
		list.add(bihin);

		return list;
	}
}
