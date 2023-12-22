package stepdefinitions.User;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Admin.AdminLoansPage;
import pages.User.UserLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_27_TC_01_02_03_04_05_06_07_08_09_10_11_12_13 {

    AdminLoansPage adminLoansPage = new AdminLoansPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    Actions actions = new Actions(Driver.getDriver());

    UserLoginPage userLoginPage = new UserLoginPage();

    // US26_TC01
    @Then("Loans menusune tiklanir")
    public void loans_menusune_tiklanir() {
        adminLoansPage.adminPanelLoansElement.click();

        ReusableMethods.bekle(2);

    }

    @Then("Running Loans menusune tiklanir.")
    public void running_loans_menusune_tiklanir() {
        adminLoansPage.loansMenuRunningLoansElement.click();

    }

    @Then("Running Loans menusune ulasildigi dogrulanir.")
    public void running_loans_menusune_ulasildigi_dogrulanir() {
        Assert.assertTrue(adminLoansPage.runningLoansSayfasiRunningLoansText.isDisplayed());


    }
    // US27_TC02


    @Then("S.N., Loan No.|Plan, User, Amount, Installment Amount, Installment,Created | Next Installment, Status basliklarinin goruntulendigi dogrulanir.")
    public void s_n_loan_no_plan_user_amount_ınstallment_amount_ınstallment_created_next_ınstallment_status_basliklarinin_goruntulendigi_dogrulanir() {

        Assert.assertTrue(adminLoansPage.runningLoansSNText.isDisplayed());
        Assert.assertTrue(adminLoansPage.runningLoansLoanNoPlanText.isDisplayed());
        Assert.assertTrue(adminLoansPage.runningLoansUSerText.isDisplayed());
        Assert.assertTrue(adminLoansPage.runningLoansAmountText.isDisplayed());
        Assert.assertTrue(adminLoansPage.runningLoansInstallmentAmountText.isDisplayed());
        Assert.assertTrue(adminLoansPage.runningLoansInstallmentText.isDisplayed());
        Assert.assertTrue(adminLoansPage.runningLoansCreatedText.isDisplayed());
        Assert.assertTrue(adminLoansPage.runningLoansStatusText.isDisplayed());
        Assert.assertTrue(adminLoansPage.runningLoansActionText.isDisplayed());


    }

    // US27_TC03

    @Then("Loan No alanina numara girilir")
    public void loan_no_alanina_numara_girilir() {

        adminLoansPage.runningLoanPageloanNoSearchButton.sendKeys(ConfigReader.getProperty("loanNoGly"));
        ReusableMethods.bekle(2);

    }

    @Then("search butonuna tiklanir")
    public void search_butonuna_tiklanir() {

        adminLoansPage.runningLoanPageloanNoSearchButton.click();
        ReusableMethods.bekle(2);

    }

    //US27_TC04

    @Then("start date - end date alanina tiklanir")
    public void start_date_end_date_alanina_tiklanir() {
        adminLoansPage.startDateEndDateTextBox.click();

        ReusableMethods.bekle(5);


    }

    @Then("baslangic tarihi secilir")
    public void baslangic_tarihi_secilir() {

        adminLoansPage.startDateEndDateTextBox.sendKeys(ConfigReader.getProperty("startDate"));


    }

    @Then("bitis tarihi secilir")
    public void bitis_tarihi_secilir() {

        adminLoansPage.startDateEndDateTextBox.sendKeys(ConfigReader.getProperty("endDate"));

        ReusableMethods.bekle(2);
    }

    @Then("kendi search butonuna tiklanir")
    public void kendi_search_butonuna_tiklanir() {

        adminLoansPage.runningLoanPagestartDateEndDateSearchButton.click();

        ReusableMethods.bekle(2);


        // US27TC05

    }

    @Then("Details sekmesine tiklanir")
    public void details_sekmesine_tiklanir() {

        adminLoansPage.runningLoanPageRunningLoansDetailsBirinci.click();
    }

    @Then("Loan details text'inin goruntulendigi dogrulanir")
    public void loan_details_text_inin_goruntulendigi_dogrulanir() {
        Assert.assertTrue(adminLoansPage.loanDetailPageLoanDetailsText.isDisplayed());

    }
    // 06

    @Then("Installment sekmesine tiklanir")
    public void ınstallment_sekmesine_tiklanir() {
        adminLoansPage.runningLoansInstallmentText.click();

    }

    @Then("Installment text'inin goruntulendigi dogrulanir")
    public void ınstallment_text_inin_goruntulendigi_dogrulanir() {
        Assert.assertTrue(adminLoansPage.installmentPageinstallmentText.isDisplayed());

    }

    //07

    @Then("Plan, Date of Application, Loan Number, Amount, Per Installment, Total Installment, Given Installment,  Total Payable, Profit, Status textlerinin goruntulendigi dogrulanir")
    public void plan_date_of_application_loan_number_amount_per_ınstallment_total_ınstallment_given_ınstallment_total_payable_profit_status_textlerinin_goruntulendigi_dogrulanir() {

        Assert.assertTrue(adminLoansPage.loanDetailPagePlanText.isDisplayed());
        Assert.assertTrue(adminLoansPage.loanDetailPageDateOfApplicationText.isDisplayed());
        Assert.assertTrue(adminLoansPage.loanDetailPageLoanNumber.isDisplayed());
        Assert.assertTrue(adminLoansPage.loanDetailPagemountText.isDisplayed());
        Assert.assertTrue(adminLoansPage.loanDetailPagePerInstallmentText.isDisplayed());
        Assert.assertTrue(adminLoansPage.loanDetailPageTotalInstallmentText.isDisplayed());
        Assert.assertTrue(adminLoansPage.loanDetailPageGivenInstallmentText.isDisplayed());
        Assert.assertTrue(adminLoansPage.loanDetailPageTotalPayableText.isDisplayed());
        Assert.assertTrue(adminLoansPage.loanDetailPageTotalPayableText.isDisplayed());
        Assert.assertTrue(adminLoansPage.loanDetailPageProfitText.isDisplayed());
        Assert.assertTrue(adminLoansPage.loanDetailPageStatusText.isDisplayed());

        ReusableMethods.bekle(2);


    }

    //08
    @Then("Status'un goruntulendigi dogrulanir")
    public void status_un_goruntulendigi_dogrulanir() {

        Assert.assertTrue(adminLoansPage.loanDetailPageStatusText.isDisplayed());

    }
    //9

    @Then("Running Loans Installment sekmesine tiklanir")
    public void running_loans_ınstallment_sekmesine_tiklanir() {
        adminLoansPage.runningLoansInstallmentBrinciSira.click();
    }

    @Then("Loan Number, Plan, Loan Amount,  Per Installment,Total Installment, Given Installment,  Receivable, Delay Charge bilgilerinin goruntulendigi dogrulanir")
    public void loan_number_plan_loan_amount_per_ınstallment_total_ınstallment_given_ınstallment_receivable_delay_charge_bilgilerinin_goruntulendigi_dogrulanir() {
        Assert.assertTrue(adminLoansPage.installmentPageLoanNumberText.isDisplayed());
        Assert.assertTrue(adminLoansPage.installmentPlanText.isDisplayed());
        Assert.assertTrue(adminLoansPage.installmentLoannAmounthText.isDisplayed());
        Assert.assertTrue(adminLoansPage.installmentPagePerInstallmentText.isDisplayed());
        Assert.assertTrue(adminLoansPage.installmentPageTotalInstallmentText.isDisplayed());
        Assert.assertTrue(adminLoansPage.installmentPageGivenInstallmentText.isDisplayed());
        Assert.assertTrue(adminLoansPage.installmentPageReceivableText.isDisplayed());
        Assert.assertTrue(adminLoansPage.installmentPageDelayChargeText.isDisplayed());
        ReusableMethods.bekle(1);


    }

    // 10
    @Then("S.N., Installment Date, Given On, Delay, Charge  bilgilerinin goruntulendigi dogrulanir")
    public void s_n_ınstallment_date_given_on_delay_charge_bilgilerinin_goruntulendigi_dogrulanir() {

        Assert.assertTrue(adminLoansPage.installmentPageSNtext.isDisplayed());
        Assert.assertTrue(adminLoansPage.installmentPageInstallmentDatePage.isDisplayed());
        Assert.assertTrue(adminLoansPage.installmentPageGivenOnText.isDisplayed());
        Assert.assertTrue(adminLoansPage.installmentPageDelayText.isDisplayed());
        Assert.assertTrue(adminLoansPage.installmentPageChargeText.isDisplayed());
        ReusableMethods.bekle(1);
    }

    //11
    @Then("Running Loans sayfasina donus yapilir")
    public void running_loans_sayfasina_donus_yapilir() {
        adminLoansPage.loansMenuRunningLoansElement.click();
        ReusableMethods.bekle(1);
    }

    //12

    @Then("Sayfayi asagi kaydirir")
    public void sayfayi_asagi_kaydirir() {

        if (adminLoansPage.tableSize.size()>=20){
            ReusableMethods.bekle(3);
            userLoginPage.scrolling(adminLoansPage.runningLoanInstallmentIkinciSayfaButonu);
            ReusableMethods.bekle(3);
            adminLoansPage.runningLoanInstallmentIkinciSayfaButonu.click();
        } else{
            ReusableMethods.bekle(3);
            Driver.closeDriver();

        }



            //actions.moveToElement(adminLoansPage.installmentPageSNtext).perform();
            // ReusableMethods.goruneneKadarKaydir(adminLoansPage.runningLoanInstallmentIkinciSayfaButonu);
        }


        @Then("Taksitler yirmiden fazlaysa ikinci Sayfaya tiklar.")
        public void taksitler_yirmiden_fazlaysa_ikinci_sayfaya_tiklar () {


        }


    }





