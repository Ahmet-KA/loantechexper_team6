package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

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

    //  RUNNING LOANS

    @FindBy (xpath = "//input[@class='form-control bg--white']")
    WebElement loanNoTextBox;

    @FindBy (xpath = "//input[@class='datepicker-here form-control bg--white pe-2']")
    public  WebElement startDateEndDateTextBox;

    @FindBy (xpath = "//*[@class='btn btn--primary']")
    public  WebElement runningLoanPageloanNoSearchButton;

    @FindBy (xpath = "(//i[@class='la la-search'])[2]")
    public  WebElement runningLoanPagestartDateEndDateSearchButton;

    @FindBy (xpath = "(//a[@class='btn btn-sm btn-outline--primary'])[1]")
    public WebElement runningLoanPageRunningLoansDetailsBirinci;

    @FindBy (xpath = "(//a[@class='btn btn-sm btn-outline--success'])[1]")
    public WebElement runningLoanPageRunningLoansInstallmentsBirinci;

    @FindBy (xpath = "//*[text()='S.N.']")
    public WebElement runningLoansSNText;

    @FindBy (xpath = "//*[text()='Loan No. | Plan']")
    public WebElement runningLoansLoanNoPlanText;

    @FindBy (xpath = "//*[text()='User']")
    public WebElement runningLoansUSerText;

    @FindBy (xpath = "//*[text()='Amount']")
    public WebElement runningLoansAmountText;

    @FindBy (xpath = "//*[text()='Installment Amount']")
    public WebElement runningLoansInstallmentAmountText;

    @FindBy (xpath = "//*[text()='Installment']")
    public WebElement runningLoansInstallmentText;

    @FindBy (xpath = "//*[text()='Created | ']")
    public WebElement runningLoansCreatedText;


    @FindBy(xpath = "//*[text()='Status']")
    public WebElement runningLoansStatusText;

    @FindBy(xpath = "//*[text()='Action']")
    public WebElement runningLoansActionText;


    @FindBy (xpath = "(//i[@class='las la-history'])[1]")
    public WebElement runningLoansInstallmentBrinciSira;


    // LOAN DETAIL PAGE
    @FindBy (xpath = "//h6[@class='page-title']")
    public WebElement loanDetailPageLoanDetailsText;

    @FindBy (xpath = "(//span[@class='fw-bold'])[1]")
    public WebElement loanDetailPagePlanText;

    @FindBy (xpath = "(//span[@class='fw-bold'])[2]")
    public WebElement loanDetailPageDateOfApplicationText;

    @FindBy (xpath = "(//span[@class='fw-bold'])[3]")
    public WebElement loanDetailPageLoanNumber;

    @FindBy (xpath = "(//span[@class='fw-bold'])[4]")
    public WebElement loanDetailPagemountText;

    @FindBy(xpath = "(//span[@class='fw-bold'])[5]")
    public WebElement loanDetailPagePerInstallmentText;

    @FindBy(xpath = "(//span[@class='fw-bold'])[6]")
    public WebElement loanDetailPageTotalInstallmentText;

    @FindBy(xpath = "(//span[@class='fw-bold'])[7]")
    public WebElement loanDetailPageGivenInstallmentText;

    @FindBy (xpath = "(//span[@class='fw-bold'])[8]")
    public WebElement loanDetailPageTotalPayableText;

    @FindBy(xpath = "(//span[@class='fw-bold'])[9]")
    public WebElement loanDetailPageProfitText;


    @FindBy (xpath = "(//span[@class='fw-bold'])[10]")
    public   WebElement loanDetailPageStatusText;



    // INSTALLMENT PAGE
    @FindBy (xpath = "//h6[@class='page-title']")
    public WebElement installmentPageinstallmentText;

    @FindBy(xpath = "//h6[@class='card-title text--white']")
    public WebElement installmentPageLoanSummaryText;

    @FindBy (xpath = "(//span[@class='caption'])[2]")
    public WebElement installmentPageLoanNumberText;

    @FindBy (xpath = "(//span[@class='caption'])[3]")
    public WebElement installmentPlanText;

    @FindBy (xpath = "(//span[@class='caption'])[4]")
     public WebElement installmentLoannAmounthText;

    @FindBy (xpath = "(//span[@class='caption'])[5]")
    public WebElement installmentPagePerInstallmentText;
    @FindBy (xpath = "(//span[@class='caption'])[6]")
    public WebElement installmentPageTotalInstallmentText;
    @FindBy (xpath = "(//span[@class='caption'])[7]")
    public WebElement installmentPageGivenInstallmentText;

    @FindBy (xpath = "(//span[@class='caption'])[8]")
    public WebElement installmentPageReceivableText;

    @FindBy (xpath = "(//span[@class='caption'])[9]")
    public WebElement installmentPageDelayChargeText;

    @FindBy (xpath = "//th[text()='S.N.']")
    public WebElement installmentPageSNtext;

    @FindBy (xpath = "//th[text()='Installment Date']")
    public WebElement installmentPageInstallmentDatePage;

    @FindBy (xpath = "//th[text()='Given On']")
    public WebElement installmentPageGivenOnText;

    @FindBy (xpath = "//th[text()='Delay']")
    public WebElement installmentPageDelayText;

    @FindBy (xpath = "//th[text()='Charge']")
    public WebElement installmentPageChargeText;

    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement runningLoansSayfasiRunningLoansText;

    @FindBy (xpath = "(//li[@class='page-item'])[1]")
    public WebElement runningLoanInstallmentIkinciSayfaButonu;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> tableSize;







}
