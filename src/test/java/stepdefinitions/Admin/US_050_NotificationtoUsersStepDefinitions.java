package stepdefinitions.Admin;

import io.cucumber.java.en.Given;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import pages.Admin.AdminLogin;
import pages.Admin.AdminManageUsersPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class US_050_NotificationtoUsersStepDefinitions {

    AdminLogin adminLogin = new AdminLogin();
    AdminManageUsersPage adminManageUsersPage = new AdminManageUsersPage();

    @Given("Verilen Url'ye gidebilmeli")
    public void verilen_urlye_gidebilmeli() {
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
        ReusableMethods.bekle(2);
    }

    @Given("Username ve password girilir ve login butonuna tiklanmasi saglanir")
    public void username_ve_password_girilir_ve_login_butonuna_tiklanmasi_saglanir() {
        adminLogin.usernameTextBoxHT.sendKeys("hakantuz");
        adminLogin.passwordTextBoxHT.sendKeys("123123123");
        adminLogin.adminLoginButtonHT.click();
    }

    @Given("Manage Users butonuna tiklanir")
    public void manage_users_butonuna_tiklanir() {
        adminManageUsersPage.manageUsersButton.click();
    }

    @Given("Notification to All Linki butonunun gorunur ve aktif oldugu test edilir")
    public void notification_to_all_linki_butonunun_gorunur_ve_aktif_oldugu_test_edilir() {
        adminManageUsersPage.notificationToAllButton.isDisplayed();
        adminManageUsersPage.notificationToAllButton.isEnabled();
    }

    @Given("Notification to All butonuna tiklanir")
    public void notification_to_all_butonuna_tiklanir() {
        adminManageUsersPage.notificationToAllButton.click();
    }


    @Given("Being Sent basligi altindaki filtreleme ikonu goruntulenir")
    public void being_sent_basligi_altindaki_filtreleme_ikonu_goruntulenir() {
        adminManageUsersPage.beingSentCheckbox.isDisplayed();
    }

    @Given("Secilen kullaniciya mesaj gonderilir")
    public void secilen_kullaniciya_mesaj_gonderilir() {
        adminManageUsersPage.beingSentCheckbox.sendKeys("s", Keys.ENTER);
        ReusableMethods.bekle(1);
        adminManageUsersPage.selectUserTextbox.sendKeys("hakantuz");
        ReusableMethods.bekle(2);
        adminManageUsersPage.selectUserTextbox.sendKeys(Keys.ENTER);
        adminManageUsersPage.subjectTextbox.sendKeys("deneme");
        adminManageUsersPage.notificationMessageTextbox.sendKeys("Hello World");
        adminManageUsersPage.pertBatchTextbox.sendKeys("1");
        adminManageUsersPage.coolingPeriodTextbox.sendKeys("1");
        adminManageUsersPage.notificationSubmitButton.click();

    }

    @Given("Done mesaji goruntulenir")
    public void done_mesaji_goruntulenir() {
        adminManageUsersPage.doneMessage.isDisplayed();

    }

}
