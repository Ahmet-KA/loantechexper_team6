package pages.User;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboardPage {

    public UserDashboardPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Change Password']")
    WebElement changePasswordButonu;

    @FindBy(xpath = "//a[@href='https://qa.loantechexper.com/user/loan/plans']")
    WebElement TakeLoanlink;

}
