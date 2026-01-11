package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void correctLogin() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.isPageOpen());
    }

    @Test
    public void incorrectLogin() {
        loginPage.openPage();
        loginPage.login("locked_out_user", "secret_sauce");
        assertEquals(loginPage.checkErrorMessage(), "Epic sadface: Sorry, this user has been locked out.",
                "");
    }
}
