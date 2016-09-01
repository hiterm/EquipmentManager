package ateam.test.model;

import ateam.model.User;
import junit.framework.TestCase;

public class UserTest extends TestCase {
    public void testGetUserName(){
        User user = new User();
        user.setUserName("XXX");
        assertEquals("XXX",user.getUserName());
    }

    public void testGetPassword(){
        User user = new User();
        user.setPassword("XXX");
        assertEquals("XXX",user.getPassword());
    }

    public void testGetUserID(){
        User user = new User();
        user.setUserID("XXX");
        assertEquals("XXX",user.getUserID());
    }

    public void testGetKana(){
        User user = new User();
        user.setUserKana("XXX");
        assertEquals("XXX",user.getUserKana());
    }

    public void testGetDeptID(){
        User user = new User();
        user.setDeptID("XXX");
        assertEquals("XXX",user.getDeptID());
    }

    public void testGetAuthority(){
        User user = new User();
        user.setAuthority(111);
        assertEquals(111,user.getAuthority());
    }

}
