package ateam.test.model;

import ateam.model.User;
import junit.framework.TestCase;

public class userTest extends TestCase {
    public void testGetName(){
        User user = new User();
        user.setUserName("XXX");
        assertEquals("XXX",user.getUserName());
    }

}
