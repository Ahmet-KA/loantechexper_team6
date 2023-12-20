package stepdefinitions.Admin;

import io.cucumber.java.en.Given;

import utilities.ConfigReader;
import utilities.Driver;
import static org.junit.Assert.assertTrue;
import static pages.Admin.AdminWithdrawalsPage.*;
import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.waitForPageToLoad;

public class US_059_AdminPendingWithdrawalsSteps {


    @Given("Sol yan barda bulunan Withdrawals menusune tiklar")
    public void withdrawals_menusune_tiklar() {
        witdrawalsMenu.click();
    }

    @Given("Withdrawals menusu altindaki Pending Withdrawals menusune tiklar")
    public void pending_withdrawals_menusune_tiklar() {
        pendingWithdrawalsMenu.click();
        bekle(1);
    }

    // TC_01
    @Given("Pending Withdrawals sayfasina erisildigini dogrular")
    public void pending_withdrawals_sayfasina_erisildigini_dogrular() {
        assertTrue(pendingWithdrawalsPageText.isDisplayed());
    }

    // TC_02
    @Given("Pending Withdrawals listesinin goruntulendigini dogrular")
    public void pending_withdrawals_listesinin_goruntulendigini_dogrular() {
        assertTrue(pendingWithdrawalsTableElement.isDisplayed());
    }

    // TC_03
    @Given("Pending Withdrawals sayfasindaki liste basliklarinin gorunurlugunu dogrular")
    public void pending_withdrawals_sayfasindaki_liste_basliklarinin_gorunurlugunu_dogrular() {
        pendingWithdrawalsListesiBasliklariGoruntulemeTesti();
    }

    // TC_03
    @Given("Pending Withdrawals sayfasindaki liste bilgilerinin gorunurlugunu dogrular")
    public void pending_withdrawals_sayfasindaki_liste_bilgilerinin_gorunurlugunu_dogrular() {
        pendingWithdrawalsListesiBilgileriGoruntulemeTesti();
    }

    @Given("Details butonunu tiklar")
    public void details_butonunu_tiklar() {
        detailsButtonElement.click();
        bekle(1);
    }

    // TC_04
    @Given("Details sayfasina erisildigini dogrular")
    public void details_sayfasina_erisildigini_dogrular() {
        String actuelDetailPageUrl = Driver.getDriver().getCurrentUrl();
        assertTrue(actuelDetailPageUrl.contains(expectedDetailsPageUrl));
    }

    // TC_05
    @Given("Details sayfasinda beklemede olan odeme isleminin detaylarinin goruntulendigi dogrular")
    public void details_sayfasinda_beklemede_olan_odeme_isleminin_detaylarinin_goruntulendigi_dogrular() {
        assertTrue(islemDetaylari.isDisplayed());
    }

    // TC_06
    @Given("Onaylama ve reddetme butonlarinin gorunurlugunu ve aktifligini dogrular")
    public void onaylama_ve_reddetme_butonlarinin_gorunurlugunu_ve_aktifligini_dogrular() {
        butonGorunurlukVeAktiflikTesti(approveButton);
        butonGorunurlukVeAktiflikTesti(rejectButton);
    }

    @Given("Onaylama veya reddetme butonuna tiklar")
    public void onaylama_veya_reddetme_butonuna_tiklar() {
        bekle(1);
        approveButton.click();
        bekle(2);
    }

    @Given("Acilan box'a isleme dair aciklama girer ve submite tiklar")
    public void acilan_box_a_isleme_dair_aciklama_girer_ve_submite_tiklar() {
        approveTextBox.sendKeys("İşlemi tamamlamak için Submit'e tıklayın");
        approveSubmit.click();
        waitForPageToLoad(10);
    }

    // TC_07
    @Given("Odeme isleminin statusunun update edilebildigi dogrular")
    public void odeme_isleminin_statusunun_update_edilebildigi_dogrular() {
        assertTrue(odemeUpdateOnayYazisi.isDisplayed());
    }

    @Given("SearcBox'a {string} yazar ve arama butonuna tiklar")
    public void searcBox_a_isim_yazar_ve_arama_butonuna_tiklar(String aranacakIsim) {
        penWithUserNameSearcBox.sendKeys(ConfigReader.getProperty(aranacakIsim));
        penWithUserNameSearcBoxFindButton.click();
        bekle(1);
    }

    // TC_08
    @Given("Username ile arama yapilabildigini dogrular")
    public void isim_ile_arama_yapilabildigini_dogrular() {
        String expectedResult = ConfigReader.getProperty("aranacakIsim");
        String actuelResult = findResultElement.getText();
        assertTrue(actuelResult.contains(expectedResult));
    }

    @Given("DateSearcBox'a {string} ve {string} yazar ve arama butonuna tiklar")
    public void date_searc_box_a_ve_yazar_ve_arama_butonuna_tiklar(String startDate, String endDate) {
        penWithDateSearcBox.sendKeys(ConfigReader.getProperty(startDate), ConfigReader.getProperty(endDate));
        penWithDateSearcBoxFindButton.click();
    }

    // TC_09
    @Given("Date ile arama yapilabildigini dogrular")
    public void date_ile_arama_yapilabildigini_dogrular() {
        String expectedResult = ConfigReader.getProperty("aranacakIsim");
        String actuelResult = findResultElement.getText();
        assertTrue(actuelResult.contains(expectedResult));
    }

}
