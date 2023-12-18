package pages.User;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserTakeLoanPage {
    public UserTakeLoanPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='https://qa.loantechexper.com/user/loan/plans']")
    WebElement TakeLoanlink;

    @FindBy(xpath = "//h3['Loan Plans']")
    WebElement LoanPlansPage;

    @FindBy(xpath = "//*[@type='button']")
    WebElement LoanButton;

    @FindBy(xpath = "//*[@id='pills-car-loan-tab']")
    WebElement CarLoanButton;

    @FindBy(xpath = "//*[@class='btn btn-md btn--xl xl-text w-100 btn--base loanBtn']")
    WebElement ApplyNowButton;

    @FindBy(xpath = "//*[@class='loan-name']")
    WebElement ApplyForPersonalFinanceLoanPage;

    @FindBy(xpath = "//*[@class='btn btn--base w-100']")
    WebElement ConfirmButton;

    @FindBy(xpath = "//h5['text-center']")
    WebElement ConfirmButtonKayit;

    @FindBy(xpath = "//*[@id='pills-basic-loan-tab']")
    WebElement BasicLoanButton;

    @FindBy(xpath = "//*[@data-planname='Test Loan']")
    WebElement TestLoanApplyNowButton;

    @FindBy(xpath = "//*[@class='btn btn--base w-100']")
    WebElement TestLoanApplyNowConfirmButton;

    @FindBy(xpath = "//*[@class='card-title']")
    WebElement ApplicationFormPage;

    @FindBy(xpath = "//h3['My Loans']")
    WebElement MyLoansPage;

    @FindBy(xpath = "//*[@id='search']")
    WebElement SearchByLoanNumberTextBox;

    @FindBy(xpath = "//*[text()='Loan Status']")
    WebElement LoanStatusTitle;

    @FindBy(xpath = "//*[@id='status']")
    WebElement RunningYazisi;


}
