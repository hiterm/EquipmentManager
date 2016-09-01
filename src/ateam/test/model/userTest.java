package ateam.test.model;

public class userTest {
    void test Get Name(){
        User user = new User();
        user setName("XXX");
        assertEqwolk("XXX",user.getName());
    }

}
