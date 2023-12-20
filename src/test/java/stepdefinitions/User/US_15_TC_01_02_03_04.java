
package stepdefinitions.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.User.UserChangePasswordPage;
import pages.User.UserDashboardPage;
import pages.User.UserLoginPage;
import pages.Visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_15_TC_01_02_03_04 {

    VisitorHomePage visitorHomePage= new VisitorHomePage();
    UserLoginPage userLoginPage= new UserLoginPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    UserDashboardPage userDashboardPage= new UserDashboardPage();


    UserChangePasswordPage userChangePasswordPage= new UserChangePasswordPage();

    @Given("ana sayfaya gidilir")
    public void ana_sayfaya_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(3);


    }
    @Then("allow Cookies tiklanir")
    public void allow_cookies_tiklanir() {
        visitorHomePage.allowCookies.click();

    }
    @Then("ana sayfa Log in butonuna tiklanir")
    public void ana_sayfa_log_in_butonuna_tiklanir() {

        visitorHomePage.loginButon.click();
        ReusableMethods.bekle(3);
    }
    @Then("Gecerli {string} ve {string} girilir")
    public void gecerli_username_ve_sifre_girilir(String userName, String password) {

        userLoginPage.userNameTextBox.sendKeys(ConfigReader.getProperty(userName));
        userLoginPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty(password));
         //ReusableMethods.bekle(2);

        }

    @Then("log in butonuna tiklanir")
    public void log_in_butonuna_tiklanir() {

        js.executeScript("arguments[0].click();", userLoginPage.loginButtonIki);

    }
    @Then("change Password linkinin goruntulendigi dogrulanir")
    public void change_password_linkinin_goruntulendigi_dogrulanir() {


        Assert.assertTrue(userChangePasswordPage.changePasswordButonu.isDisplayed());

        Driver.closeDriver();


    }

    // US_15_TC_02

    @Then("User Dashboard sayfasindaki Change Password butonuna tiklanir")
    public void user_dashboard_sayfasinaki_change_password_butonuna_tiklanir() {

        userChangePasswordPage.changePasswordButonu.click();

    }
    @Then("Change dasboard sayfasina ulasildigi dogrulanir.")
    public void change_dasboard_sayfasina_ulasildigi_dogrulanir() {


        Assert.assertTrue(userChangePasswordPage.cPSayfasiChangePasswordTexti.isDisplayed());

        Driver.closeDriver();

    }

    // US_15_TC_03

    @Then("Current Password alanina {string} girilir")
    public void current_password_alanina_string_girilir(String password) {

        userChangePasswordPage.currentPasswordAlani.sendKeys(ConfigReader.getProperty(password));

    }
    @Then("Password alanina {string} girilir")
    public void password_alanina_yeni_sifre_girilir(String userName) {
        userChangePasswordPage.passwordAlani.sendKeys(ConfigReader.getProperty(userName));

    }
    @Then("Confirm Passwoord alanina {string} yeniden girilir")
    public void confirm_passwoord_alanina_yeni_sifre_yeniden_girilir(String userName) {
        userChangePasswordPage.confirmPasswprdAlani.sendKeys(ConfigReader.getProperty(userName));

    }
    @Then("CPSubmit butonuna tiklanir")
    public void cp_submit_butonuna_tiklanir() {
        userChangePasswordPage.submitButonu.click();

    }
    @Then("CP Password changes succesfully yazisinin gorundugu dogrulanir")
    public void cp_password_changes_succesfully_yazisinin_gorundugu_dogrulanir() {
        Assert.assertTrue(userChangePasswordPage.passwordChangesSuccesfullyMesaji.isDisplayed());
        Driver.closeDriver();

    }

    // US_15_TC_04
    @Then("Confirm Passwoord alanina yanlis {string} girilir")
    public void confirm_passwoord_alanina_yanlis_girilir(String yanlisSifre) {

        userChangePasswordPage.confirmPasswprdAlani.sendKeys(ConfigReader.getProperty(yanlisSifre));

    }
    @Then("CP the password confirmation does not match uyarisinin  gorundugu dogrulanir")
    public void cp_the_password_confirmation_does_not_match_uyarisinin_gorundugu_dogrulanir() {

        Assert.assertTrue(userChangePasswordPage.thePasswordConfirmationDoesnotUyarisi.isDisplayed());

        Driver.closeDriver();

    }



}