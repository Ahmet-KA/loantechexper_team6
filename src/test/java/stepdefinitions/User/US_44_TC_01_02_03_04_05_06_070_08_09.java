package stepdefinitions.User;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Admin.AdminLogin;
import pages.Admin.AdminManageUsersPage;
import pages.User.UserLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_44_TC_01_02_03_04_05_06_070_08_09 {

    AdminManageUsersPage adminManageUsersPage= new AdminManageUsersPage();

    //US_44_TC_01_02_03_04
    //US_44_TC_05

    @Then("Notification text'inin gorundugu dogrulanir")
    public void notification_text_inin_gorundugu_dogrulanir() {

        Assert.assertTrue(adminManageUsersPage.notificationButonu.isDisplayed());
    }

    //US44_TC06

    @Then("notifications butonuna tiklanir")
    public void notifications_butonuna_tiklanir() {
        adminManageUsersPage.notificationButonu.click();

    }

    //US44_TC07

    @Then("send notification text'inin gorundugu dogrulanir")
    public void send_notification_text_inin_gorundugu_dogrulanir() {

        Assert.assertTrue(adminManageUsersPage.sendNotificationButonug.isDisplayed());
    }

    //US44_TC08

    @Then("send notification butonuna tiklanir")
    public void send_notification_butonuna_tiklanir() {

        adminManageUsersPage.sendNotificationButonug.click();
    }

    //US44_TC09

    @Then("notification sent successfully mesajinin goruntulenmedigi dogrulanir")
    public void notification_sent_successfully_mesajinin_goruntulenmedigi_dogrulanir() {


        Assert.assertTrue(adminManageUsersPage.mesajgonderilditexti.isDisplayed());


    }

    //US44_TC10

    @Then("Subject textbox doldurulur")
    public void subject_textbox_doldurulur() {
        adminManageUsersPage.sendNotificationSubjectTextBox.sendKeys("Merhaba");
        ReusableMethods.bekle(2);

    }

    //US44_TC11

    @Then("Message textbox doldurulur")
    public void message_textbox_doldurulur() {

    adminManageUsersPage.sendNotificatinMessageTextBox.sendKeys("Merhaba");
        ReusableMethods.bekle(2);
    }


    //US44_TC12
    @Then("submit butonunun goruntulendigi dogrulanir")
    public void submit_butonunun_goruntulendigi_dogrulanir() {
        Assert.assertTrue(adminManageUsersPage.sendNotificationSubmitButton.isDisplayed());

        ReusableMethods.bekle(1);
    }

    //US44_TC13
    @Then("submit butonununa tiklanir")
    public void submit_butonununa_tiklanir() {
        adminManageUsersPage.sendNotificationSubmitButton.click();

    }
    @Then("mesaj gonderildi text'inin goruntulendigi dogrulanir")
    public void mesaj_gonderildi_text_inin_goruntulendigi_dogrulanir() {
     Assert.assertTrue(adminManageUsersPage.mesajgonderilditexti.isDisplayed());
     ReusableMethods.bekle(1);

    }


}


