package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class AdminLogin {

    public AdminLogin(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    private WebElement usernameTextBox;
    @FindBy (xpath = "(//input[@class='form-control'])[2]")
    private WebElement passwordTextBox;
    @FindBy (xpath = "//label[@class='form-check-label']")
    private WebElement rememberMeBaslik;
    @FindBy (xpath = "//button[@type='submit']")
    private WebElement adminLoginButton;
    @FindBy (xpath = "//a[@class='forget-text']")
    public WebElement forgotPasswordBaslik;
    @FindBy (xpath = "//h6[@class='page-title']")
    public WebElement adminDashoardyazisi;



    public void adminLoginGirisYap(String adminname,String adminPassword){
        usernameTextBox.sendKeys(adminname);
        passwordTextBox.sendKeys(adminPassword);
        adminLoginButton.click();
        ReusableMethods.bekle(2);

    }


}
