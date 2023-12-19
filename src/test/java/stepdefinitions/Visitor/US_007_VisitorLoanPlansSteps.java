package stepdefinitions.Visitor;

import io.cucumber.java.en.Given;
import pages.Visitor.VisitorHomePage;
import pages.Visitor.VisitorLoanPage;
import pages.Visitor.VisitorPlansPage;
import utilities.ConfigReader;
import utilities.Driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class US_007_VisitorLoanPlansSteps {

    VisitorHomePage homePage = new VisitorHomePage();
    VisitorLoanPage loanPage = new VisitorLoanPage();
    VisitorPlansPage plansPage = new VisitorPlansPage();

    @Given("Ziyaretci anasayfaya gider")
    public void ziyaretci_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        bekle(1);
    }

    @Given("Plans menusune tiklar")
    public void plans_menusune_tiklar() {
        homePage.homePagePlansMenuElementi.click();
    }


    @Given("Loan sayfasina erisebildigini dogrular")
    public void loan_sayfasina_erisebildigini_dogrular() {
        assertTrue(plansPage.loansPlansTextElementi.isDisplayed());
    }


    @Given("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Given("Cookiesi kapatir")
    public void cookiesi_kapatir() {
        bekle(2);
        homePage.cookiesAllowElementi.click();
    }

    @Given("Loan Plans link textinin gorunur oldugunu dogrular") // TC_02
    public void loan_plans_link_textinin_gorunur_oldugunu_dogrular() {
        goruneneKadarKaydir(homePage.footerCopyRightElement);
        assertTrue(homePage.footerLoanPlansLinkElementi.isDisplayed());
    }

    @Given("Loan Plans link textine tiklar ve aktif oldugunu dogrular") // TC_03
    public void loan_plans_link_textine_tiklar_ve_aktif_oldugunu_dogrular() {
        goruneneKadarKaydirTikla(homePage.footerLoanPlansLinkElementi);
        assertTrue(plansPage.loansPlansTextElementi.isDisplayed());
    }

    @Given("Basic Loan butonuna tiklar")
    public void Basic_Loan_butonuna_tiklar() {
        loanPage.basicLoanButtonElement.click();
    }

    @Given("Loan Plan kartlarinin gorunur oldugunu dogrular") // TC_04
    public void loan_plan_kartlarinin_gorunur_oldugunu_dogrular() {
        goruneneKadarKaydir(loanPage.installmentElement);
        bekle(1);
        assertTrue(loanPage.basicLoanPlanCardBodyElement.isDisplayed());
    }

    @Given("Apply Now butonlarinin gorunur oldugunu dogrular") // TC_05
    public void apply_now_butonlarinin_gorunur_oldugunu_dogrular() {
        goruneneKadarKaydir(loanPage.basicLoanApplyNowButtonElement);
        bekle(1);
        assertTrue(loanPage.basicLoanApplyNowButtonElement.isDisplayed());
    }

    @Given("Apply Now butonlarinin aktif oldugunu dogrular") // TC_06
    public void apply_now_butonlarinin_aktif_oldugunu_dogrular() {
        goruneneKadarKaydirTikla(loanPage.basicLoanApplyNowButtonElement);
        bekle(1);
        assertTrue(loanPage.applyNowAktiveXElement.isDisplayed());
    }

    @Given("Home linkinin islevini dogrular") // US_07 TC_07
    public void home_linkinin_islevini_dogrular() {
        plansPage.loanPlansHomeLinkElement.click();
        String expectedHomePageUrl = ConfigReader.getProperty("url");
        String actuelHomePageUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedHomePageUrl, actuelHomePageUrl);
    }


    @Given("Loan Plans linkinin islevini dogrular") // US_07 TC_07
    public void loan_plans_linkinin_islevini_dogrular() {
        homePage.homePagePlansMenuElementi.click();
        assertTrue(plansPage.loanPlansLinkElement.isEnabled());
    }




}
