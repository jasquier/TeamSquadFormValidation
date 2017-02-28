package hello;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 2/28/17.
 */
public class UserTest {

    private User goodUser, badUser;

    @Before
    public void setup() {
        goodUser = new User("Andres", "123");
        badUser = new User("Andres", "122");
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

        Assert.assertEquals("I don't expect the user:Andres to have the password:122",
                expected, actual);
    }
}
