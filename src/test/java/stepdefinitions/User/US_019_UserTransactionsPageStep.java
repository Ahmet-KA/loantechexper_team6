package stepdefinitions.User;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.User.UserDashboardPage;
import pages.User.UserLoginPage;
import pages.User.UserTransactionPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class US_019_UserTransactionsPageStep {
    WebElement driver;

    UserTransactionPage userTransactionPage = new UserTransactionPage();
    UserLoginPage loginPage = new UserLoginPage();
    UserDashboardPage dashboardPage = new UserDashboardPage();

    public void cookiesi_kapatir() {
        bekle(2);
        ReusableMethods.clickWithJS(loginPage.allowCookies);
    }

    /*@Given("Kullanici anasayfaya gider {string} ve {string} ile login olur")
    public void kullanici_anasayfaya_gider_ve_ile_login_olur(String userNameRcr, String userPassword) {
        ReusableMethods.bekle(1);
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        bekle(1);
        dashboardPage.dashboardLoginElement.click();
        cookiesi_kapatir();
        goruneneKadarKaydir(loginPage.userNameTextBox);
        loginPage.userNameTextBox.sendKeys(ConfigReader.getProperty(userNameRcr));
        loginPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty(userPassword));
        loginPage.loginButton.click();
    }

     */
    @Given("Dasboard sayfasinda Transactions linki gorulur ve aktifligini dogrular")
    public void dasboard_sayfasinda_transactions_linki_gorulur_ve_aktifligini_dogrular() {
        waitForPageToLoad(5);
        assertTrue(userTransactionPage.transactionsButton.isDisplayed());
        userTransactionPage.transactionsButton.isEnabled();
    }
    @Given("Transactions linkine tiklanir")
    public void transactions_linkine_tiklanir() {
        userTransactionPage.transactionsButton.click();
    }
    @Given("My Transactions History yazisinin goruntulendigi dogrulanır")
    public void my_transactions_history_yazisinin_goruntulendigi_dogrulanır() {
        userTransactionPage.myTransactionsHistoryYazisi.isDisplayed();
    }                                                   // case-3
    @Given("Sayfada Transactions Number  Search Box ,Type,Remark goruntulenir")
    public void sayfada_transactions_number_search_box_type_remark_goruntulenir() {
        userTransactionPage.transactionNumberSearchBox.isDisplayed();
        userTransactionPage.transactionNumberYazisi.isDisplayed();
        userTransactionPage.typeYazisi.isDisplayed();
        userTransactionPage.remarkYazisi.isDisplayed();
    }
    @Given("Type altindaki All,Plus,Minus menuler ve remark altindaki Any, Application fee, Balance add,Deposit, Loan taken, Withdraw, Withdraw reject goruntulenir")
    public void type_altindaki_all_plus_minus_menuler_ve_remark_altindaki_any_application_fee_balance_add_deposit_loan_taken_withdraw_withdraw_reject_goruntulenir() {

        Select select = new Select(userTransactionPage.transactionsAllYazisi);
        select.selectByVisibleText("All");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("All"));
        bekle(1);
        select.selectByVisibleText("Plus");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Plus"));
        bekle(1);
        select.selectByVisibleText("Minus");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Minus"));
        bekle(1);
        Select select2 = new Select(userTransactionPage.transactionsAnyYazisi);
        select2.selectByVisibleText("Any");
        Assert.assertTrue(select2.getFirstSelectedOption().getText().contains("Any"));
        bekle(1);
        select2.selectByVisibleText("Application fee");
        Assert.assertTrue(select2.getFirstSelectedOption().getText().contains("Application fee"));
        bekle(1);
        select2.selectByVisibleText("Balance add");
        Assert.assertTrue(select2.getFirstSelectedOption().getText().contains("Balance add"));
        bekle(1);
        select2.selectByVisibleText("Balance subtract");
        Assert.assertTrue(select2.getFirstSelectedOption().getText().contains("Balance subtract"));
        bekle(1);
        select2.selectByVisibleText("Deposit");
        Assert.assertTrue(select2.getFirstSelectedOption().getText().contains("Deposit"));
        bekle(1);
        select2.selectByVisibleText("Loan installment");
        Assert.assertTrue(select2.getFirstSelectedOption().getText().contains("Loan installment"));
        bekle(1);
        select2.selectByVisibleText("Loan taken");
        Assert.assertTrue(select2.getFirstSelectedOption().getText().contains("Loan taken"));
        bekle(1);
        select2.selectByVisibleText("Withdraw");
        Assert.assertTrue(select2.getFirstSelectedOption().getText().contains("Withdraw"));
        bekle(1);
        select2.selectByVisibleText("Withdraw reject");
        Assert.assertTrue(select2.getFirstSelectedOption().getText().contains("Withdraw reject"));
        bekle(1);
        select2.selectByVisibleText("Any");
    }
}

