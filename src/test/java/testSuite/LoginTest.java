package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTestTodoLy{

    @Test
    public void verifyLoginSuccessfully(){

        String User = "selenium123@123.com";
        String Password= "12345";

        mainPage.loginButton.click();
        loginSection.emailTxtBox.setText(User);
        loginSection.pwdTxtBox.setText(Password);
        loginSection.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR! the login was failed");
    }
}
