package stepdefinitions.Visitor;

import io.cucumber.java.en.Given;
import pages.Visitor.VisitorHomePage;
import pages.Visitor.VisitorLoanPage;
import pages.Visitor.VisitorPlansPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.*;
import static utilities.ReusableMethods.*;

public class US_007_VisitorLoanPlansSteps {

    VisitorHomePage homePage = new VisitorHomePage();
    VisitorPlansPage visitorPlansPage = new VisitorPlansPage();
    VisitorLoanPage visitorLoanPage = new VisitorLoanPage();

    @Given("Ziyaretci anasayfaya gider")
    public void ziyaretci_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        bekle(1);
    }

    @Given("Plans menusune tiklar")
    public void plans_menusune_tiklar() {
        homePage.homePagePlansMenuElementi.click();
        bekle(1);
    }


    @Given("Loan sayfasina erisebildigini dogrular")
    public void loan_sayfasina_erisebildigini_dogrular() {
        assertTrue(visitorPlansPage.loansPlansTextElementi.isDisplayed());
    }


    @Given("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
        bekle(1);
    }

    @Given("Cookiesi kapatir")
    public void cookiesi_kapatir() {
        bekle(2);
        homePage.cookiesAllowElementi.click();
        bekle(1);
    }

    @Given("Loan Plans link textinin gorunur oldugunu dogrular") // TC_02
    public void loan_plans_link_textinin_gorunur_oldugunu_dogrular() {
        goruneneKadarKaydir(homePage.footerCopyRightElement);
        assertTrue(homePage.footerLoanPlansLinkElementi.isDisplayed());
    }

    @Given("Loan Plans link textine tiklar ve aktif oldugunu dogrular") // TC_03
    public void loan_plans_link_textine_tiklar_ve_aktif_oldugunu_dogrular() {
        goruneneKadarKaydirTikla(homePage.footerLoanPlansLinkElementi);
        assertTrue(visitorPlansPage.loansPlansTextElementi.isDisplayed());
    }

    @Given("Basic Loan butonuna tiklar")
    public void Basic_Loan_butonuna_tiklar() {
        visitorLoanPage.basicLoanButtonElement.click();
    }

    @Given("Loan Plan kartlarinin gorunur oldugunu dogrular") // TC_04
    public void loan_plan_kartlarinin_gorunur_oldugunu_dogrular() {
        goruneneKadarKaydir(visitorLoanPage.installmentElement);
        bekle(1);
        assertTrue(visitorLoanPage.basicLoanPlanCardBodyElement.isDisplayed());
    }

    @Given("Apply Now butonlarinin gorunur oldugunu dogrular") // TC_05
    public void apply_now_butonlarinin_gorunur_oldugunu_dogrular() {
        goruneneKadarKaydir(visitorLoanPage.basicLoanApplyNowButtonElement);
        bekle(1);
        assertTrue(visitorLoanPage.basicLoanApplyNowButtonElement.isDisplayed());
    }

    @Given("Apply Now butonlarinin aktif oldugunu dogrular") // TC_06
    public void apply_now_butonlarinin_aktif_oldugunu_dogrular() {
        goruneneKadarKaydirTikla(visitorLoanPage.basicLoanApplyNowButtonElement);
        bekle(1);
        assertTrue(visitorLoanPage.applyNowAktiveXElement.isDisplayed());
    }

    @Given("Home linkinin islevini dogrular") // US_07 TC_07
    public void home_linkinin_islevini_dogrular() {
        String expectedHomePageUrl = ConfigReader.getProperty("url");
        visitorPlansPage.loanPlansHomeLinkElement.click();
        bekle(1);
        String actuelHomePageUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedHomePageUrl, actuelHomePageUrl);
        bekle(1);
    }

    @Given("Loan Plans linkinin islevini dogrular") // US_07 TC_07
    public void loan_plans_linkinin_islevini_dogrular() {
        visitorPlansPage.loanPlansLinkElement.click();
        String actuelUrl = Driver.getDriver().getCurrentUrl();
               assertNotEquals("Link'in herhangi bir fonksiyonu yoktur",
                VisitorLoanPage.unExpectedUrl, actuelUrl);

    }


}
