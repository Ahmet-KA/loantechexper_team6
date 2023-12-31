package pages.Admin;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class AdminDepositsPage {

    public AdminDepositsPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Deposit History']")
    public WebElement depositHistoryPageTitle;
    @FindBy (xpath = "//th[text()='Gateway | Transaction']")
    public WebElement gatewaySutunBaslik;
    @FindBy (xpath = "//th[text()='Initiated']")
    public WebElement initiatedSutunBaslik;
    @FindBy (xpath = "//th[text()='Amount']")
    public WebElement amountSutunBaslik;
    @FindBy (xpath = "//th[text()='Conversion']")
    public WebElement conversionSutunBaslik;
    @FindBy (xpath = "//th[text()='Status']")
    public WebElement statusSutunBaslik;
    @FindBy (xpath = "//*[@class='btn btn-sm btn-outline--primary ms-1']")
    public WebElement depoHistoryDetailsButton;
    @FindBy (xpath = "//h6[contains(text(),'requested')]")
    public WebElement userRequestedText;
    @FindBy (xpath = "//*[@class='card-body']")
    public WebElement depositCardBody;
    @FindBy (xpath = "//*[@class='list-group-item d-flex justify-content-between align-items-center']")
    public List<WebElement> depositCardBilgiList;

    @FindBy (xpath = "//*[text()='Successful Deposit']")
    public WebElement successDepositBaslik;
    @FindBy (xpath = "(//h2[@class='text-white'])[1]")
    public WebElement successDepositDeger;
    @FindBy (xpath = "//*[text()='Pending Deposit']")
    public WebElement pendingDepositBaslik;
    @FindBy (xpath = "(//h2[@class='text-white'])[2]")
    public WebElement pendingDepositDeger;
    @FindBy (xpath = "//*[text()='Rejected Deposit']")
    public WebElement rejectedDepositBaslik;
    @FindBy (xpath = "(//h2[@class='text-white'])[3]")
    public WebElement rejectedDepositDeger;
    @FindBy (xpath = "//*[text()='Initiated Deposit']")
    public WebElement initiatedDepositBaslik;
    @FindBy (xpath = "(//h2[@class='text-white'])[4]")
    public WebElement initiatedDepositDeger;

    //Successfull deposit sayfasına yonlendirdi
    @FindBy (xpath = "//h6[text()='Successful Deposits']")
    public WebElement successDepositPageTitle;
    @FindBy (xpath = "//input[@name='search']")
    public WebElement searchBox;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement searchButton;
    @FindBy (xpath = "//input[@name='date']")
    public WebElement dateBox;
    @FindBy (xpath = "///button[@class='btn btn--primary input-group-text']")
    public WebElement dateSearchButton;
    @FindBy (xpath = "//tbody//tr")
    public List<WebElement> successdepositList;
    @FindBy (xpath = "//h6[@class='page-title']")
    public WebElement pendingDepositsYazisi;
    @FindBy (xpath = "//div[@class='bodywrapper__inner']")
    public WebElement pendingDepositsListesi;
    @FindBy (xpath = "(//a[@class='btn btn-sm btn-outline--primary ms-1'])[5]")
    public WebElement pendingDepositDetailsButton;
    @FindBy (xpath = "(//div[@class='modal-body'])[2]")
    public WebElement approveUyariMesaji;


















    @FindBy (xpath = "//span[text()='Deposits']")
    public WebElement depositsButon;
    @FindBy (xpath = "//span[text()='Successful Deposits']")
    public WebElement successfulDeposits;
    @FindBy (xpath = "//h6[@class='page-title']")
    public WebElement adminSuccessfulSayfa;
    @FindBy (xpath = "//th[text()='Gateway | Transaction']")
    public WebElement gatewayBaslik;
    @FindBy (xpath = "//th[text()='Initiated']")
    public WebElement initatedBaslik;
    @FindBy (xpath = "//th[text()='User']")
    public WebElement userBaslik;
    @FindBy (xpath = "//th[text()='Amount']")
    public WebElement amountBaslik;
    @FindBy (xpath = "//th[text()='Conversion']")
    public WebElement conversionBaslik;
    @FindBy (xpath = "//th[text()='Status']")
    public WebElement statusBaslik;
    @FindBy (xpath = "//th[text()='Action']")
    public WebElement actionBaslik;

    //@FindBy(xpath = "//a[@*='https://qa.loantechexper.com/admin/deposit/details/52']")

    @FindBy(xpath = "//a[@*='btn btn-sm btn-outline--primary ms-1']")
    public WebElement detailsButon;

    @FindBy(xpath = "//span[text()='All Deposits']")
    public WebElement allDepositsBaslik;
    @FindBy(xpath = "(//*[@class='menu-title'])[26]")
    public WebElement approvedDepositsBaslik;

    @FindBy(xpath = "//div[@class='card b-radius--10 overflow-hidden box--shadow1']")
    public WebElement detailsRaporu;














    //Pending deposit sayfasına yonlendirdi
    @FindBy (xpath = "//h6[text()='Pending Deposits']")
    public WebElement pendingDepositPageTitle;

    @FindBy (xpath = "(//a[@class='btn btn-sm btn-outline--primary ms-1'])[1]")
    public WebElement ilkPendingDetailsButton;
    @FindBy (xpath = "//*[@class='btn btn-outline--success btn-sm ms-1 confirmationBtn']")
    public WebElement approveButton;
    @FindBy (xpath = "//*[@class='btn btn-outline--danger btn-sm ms-1 rejectBtn']")
    public WebElement rejectButton;















    @FindBy(xpath ="(//a[@href='javascript:void(0)'])[4]")
    public WebElement adminDashboardDepositButton;
    @FindBy(xpath ="//a[@href='https://qa.loantechexper.com/admin/deposit/approved']")
    public WebElement adminDashboardApprovedDepositButton;
    @FindBy(xpath ="//div[@class='bodywrapper__inner']")
    public WebElement approvedDepositTable;
    @FindBy(xpath  = "(//th)[1]")
    public WebElement approvedDepositsHeader1;
    @FindBy(xpath  = "(//th)[2]")
    public WebElement approvedDepositsHeader2;
    @FindBy(xpath  = "(//th)[3]")
    public WebElement approvedDepositsHeader3;
    @FindBy(xpath  = "(//th)[4]")
    public WebElement approvedDepositsHeader4;
    @FindBy(xpath  = "(//th)[5]")
    public WebElement approvedDepositsHeader5;
    @FindBy(xpath  = "(//th)[6]")
    public WebElement approvedDepositsHeader6;
    @FindBy(xpath  = "(//th)[7]")
    public WebElement approvedDepositsHeader7;
    @FindBy(xpath  = "(//input[@type='search'])[2]")
    public WebElement approvedDepositsUsersSearchTextBox;
    @FindBy(xpath  = "//button[@type='submit']")
    public WebElement approvedDepositsUsersSearchButton;
    @FindBy(xpath  = "//a[@class='btn btn-sm btn-outline--primary ms-1']")
    public WebElement approvedDepositsUsersDetails;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[1]")
    public WebElement approvedDepositsDetailedInformation1;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[2]")
    public WebElement approvedDepositsDetailedInformation2;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[3]")
    public WebElement approvedDepositsDetailedInformation3;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[4]")
    public WebElement approvedDepositsDetailedInformation4;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[5]")
    public WebElement approvedDepositsDetailedInformation5;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[6]")
    public WebElement approvedDepositsDetailedInformation6;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[7]")
    public WebElement approvedDepositsDetailedInformation7;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[8]")
    public WebElement approvedDepositsDetailedInformation8;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[9]")
    public WebElement approvedDepositsDetailedInformation9;
    @FindBy(xpath  = "(//li[@class='list-group-item d-flex justify-content-between align-items-center'])[10]")
    public WebElement approvedDepositsDetailedInformation10;

    //afife<<<<<<DepositHistorypage

    @FindBy (xpath = "//th[text()='User']")
    public WebElement userSutunBaslik;
    @FindBy (xpath = "//th[text()='Action']")
    public WebElement actionSutunBaslik;
    @FindBy (xpath = "//*[@class='list-group-item d-flex justify-content-between align-items-center']")
    public List<WebElement> depositCardBaslikList;
    @FindBy (xpath = "//a[@class='item-link']")
    public WebElement successDepositLink;
    public void cardBilgiGoruntuleAssert(){
        List<String> baslikList=new ArrayList<>();
        baslikList.add("Date"); baslikList.add("Transaction Number"); baslikList.add("Username");
        baslikList.add("Method"); baslikList.add("Amount"); baslikList.add("Charge");
        baslikList.add("After Charge"); baslikList.add("Rate"); baslikList.add("Payable");baslikList.add("Status");

        for (int i = 0; i < depositCardBaslikList.size(); i++) {
            if (depositCardBaslikList.get(i).getText().contains(baslikList.get(i))){
                Assert.assertTrue(depositCardBaslikList.get(i).isDisplayed());
            }
        }
    }
    public void userDepositTableBaslikAssert() {
        Assert.assertTrue(gatewaySutunBaslik.isDisplayed());
        Assert.assertTrue(initiatedSutunBaslik.isDisplayed());
        Assert.assertTrue(userSutunBaslik.isDisplayed());
        Assert.assertTrue(amountSutunBaslik.isDisplayed());
        Assert.assertTrue(statusSutunBaslik.isDisplayed());
        Assert.assertTrue(actionSutunBaslik.isDisplayed());
    }

    // pending deposit sayfasi reject-aprove islemleri
    @FindBy (xpath = "(//a[@class='item-link'])[2]")
    public WebElement pendingDepositLink;
    @FindBy (xpath = "//h5[text()='Reject Deposit Confirmation']")
    public WebElement rejDepoConfirmSayfaBaslik;
    @FindBy (xpath = "//*[@class='modal-content']")
    public WebElement rejDepoConfirmModal;
    @FindBy (xpath = "//*[@id='message']")
    public WebElement rejDepoMessageBox;
    @FindBy (xpath = "//*[@class='btn btn--primary w-100 h-45']")
    public WebElement rejMessageSubmitButton;
    @FindBy (xpath = "//*[text()='Deposit request rejected successfully']")////bu kısımda mesajı yakalamalı
    public WebElement rejectSuccessText;
    @FindBy (xpath = "//button[@class='btn btn--primary']")
    public WebElement approveAlertYesButton;
    @FindBy (xpath = "//*[text()='Deposit request approved successfully']")////bu kısımda mesajı yakalamalı
    public WebElement approveSuccessText;
    @FindBy (xpath = "//tbody//tr")
    public List<WebElement> userDepositHistoryList;
    @FindBy(xpath = "(//*[text()='Pending Deposits'])[1]")
    public WebElement pendingDepositslink;






























}
