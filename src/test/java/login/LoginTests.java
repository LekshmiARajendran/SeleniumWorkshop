package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.assertEquals;
//import static org.testng.AssertJUnit.assertEquals;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String alertText = secureAreaPage.getAlertText();
        // Remove the close icon character '×' and trim spaces from the alert text
        String cleanedAlert = alertText.replace("×", "").trim();
        System.out.println("Alert Text with quotes: '" + alertText + "'");
        assertEquals(cleanedAlert, "You logged into a secure area!", "Alert text does not match!");

    }
}
