package pages.User;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserTransactionPage {

    public UserTransactionPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    // User Page Transactions locateleri US_019
    @FindBy(xpath = "//a[@href='https://qa.loantechexper.com/user/transactions']")
    public WebElement transactionsButton;
    @FindBy (xpath = "//*[h3='My Transactions History']")
    public WebElement myTransactionsHistoryYazisi;
    @FindBy (xpath = "//*[text()='Transaction Number']")
    public WebElement transactionNumberYazisi;
    @FindBy (xpath = "//div[@class='custom-input-box trx-search']")
    public WebElement transactionNumberSearchBox;
    @FindBy(xpath = "//i[@class='las la-search']")
    public WebElement searchBoxArama;
    @FindBy (xpath = "//*[text()='Type']")
    public WebElement typeYazisi;
    @FindBy (xpath = "(//div[@class='custom-input-box'])[1]")
    public WebElement typeTextBox;
    @FindBy (xpath = "//*[text()='Remark']")
    public WebElement remarkYazisi;
    @FindBy (xpath = "(//div[@class='custom-input-box'])[2]")
    public WebElement remarkTextBoxYazisi;
    @FindBy (xpath = "(//button[@class='accordion-button collapsed'])[1]")
    public WebElement depositSection;
    @FindBy (xpath = "(//button[@class='accordion-button collapsed'])[2]")
    public WebElement withdrawSection;

    //filtreleme sonrasi (minus/withdraw seçimi) sonrası açılan sayfadaki bilgilerin görüntülenmesi

    @FindBy (xpath = "//h6[@class='trans-title']")
    public WebElement withdrawYazisi;
    @FindBy (xpath = "(//span[@class='caption'])[1]")
    public WebElement chargeYazisi;
    @FindBy (xpath = "(//span[@class='caption'])[2]")
    public WebElement postBalanceYazisi;
    @FindBy (xpath = "(//span[@class='caption'])[3]")
    public WebElement detailsYazisi;
    @FindBy(xpath = "//*[text()='All']")
    public WebElement dropdownAllYazisi;
    @FindBy(xpath = "//select[@name='trx_type']")
    public WebElement typeDropdownMenu;
    @FindBy(xpath = "//select[@name='remark']")
    public WebElement remarkDropdownMenu;
    @FindBy(xpath = "//*[text()='Minus']")
    public WebElement dropdownMinusYazisi;
    @FindBy(xpath = "//*[text()='Plus']")
    public WebElement dropdownPlusYazisi;
    @FindBy(xpath = "//*[text()='Any']")
    public WebElement dropdownAnyYazisi;
    @FindBy(xpath = "//*[text()='Balance add']")
    public WebElement dropdownBalanceAddYazisi;
    @FindBy(xpath = "//*[text()='Application fee']")
    public WebElement dropdownApplicationFeeYazisi;
    @FindBy(xpath = "//*[text()='Deposit']")
    public WebElement dropdownDepositYazisi;
    @FindBy(xpath = "//*[text()='Withdraw']")
    public WebElement dropdownWithdrawYazisi;
    @FindBy(xpath = "//*[text()='Withdraw reject']")
    public WebElement dropdownWithdrawRejectYazisi;
    @FindBy(xpath = "//button[@class='accordion-button collapsed']")
    public WebElement filtreSonucuSayfa;
    @FindBy(xpath = "//select[@name='trx_type']")
    public WebElement transactionsAllYazisi;
    @FindBy(xpath = "//select[@name='remark']")
    public WebElement transactionsAnyYazisi;





}
