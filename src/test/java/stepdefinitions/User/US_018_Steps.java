package stepdefinitions.User;

import io.cucumber.java.en.Given;
import pages.User.UserTakeLoanPage;
import utilities.ConfigReader;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class US_018_Steps {

    UserTakeLoanPage userTakeLoanPage = new UserTakeLoanPage();


    @Given("Sol taraftaki navbar'da Take Loan menu linki bulundugunu dogrular")
    public void sol_taraftaki_navbar_da_take_loan_menu_linki_bulundugunu_dogrular() {
        assertTrue(userTakeLoanPage.TakeLoanlink.isDisplayed());
    }

    @Given("Take Loan menusune tiklar")
    public void take_loan_menusune_tiklar() {
        userTakeLoanPage.TakeLoanlink.click();
        bekle(1);
    }

    @Given("Loan Plans sayfasina yonlendirildigini dogrular")
    public void Loan_Plans_sayfasina_yonlendirildigini_dogrular() {
        assertTrue(userTakeLoanPage.LoanPlansPage.isDisplayed());
    }
    @Given("Car Loans iki butonuna tiklar")
    public void car_loans_iki_butonuna_tiklar(){
       userTakeLoanPage.basicCar2.click();
       bekle(1);
    }

    @Given("Loan Plans Card body textlerini doğrular")
    public void loan_plans_card_body_textlerini_doğrular() {
        userTakeLoanPage.loanPlansCardBodyTextlerini_dogrula();
    }


    @Given("Apply Now butonunun gorunur ve aktif oldugunu dogrular")
    public void apply_now_butonunun_gorunur_ve_aktif_oldugunu_dogrular() {
        goruneneKadarKaydir(userTakeLoanPage.LoanPlansApplyNowButton);
        assertTrue(userTakeLoanPage.LoanPlansApplyNowButton.isDisplayed());
        assertTrue(userTakeLoanPage.LoanPlansApplyNowButton.isEnabled());
    }

    @Given("Apply Now butona tiklar")
    public void apply_now_butona_tiklar() {
        goruneneKadarKaydirTikla(userTakeLoanPage.LoanPlansApplyNowButton);
        bekle(1);
    }

    @Given("Apply for Personal Finance Loan\" sayfasina gecildigini dogrular")
    public void apply_for_personal_finance_loan_sayfasina_gecildigini_dogrular() {
        assertTrue(userTakeLoanPage.ApplyForPersonalFinanceLoanPage.isDisplayed());
    }

    @Given("Confirm butonunun gorunur ve aktif oldugunu dogrular")
    public void confirm_butonunun_gorunurve_aktif_oldugunu_dogrular() {
        assertTrue(userTakeLoanPage.applyForPersonalConfirmButton.isDisplayed());
        assertTrue(userTakeLoanPage.applyForPersonalConfirmButton.isEnabled());
    }

    @Given("Minimum Amount degeri girer")
    public void minimum_amount_degeri_girer() {
        userTakeLoanPage.amountInputBox.sendKeys(ConfigReader.getProperty("minAmountValue"));
        userTakeLoanPage.applyForPersonalConfirmButton.click();
    }
    @Given("Min Amount degeri girer")
    public void min_amount_degeri_girer() {
        userTakeLoanPage.amountInputBox.sendKeys(ConfigReader.getProperty("minAmountValue32"));
        userTakeLoanPage.applyForPersonalConfirmButton.click();
    }

    @Given("Kayit isleminin gerceklestigini dogrular")
    public void kayit_isleminin_gerceklestigini_dogrular() {
        assertTrue(userTakeLoanPage.LoanApplicationSubmittedSuccessfullyText.isDisplayed());
    }

    @Given("Confirm butonuna tiklar")
    public void confirm_butonuna_tiklar() {
        bekle(1);
        userTakeLoanPage.applyForPersonalConfirmButton.click();
        bekle(1);

    }

    @Given("Basic Loana tiklar")
    public void basic_loana_tiklar() {
        userTakeLoanPage.BasicLoanButton.click();
        bekle(2);
    }

    @Given("Card basliklarini goruntulendigini dogrular")
    public void card_basliklarini_goruntulendigini_dogrular() {
        userTakeLoanPage.basicLoanCardBasliklariGorunurlukTest();
    }

    @Given("Sayfadaki Apply Now butonlarinin gorunur ve aktif oldugunu dogrular")
    public void sayfadaki_apply_now_butonlarinin_gorunur_ve_aktif_oldugunu_dogrular() {
        userTakeLoanPage.basicLoanApplyNowButtonlariGorunurlukveAktiflikTest();
    }

    @Given("Application Form sayfasina yonlendirildigini dogrular")
    public void application_form_sayfasina_yonlendirildigini_dogrular() {
        assertTrue(userTakeLoanPage.ApplicationFormPage.isDisplayed());
    }

    @Given("Sol yan barda My Loans menusune tiklanir")
    public void sol_yan_barda_my_loans_menusune_tiklanir() {
        userTakeLoanPage.MyLoansPage.click();
        bekle(1);
    }

    @Given("Apply butonu tiklanir")
    public void apply_butonu_tiklanir() {
        userTakeLoanPage.applicationFormApplyButton.click();
        bekle(1);
    }

    @Given("Loan application submitted successfully mesajinin goruldugu dogrulanir")
    public void loan_application_submitted_successfully_mesajinin_goruldugu_dogrulanir() {
        assertTrue(userTakeLoanPage.LoanApplicationSubmittedSuccessfullyText.isDisplayed());
    }


    @Given("Yapilan islemin gorunur oldugu dorulanir")
    public void yapilan_islemin_gorunur_oldugu_dorulanir() {
        assertTrue(userTakeLoanPage.myLoansSonYapilanIslem.isDisplayed());
    }

    @Given("Search By Loan Number text box gorunur ve aktif oldugu dogrulanir")
    public void search_by_loan_number_text_box_gorunur_ve_aktif_oldugu_dogrulanir() {
        userTakeLoanPage.SearchByLoanNumberTextBox.isDisplayed();
        userTakeLoanPage.SearchByLoanNumberTextBox.isEnabled();
    }

    /*  @Given("Loan Status basligi altinda filtreleme yapilabildigi dogrulanir")
      public void loan_status_basligi_altinda_filtreleme_yapilabildigi_dogrulanir() {

      }
         */
    @Given("Running e tiklanir")
    public void running_e_tiklanir() {
        userTakeLoanPage.RunningYazisi.click();
    }

    @Given("installments buton gorunur ve aktif oldugu dogrulanir")
    public void installments_buton_gorunur_ve_aktif_oldugu_dogrulanir() {
        userTakeLoanPage.InstallmentsButton.isDisplayed();
        userTakeLoanPage.InstallmentsButton.isEnabled();
    }

    @Given("Installments e tiklanir")
    public void ınstallments_e_tiklanir() {
        goruneneKadarKaydir(userTakeLoanPage.InstallmentsButton);
        userTakeLoanPage.InstallmentsButton.click();
    }

    @Given("Taksit plani listesinin gorunur oldugu dogrulanir")
    public void taksit_plani_listesinin_gorunur_oldugu_dogrulanir() {
        userTakeLoanPage.myLoansRunning.click();
        bekle(1);
        assertTrue(userTakeLoanPage.taksitPlanListesi.isDisplayed());
    }

    @Given("Take Loan butonunun gorunur ve aktif oldugu dogrulanir")
    public void take_loan_butonunun_gorunur_ve_aktif_oldugu_dogrulanir() {
        assertTrue(userTakeLoanPage.takeLoanButton.isDisplayed());
        assertTrue(userTakeLoanPage.takeLoanButton.isEnabled());
    }
    @Given("Liste basliklarinin gorunur oldugu dogrulanir")
    public void liste_basliklarinin_gorunur_oldugu_dogrulanir() {
     bekle(1);
     userTakeLoanPage.listeBasliklariGorunurlukTest();
    }

    @Given("Liste icerisinde degerlerin gorunur oldugu dogrulanir")
    public void liste_icerisinde_degerlerin_gorunur_oldugu_dogrulanir() {
        bekle(1);
       userTakeLoanPage.loanInstallmentListeDegerleri();
    }
}
