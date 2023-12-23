package stepdefinitions.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.User.UserDashboardPage;
import pages.User.UserLoginPage;
import pages.Visitor.VisitorHomePage;
import pages.Visitor.VisitorLoanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_023_LoanPlansPageStepDefinitions {

   // UserLoginPage userLoginPage = new UserLoginPage();
  //  UserDashboardPage userDashboardPage = new UserDashboardPage();
  //  VisitorHomePage visitorHomePage = new VisitorHomePage();
 //   VisitorLoanPage visitorLoanPage = new VisitorLoanPage();


    @Given("Kullanici verilen Url'ye giderh")
    public void kullanici_verilen_urlye_giderh() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(2);
    }

    @Given("Allow Cookies tiklanirh")
    public void allow_cookies_tiklanirh() {
        VisitorHomePage visitorHomePage = new VisitorHomePage();
visitorHomePage.allowCookies.click();
        ReusableMethods.bekle(2);
    }

    @Given("Kullanici login butonuna tiklarh")
    public void kullanici_login_butonuna_tiklarh() {
        VisitorHomePage visitorHomePage = new VisitorHomePage();
         visitorHomePage.loginButon.click();
         ReusableMethods.bekle(2);
    }

    @Given("Username ve password girer ve giris dugmesine tiklarh")
    public void username_ve_password_girer_ve_giris_dugmesine_tiklarh() {
        UserLoginPage userLoginPage = new UserLoginPage();
        userLoginPage.userNameTextBox.sendKeys("hakantuz");
        userLoginPage.userPasswordTextBox.sendKeys("Loan.741" + Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @Given("Anasayfaya giderh")
    public void anasayfaya_giderh() {
        Driver.getDriver().navigate().back();
    }

    @Given("Plans butonuna tiklanirh")
    public void plans_butonuna_tiklanirh() {
        VisitorHomePage visitorHomePage = new VisitorHomePage();
        visitorHomePage.plansButon.click();
        ReusableMethods.bekle(2);
    }

    @Given("Loan cardlar goruntulenirh")
    public void loan_cardlar_goruntulenirh() {
        VisitorLoanPage visitorLoanPage = new VisitorLoanPage();
        Assert.assertTrue(visitorLoanPage.standartLoanButton.isDisplayed());
        Assert.assertTrue(visitorLoanPage.basicLoanButton.isDisplayed());
        Assert.assertTrue(visitorLoanPage.carLoanButton.isDisplayed());
    }

    @Given("Basic Loan butonuna tiklarh")
    public void basic_loan_butonuna_tiklarh() {
        VisitorLoanPage visitorLoanPage = new VisitorLoanPage();
        visitorLoanPage.basicLoanButton.click();
        ReusableMethods.bekle(2);
    }

    @Given("Loan basliklari goruntulenirh")
    public void loan_basliklari_goruntulenirh() {
        VisitorLoanPage visitorLoanPage = new VisitorLoanPage();
        ReusableMethods.goruneneKadarKaydir(visitorLoanPage.basicLoanText);
        ReusableMethods.goruneneKadarKaydir(visitorLoanPage.carLoanText);
        ReusableMethods.goruneneKadarKaydir(visitorLoanPage.testLoanText);
    }

    @Given("Apply Now butonu gorunur ve aktiftirh")
    public void apply_now_butonu_gorunur_ve_aktiftirh() {
        VisitorLoanPage visitorLoanPage = new VisitorLoanPage();
        visitorLoanPage.applyNowButton.isDisplayed();
        visitorLoanPage.applyNowButton.isEnabled();
    }

    @Given("Apply Now butonuna tiklanirh")
    public void apply_now_butonuna_tiklanirh() {
        VisitorLoanPage visitorLoanPage = new VisitorLoanPage();
        ReusableMethods.goruneneKadarKaydirTikla(visitorLoanPage.applyNowButton);
    }

    @Given("Apply for Basic Loan 1 sayfasi acilirh")
    public void apply_for_basic_loan_1_sayfasi_acilirh() {
        VisitorLoanPage visitorLoanPage = new VisitorLoanPage();
        visitorLoanPage.applyForText.isDisplayed();
    }

    @Given("Amount textbox'a minimum ve maximum deger araliginda deger girilirh")
    public void amount_textboxa_minimum_maximum_deger_araliginda_deger_girilirh() {
        VisitorLoanPage visitorLoanPage = new VisitorLoanPage();
        visitorLoanPage.amountTextbox.click();
        visitorLoanPage.amountTextbox.sendKeys("2000");
    }

    @Given("Confirm butonuna tiklanirh")
    public void confirm_butonuna_tiklanirh() {
        VisitorLoanPage visitorLoanPage = new VisitorLoanPage();
        visitorLoanPage.confirmButton.click();
    }

    @Given("Application Form sayfasina gecis yaparh")
    public void application_form_sayfasina_gecis_yaparh() {
        UserDashboardPage userDashboardPage = new UserDashboardPage();
        userDashboardPage.applicationformText.isDisplayed();
    }

    @Given("Apply butonu tiklanir ve aktiftirh")
    public void apply_butonu_tiklanir_ve_aktiftirh() {
        UserDashboardPage userDashboardPage = new UserDashboardPage();
        userDashboardPage.applyButonuDashboard.isDisplayed();
    }

    @Given("Apply butonuna tiklanirh")
    public void apply_butonuna_tiklanirh() {
        UserDashboardPage userDashboardPage = new UserDashboardPage();
        userDashboardPage.applyButonuDashboard.click();
    }

    @Given("Loan application submitted succesfully mesajinin gorundugu dogrulanirh")
    public void loan_application_submitted_succesfully_mesajinin_gorundugu_dogrulanirh() {
        UserDashboardPage userDashboardPage = new UserDashboardPage();
        userDashboardPage.loanApplicationSubmittedSuccessfullyMessage.isDisplayed();
    }

    @Given("Sayfa kapatilirh")
    public void sayfa_kapatiliir() {
        Driver.closeDriver();
        ReusableMethods.bekle(1);
    }






}
