package stepdefinitions.Visitor;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_013_VisitorHomePageStep {

    VisitorHomePage visitorHomePage = new VisitorHomePage();

    @Given("Kayitli kullanici olarak {string} adresine gidilir.")
    public void kayitli_kullanici_olarak_adresine_gidilir(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Given("Anasayfada login button gorunurlugu ve aktifligi dogrulanır.")
    public void anasayfada_login_button_gorunurlugu_ve_aktifligi_dogrulanır() {
       Assert.assertTrue(visitorHomePage.loginButon.isDisplayed());
    }


}
