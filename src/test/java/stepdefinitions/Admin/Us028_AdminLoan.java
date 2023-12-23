package stepdefinitions.Admin;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Admin.AdminLoanPage;
import utilities.ReusableMethods;

import java.io.IOException;

public class Us028_AdminLoan {

    AdminLoanPage adminLoanPage = new AdminLoanPage();

    @Given("Anasayfa sağ barda bulunan Loans butonuna tiklar")
    public void anasayfa_sağ_barda_bulunan_loans_butonuna_tiklar() {
        adminLoanPage.adminPanelLoansElement.click();

    }
    @Given("Loans barin altinda Due Loans butonuna tiklar {string} sayfasi test edilir")
    public void loans_barin_altinda_due_loans_butonuna_tiklar_sayfasi_test_edilir(String string) {
        adminLoanPage.loansMenuDuoLoansElement.click();
        adminLoanPage.dueLoansPage.isDisplayed();

    }

    @Given("Due Installment Loans Tablosu goruntulenmelidir")
    public void due_ınstallment_loans_tablosu_goruntulenmelidir() {
        adminLoanPage.dueInstallmentLoansTablosu.isDisplayed();


    }

    @Given("Due Installment Loans tablosu uzerinde {string} bilgileri ile arama yapilir")
    public void due_ınstallment_loans_tablosu_uzerinde_bilgileri_ile_arama_yapilir(String string) {
        String unexpected = "Data not found";
        Assert.assertTrue(adminLoanPage.dataNotFoundElement.equals(unexpected));
        try {
            ReusableMethods.getScreenshot(adminLoanPage.dataNotFoundElement.getText());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }






}
