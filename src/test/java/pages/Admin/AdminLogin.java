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
    @FindBy(xpath = "//a[@class='btn btn--base btn--xl w-100 policy']")
    public WebElement cookies;



    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement usernameTextBoxg;

    @FindBy (xpath = "(//input[@class='form-control'])[2]")
    public WebElement passwordTextBoxg;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement adminLoginButtong;


    public void adminLoginGirisYap(String adminname,String adminPassword){
        usernameTextBox.sendKeys(adminname);
        passwordTextBox.sendKeys(adminPassword);
        adminLoginButton.click();
        ReusableMethods.bekle(2);

    }










    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement usernameTextBoxHT;
    @FindBy (xpath = "(//input[@class='form-control'])[2]")
    public WebElement passwordTextBoxHT;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement adminLoginButtonHT;


}
