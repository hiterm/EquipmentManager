package ateam.logic;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import ateam.model.Bihin;

public class BihinListLogic {
	public static List<Bihin> getAllBihinList () {
		List<Bihin> list = new ArrayList<Bihin>();

		// 適当な備品を追加
		Bihin bihin = new Bihin();
		bihin.setBihinID("T001");
		bihin.setBihinKana("ツクエ");
		bihin.setBihinName("机");
		bihin.setReturnDay(Date.valueOf("2016-8-30"));
		bihin.setStatus(2);
		bihin.setUserID("00001");
		list.add(bihin);

		Bihin bihin2 = new Bihin();
		bihin2.setBihinID("W001");
		bihin2.setBihinKana("ホワイトボード");
		bihin2.setBihinName("ホワイトボード");
		bihin2.setReturnDay(Date.valueOf("2016-9-10"));
		bihin2.setStatus(2);
		bihin2.setUserID("00002");
		list.add(bihin2);

		Bihin bihin3 = new Bihin();
		bihin3.setBihinID("W002");
		bihin3.setBihinKana("ホワイトボード");
		bihin3.setBihinName("ホワイトボード");
		bihin3.setReturnDay(Date.valueOf("2016-9-15"));
		bihin3.setStatus(1);
		bihin3.setUserID("00003");
		list.add(bihin3);

		return list;
	}
}
