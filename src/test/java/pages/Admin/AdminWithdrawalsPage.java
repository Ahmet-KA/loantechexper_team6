package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.bekle;

public class AdminWithdrawalsPage {

    public AdminWithdrawalsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Withdrawals ']")
    public WebElement witdrawalsDropdown;
    @FindBy(xpath = "//span[text()='Withdrawal Methods']")
    public WebElement withdrawMethodMenu;
    @FindBy(xpath = "//span[text()='Pending Withdrawals']")
    public WebElement pendingWithdrawMenu;
    @FindBy(xpath = "//span[text()='Approved Withdrawals']")
    public WebElement approvedWithdrawMenu;
    @FindBy(xpath = "//span[text()='Rejected Withdrawals']")
    public WebElement rejectedWithdrawMenu;
    @FindBy(xpath = "//span[text()='All Withdrawals']")
    public WebElement allWithdrawsMenu;
    @FindBy(xpath = "//h6[text()='Withdrawal Methods']")
    public WebElement withdrawMethodPageTitle;
    @FindBy(xpath = "//h6[text()='Pending Withdrawals']")
    public WebElement pendingwithdrawPageTitle;
    @FindBy(xpath = "//h6[text()='Approved Withdrawals']")
    public WebElement approveWithdrawPageTitle;
    @FindBy(xpath = "//h6[text()='Rejected Withdrawals']")
    public WebElement rejectedWithdrawPageTitle;
    @FindBy(xpath = "//h6[text()='Withdrawals Log']")
    public WebElement allWithdrawPageTitle;


    //PENDING WITHDRAWALS ELEMENTLERİ -Admin ---Murat
    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--primary ms-1'])[1]")
    public static WebElement detailsButtonElement;
    @FindBy(xpath = "//span[text()=\"Pending Withdrawals\"]")
    public static WebElement pendingWithdrawalsMenu;
    @FindBy(xpath = "//h6[text()=\"Pending Withdrawals\"]")
    public static WebElement pendingWithdrawalsPageText;
    @FindBy(xpath = "//ul[@class=\"list-group\"]")
    public static WebElement islemDetaylari;

    @FindBy(xpath = "//div[@class=\"iziToast-body\"]")
    public static WebElement odemeUpdateOnayYazisi;
    @FindBy(xpath = "//i[@class='fas la-check']")
    public static WebElement approveButton;
    @FindBy(xpath = "//textarea[@placeholder=\"Provide the details. eg: transaction number\"]")
    public static WebElement approveTextBox;
    @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    public static WebElement approveSubmit;
    @FindBy(xpath = "(//button[@data-id=\"102\"])[2]")
    public static WebElement rejectButton;
    @FindBy(xpath = "//span[text()='Withdrawals ']")
    public static WebElement witdrawalsMenu;
    @FindBy(xpath = "(//input[@type=\"search\"])[2]")
    public static WebElement penWithUserNameSearcBox;
    @FindBy(xpath = "(//span[text()=\"murat armut\"])[1]")
    public static WebElement findResultElement;
    @FindBy(xpath = "//button[@class=\"btn btn--primary\"]")
    public static WebElement penWithUserNameSearcBoxFindButton;
    @FindBy(xpath = "(//input[@type=\"search\"])[3]")
    public static WebElement penWithDateSearcBox;
    @FindBy(xpath = "//button[@class=\"btn btn--primary input-group-text\"]") //i[@class='la la-search']
    public static WebElement penWithDateSearcBoxFindButton;
    @FindBy(xpath = "//div[@class=\"row justify-content - center\"]")
    public static WebElement pendingWithdrawalsTableElement;
    @FindBy(xpath = "//table/thead/tr/th[1]")
    public static WebElement gatewayHeader;
    @FindBy(xpath = "//table/thead/tr/th[2]")
    public static WebElement initiatedHeader;
    @FindBy(xpath = "//table/thead/tr/th[3]")
    public static WebElement userHeader;
    @FindBy(xpath = "//table/thead/tr/th[4]")
    public static WebElement amountHeader;
    @FindBy(xpath = "//table/thead/tr/th[5]")
    public static WebElement conversionHeader;
    @FindBy(xpath = "//table/thead/tr/th[6]")
    public static WebElement statusHeader;
    @FindBy(xpath = "//table/thead/tr/th[7]")
    public static WebElement actionHeader;
    @FindBy(xpath = "//table/tbody/tr[1]/td[1]")
    public static WebElement gatewayInfoElement;
    @FindBy(xpath = "//table/tbody/tr[1]/td[2]")
    public static WebElement initiatedInfoElement;
    @FindBy(xpath = "//table/tbody/tr[1]/td[3]")
    public static WebElement userInfoElement;
    @FindBy(xpath = "//table/tbody/tr[1]/td[4]")
    public static WebElement amountInfoElement;
    @FindBy(xpath = "//table/tbody/tr[1]/td[5]")
    public static WebElement conversionInfoElement;
    @FindBy(xpath = "//table/tbody/tr[1]/td[6]")
    public static WebElement statusInfoElement;
    @FindBy(xpath = "//table/tbody/tr[1]/td[7]")
    public static WebElement actionInfoElement;


    @FindBy(xpath = "(//input[@type='search'])[2]")
    public WebElement activeUsersSearchTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement activeUsersSearchButton;
    @FindBy(xpath = "//a[@class='btn btn-sm btn-outline--primary']")
    public WebElement activeUsersDetalis;
    @FindBy(xpath = "//a[@href='https://qa.loantechexper.com/admin/withdraw/log?search=mertkan']")
    public WebElement withdrawViewAll;
    @FindBy(xpath = "(//a[@class='item-link'])[1]")
    public WebElement approvedWithdrawals;
    @FindBy(xpath = "(//a[@class='item-link'])[2]")
    public WebElement pendingWithdrawals;
    @FindBy(xpath = "(//a[@class='item-link'])[3]")
    public WebElement rejectedWithdrawals;
    @FindBy(xpath = "//a[@class='btn btn-sm btn-outline--primary ms-1']")
    public WebElement withdrawalsUsersDetails;
    @FindBy(xpath = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[1]")
    public WebElement withdrawDetailedInformation1;
    @FindBy(xpath = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[2]")
    public WebElement withdrawDetailedInformation2;
    @FindBy(xpath = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[3]")
    public WebElement withdrawDetailedInformation3;
    @FindBy(xpath = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[4]")
    public WebElement withdrawDetailedInformation4;
    @FindBy(xpath = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[5]")
    public WebElement withdrawDetailedInformation5;
    @FindBy(xpath = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[6]")
    public WebElement withdrawDetailedInformation6;
    @FindBy(xpath = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[7]")
    public WebElement withdrawDetailedInformation7;
    @FindBy(xpath = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[8]")
    public WebElement withdrawDetailedInformation8;
    @FindBy(xpath = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[9]")
    public WebElement withdrawDetailedInformation9;
    @FindBy(xpath = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[10]")
    public WebElement withdrawDetailedInformation10;
    @FindBy(xpath = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[11]")
    public WebElement withdrawDetailedInformation11;
    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--primary ms-1'])[2]")
    public WebElement pendingUsersDetails;
    @FindBy(xpath = "//button[@class='btn btn-outline--success ms-1 approveBtn']")
    public WebElement approvePendingWithdrawButton;
    @FindBy(xpath = "//button[@class='btn btn-outline--danger ms-1 rejectBtn']")
    public WebElement rejecetPendingWithdrawButton;
    @FindBy(xpath = "(//textarea[@name='details'])[2]")
    public WebElement reasonOfRejectionTextBox;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement reaasonSubmitButton;
    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement confirmationAlertBox;
    @FindBy(xpath = "(//span[@class='badge badge--danger'])[1]")
    public WebElement rejectedStatusTextBox;
    @FindBy(xpath = "(//span[@class='fw-bold'])[5]")
    public WebElement rejectedAmountTextBox;


    public static void pendingWithdrawalsListesiBasliklariGoruntulemeTesti() {
        bekle(1);
        assertTrue(gatewayHeader.isDisplayed());
        assertTrue(initiatedHeader.isDisplayed());
        assertTrue(userHeader.isDisplayed());
        assertTrue(amountHeader.isDisplayed());
        assertTrue(conversionHeader.isDisplayed());
        assertTrue(statusHeader.isDisplayed());
        assertTrue(actionHeader.isDisplayed());
        bekle(1);
    }

    public static void pendingWithdrawalsListesiBilgileriGoruntulemeTesti() {
        bekle(1);
        assertTrue(gatewayInfoElement.isDisplayed());
        assertTrue(initiatedInfoElement.isDisplayed());
        assertTrue(userInfoElement.isDisplayed());
        assertTrue(amountInfoElement.isDisplayed());
        assertTrue(conversionInfoElement.isDisplayed());
        assertTrue(statusInfoElement.isDisplayed());
        assertTrue(actionInfoElement.isDisplayed());
        bekle(1);
    }
public static void butonGorunurlukVeAktiflikTesti(WebElement buttonElement){
    assertTrue(buttonElement.isDisplayed());
    assertTrue(buttonElement.isEnabled());
}


       public static String expectedDetailsPageUrl = "https://qa.loantechexper.com/admin/withdraw/details";
















    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[8]/a")
    public WebElement withdrawalsButton;

    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[8]/div/ul/li[1]/a/span")
    public WebElement withdrawalsMethodButton;

    @FindBy(xpath = "//div[@class=\"col-lg-12\"]")
    public WebElement withdrawalsMethod;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/div/table/tbody/tr[3]/td[6]/div/a")
    public WebElement withdrawalsMethodEditButton;

    @FindBy(xpath = "//h6[@class=\"page-title\"]")
    public WebElement updateWithdrawalMethodText;

    @FindBy(xpath = "//*[@id=\"min_limit\"]")
    public WebElement withdrawalMethodMinimumAmount;

    @FindBy(xpath = "//*[@id=\"max_limit\"]")
    public WebElement withdrawalMethodMaximumAmount;

    @FindBy(xpath = "//button[@class=\"btn btn--primary w-100 h-45\"]")
    public WebElement withdrawalMethodSubmitButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/div/table/tbody/tr[3]/td[5]/span")
    public WebElement enabledButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div/a")
    public WebElement addNewButton;

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement nameText;

    @FindBy(xpath = "//*[@id=\"currency\"]")
    public WebElement currencyText;

    @FindBy(xpath = "//*[@id=\"rate\"]")
    public WebElement rateText;

    @FindBy(xpath = "//*[@id=\"min_limit\"]")
    public WebElement minLimitText;

    @FindBy(xpath = "//*[@id=\"max_limit\"]")
    public WebElement maxLimitText;

    @FindBy(xpath = "//*[@id=\"fixed_charge\"]")
    public WebElement fixedChargeText;

    @FindBy(xpath = "//*[@id=\"percent_charge\"]")
    public WebElement percentChargeText;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/form/div[1]/div/div/div[3]/div[3]/div/div/div/div[2]/div")
    public WebElement withdrawInstructionText;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/form/div[2]/button")
    public WebElement methodsSubmitButton;

    @FindBy(xpath = "//*[@id=\"V2l0aGRyYXclMjBtZXRob2QlMjBhZGRlZCUyMHN1Y2Nlc3NmdWxseWdyZWVu\"]/div[1]/div[1]/p")
    public WebElement withdrawMethodAddedSuccessfullyMessage;






}