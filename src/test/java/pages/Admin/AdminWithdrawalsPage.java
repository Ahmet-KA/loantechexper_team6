package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminWithdrawalsPage {

    public AdminWithdrawalsPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Withdrawals ']")
    public WebElement witdrawalsDropdown;
    @FindBy (xpath = "//span[text()='Withdrawal Methods']")
    public WebElement withdrawMethodMenu;
    @FindBy (xpath = "//span[text()='Pending Withdrawals']")
    public WebElement pendingWithdrawMenu;
    @FindBy (xpath = "//span[text()='Approved Withdrawals']")
    public WebElement approvedWithdrawMenu;
    @FindBy (xpath = "//span[text()='Rejected Withdrawals']")
    public WebElement rejectedWithdrawMenu;
    @FindBy (xpath = "//span[text()='All Withdrawals']")
    public WebElement allWithdrawsMenu;
    @FindBy (xpath = "//h6[text()='Withdrawal Methods']")
    public WebElement withdrawMethodPageTitle;
    @FindBy (xpath = "//h6[text()='Pending Withdrawals']")
    public WebElement pendingwithdrawPageTitle;
    @FindBy (xpath = "//h6[text()='Approved Withdrawals']")
    public WebElement approveWithdrawPageTitle;
    @FindBy (xpath = "//h6[text()='Rejected Withdrawals']")
    public WebElement rejectedWithdrawPageTitle;
    @FindBy (xpath = "//h6[text()='Withdrawals Log']")
    public WebElement allWithdrawPageTitle;










    //PENDING WITHDRAWALS ELEMENTLERİ -Admin ---Murat
    @FindBy(xpath = "//span[text()=\"Withdrawals\"]")
    public WebElement withdrawalsMenu;
    @FindBy(xpath = "//span[text()=\"Pending Withdrawals\"]")
    public WebElement pendingWithdrawalsMenu;
    @FindBy(xpath = "//h6[text()=\"Pending Withdrawals\"]")
    public WebElement pendingWithdrawalsPageText;
    @FindBy(xpath = "//table/thead/tr")
    public static WebElement pendingWithdrawalsTableHeader;

    @FindBy(xpath = "//span[text()=\"Pending\"]")
    public WebElement statusPendingElementi;
    @FindBy(xpath = "//i[@class=\"fas la-check\"]")
    public WebElement approveButton;
    @FindBy(xpath = "(//textarea[@class=\"form-control pt-3\"])[1]")
    public WebElement approveTextBox;
    @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    public WebElement approveSubmit;
    @FindBy(xpath = "(//button[@aria-label=\"Close\"])[1]")
    public WebElement xClose;
    @FindBy(xpath = "//span[text()=\"Approved\"]")
    public WebElement statusApprovedElementi;
    @FindBy(xpath = "(//input[@type=\"search\"])[2]")
    public WebElement penWithUserNameSearcBox;
    @FindBy(xpath = "//span[text()=\"murat armut\"]")
    public WebElement findResultElement;
    @FindBy(xpath = "//button[@class=\"btn btn--primary\"]")
    public WebElement penWithUserNameSearcBoxFindButton;
    @FindBy(xpath = "(//input[@type=\"search\"])[3]")
    public WebElement penWithDateSearcBox;
    @FindBy(xpath = "//button[@class=\"btn btn--primary input-group - text\"]")
    public WebElement penWithDateSearcBoxFindButton;
    @FindBy(xpath = "//div[@class=\"row justify-content - center\"]")
    public WebElement pendingWithdrawalsTableElement;
    @FindBy(xpath = "//table/thead/tr/th[1]")
    public WebElement gatewayHeader;
    @FindBy(xpath = "//table/thead/tr/th[2]")
    public WebElement initiatedHeader;
    @FindBy(xpath = "//table/thead/tr/th[3]")
    public WebElement userHeader;
    @FindBy(xpath = "//table/thead/tr/th[4]")
    public WebElement amountHeader;
    @FindBy(xpath = "//table/thead/tr/th[5]")
    public WebElement conversionHeader;
    @FindBy(xpath = "//table/thead/tr/th[6]")
    public WebElement statusHeader;
    @FindBy(xpath = "//table/thead/tr/th[7]")
    public WebElement actionHeader;
    @FindBy(xpath = "")
    public WebElement gatewayInfoElement;
    @FindBy(xpath = "")
    public WebElement initiatedInfoElement;
    @FindBy(xpath = "")
    public WebElement userInfoElement;
    @FindBy(xpath = "")
    public WebElement amountInfoElement;
    @FindBy(xpath = "")
    public WebElement conversionInfoElement;
    @FindBy(xpath = "")
    public WebElement statusInfoElement;
    @FindBy(xpath = "")
    public WebElement actionInfoElement;











    @FindBy(xpath  = "(//input[@type='search'])[2]")
    public WebElement activeUsersSearchTextBox;
    @FindBy(xpath  = "//button[@type='submit']")
    public WebElement activeUsersSearchButton;
    @FindBy(xpath  = "//a[@class='btn btn-sm btn-outline--primary']")
    public WebElement activeUsersDetalis;
    @FindBy(xpath="//a[@href='https://qa.loantechexper.com/admin/withdraw/log?search=mertkan']")
    public WebElement withdrawViewAll;
    @FindBy(xpath="(//a[@class='item-link'])[1]")
    public WebElement approvedWithdrawals;
    @FindBy(xpath="(//a[@class='item-link'])[2]")
    public WebElement pendingWithdrawals;
    @FindBy(xpath="(//a[@class='item-link'])[3]")
    public WebElement rejectedWithdrawals;
    @FindBy(xpath  = "//a[@class='btn btn-sm btn-outline--primary ms-1']")
    public WebElement withdrawalsUsersDetails;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[1]")
    public WebElement withdrawDetailedInformation1;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[2]")
    public WebElement withdrawDetailedInformation2;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[3]")
    public WebElement withdrawDetailedInformation3;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[4]")
    public WebElement withdrawDetailedInformation4;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[5]")
    public WebElement withdrawDetailedInformation5;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[6]")
    public WebElement withdrawDetailedInformation6;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[7]")
    public WebElement withdrawDetailedInformation7;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[8]")
    public WebElement withdrawDetailedInformation8;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[9]")
    public WebElement withdrawDetailedInformation9;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[10]")
    public WebElement withdrawDetailedInformation10;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[11]")
    public WebElement withdrawDetailedInformation11;
    @FindBy(xpath  = "(//a[@class='btn btn-sm btn-outline--primary ms-1'])[2]")
    public WebElement pendingUsersDetails;
    @FindBy(xpath  = "//button[@class='btn btn-outline--success ms-1 approveBtn']")
    public WebElement approvePendingWithdrawButton;
    @FindBy(xpath  = "//button[@class='btn btn-outline--danger ms-1 rejectBtn']")
    public WebElement rejecetPendingWithdrawButton;
    @FindBy(xpath  = "(//textarea[@name='details'])[2]")
    public WebElement reasonOfRejectionTextBox;
    @FindBy(xpath ="(//button[@type='submit'])[2]")
    public WebElement reaasonSubmitButton;
    @FindBy(xpath ="//div[@class='iziToast-body']")
    public WebElement confirmationAlertBox;
    @FindBy(xpath ="(//span[@class='badge badge--danger'])[1]")
    public WebElement rejectedStatusTextBox;
    @FindBy(xpath ="(//span[@class='fw-bold'])[5]")
    public WebElement rejectedAmountTextBox;


}
