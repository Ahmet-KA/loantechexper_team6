package stepdefinitions.user;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.Select;
import pages.User.UserDashboardPage;
import pages.User.UserDepositPage;
import pages.User.UserLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.*;
import static utilities.ReusableMethods.*;

public class US_016_UserDepositPageSteps {

    UserDepositPage depositPage = new UserDepositPage();
    UserLoginPage loginPage = new UserLoginPage();
    UserDashboardPage dashboardPage = new UserDashboardPage();

    Select gatewayDropdown = new Select(depositPage.selectGatewayBoxElement);

    public void cookiesi_kapatir() {
        bekle(2);
        loginPage.allowCookies.click();
    }

    @Given("Kullanici anasayfaya gider {string} ve {string} ile login olur") // US_16
    public void kullanici_anasayfaya_gider_ve_login_olur(String userName, String userPassword) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        bekle(1);
        dashboardPage.dashboardLoginElement.click();
        cookiesi_kapatir();
        goruneneKadarKaydir(loginPage.userNameTextBox);
        loginPage.userNameTextBox.sendKeys(ConfigReader.getProperty(userName));
        loginPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty(userPassword));
        loginPage.loginButton.click();
    }

    @Given("Dashboard sayfasinda Deposit butonu bulundugunu dogrular")  // US_16 TC_01
    public void dashboard_sayfasinda_deposit_butonu_bulundugunu_dogrular() {
        waitForPageToLoad(5);
        assertTrue(depositPage.dashboardDepositMenuButtonElement.isDisplayed());
    }

    @Given("Kullanici Deposit Methods sayfasina gider")
    public void kullanici_deposit_methods_sayfasina_gider() {

        depositPage.dashboardDepositMenuButtonElement.click();
    }


    @Given("Deposit Methods sayfasina ulastigini dogrular") // US_16 TC_02
    public void deposit_methods_sayfasina_ulastigini_dogrular() {
        assertTrue(depositPage.depositMethodsTextElement.isDisplayed());
    }


    @Given("Deposit History butonunun bulundugunu dogrular")  // US_16 TC_03
    public void deposit_history_butonunun_bulundugunu_dogrular() {
        assertTrue(depositPage.depositHistoryButtonElement.isDisplayed());
    }

    @Given("Deposit History butonuna tiklar")
    public void deposit_history_butonuna_tiklar() {
        depositPage.depositHistoryButtonElement.click();
    }


    @Given("Deposit History sayfasina gectigini dogrular")  // US_16 TC_04
    public void deposit_history_sayfasina_gectigini_dogrular() {
        assertTrue(depositPage.depositHistoryTextElement.isDisplayed());
    }


    @Given("Deposit History sayfasinda islem akordiyon tablosunu gordugunu dogrular") // US_16 TC_05
    public void deposit_history_sayfasinda_islem_akordiyon_tablosunu_gordugunu_dogrular() {
        assertTrue(depositPage.accordionTableElement.isDisplayed());
    }


    @Given("Select Gateway dropdown menusunden {string} secer")
    public void select_gateway_dropdown_menusunden_manual_i_secer(String optionText) {
        gatewayDropdown.selectByVisibleText(optionText);
    }

    @Given("{string} in secilebildidigini dogrular") // US_16 TC_06
    public void manual_in_secilebildidigini_dogrular(String expectedOptionText) {
        String actuelSelectedText = gatewayDropdown.getFirstSelectedOption().getText();
        assertEquals(expectedOptionText, actuelSelectedText);

    }

    @Given("Amount textbox'ina {string} girer")
    public void amount_textbox_ina_girer(String string) {

    }

    @Given("Submit butonuna tiklar")
    public void submit_butonuna_tiklar() {

    }

    @Given("{string} girildigini dogrular")
    public void girildigini_dogrular(String string) {

    }

    @Given("Limit-Charge-Payable degerlerinin goruldugunu dogrular")
    public void limit_charge_payable_degerlerinin_goruldugunu_dogrular() {

    }


    @Given("'You have requested 'enteredAmount' USD , Please pay 'payableAmount' USD for successful payment' yazisinin goruldugunu dogrular")
    public void you_have_requested_entered_amount_usd_please_pay_payable_amount_usd_for_successful_payment_yazisinin_goruldugunu_dogrular() {

    }

    @Given("PAY NOW butonuna tiklar ve Deposit History sayfasina gecildigi dogrular")
    public void pay_now_butonuna_tiklar_ve_deposit_history_sayfasina_gecildigi_dogrular() {

    }

    @Given("PAY NOW butonuna tiklar")
    public void pay_now_butonuna_tiklar() {

    }

    @Given("islem tablosunda yapilan islemin goruntulendigi dogrular")
    public void islem_tablosunda_yapilan_islemin_goruntulendigi_dogrular() {

    }

    @Given("{string} yazisini gordugunu dogrular")
    public void yazisini_gordugunu_dogrular(String string) {

    }

    @Given("Deposit Now butonuna tiklar")
    public void deposit_now_butonuna_tiklar() {

    }

    @Given("Deposit Methods sayfasina gecildigini dogrular")
    public void deposit_methods_sayfasina_gecildigini_dogrular() {

    }

}
