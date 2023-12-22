package stepdefinitions.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.Admin.AdminLogin;
import pages.Admin.AdminManageUsersPage;
import pages.User.UserDashboardPage;
import pages.User.UserLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_43_TC_01_02_03_04_05_06_07 {
   AdminLogin adminLogin= new AdminLogin();

    UserLoginPage userLoginPage= new UserLoginPage();
    AdminManageUsersPage adminManageUsersPage= new AdminManageUsersPage();


    @Given("Admin ana sayfayya gidilir")
    public void admin_ana_sayfaya_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("urladmin"));

    }
    @Then("Gecerli {string} ve {string} girisi yapilir")
    public void gecerli_kullanici_adi_ve_sifre_girisi_yapilir(String userName, String AdminPassword) {

        adminLogin.usernameTextBoxg.sendKeys(ConfigReader.getProperty(userName));
        adminLogin.passwordTextBoxg.sendKeys(ConfigReader.getProperty(AdminPassword));


        // adminLogin.adminLoginGirisYap(userName,AdminPassword);

    }
    @Then("Log in butonuna giris tikklanir")
    public void log_in_butonuna_giris_tikklanir() {

        // adminLogin.adminLoginButton.click();
        adminLogin.adminLoginButtong.click();
        ReusableMethods.bekle(1);


    }
    @Then("Manage User link'ine tiklanir")
    public void manage_user_link_ine_tiklanir() {
        adminManageUsersPage.manageUserDropdownMenu.click();

    }
    @Then("Active users link'ine tiklanir")
    public void active_users_link_ine_tiklanir() {


        adminManageUsersPage.activeUsersMenu.click();

    }
    @Then("Active User text'inin goruntulendigi dogrulaniir")
    public void active_user_text_inin_goruntulendigi_dogrulaniir() {
        Assert.assertTrue(adminManageUsersPage.activeUsersText.isDisplayed());

        Driver.closeDriver();

    }

// US_43_TC_02

    @Then("User, Email-Phone, Country, Joined At, Balance ve Action başlıklarının gorundugu dogrulanır.")
    public void user_email_phone_country_joined_at_balance_ve_action_başlıklarının_gorundugu_dogrulanır() {

        adminManageUsersPage.userSutunBaslik.isDisplayed();
        adminManageUsersPage.emailSutunBaslik.isDisplayed();
        adminManageUsersPage.countrySutunBaslik.isDisplayed();
        adminManageUsersPage.joinedAtSutunBaslik.isDisplayed();
        adminManageUsersPage.balanceSutunBaslik.isDisplayed();
        adminManageUsersPage.actionSutunBaslik.isDisplayed();
        ReusableMethods.bekle(2);

    }
    @Then("sayfa kapatiliir")
    public void sayfa_kapatiliir() {
        Driver.closeDriver();
        ReusableMethods.bekle(1);
    }


    // US_43_TC_03


    @Then("Details butonunun goruntulendigi dogrulanir")
    public void details_butonunun_goruntulendigi_dogrulanir() {

        adminManageUsersPage.detailsButonuBirinciSira.isDisplayed();


    }

    // US_43_TC_04

    // Details butonu aktiflik testi. kod yazilmadi.

    // US_43_TC_05
    @Then("Details butonuna tiklanir")
    public void details_butonuna_tiklanir() {
        adminManageUsersPage.detailsButonuBirinciSira.click();


    }
    @Then("User Detail – kullanici adi text’inin gorundugu dogrulanir")
    public void user_detail_kullanici_adi_text_inin_gorundugu_dogrulanir() {

        adminManageUsersPage.userDetailKullaniciAdi.isDisplayed();



    }

    // US_43_TC_06




    @And("‘Log in as a user’ butonunun goruntulendigi dogrulanir")
    public void log_in_as_a_user_butonunun_goruntulendigi_dogrulanir() {

        adminManageUsersPage.loginAsAUserButonu.isDisplayed();

        ReusableMethods.bekle(2);
    }

    // US_43_TC_07



    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    UserDashboardPage userDashboardPage= new UserDashboardPage();
    @Then("Log in as a user butonuna tiklaniir")
    public void log_in_as_a_user_butonuna_tiklaniir() {

        adminManageUsersPage.loginAsAUserButonu.click();
        ReusableMethods.bekle(2);

    }
    @Then("Dashboard yazisinin goruntulendigi dogrulaniir")
    public void dashboard_yazisinin_goruntulendigi_dogrulaniir() {

        // js.executeScript("arguments[0].click();", userDashboardPage.userDashboardAllowCookies);

        // Assert.assertTrue(userDashboardPage.userLogoSagUst.isDisplayed());

        Assert.assertTrue(userDashboardPage.userDashboardSayfasiDashboardText.isDisplayed());


    }

}
