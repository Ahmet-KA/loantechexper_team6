package pages.User;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserLoginPage {

    public UserLoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath  = "(//a[@href='https://qa.loantechexper.com/user/logout'])[1]")
    public WebElement userLogout;

    @FindBy(xpath = "//a[@class='btn btn--base btn--xl w-100 policy']")
    public WebElement allowCookies;

    //*[@class='btn btn--base btn--xxl w-100 text-capitalize xl-text']


    @FindBy(xpath = "//input[@type='text']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement userPasswordTextBox;

    @FindBy(xpath = "//*[@class='btn btn--base btn--xxl w-100 text-capitalize xl-text']")
    public WebElement loginButton;
}
