package stepdefinitions.Admin;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.Admin.AdminLoanPage;
import pages.Admin.AdminLogin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_036_AdminLoanPlansPageStepDefinitions {

    AdminLogin adminLogin = new AdminLogin();
    AdminLoanPage adminLoanPage = new AdminLoanPage();

    @Given("Verilen Url ile giris saglanir")
    public void verilen_url_ile_giris_saglanir() {
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.bekle(2);
    }

    @Given("Username ve password girilir ve login butonuna tiklanilmasi saglanir")
    public void username_ve_password_girilir_ve_login_butonuna_tiklanilmasi_saglanir() {
        adminLogin.usernameTextBoxHT.sendKeys("hakantuz");
        adminLogin.passwordTextBoxHT.sendKeys("123123123");
        adminLogin.adminLoginButtonHT.click();
    }

    @Given("Loan plans butonuna erisilmesi saglanir")
    public void loan_plans_butonuna_erisilmesi_saglanir() {
        adminLoanPage.adminPanelLoanPlansElement.isDisplayed();
    }

    @Given("Loan plans butonuna tiklanir")
    public void loan_plans_butonuna_tiklanir() {
        adminLoanPage.adminPanelLoanPlansElement.click();
    }

    @Given("Kredi planlari goruntulenir")
    public void kredi_planlari_goruntulenir() {
        adminLoanPage.loanPlansList.isDisplayed();
    }

    @Given("Add New butonuna tiklanir")
    public void add_new_butonuna_tiklanirh() {
        adminLoanPage.addNewButton.click();
    }

    @Given("Gerekli bilgiler girilir")
    public void gerekli_bilgiler_girilirh() {
        adminLoanPage.planNameTextbox.sendKeys("Test Loan Hakan");
        adminLoanPage.titleTextbox.sendKeys("Deneme");
        adminLoanPage.minimumAmountTextbox.sendKeys("1000");
        adminLoanPage.maximumAmountTextbox.sendKeys("5000");
        adminLoanPage.categoryCheckbox.sendKeys("1", Keys.ENTER);
        adminLoanPage.perInstallmentTextbox.sendKeys("100");
        adminLoanPage.installmentIntervalTextbox.sendKeys("100");
        adminLoanPage.totalInstallmentsTextbox.sendKeys("100");
        adminLoanPage.applicationFixedChargeTextbox.sendKeys("5");
        adminLoanPage.applicationPercentChargeTextbox.sendKeys("10");
        adminLoanPage.chargeWillApplyIfDelayTextbox.sendKeys("5");
        adminLoanPage.fixedChargeTextbox.sendKeys("10");
        adminLoanPage.percentChargeTextbox.sendKeys("15");
    }

    @Given("Submit butonuna tiklanir")
    public void submit_butonuna_tiklanir() {
        ReusableMethods.goruneneKadarKaydirTikla(adminLoanPage.submitButton);
    }

    @Given("Plan added successfully mesaji goruntulenir")
    public void plan_added_successfully_mesaji_goruntulenir() {
        adminLoanPage.planAddedsuccesfullyMessage.isDisplayed();
    }

    @Given("Back butonuna tiklanir")
    public void back_butonuna_tiklanir() {
        adminLoanPage.backButton.click();
    }

    @Given("Edit butonuna tiklanir")
    public void edit_butonuna_tiklanir() {
        adminLoanPage.editButton.click();

    }

    @Given("Gerekli duzenlemeler yapilir")
    public void gerekli_duzenlemeler_yapilir() {
        adminLoanPage.minimumAmountTextbox.clear();
        adminLoanPage.minimumAmountTextbox.sendKeys("100");
        adminLoanPage.maximumAmountTextbox.clear();
        adminLoanPage.maximumAmountTextbox.sendKeys("300");
        ReusableMethods.goruneneKadarKaydirTikla(adminLoanPage.editSubmitButton);
    }

    @Given("Plan updated successfully mesaji goruntulenir")
    public void plan_updated_successfully_mesaji_goruntulenir() {
        adminLoanPage.planUpdatedSuccesfullyMessage.isDisplayed();
    }

    @Given("Mevcut bir kredi plani sistemden kaldirilir")
    public void mevcut_bir_kredi_plani_sistemden_kaldirilir() {
        adminLoanPage.disableButton.click();
        adminLoanPage.yesButton.click();
    }

    @Given("Status changed successfully mesaji goruntulenir")
    public void status_changed_successfully_mesaji_goruntulenir() {
        adminLoanPage.statusChangedSuccesfullyMessage.isDisplayed();
    }

    @Given("Hatali giris yapilir")
    public void hatali_giris_yapilir() {
        adminLoanPage.planNameTextbox.sendKeys("Test Loan Hakan");
        adminLoanPage.titleTextbox.sendKeys("Deneme");
        adminLoanPage.minimumAmountTextbox.sendKeys("1000");
        adminLoanPage.maximumAmountTextbox.sendKeys("5000");
        adminLoanPage.categoryCheckbox.sendKeys("1", Keys.ENTER);
        adminLoanPage.perInstallmentTextbox.sendKeys("100");
        adminLoanPage.installmentIntervalTextbox.sendKeys("-100");
        adminLoanPage.totalInstallmentsTextbox.sendKeys("100");
        adminLoanPage.applicationFixedChargeTextbox.sendKeys("5");
        adminLoanPage.applicationPercentChargeTextbox.sendKeys("10");
        adminLoanPage.chargeWillApplyIfDelayTextbox.sendKeys("5");
        adminLoanPage.fixedChargeTextbox.sendKeys("10");
        adminLoanPage.percentChargeTextbox.sendKeys("15");
        ReusableMethods.goruneneKadarKaydirTikla(adminLoanPage.submitButton);

    }

    @Given("Kullanici uygun hata mesaji ile bilgilendirilir")
    public void kullanici_uygun_hata_mesaji_ile_bilgilendirilir() {
        adminLoanPage.errorMessage.isDisplayed();

    }




}
