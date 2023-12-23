package stepdefinitions.Admin;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.Admin.AdminLogin;
import pages.Admin.AdminWithdrawalsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_058_WithdrawalMethodsPageStepDefinitions {

    AdminLogin adminLogin = new AdminLogin();
    AdminWithdrawalsPage adminWithdrawalsPage = new AdminWithdrawalsPage();

    @Given("Verilen Url'ye gidilir")
    public void verilen_urlye_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.bekle(2);
    }

    @Given("Username ve password girilir ve login butonuna tiklanirr")
    public void username_ve_password_girilir_ve_login_butonuna_tiklanirr() {
        adminLogin.usernameTextBoxHT.sendKeys("hakantuz");
        adminLogin.passwordTextBoxHT.sendKeys("123123123");
        adminLogin.adminLoginButtonHT.click();
    }

    @Given("Withdrawal Methods sayfasinin erisilir oldugu dogrulanir")
    public void withdrawal_methods_sayfasinin_erisilir_oldugu_dogrulanir() {
        adminWithdrawalsPage.withdrawalsButton.click();
        adminWithdrawalsPage.withdrawalsMethodButton.isDisplayed();
    }

    @Given("Withdrawal Methods butonuna tiklanir")
    public void withdrawal_methods_butonuna_tiklanir() {
        adminWithdrawalsPage.withdrawalsButton.click();
        adminWithdrawalsPage.withdrawalsMethodButton.click();
    }

    @Given("Odeme methodlari goruntulenir")
    public void odeme_methodlari_goruntulenir() {
        adminWithdrawalsPage.withdrawalsMethod.isDisplayed();
    }

    @Given("Edit sayfasinin erisilir oldugu dogrulanir")
    public void edit_sayfasinin_erisilir_oldugu_dogrulanir () {
        adminWithdrawalsPage.withdrawalsMethodEditButton.click();
        adminWithdrawalsPage.updateWithdrawalMethodText.isDisplayed();
    }

    @Given("Edit sayfasina gecerli bilgiler girilir ve Submit butonuna tiklanir")
    public void edit_sayfasina_gecerli_bilgiler_girilir_ve_submit_butonuna_tiklanir() {
        adminWithdrawalsPage.withdrawalsMethodEditButton.click();
        adminWithdrawalsPage.withdrawalMethodMinimumAmount.clear();
        adminWithdrawalsPage.withdrawalMethodMinimumAmount.sendKeys("200");
        adminWithdrawalsPage.withdrawalMethodMaximumAmount.clear();
        adminWithdrawalsPage.withdrawalMethodMaximumAmount.sendKeys("1000");
        ReusableMethods.goruneneKadarKaydirTikla(adminWithdrawalsPage.withdrawalMethodSubmitButton);
    }

    @Given("Methodun gorunurlugu kontrol edilir")
    public void methodun_gorunurlugu_kontrol_edilir() {
        adminWithdrawalsPage.enabledButton.isDisplayed();

    }

    @Given("Method create edilir")
    public void method_create_edilir() {

        adminWithdrawalsPage.addNewButton.click();
        adminWithdrawalsPage.nameText.sendKeys("Hakan");
        adminWithdrawalsPage.currencyText.sendKeys("Dollar");
        adminWithdrawalsPage.rateText.sendKeys("1");
        adminWithdrawalsPage.minLimitText.sendKeys("100");
        adminWithdrawalsPage.maxLimitText.sendKeys("500");
        adminWithdrawalsPage.fixedChargeText.sendKeys("10");
        adminWithdrawalsPage.percentChargeText.sendKeys("5");
        adminWithdrawalsPage.withdrawInstructionText.sendKeys("hello");
        ReusableMethods.goruneneKadarKaydirTikla(adminWithdrawalsPage.withdrawalMethodSubmitButton);
        adminWithdrawalsPage.withdrawMethodAddedSuccessfullyMessage.isDisplayed();


    }




}
