package team.squad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Team Squad Spring Squad
 */
public class UserTests {

    User goodUser, badUser;

    @Before
    public void setup() {
        goodUser = new User("Andres", "123");
        badUser = new User("Andres", "notAndresPW");
    }

    @Test
    public void confirmUserNameAndPwAreValidTest() {
        boolean expected = true;

        boolean actual = goodUser.getIsPasswordValid();

        Assert.assertEquals("I expect the user:Andres to have the password:123",
                expected, actual);
    }

    @Test
    public void confirmUserNameAndPwAreNotValidTest() {
        boolean expected = false;

        boolean actual = badUser.getIsPasswordValid();

        Assert.assertEquals("I don't expect the user:Andres to have the password:notAndresPW",
                expected, actual);
    }
}
