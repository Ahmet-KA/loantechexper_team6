package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminLoanPage {


    public AdminLoanPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

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
    public String expectedAllUrl = "https://qa.loantechexper.com/admin/loan/all";
    public String expectedRejectedUrl = "https://qa.loantechexper.com/admin/loan/rejected";
    public String expectedPaidUrl = "https://qa.loantechexper.com/admin/loan/paid";
    public String expectedDuoUrl = "https://qa.loantechexper.com/admin/loan/due";
    public String expectedRunningUrl = "https://qa.loantechexper.com/admin/loan/running";
    public String expectedPendingUrl = "https://qa.loantechexper.com/admin/loan/pending";
}
