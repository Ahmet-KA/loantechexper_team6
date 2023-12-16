package stepdefinitions.Admin;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Admin.AdminDepositsPage;
import pages.Admin.AdminLogin;
import utilities.ConfigReader;
import utilities.Driver;

public class Us053_Successfuldeposits {
    AdminLogin adminLogin = new AdminLogin();
    AdminDepositsPage adminDepositsPage = new AdminDepositsPage();

    @Given("\"urladmin\"e gidilir")
    public void urladmin_e_gidilir() {

        Driver.getDriver().get(ConfigReader.getProperty("urladmin"));
        adminLogin.adminLoginGirisYap(ConfigReader.getProperty("adminsmy"), ConfigReader.getProperty("adminsmypsswrd"));


    }

    @Given("Sol yan barda bulunan Deposits butonuna basilir")
    public void sol_yan_barda_bulunan_deposits_butonuna_basilir() {
        adminDepositsPage.depositsButon.isDisplayed();
        adminDepositsPage.depositsButon.isEnabled();
        adminDepositsPage.depositsButon.click();


    }

    @Given("Sol yan barda bulunan Successful Deposits butonuna basilir")
    public void sol_yan_barda_bulunan_successful_deposits_butonuna_basilir() {
        adminDepositsPage.successfulDeposits.isDisplayed();
        adminDepositsPage.successfulDeposits.isEnabled();
        adminDepositsPage.successfulDeposits.click();
        Assert.assertTrue(adminDepositsPage.adminSuccessfulSayfa.isDisplayed());

    }


    @Given("admin deposit successful sayfanin erisilebildigi  dogrulanir")
    public void admin_deposit_successful_sayfanin_erisilebildigi_dogrulanir() {
        adminDepositsPage.successfulDeposits.isDisplayed();
        adminDepositsPage.successfulDeposits.isEnabled();
        adminDepositsPage.successfulDeposits.click();
        Assert.assertTrue(adminDepositsPage.adminSuccessfulSayfa.isDisplayed());

    }


    @Given("browser kapatilir")
    public void browser_kapatilir() {
        Driver.closeDriver();

    }


}
