package stepdefinitions.Admin;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Admin.AdminDepositsPage;
import pages.Admin.AdminLogin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

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


    @Given("Successful Deposits listesinin ve iceriginin goruntulendigi test edilir")
    public void successful_deposits_listesinin_ve_iceriginin_goruntulendigi_test_edilir() {


        List<WebElement> succsesfulListeBilgileri = Driver.getDriver().findElements(By.xpath("//tr"));

        for (WebElement eachinformation : succsesfulListeBilgileri) {
            Assert.assertTrue(eachinformation.isDisplayed());
            System.out.println(eachinformation.getText());
            ReusableMethods.bekle(2);
        }

    }

    @Given("Listedeki Details butonun gorunur ve aktif oldugu test edilir")
    public void listedeki_details_butonun_gorunur_ve_aktif_oldugu_test_edilir() {
        adminDepositsPage.detailsButon.isDisplayed();
        adminDepositsPage.detailsButon.isEnabled();
    }

    @Given("Details butonuna basilir ve bilgilerin gorunur oldugu test edilir")
    public void details_butonuna_basilir_ve_bilgilerin_gorunur_oldugu_test_edilir() {
        ReusableMethods.bekle(2);
        //adminDepositsPage.depositsButon.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(adminDepositsPage.detailsButon).sendKeys(Keys.ENTER).perform();
        ReusableMethods.bekle(3);
        Assert.assertTrue(adminDepositsPage.detailsRaporu.isDisplayed());
    }


    @Given("browser kapatilir")
    public void browser_kapatilir() {
        Driver.closeDriver();

    }


}
