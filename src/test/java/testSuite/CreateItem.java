package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.todoly.LoginSection;
import pages.todoly.MainPage;
import pages.todoly.ProjectLeftSection;
import pages.todoly.RightSection;

import java.util.Date;

public class CreateItem extends BaseTestTodoLy {

    RightSection rightSection = new RightSection();
    ProjectLeftSection projectLeftSection = new ProjectLeftSection();
    LoginSection loginSection = new LoginSection();
    MainPage mainPage = new MainPage();

    @Test
    public void testCreateItem() {

        String nameItem = "Item"+new Date().getTime();
        mainPage.loginButton.click();
        loginSection.login("selenium123@123.com","12345");
        rightSection.textBox.setText(nameItem);
        rightSection.buttonAddItem.click();
        Assertions.assertEquals(nameItem, rightSection.getProjectLabel(nameItem).getText(),"ERROR The Item not created");
    }
}
