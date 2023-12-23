package stepdefinitions.Visitor;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_021_VisitorHomePageStepDefinitions {

    VisitorHomePage visitorHomePage = new VisitorHomePage();

    @Given("Kayıtlı kullanıcı olarak {string} adresine gidilir.")
    public void kayıtlı_kullanıcı_olarak_adresine_gidilir(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Given("İlgili url'e erişim sağlandıgı doğrulanır.")
    public void ilgili_url_e_erişim_sağlandıgı_doğrulanır() {

        Assert.assertTrue(visitorHomePage.loanTechLogo.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @Given("Ana sayfa üst barinda email,telefon,adres bilgileri bulundugu dogrulanır.")
    public void ana_sayfa_üst_barinda_email_telefon_adres_bilgileri_bulundugu_dogrulanır() {

        visitorHomePage.visitorEmailNumberadressGorunurTesti();
    }

    @Given("Ana sayfa üst barinda site logosu ve menü basliklari \\(Home, About, Plans,Blogs,Contact,Login Icon,Get Started Icon ) görünür ve aktif oldugu dogrulanır.")
    public void ana_sayfa_üst_barinda_site_logosu_ve_menü_basliklari_home_about_plans_blogs_contact_login_ıcon_get_started_ıcon_görünür_ve_aktif_oldugu_dogrulanır() {

        visitorHomePage.navbarİsDisplaed();
    }

    @Given("Ana sayfa üst barindaki başlıklara \\(Home, About, Plans,Blogs,Contact,Login Icon,Get Started Icon ) tıklandığında ilgili sayfaya geçiş yapılabildiği dogrulanır.")
    public void ana_sayfa_üst_barindaki_başlıklara_home_about_plans_blogs_contact_login_ıcon_get_started_ıcon_tıklandığında_ilgili_sayfaya_geçiş_yapılabildiği_dogrulanır() {

        visitorHomePage.visitorHomePageisDisplsyedTest();
    }


}
