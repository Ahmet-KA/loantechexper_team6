package stepdefinitions.Visitor;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Visitor.VisitorContactPage;
import pages.Visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.goruneneKadarKaydir;

public class US_09_VisitorContactUsSteps {

    VisitorContactPage visitorContactPage=new VisitorContactPage();
    VisitorHomePage homePage = new VisitorHomePage();

    @Given("Contact Us menusunun oldugunu dogrular")
    public void contact_us_menusunun_oldugunu_dogrular() {
        assertTrue(visitorContactPage.ContactButonu.isDisplayed());

    }
    @Given("Contact Us linki tiklar, ilgili sayfaya erisildigini dogrular.")
    public void contact_us_linki_tiklar_ilgili_sayfaya_erisildigini_dogrular() {
        visitorContactPage.ContactButonu.click();
        bekle(1);
        assertTrue(visitorContactPage.ContactUsSayfasi.isDisplayed());

    }

    @Given("Contact Us link textinin gorunur oldugunu dogrular")
    public void contact_us_link_textinin_gorunur_oldugunu_dogrular() {
        goruneneKadarKaydir(homePage.footerCopyRightElement);
        bekle(2);
        assertTrue(visitorContactPage.ContactUsLink.isDisplayed());

    }
    @Given("Contact Us link textine tiklar, aktif oldugunu ve Contact Us sayfasina yonlendirdigini dogrular")
    public void contact_us_link_textine_tiklar_aktif_oldugunu_ve_contact_us_sayfasina_yonlendirdigini_dogrular() {
        goruneneKadarKaydir(homePage.footerCopyRightElement);
        bekle(2);
        assertTrue(visitorContactPage.ContactUsLink.isEnabled());
        visitorContactPage.ContactUsLink.click();
        assertTrue(visitorContactPage.ContactUsSayfasi.isDisplayed());
    }
    @Given("Contact Us linki tiklar")
    public void contact_us_linki_tiklar() {
     visitorContactPage.ContactButonu.click();
     bekle(1);
    }

    @Given("Sirket konumunu gosteren haritada adres bilgisinin gorunur oldugunu dogrular")
    public void sirket_konumunu_gosteren_haritada_adres_bilgisinin_gorunur_oldugunu_dogrular() {
        goruneneKadarKaydir(visitorContactPage.Adres);
        bekle(2);
        assertTrue(visitorContactPage.Adres.isDisplayed());
    }

    @Given("Sirkete ait email, telefon ve adres iletisim bilgileri gorunur olmali")
    public void sirkete_ait_email_telefon_ve_adres_iletisim_bilgileri_gorunur_olmali() {
        goruneneKadarKaydir(visitorContactPage.Email);
        bekle(2);
        assertTrue(visitorContactPage.Email.isDisplayed());
        assertTrue(visitorContactPage.Telefon.isDisplayed());
        assertTrue(visitorContactPage.AdresBilgisi.isDisplayed());
    }
    @Given("Sirkete mesaj gonderilecek form gorunur olmali ve mesaj gonderilebilmeli")
    public void sirkete_mesaj_gonderilecek_form_gorunur_olmali_ve_mesaj_gonderilebilmeli() {
        goruneneKadarKaydir(visitorContactPage.MesajButonu);
        bekle(1);
        assertTrue(visitorContactPage.SubjectBox.isDisplayed());
        assertTrue(visitorContactPage.NameBox.isDisplayed());
        assertTrue(visitorContactPage.EmailBox.isDisplayed());
        assertTrue(visitorContactPage.MessageBox.isDisplayed());
        visitorContactPage.SubjectBox.sendKeys(ConfigReader.getProperty("SubjectVisitor"));
        visitorContactPage.NameBox.sendKeys(ConfigReader.getProperty("isimVisitor"));
        visitorContactPage.EmailBox.sendKeys(ConfigReader.getProperty("emailVisitor"));
        visitorContactPage.MessageBox.sendKeys(ConfigReader.getProperty("MessageText"));
        visitorContactPage.MesajButonu.click();
        bekle(2);
        assertTrue(visitorContactPage.MesajOnayElementi.isDisplayed());
    }
}

