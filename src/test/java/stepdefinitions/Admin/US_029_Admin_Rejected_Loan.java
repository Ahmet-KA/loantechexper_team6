package stepdefinitions.Admin;

import pages.Admin.AdminLoanPage;
import pages.Admin.AdminLoansPage;
import io.cucumber.java.en.Given;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_029_Admin_Rejected_Loan {

    AdminLoanPage adminLoanPage = new AdminLoanPage();
    AdminLoansPage adminLoansPage = new AdminLoansPage();

    @Given("Rejected Loan sayfa linkine tiklanir  ve Reject Loans sayfasi goruntulenir")
    public void rejected_loan_sayfa_linkine_tiklanir_ve_reject_loans_sayfasi_goruntulenir() {
        adminLoanPage.adminPanelLoansLinki.click();
        adminLoanPage.adminPanelRejectedLoansLinki.click();
        adminLoanPage.adminPanelRejectedLoansYazisi.isDisplayed();
    }

    @Given("S.N., Loan No.|Plan, User, Amount, Installment Amount, Installment, Created | Next Installment, Status  bilgileri goruntulenir")
    public void s_n_loan_no_plan_user_amount_ınstallment_amount_ınstallment_created_next_ınstallment_status_bilgileri_goruntulenir() {

        adminLoanPage.rejectedLoansSn.isDisplayed();
        adminLoanPage.rejectedLoansNoPlan.isDisplayed();
        adminLoanPage.rejectedLoansUser.isDisplayed();
        adminLoanPage.rejectedLoansAmount.isDisplayed();
        adminLoanPage.rejectedLoansInstallment.isDisplayed();
        adminLoanPage.rejectedLoansInsAmnt.isDisplayed();
        adminLoanPage.rejectedLoansStatus.isDisplayed();
    }

    @Given("Loan No ve Start Date - End Date bilgileri ile arama yapilir")
    public void loan_no_ve_start_date_end_date_bilgileri_ile_arama_yapilir() {

        adminLoanPage.rejectedLoanNo.sendKeys("1");
        adminLoanPage.rejectedLoanStartEndDate.sendKeys("01/16/2023 - 11/15/2023");
        adminLoanPage.rejectedLoanfiltreSearch.click();
        adminLoanPage.rejectedLoanfiltreSonucSayfasi.isDisplayed();

    }
    @Given("details butonuna tıklanir details chart gorulur")
    public void details_butonuna_tıklanir_details_chart_gorulur() {

        adminLoanPage.rejectedLoanDetailsButton.isDisplayed();
        adminLoanPage.rejectedLoanDetailsButton.click();


    }
    @Given("Installment butonuna tiklanir installment chart gorulur")
    public void ınstallment_butonuna_tiklanir_installment_chart_gorulur() {


        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
       ReusableMethods.goruneneKadarKaydirTikla(adminLoanPage.rejectedLoanInstallmentButton);
        adminLoanPage.rejectedLoanInstallmentChart.isDisplayed();


    }
    @Given("Plan, Date of Application, Loan Number,Amount,  Per Installment, Total Installment, Given Installment,  Total Payable, Profit, Status bilgilerine  erisilebilmelidir")
    public void plan_date_of_application_loan_number_amount_per_ınstallment_total_ınstallment_given_ınstallment_total_payable_profit_status_bilgilerine_erisilebilmelidir() {

        ReusableMethods.bekle(3);
        adminLoanPage.rejectedLoanDetailsChartPlan.isDisplayed();
        adminLoanPage.rejectedLoanDetailsChartGivenIns.isDisplayed();
        adminLoanPage.rejectedLoanDetailsChartLoanNumber.isDisplayed();
        adminLoanPage.rejectedLoanDetailsChartProfit.isDisplayed();
        adminLoanPage.rejectedLoanDetailsChartStatus.isDisplayed();
        adminLoanPage.rejectedLoanDetailsChartTotalIns.isDisplayed();
        adminLoanPage.rejectedLoanDetailsChartTotalPay.isDisplayed();
    }

    @Given("kullanici kredi formu statusu goruntulenir")
    public void kullanici_kredi_formu_statusu_goruntulenir() {

        adminLoanPage.rejectedLoanstatusrapor.isDisplayed();
    }

    @Given("Installment butonuna tiklanir")
    public void ınstallment_butonuna_tiklanir() {
        adminLoanPage.adminPanelRejectedLoansLinki.click();
        adminLoanPage.rejectedLoanInstallmentButton.click();
    }
    @Given("Loan Number, Plan, Loan Amount,Per Installment, Total Installment, Given Installment,  Receivable, Delay Charge gorulur")
    public void loan_number_plan_loan_amount_per_ınstallment_total_ınstallment_given_ınstallment_receivable_delay_charge_gorulur() {


        adminLoanPage.InstallmentSumLoanNumber.isDisplayed();
        adminLoanPage.InstallmentSumPlan.isDisplayed();
        adminLoanPage.InstallmentSumLoanAmount.isDisplayed();
        adminLoanPage.InstallmentSumPerIns.isDisplayed();
        adminLoanPage.InstallmentSumTotalIns.isDisplayed();
        adminLoanPage.InstallmentSumReceivable.isDisplayed();
    }
    @Given("S.N., Installment Date, Given On, Delay, Charge bilgileri ile goruntulenir")
    public void s_n_ınstallment_date_given_on_delay_charge_bilgileri_ile_goruntulenir() {
       adminLoanPage.InstallmentsSn.isDisplayed();
       adminLoanPage.InstallmentsInsDate.isDisplayed();
       adminLoanPage.InstallmentsGivenOn.isDisplayed();
       adminLoanPage.InstallmentsDelay.isDisplayed();
       adminLoanPage.InstallmentsCharge.isDisplayed();

    }
    @Given("Rejected Loans sayfasina donus yapilir")
    public void rejected_loans_sayfasina_donus_yapilir() {

        Driver.getDriver().navigate().back();
        adminLoanPage.adminPanelRejectedLoansYazisi.isDisplayed();
    }


}
