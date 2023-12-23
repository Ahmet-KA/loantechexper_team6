package pages.User;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboardPage {

    public UserDashboardPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy (xpath = "//*[text()='Dashboard']")
    public WebElement userDashboardSayfasiDashboardText;

    @FindBy(xpath = "//a[@class='link']")
    public WebElement userLogoSagUst;

    @FindBy(xpath = "(//a[@href='javascript:void(0)'])[2]")
    public WebElement userDashboardAllowCookiesButonuu;

    @FindBy(xpath = "//a[@class='btn btn--base btn--xl w-100 policy']")
    public WebElement userDashboardAllowCookies;

    @FindBy(xpath = "//*[text()='Change Password']")
    WebElement changePasswordButonu;


    @FindBy(xpath = "//a[@href='https://qa.loantechexper.com/user/loan/plans']")
    WebElement TakeLoanlink;

    @FindBy(xpath = "//*[@id=\"header\"]/div/nav/div[2]/a")
    public WebElement dashboardLoginElement;











    @FindBy(xpath = "/html/body/div[3]/div/div[1]/a/img")
    public WebElement loanTechExperImage;

    @FindBy(xpath = "//h5[@class='card-title']")
    public WebElement applicationformText;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement applyButonuDashboard;

    @FindBy(xpath = "//*[@id=\"TG9hbiUyMGFwcGxpY2F0aW9uJTIwc3VibWl0dGVkJTIwc3VjY2Vzc2Z1bGx5Z3JlZW4\"]/div[1]/div[1]/p")
    public WebElement loanApplicationSubmittedSuccessfullyMessage;






}
