package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.todoly.LoginSection;
import pages.todoly.MainPage;
import pages.todoly.ProjectLeftSection;
import pages.todoly.RightSection;

import java.util.Date;

public class UpdateItem extends BaseTestTodoLy {

    RightSection rightSection = new RightSection();
    ProjectLeftSection projectLeftSection = new ProjectLeftSection();
    LoginSection loginSection = new LoginSection();
    MainPage mainPage = new MainPage();

    @Test
    public void testUpdateItem() {

        String nameItem = "Thompson"+new Date().getTime();
        mainPage.loginButton.click();
        loginSection.login("selenium123@123.com","12345");
        projectLeftSection.createProject(nameItem);
        projectLeftSection.getProjectLabel(nameItem).click();
        rightSection.createItem(nameItem);
        rightSection.getProjectLabel(nameItem).click();
        rightSection.buttonEdit.click();
        String updateName= "ThompsonUpdate"+new Date().getTime();
        rightSection.txtBoxUpdate.clearSetText(updateName);
        rightSection.buttonSave.click();

        Assertions.assertEquals(updateName, rightSection.getProjectLabel(updateName).getText(),"ERROR The Item not created");
    }
}
