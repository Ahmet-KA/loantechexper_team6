package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminManageUsersPage {

    public AdminManageUsersPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Active Users sayfası
    @FindBy(xpath = "//span[text()='Manage Users']")
    public WebElement manageUserDropdownMenu;
    @FindBy (xpath = "//span[text()='Active Users']")
    public WebElement activeUsersMenu;
    @FindBy (xpath = "//th[text()='User']")
    public WebElement userSutunBaslik;
    @FindBy (xpath = "//th[text()='Email-Phone']")
    public WebElement emailSutunBaslik;
    @FindBy (xpath = "//th[text()='Country']")
    public WebElement countrySutunBaslik;
    @FindBy (xpath = "//th[text()='Joined At']")
    public WebElement joinedAtSutunBaslik;
    @FindBy (xpath = "//th[text()='Balance']")
    public WebElement balanceSutunBaslik;
    @FindBy (xpath = "//th[text()='Action']")
    public WebElement actionSutunBaslik;


    // Active User
    @FindBy (xpath = "//h6[@class='page-title']")
    WebElement Notificationsendto;

    @FindBy (xpath = "(//*[@class='btn btn-sm btn-outline--primary'])[1]")
    WebElement DetailsButonuBirinciSira;

    // user detail sayfasi
    @FindBy (xpath = "//*[@class='page-title']")
    WebElement userDetailKullaniciAdi;
    // user detail
    @FindBy (xpath = "//*[@class='btn btn--secondary btn--shadow w-100 btn-lg']")
    WebElement notificationButonu;
    // User Detail
    @FindBy (xpath = "//a[@class='btn btn--primary btn--gradi btn--shadow w-100 btn-lg']")
    WebElement loginAsAUserButonu;

}
