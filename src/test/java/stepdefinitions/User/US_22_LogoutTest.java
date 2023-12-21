package stepdefinitions.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Admin.AdminWithdrawalsPage;
import pages.User.UserLoginPage;
import pages.Visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_22_LogoutTest {

    UserLoginPage userLoginPage = new UserLoginPage();
    VisitorHomePage visitorHomePage = new VisitorHomePage();
    AdminWithdrawalsPage adminWithdrawalsPage = new AdminWithdrawalsPage();

    @Given("Kullanici loantechUrl anasayfasina gider")
    public void kullanici_loantech_url_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(2);
    }
    @Given("Kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        visitorHomePage.loginButon.click();

    }
    @Given("username ve password bilgilerini girer")
    public void username_ve_password_bilgilerini_girer() {
        userLoginPage.userNameTextBox.sendKeys("mertkan");
        userLoginPage.userPasswordTextBox.sendKeys("Loan.741");
        userLoginPage.loginButton.click();


    }
    @Given("logout butonunu gorur")
    public void logout_butonunu_gorur() {
        ReusableMethods.clickWithJS(userLoginPage.allowCookies);
        ReusableMethods.goruneneKadarKaydir(userLoginPage.userLogout);
        ReusableMethods.bekle(2);
        Assert.assertTrue(userLoginPage.userLogout.isDisplayed());
    }

    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {

        Driver.quitDriver();
        ReusableMethods.bekle(2);


    }

    @Given("logout butonuna tiklar")
    public void logout_butonuna_tiklar() {
        ReusableMethods.clickWithJS(userLoginPage.allowCookies);
        ReusableMethods.goruneneKadarKaydir(userLoginPage.userLogout);
        ReusableMethods.bekle(2);
        userLoginPage.userLogout.click();
    }
    @Given("Anasayfaya doner ve You have been logged out. yazisini goruntuler")
    public void anasayfaya_doner_ve_you_have_been_logged_out_yazisini_goruntuler() {
       Assert.assertTrue(adminWithdrawalsPage.confirmationAlertBox.isDisplayed());
       Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.loantechexper.com/user/login"));
    }
}
