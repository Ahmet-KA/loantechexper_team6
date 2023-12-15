package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminLogin {

    public AdminLogin(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement usernameTextBox;
    @FindBy (xpath = "(//input[@class='form-control'])[2]")
    public WebElement passwordTextBox;
    @FindBy (xpath = "//label[@class='form-check-label']")
    public WebElement rememberMeBaslik;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement adminLoginButton;
    @FindBy (xpath = "//a[@class='forget-text']")
    public WebElement forgotPasswordBaslik;
    @FindBy (xpath = "//h6[@class='page-title']")
    public WebElement adminDashoardyazisi;
}
