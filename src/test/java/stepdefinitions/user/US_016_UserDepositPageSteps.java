package stepdefinitions.User;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.Select;
import pages.User.UserDashboardPage;
import pages.User.UserDepositPage;
import pages.User.UserLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;
import static utilities.ReusableMethods.bekle;

public class US_016_UserDepositPageSteps {

    static UserDepositPage depositPage = new UserDepositPage();
    static UserLoginPage loginPage = new UserLoginPage();
    static UserDashboardPage dashboardPage = new UserDashboardPage();


    static Select gatewayDropdown;


    public static void cookiesi_kapatir() {
        bekle(2);
        loginPage.allowCookies.click();
    }


    @Given("Kullanici anasayfaya gider {string} ve {string} ile login olur")
    public static void kullanici_anasayfaya_gider_ve_ile_login_olur(String userNameMrt, String userPassword) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        bekle(1);
        dashboardPage.dashboardLoginElement.click();
        cookiesi_kapatir();
        goruneneKadarKaydir(loginPage.userNameTextBox);
        loginPage.userNameTextBox.sendKeys(ConfigReader.getProperty(userNameMrt));
        loginPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty(userPassword));
        loginPage.loginButton.click();
        bekle(2);
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
        gatewayDropdown = new Select(depositPage.selectGatewayBoxElement);
        gatewayDropdown.selectByVisibleText(optionText);
    }

    @Given("{string} in secilebildidigini dogrular") // US_16 TC_06
    public void manual_in_secilebildidigini_dogrular(String expectedOptionText) {
        gatewayDropdown = new Select(depositPage.selectGatewayBoxElement);
        String actuelSelectedText = gatewayDropdown.getFirstSelectedOption().getText();
        assertEquals(expectedOptionText, actuelSelectedText);

    }

    @Given("Amount textbox'ina {string} girer")
    public void amount_textbox_ina_girer(String enterAmount) {
        depositPage.amountBoxElement.sendKeys(ConfigReader.getProperty(enterAmount));
    }

    @Given("Submit butonu tiklar")
    public void submit_butonu_tiklar() {
        depositPage.submitButtonElement.click();
    }

    @Given("Uygun deger girildigini dogrular") // US_16 TC_07
    public void uygun_deger_girildigini_dogrular() {
        bekle(2);
        assertTrue(depositPage.successfulPaymentTextElement.isDisplayed());
    }

    @Given("Limit-Charge-Payable degerlerinin goruldugunu dogrular") // US_16 TC_08
    public void limit_charge_payable_degerlerinin_goruldugunu_dogrular() {
        assertTrue(depositPage.amountBoxLimitElement.isDisplayed());
        assertTrue(depositPage.amountBoxChargeElement.isDisplayed());
        assertTrue(depositPage.amountBoxPayableElement.isDisplayed());
    }


    @Given("'You have requested 'enterAmount' USD , Please pay 'payable' USD for successful payment' yazisinin goruldugunu dogrular")
    public void successful_payment_yazisinin_goruldugunu_dogrular() { // US_16 TC_09
        String actuelText = depositPage.successfulPaymentElement.getText();
        String expectedText = "You have requested 500.00 USD , Please pay 610.00 USD for successful payment";
        assertEquals(expectedText, actuelText);
    }

    @Given("Deposit History sayfasina gecildigi dogrular") // US_16 TC_10
    public void deposit_history_sayfasina_gecildigi_dogrular() {
        assertTrue(depositPage.depositHistoryTextElement.isDisplayed());
    }

    @Given("PAY NOW butonuna tiklar")
    public void pay_now_butonuna_tiklar() {
        depositPage.payNowButtonElement.click();
        bekle(1);
    }

    @Given("islem tablosunda yapilan islemin goruntulendigi dogrular")// US_16 TC_11
    public void islem_tablosunda_yapilan_islemin_goruntulendigi_dogrular() {
        assertTrue(depositPage.yapilanIslemElement.isDisplayed());
    }

    @Given("You have deposit request has been taken, yazisini gordugunu dogrular") // US_16 TC_11
    public void yazisini_gordugunu_dogrular() {
        assertTrue(depositPage.YouHaveDepositRequestTextElement.isDisplayed());

    }

    @Given("Deposit Now butonuna tiklar")
    public void deposit_now_butonuna_tiklar() {
        depositPage.depositNowButtonElement.click();
        bekle(1);
    }

    @Given("Deposit Methods sayfasina gecildigini dogrular") // US_16 TC_12
    public void deposit_methods_sayfasina_gecildigini_dogrular() {
        assertTrue(depositPage.depositMethodsTextElement.isDisplayed());
    }


}
