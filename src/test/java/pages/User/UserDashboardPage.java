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


}
