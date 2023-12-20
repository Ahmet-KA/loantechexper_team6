package stepdefinitions.Visitor;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Us002_VisitorHomePage {

    VisitorHomePage visitorHomePage = new VisitorHomePage();

    @Given("Browser acilir")
    public void browser_acilir() {

    }

    @Given("\"url\"e gidilir")
    public void url_e_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @Given("ust barda email,telefon,adres gorunur")
    public void ust_barda_email_telefon_adres_gorunur() {

        visitorHomePage.visitorEmailNumberadressGorunurTesti();


    }

    @Given("Anasayfa ust barinda site logosu ve menu basliklari gorunur ve aktif oldugunu test eder")
    public void anasayfa_ust_barinda_site_logosu_ve_menu_basliklari_gorunur_ve_aktif_oldugunu_test_eder() {
        visitorHomePage.visitorHomeButtonsVisibleEnabledTest();

    }

    @Given("Anasayfa ust barinda logoya tiklar Acilan sayfanin ansayfa oldugunu test eder")
    public void anasayfa_ust_barinda_logoya_tiklar_acilan_sayfanin_ansayfa_oldugunu_test_eder() {
        visitorHomePage.siteLogo.click();
        Assert.assertTrue(visitorHomePage.getStartedButton.isDisplayed());
    }

    @Given("Anasayfa ust barindaki basliklara tiklandiginda ilgili sayfaya gecisi test edilir")
    public void anasayfa_ust_barindaki_basliklara_tiklandiginda_ilgili_sayfaya_gecisi_test_edilir() {
        visitorHomePage.visitorHomePageisDisplsyedTest();
    }


}


