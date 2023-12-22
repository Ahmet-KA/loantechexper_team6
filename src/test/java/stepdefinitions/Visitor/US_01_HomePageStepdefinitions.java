package stepdefinitions.Visitor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.Visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_01_HomePageStepdefinitions {
     VisitorHomePage  homePage=new VisitorHomePage();
     //String homepageWHD;

    @Given("kullanici browserı acar")
    public void kullanici_browserı_acar() {
        Driver.getDriver();
    }
    @Given("kullanici browserda  {string} e gider")
    public void kullaniciEGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
        //String homepageWHD=Driver.getDriver().getWindowHandle();
    }
    @Then("sayfanın acıldıgını test eder")
    public void sayfanin_acıldıgını_test_eder() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(homePage.loanTechLogo.isDisplayed());
    }
    @Then("acılan sayfanın Homepage oldugunu test eder")
    public void acılan_sayfanın_homepage_oldugunu_test_eder() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(homePage.getStartedButton.isDisplayed());
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
        ReusableMethods.bekle(1);
    }
    @Given("sayfalari kapatir")
    public void sayfalari_kapatir() {
        Driver.quitDriver();
    }
    @Given("acılan anasayfada sayfayı en alta kaydırır")
    public void acılan_anasayfada_sayfayı_en_alta_kaydırır() {
        ReusableMethods.bekle(2);
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.clickWithJS(homePage.allowCookies);
        ReusableMethods.bekle(1);
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.footerCopyright);
    }
    @Given("About Loantech basligi altında X sosyal medya iconunun gorunurlugunu dogrular")
    public void about_loantech_basligi_altında_x_sosyal_medya_iconunun_gorunurlugunu_dogrular() {
        ReusableMethods.bekle(1);
      Assert.assertTrue(homePage.twitterIcon.isDisplayed());
    }
    @Given("X iconuna tiklar")
    public void x_iconuna_tiklar() {
        ReusableMethods.bekle(2);
        homePage.twitterIcon.click();
    }
    @Given("yeni sayfada Twitter ana sayfasinin acildigini dogrular")
    public void acilan_sayfanin_twitter_ana_sayfasi_oldugunu_dogrular() {
        homePage.switchWindow();
        String expectedurl="https://twitter.com/";
        Assert.assertEquals(expectedurl,Driver.getDriver().getCurrentUrl());
    }

    @Given("About Loantech basligi altında Facebook sosyal medya iconunun gorunurlugunu dogrular")
    public void about_loantech_basligi_altında_facebook_sosyal_medya_iconunun_gorunurlugunu_dogrular() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(homePage.facebookIcon.isDisplayed());
    }
    @Given("Facebook iconuna tiklar")
    public void facebook_iconuna_tiklar() {
        homePage.facebookIcon.click();
    }
    @Given("yeni sayfada Facebook ana sayfasinin acildigini dogrular")
    public void acilan_sayfanin_facebook_ana_sayfasi_oldugunu_dogrular() {
        homePage.switchWindow();
        String expectedurl="https://www.facebook.com/";
        Assert.assertEquals(expectedurl,Driver.getDriver().getCurrentUrl());
    }
    @Given("About Loantech basligi altında Youtube sosyal medya iconunun gorunurlugunu dogrular")
    public void about_loantech_basligi_altında_f_youtube_sosyal_medya_iconunun_gorunurlugunu_dogrular() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(homePage.youtubeIcon.isDisplayed());
    }
    @Given("Youtube iconuna tiklar")
    public void youtube_iconuna_tiklar() {
        homePage.youtubeIcon.click();
    }
    @Given("yeni sayfada Youtube ana sayfasinin acildigini dogrular")
    public void acilan_sayfanin_youtube_ana_sayfasi_oldugunu_dogrular() {
        homePage.switchWindow();
        String expectedurl="https://www.youtube.com/";
        Assert.assertEquals(expectedurl,Driver.getDriver().getCurrentUrl());
    }
    @Given("About Loantech basligi altında Instagram sosyal medya iconunun gorunurlugunu dogrular")
    public void about_loantech_basligi_altında_ınstagram_sosyal_medya_iconunun_gorunurlugunu_dogrular() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(homePage.instagramIcon.isDisplayed());
    }
    @Given("Instagram iconuna tiklar")
    public void ınstagram_iconuna_tiklar() {
        homePage.instagramIcon.click();
    }
    @Given("yeni sayfada Instagram ana sayfasinin acildigini dogrular")
    public void acilan_sayfanin_ınstagram_ana_sayfasi_oldugunu_dogrular() {
        homePage.switchWindow();
        Assert.assertTrue(homePage.instagramHomePageLogo.isDisplayed());
    }

   /* @Given("About Loantech basligi altında Google iconunun gorunurlugunu dogrular")
    public void about_loantech_basligi_altında_google_iconunun_gorunurlugunu_dogrular() {





    }*/
    /*@Given("Google iconuna tiklar")
    public void google_iconuna_tiklar()  {






    }*/
    @Given("yeni sayfada Google ana sayfasinin acildigini dogrular")
    public void acilan_sayfanin_google_ana_sayfasi_oldugunu_dogrular() {
        homePage.switchWindow();
        String expectedurl="https://www.google.com/";
        Assert.assertEquals(expectedurl,Driver.getDriver().getCurrentUrl());

    }
    @Given("About Loantech basligi altında LinkedIn iconunun gorunurlugunu dogrular")
    public void about_loantech_basligi_altında_linked_ın_iconunun_gorunurlugunu_dogrular() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(homePage.linkedInIcon.isDisplayed());
    }
    @Given("LinkedIn iconuna tiklar")
    public void linked_ın_iconuna_tiklar() {
        homePage.linkedInIcon.click();
    }
    @Given("yeni sayfada LinkedIn ana sayfasinin acildigini dogrular")
    public void acilan_sayfanin_linked_ın_ana_sayfasi_oldugunu_dogrular() {
       homePage.switchWindow();
        String expectedurl="https://www.linkedin.com/";
        Assert.assertEquals(expectedurl,Driver.getDriver().getCurrentUrl());
    }

}
