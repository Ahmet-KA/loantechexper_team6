package stepdefinitions.Admin;

import io.cucumber.java.en.Given;
import pages.Admin.AdminLoansPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US_025_AdminLoansMenuSteps {

    AdminLoansPage adminLoansPage = new AdminLoansPage();

    @Given("Admin anasayfaya gidilir")
    public void admin_anasayfaya_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
    }

    @Given("Admin {string} ve {string} ile giris yapilir")
    public void admin_username_ve_password_ile_giris_yapilir(String userName, String password) {
        adminLoansPage.adminLogin(ConfigReader.getProperty(userName), ConfigReader.getProperty(password));
    }

    // TC_01
    @Given("Sol panelde Loans menu basligini goruntuler ve sayfayi kapatir")
    public void sol_panelde_loans_menu_basligini_goruntuler() {
        assertTrue(adminLoansPage.adminPanelLoansElement.isDisplayed());
        Driver.closeDriver();
    }

    // TC_02
    @Given("Loans menu altinda “Pending Loans, Running Loans, Due Loans, Paid Loans, Rejected Loans, All Loans\"  sayfa basliklarini goruntuler ve sayfayi kapatir")
    public void loans_menu_altindaki_sayfa_basliklarini_goruntuler() {
        adminLoansPage.loansMenuBasliklariGoruntulemeTesti();
    }

    // TC_03
    @Given("“Pending Loans” menusune tiklandiginda ilgili sayfaya yonlendirme yapidigi gorulur ve sayfa kapatilir")
    public void pendingLoans_menu_yonlendirmeKontrol() {
        adminLoansPage.menuBasligiTiklamaVeYonlendirmeTesti(adminLoansPage.loansMenuPendingLoansElement, adminLoansPage.expectedPendingUrl);
    }

    // TC_04
    @Given("“Running Loans” menusune tiklandiginda ilgili sayfaya yonlendirme yapidigi gorulur ve sayfa kapatilir")
    public void runningLoans_menu_yonlendirmeKontrol() {
        adminLoansPage.menuBasligiTiklamaVeYonlendirmeTesti(adminLoansPage.loansMenuRunningLoansElement, adminLoansPage.expectedRunningUrl);
    }

    // TC_05
    @Given("“Due Loans” menusune tiklandiginda da  ilgili sayfaya yonlendirme yapidigi gorulur ve sayfa kapatilir")
    public void dueLoans_menu_yonlendirmeKontrol() {
        adminLoansPage.menuBasligiTiklamaVeYonlendirmeTesti(adminLoansPage.loansMenuDuoLoansElement, adminLoansPage.expectedDuoUrl);
    }

    // TC_06
    @Given("“Paid Loans” menusune tiklandiginda ilgili sayfaya yonlendirme yapidigi gorulur ve sayfa kapatilir")
    public void paidLoans_menu_yonlendirmeKontrol() {
        adminLoansPage.menuBasligiTiklamaVeYonlendirmeTesti(adminLoansPage.loansMenuPaidLoansElement, adminLoansPage.expectedPaidUrl);
    }

    // TC_07
    @Given("“Rejected Loans” menusune tiklandiginda  ilgili sayfaya yonlendirme yapidigi gorulur ve sayfa kapatilir")
    public void rejectedLoans_menu_yonlendirmeKontrol() {
        adminLoansPage.menuBasligiTiklamaVeYonlendirmeTesti(adminLoansPage.loansMenuRejectedLoansElement, adminLoansPage.expectedRejectedUrl);
    }

    // TC_08
    @Given("“All Loans” menusune tiklandiginda ilgili sayfaya yonlendirme yapidigi gorulur ve sayfa kapatilir")
    public void allLoans_menu_yonlendirmeKontrol() {
        adminLoansPage.menuBasligiTiklamaVeYonlendirmeTesti(adminLoansPage.loansMenuAllLoansElement, adminLoansPage.expectedAllUrl);
    }

}

