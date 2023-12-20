package pages.User;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.Visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class UserLoginPage {

    public UserLoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath  = "(//a[@href='https://qa.loantechexper.com/user/logout'])[1]")
    public WebElement userLogout;

    @FindBy(xpath = "//*[@class='btn btn--base btn--xl w-100 policy']")
    public WebElement allowCookies;

    //*[@class='btn btn--base btn--xxl w-100 text-capitalize xl-text']


    @FindBy(xpath = "//input[@type='text']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement userPasswordTextBox;

    @FindBy(xpath = "//*[@class='btn btn--base btn--xxl w-100 text-capitalize xl-text']")
    public WebElement loginButton;


    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement loginButtonIki;

    @FindBy(xpath = "//*[@class='form-check-input']")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = "//*[@class='forgot-pass text-decoration-none']")
    public WebElement forgotPassword;

    @FindBy(xpath = "//*[@class='row g-4 verify-gcaptcha']")
    public WebElement loginForm;// Login sayfasina yönlendirme işleminin doğrulamasında kullanılan login formun tamami.

    @FindBy(xpath = "//*[@class='bx bxl-facebook']")
    public WebElement facebookIkon;

    @FindBy(xpath = "//*[@class='bx bxl-google']")
    public WebElement googleIkon;

    @FindBy(xpath = "//*[@class='bx bxl-linkedin']")
    public WebElement linkedinIkon;

    @FindBy(xpath = "//*[@class='text-capitalize text-center mt-0 mb-4']")
    public WebElement welcomeText;

    @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement hataliLoginGirişUyarisi;

    @FindBy(xpath = "//*[@class='hero__content-title text-capitalize t-text-white']")
    public WebElement accountRecoveryText;

    @FindBy(xpath = "//*[@class='auth-form__input']")
    public WebElement accountRecoveryEmailTextbox;

    @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement passwordResetMessage;

    @FindBy(xpath = "//*[@class='btn btn--base btn--xxl w-100 text-capitalize xl-text mt-3']")
    public WebElement accountRecoverySubmitButton;

    public String userDashboard = "https://qa.loantechexper.com/user/dashboard";
    public String email = "bilsekaya@gmail.com";

    public void loginPageVisibilityControl(){

        VisitorHomePage visitorHomePage = new VisitorHomePage();
        visitorHomePage.loginButon.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(userNameTextBox.isDisplayed());
        Assert.assertTrue(userPasswordTextBox.isDisplayed());
        Assert.assertTrue(rememberMeCheckbox.isDisplayed());
        Assert.assertTrue(forgotPassword.isDisplayed());
        Assert.assertTrue(loginButton.isDisplayed());
    }

    public void loginPageUserNamePasswordİsEnabled(){

        VisitorHomePage visitorHomePage = new VisitorHomePage();
        visitorHomePage.loginButon.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(userNameTextBox.isEnabled());
        Assert.assertTrue(userPasswordTextBox.isEnabled());
    }

    public void userLogin(String userName,String userPassword){

        userNameTextBox.sendKeys(userName);
        userPasswordTextBox.sendKeys(userPassword);
        ReusableMethods.bekle(1);
        loginButton.click();
    }

    public void scrolling(WebElement locate){

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",locate);
    }




}
