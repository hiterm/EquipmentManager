package ateam.test.model;

import java.sql.Date;

import ateam.model.Bihin;
import junit.framework.TestCase;

public class BihinTest extends TestCase {
    public void testGetBihinID(){
        Bihin bihin = new Bihin();
        bihin.setBihinID("XXX");
        assertEquals("XXX",bihin.getBihinID());
    }
    public void testGetBihinName(){
        Bihin bihin = new Bihin();
        bihin.setBihinName("XXX");
        assertEquals("XXX",bihin.getBihinName());
    }
    public void testGetBihinKana(){
        Bihin bihin = new Bihin();
        bihin.setBihinKana("XXX");
        assertEquals("XXX",bihin.getBihinKana());
    }
    public void testGetStatus(){
        Bihin bihin = new Bihin();
        bihin.setStatus(1);
        assertEquals(1,bihin.getStatus());
    }
    public void testGetUserID(){
        Bihin bihin = new Bihin();
        bihin.setUserID("XXX");
        assertEquals("XXX",bihin.getUserID());
    }
    public void testGetReturnDay(){
        Bihin bihin = new Bihin();
        String datestr = "2016-12-24";
        Date date = Date.valueOf(datestr);
        bihin.setReturnDay(date);
        assertEquals(date,bihin.getReturnDay());
    }
}
