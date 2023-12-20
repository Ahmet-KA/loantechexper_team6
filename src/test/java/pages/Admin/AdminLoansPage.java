package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.goruneneKadarKaydirTikla;

public class AdminLoansPage {

    public AdminLoansPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    AdminLogin adminLogin = new AdminLogin();

    // LOANS MENU ELEMENTLERİ  -Admin----Murat
    @FindBy(xpath = "//div[2]/div[1]/ul/li[5]/a")
    public WebElement adminPanelLoansElement;
    @FindBy(xpath = "//span[text()=\"Pending Loans\"]")
    public WebElement loansMenuPendingLoansElement;
    @FindBy(xpath = "//span[text()=\"Running Loans\"]")
    public WebElement loansMenuRunningLoansElement;
    @FindBy(xpath = "//span[text()=\"Due Loans\"]")
    public WebElement loansMenuDuoLoansElement;
    @FindBy(xpath = "//span[text()=\"Paid Loans\"]")
    public WebElement loansMenuPaidLoansElement;
    @FindBy(xpath = "//span[text()=\"Rejected Loans\"]")
    public WebElement loansMenuRejectedLoansElement;
    @FindBy(xpath = "//span[text()=\"All Loans\"]")
    public WebElement loansMenuAllLoansElement;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement usernameTextBox;
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminLoginButton;

    public String expectedAllUrl = "https://qa.loantechexper.com/admin/loan/all";
    public String expectedRejectedUrl = "https://qa.loantechexper.com/admin/loan/rejected";
    public String expectedPaidUrl = "https://qa.loantechexper.com/admin/loan/paid";
    public String expectedDuoUrl = "https://qa.loantechexper.com/admin/loan/due";
    public String expectedRunningUrl = "https://qa.loantechexper.com/admin/loan/running";
    public String expectedPendingUrl = "https://qa.loantechexper.com/admin/loan/pending";

    public void adminLogin(String adminName,String adminPassword) {
        usernameTextBox.sendKeys(adminName);
        passwordTextBox.sendKeys(adminPassword);
        goruneneKadarKaydirTikla(adminLoginButton);
        bekle(1);
    }


    public void loansMenuBasliklariGoruntulemeTesti() {
        adminPanelLoansElement.click();
        bekle(1);
        assertTrue(loansMenuPendingLoansElement.isDisplayed());
        assertTrue(loansMenuRunningLoansElement.isDisplayed());
        assertTrue(loansMenuDuoLoansElement.isDisplayed());
        assertTrue(loansMenuPaidLoansElement.isDisplayed());
        assertTrue(loansMenuRejectedLoansElement.isDisplayed());
        assertTrue(loansMenuAllLoansElement.isDisplayed());

        Driver.closeDriver();
        bekle(1);
    }

    public void menuBasligiTiklamaVeYonlendirmeTesti(WebElement menuBaslikElementi, String expectedUrl) {
        adminPanelLoansElement.click();
        bekle(1);
        menuBaslikElementi.click();
        bekle(1);
        String actuelUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl, actuelUrl);

        Driver.closeDriver();
        bekle(1);
    }
}
