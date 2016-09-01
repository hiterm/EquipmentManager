package ateam.test.logic;

import java.sql.Date;

import ateam.dao.BihinDAO;
import ateam.logic.RequestLogic;
import junit.framework.TestCase;

public class RequestLogicTest extends TestCase{
    public void testRequestBihinTrue() {
        String datestr = "2016-12-24";
        Date date = Date.valueOf(datestr);
        assertTrue(RequestLogic.requestBihin("B001", "U001",date ));
        BihinDAO dao = BihinDAO.getInstance();
        dao.update("U001", "B001");
    }

    public void testRequestBihinFalse() {
        String datestr = "2016-12-24";
        Date date = Date.valueOf(datestr);
        assertFalse(RequestLogic.requestBihin("B004", "U001",date ));
    }
}
