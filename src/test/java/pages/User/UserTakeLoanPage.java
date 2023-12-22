package pages.User;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.goruneneKadarKaydir;

public class UserTakeLoanPage {

    public UserTakeLoanPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='https://qa.loantechexper.com/user/loan/plans']")
    public WebElement TakeLoanlink;

    @FindBy(xpath = "//h3['Loan Plans']")
    public WebElement LoanPlansPage;

    @FindBy(xpath = "//*[@type='button']")
    public WebElement LoanButton;

    @FindBy(xpath = "//i[@class='las la-check-circle']")
    public WebElement applicationFormApplyButton;

    @FindBy(xpath = "(//*[@class='btn btn-md btn--xl xl-text w-100 btn--base loanBtn'])[2]")
    public WebElement LoanPlansApplyNowButton;

    @FindBy(xpath = "//*[@class='loan-name']")
    public WebElement ApplyForPersonalFinanceLoanPage;

    @FindBy(xpath = "//*[@class='btn btn--base w-100']")
    public WebElement ConfirmButton;

    @FindBy(xpath = "//button[@class='btn btn--base w-100']")
    public WebElement applyForPersonalConfirmButton;

    @FindBy(xpath = "//*[@id='pills-basic-loan-tab']")
    public WebElement BasicLoanButton;

    @FindBy(xpath = "//*[@data-planname='Test Loan']")
    public WebElement TestLoanApplyNowButton;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement amountInputBox;

    @FindBy(xpath = "//*[@class='card-title']")
    public WebElement ApplicationFormPage;

    @FindBy(xpath = "//h3['My Loans']")
    public WebElement MyLoansPage;

    @FindBy(xpath = "//*[@id='search']")
    public WebElement SearchByLoanNumberTextBox;

    @FindBy(xpath = "//*[text()='Loan Status']")
    public WebElement LoanStatusTitle;

    @FindBy(xpath = "//*[@id='status']")
    public WebElement RunningYazisi;

    @FindBy(xpath = "//*[@class='value']")
    public WebElement InstallmentsButton;

    @FindBy(xpath = "//*[@id=\"pills-car-loan-2\"]//div[2]/ul/li[1]/span[1]")
    public WebElement takeMinimum;
    @FindBy(xpath = "//*[@id=\"pills-car-loan-2\"]//div[2]/ul/li[1]/span[2]")
    public WebElement takeMinimumValue;

    @FindBy(xpath = "//*[@id=\"pills-car-loan-2\"]//div[2]/ul/li[2]/span[1]")
    public WebElement takeMaximum;
    @FindBy(xpath = "//*[@id=\"pills-car-loan-2\"]//div[2]/ul/li[2]/span[2]")
    public WebElement takeMaximumValue;

    @FindBy(xpath = "//*[@id=\"pills-car-loan-2\"]//div[2]/ul/li[3]/span[1]")
    public WebElement perInstallment;
    @FindBy(xpath = "//*[@id=\"pills-car-loan-2\"]//div[2]/ul/li[3]/span[2]")
    public WebElement perInstallmentValue;

    @FindBy(xpath = "//*[@id=\"pills-car-loan-2\"]//div[2]/ul/li[4]/span[1]")
    public WebElement installmentInterval;
    @FindBy(xpath = "//*[@id=\"pills-car-loan-2\"]//div[2]/ul/li[4]/span[2]")
    public WebElement installmentIntervalValue;

    @FindBy(xpath = "//*[@id=\"pills-car-loan-2\"]//div[2]/ul/li[5]/span[1]")
    public WebElement totalInstallment;
    @FindBy(xpath = "//*[@id=\"pills-car-loan-2\"]//div[2]/ul/li[5]/span[2]")
    public WebElement totalInstallmentValue;


    @FindBy(xpath = "//h4[text()='Personal Finance Loan']")
    public WebElement personalFinanceLoan;

    @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement LoanApplicationSubmittedSuccessfullyText;

    @FindBy(xpath = "//h4[text()='Basic Loan 1']")
    public WebElement basicLoan1Card;
    @FindBy(xpath = "//h4[text()='Car Loan 9']")
    public WebElement basicLoan9Card;
    @FindBy(xpath = "//h4[text()='Test Loan']")
    public WebElement testLoanCard;

    @FindBy(xpath = "(//button[text()='Apply Now                                        '])[9]")
    public WebElement basicLoanApplyNowButton1;
    @FindBy(xpath = "(//button[text()='Apply Now                                        '])[10]")
    public WebElement basicLoanApplyNowButton2;
    @FindBy(xpath = "(//button[text()='Apply Now                                        '])[11]")
    public WebElement basicLoanApplyNowButton3;

    @FindBy(xpath = "(//button[@class='accordion-button collapsed'])[1]")
    public WebElement myLoansSonYapilanIslem;
    @FindBy(xpath = "//a[@class='btn btn--base btn--sm']")
    public WebElement takeLoanButton;
    @FindBy(xpath = "(//span[@class='badge badge--primary'])[1]")
    public WebElement myLoansRunning;
    @FindBy(xpath = "//div[3]//div/table")
    public WebElement taksitPlanListesi;

    @FindBy(xpath = "//table/thead/tr/th[1]")
    public WebElement loanInstallmentListeBaslikSN;
    @FindBy(xpath = "//table/thead/tr/th[2]")
    public WebElement loanInstallmentListeBaslikInstallmentDate;
    @FindBy(xpath = "//table/thead/tr/th[3]")
    public WebElement loanInstallmentListeBaslikGivenOn;
    @FindBy(xpath = "//table/thead/tr/th[4]")
    public WebElement loanInstallmentListeBaslikDelay;

    @FindBy(xpath = "//table/tbody/tr[1]/td[1]")
    public WebElement loanInstallmentListeDeger1;
    @FindBy(xpath = "//table/tbody/tr[1]/td[2]")
    public WebElement loanInstallmentListeDeger2;
    @FindBy(xpath = "//table/tbody/tr[1]/td[3]")
    public WebElement loanInstallmentListeDeger3;
    @FindBy(xpath = "//table/tbody/tr[1]/td[4]")
    public WebElement loanInstallmentListeDeger4;

     @FindBy(xpath = "//button[@id='pills-car-loan-2-tab']")
    public WebElement basicCar2;


    public void loanPlansCardBodyTextlerini_dogrula() {
        assertTrue(takeMinimum.isDisplayed());
        assertTrue(takeMinimumValue.isDisplayed());
        assertTrue(takeMaximum.isDisplayed());
        assertTrue(takeMaximumValue.isDisplayed());
        assertTrue(perInstallment.isDisplayed());
        assertTrue(perInstallmentValue.isDisplayed());
        assertTrue(personalFinanceLoan.isDisplayed());
        assertTrue(totalInstallment.isDisplayed());
        assertTrue(totalInstallmentValue.isDisplayed());
        assertTrue(installmentInterval.isDisplayed());
        assertTrue(installmentIntervalValue.isDisplayed());
        bekle(1);
    }

    public void basicLoanCardBasliklariGorunurlukTest() {
        goruneneKadarKaydir(basicLoan1Card);
        bekle(1);
        assertTrue(basicLoan1Card.isDisplayed());
        assertTrue(basicLoan9Card.isDisplayed());
        assertTrue(testLoanCard.isDisplayed());
    }

    public void basicLoanApplyNowButtonlariGorunurlukveAktiflikTest() {
        goruneneKadarKaydir(basicLoanApplyNowButton2);
        basicLoanApplyNowButton1.isDisplayed();
        basicLoanApplyNowButton2.isDisplayed();
        basicLoanApplyNowButton3.isDisplayed();
        basicLoanApplyNowButton1.isEnabled();
        basicLoanApplyNowButton2.isEnabled();
        basicLoanApplyNowButton3.isEnabled();
    }

    public void listeBasliklariGorunurlukTest() {
        assertTrue(loanInstallmentListeBaslikSN.isDisplayed());
        assertTrue(loanInstallmentListeBaslikInstallmentDate.isDisplayed());
        assertTrue(loanInstallmentListeBaslikGivenOn.isDisplayed());
        assertTrue(loanInstallmentListeBaslikDelay.isDisplayed());


    }

    public void loanInstallmentListeDegerleri() {
        loanInstallmentListeDeger1.isDisplayed();
        loanInstallmentListeDeger2.isDisplayed();
        loanInstallmentListeDeger3.isDisplayed();
        loanInstallmentListeDeger4.isDisplayed();
    }
}
