package pages.Admin;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

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
   public WebElement notificationsendto;

    @FindBy (xpath = "(//*[@class='btn btn-sm btn-outline--primary'])[1]")
    public WebElement detailsButonuBirinciSira;

    // user detail sayfasi
    @FindBy (xpath = "//*[@class='page-title']")
   public WebElement userDetailKullaniciAdi;
    // user detail
    @FindBy (xpath = "//*[@class='btn btn--secondary btn--shadow w-100 btn-lg']")
    public WebElement notificationButonu;
    // User Detail
    @FindBy (xpath = "//a[@class='btn btn--primary btn--gradi btn--shadow w-100 btn-lg']")
   public WebElement loginAsAUserButonu;
    @FindBy (xpath = "//h6[@class='page-title']")
    public WebElement activeUsersText;

    // Send Notification
    @FindBy(xpath = "//a[@class='btn btn-outline--primary btn-sm']")
    public WebElement sendNotificationButonug;

    @FindBy (xpath = "//input[@class='form-control']")
    public  WebElement sendNotificationSubjectTextBox;

    @FindBy (xpath = "//*[@contenteditable='true']")
    public WebElement sendNotificatinMessageTextBox;

    @FindBy (xpath = "//button[@class='btn w-100 h-45 btn--primary']")
    public WebElement sendNotificationSubmitButton;


    @FindBy (xpath = "//*[text()='Notification sent successfully']")
    public WebElement mesajgonderilditexti;


    //afife<<<< activeUserspage
    @FindBy(xpath = "//*[text()='Active Users']")
    public WebElement activeUsersTitle;
    @FindBy (xpath = "//input[@name='search']")
    public WebElement userNameSearchBox;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement searchSubmitButton;
    @FindBy (xpath = "//*[@class='btn btn-sm btn-outline--primary']")
    public WebElement detailsButton;
    @FindBy (xpath = " //h6[contains(text(),'User Detail')]")
    public WebElement userDetailPageTitle;
    @FindBy (xpath = "//*[@class='widget-two__btn btn btn-outline--success']")
    public WebElement viewAllDepositIcon;
    @FindBy (xpath = "//tbody//tr")
    public List<WebElement> activeUsersList;
    @FindBy (xpath = "//*[text()='Deposit History']")
    public WebElement depositHistoryPageTitle;
    public void activeUserTableBaslikAssert(){
        Assert.assertTrue(emailSutunBaslik.isDisplayed());
        Assert.assertTrue(userSutunBaslik.isDisplayed());
        Assert.assertTrue(countrySutunBaslik.isDisplayed());
        Assert.assertTrue(joinedAtSutunBaslik.isDisplayed());
        Assert.assertTrue(balanceSutunBaslik.isDisplayed());
        Assert.assertTrue(actionSutunBaslik.isDisplayed());
    }

    @FindBy(xpath = "//*[@class='widget-two__btn btn btn-outline--primary'][1]")
    public WebElement viewAllBalanceIcon;

    @FindBy(xpath = "//h6[contains(text(),'Transaction Logs')]")
    public WebElement transactionLogsPageTitle;

    @FindBy(xpath = "//table/thead/tr/th")
    public List<WebElement> tableTransactionLogsPage;

    @FindBy(xpath = "//*[@name='trx_type']")
    public WebElement typeFilter;

    @FindBy(xpath = "//*[@name='remark']")
    public  WebElement remarkFilter;

    @FindBy(xpath = "//*[@class='datepicker--cell datepicker--cell-day -current-']")
    public WebElement dateFilterSelected;

    @FindBy(xpath = "//*[@class='datepicker-here form-control']")
    public WebElement dateFilter;

    @FindBy(xpath = "//*[@class='btn btn--primary w-100 h-45']")
    public WebElement filterButton;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> transactionLogsTable;

    @FindBy(xpath = "//*[@class='btn btn--success btn--shadow w-100 btn-lg bal-btn']")
    public WebElement balanceButton;

    @FindBy(xpath = "//h5[@class='modal-title']")
    public WebElement addBalancePageTitle;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement amountTextBox;

    @FindBy(xpath = "//textarea[@name='remark']")
    public WebElement remarkTextBox;

    @FindBy(xpath = "//*[@class='btn btn--primary h-45 w-100'][1]")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@class='iziToast-wrapper iziToast-wrapper-topRight']")
    public WebElement addBalanceMessage;

    @FindBy(xpath = "//*[@class='btn btn--danger btn--shadow w-100 btn-lg bal-btn']")
    public WebElement subtractBalanceButton;

    @FindBy(xpath = "//*[@class='iziToast-wrapper iziToast-wrapper-topRight']")
    public WebElement subtractBalanceMessage;

    @FindBy(xpath = "//h5[@class='modal-title'][1]")
    public WebElement subtractBalancePageTitle;

    public void filterSelectedValidate(){

        Select select = new Select(typeFilter);
        select.selectByVisibleText("Plus");

        select = new Select(remarkFilter);
        select.getFirstSelectedOption();

        dateFilter.click();
        ReusableMethods.bekle(1);
        dateFilterSelected.click();
        ReusableMethods.bekle(1);
        filterButton.click();

        Assert.assertTrue(transactionLogsTable.size()>0);
    }

    public void addBalancePageControl(){

        Assert.assertTrue(amountTextBox.isEnabled());
        Assert.assertTrue(remarkTextBox.isEnabled());
    }

    public void subtractBalancePageControl(){

        Assert.assertTrue(amountTextBox.isEnabled());
        Assert.assertTrue(remarkTextBox.isEnabled());
        ReusableMethods.bekle(1);
    }











    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[2]/a")
    public WebElement manageUsersButton;

    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[2]/div/ul/li[9]/a")
    public WebElement notificationToAllButton;

    @FindBy(xpath = "//*[@id=\"being_sent_to\"]")
    public WebElement beingSentCheckbox;

    @FindBy(xpath = "//*[@id=\"subject\"]")
    public WebElement subjectTextbox;

    @FindBy(xpath = "//*[@id=\"user_list_wrapper\"]/span/span[1]/span")
    public WebElement selectUserTextbox;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div")
    public WebElement notificationMessageTextbox;

    @FindBy(xpath = "//*[@id=\"batch\"]")
    public WebElement pertBatchTextbox;

    @FindBy(xpath = "//*[@id=\"cooling_time\"]")
    public WebElement coolingPeriodTextbox;

    @FindBy(xpath = "//button[@class=\"btn w-100 h-45 btn--primary me-2\"]")
    public WebElement notificationSubmitButton;

    @FindBy(xpath = "//*[@id=\"notificationSending\"]/div/div/div[2]/div[2]/div")
    public WebElement doneMessage;














}
