package stepdefinitions.Admin;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Admin.AdminLogin;
import pages.Admin.AdminManageUsersPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_037_AdminManageUsersStepDefinitions {

    AdminLogin adminLogin = new AdminLogin();
    AdminManageUsersPage adminManageUsersPage = new AdminManageUsersPage();

    @Given("Admin kullanıcı olarak {string} adresine gidilir.")
    public void admin_kullanıcı_olarak_adresine_gidilir(String urlAdmin) {
        ReusableMethods.bekle(1);
        Driver.getDriver().get(ConfigReader.getProperty(urlAdmin));
    }

    @Given("Açılan admin login sayfasında admin {string} ve {string} girilir ve login button tıklanır.")
    public void açılan_admin_login_sayfasında_admin_ve_girilir_ve_login_button_tıklanır(String userName, String adminPassword) {

        adminLogin.adminLoginGirisYap(ConfigReader.getProperty(userName),ConfigReader.getProperty(adminPassword));
    }
    @Given("Açılan dashboard sayfasında soldaki menüden manage users'a tıklanır ve altında Active users linki görüntülentiği dogrulanir.")
    public void açılan_dashboard_sayfasında_soldaki_menüden_manage_users_a_tıklanır_ve_altında_active_users_linki_görüntülentiği_dogrulanir() {

        adminManageUsersPage.manageUserDropdownMenu.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminManageUsersPage.activeUsersMenu.isDisplayed());
    }

    @Given("Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır")
    public void açılan_dashboard_sayfasında_soldaki_menüden_manage_users_a_ardından_active_user_sa_tıklanır() {

        adminManageUsersPage.manageUserDropdownMenu.click();
        adminManageUsersPage.activeUsersMenu.click();
    }
    @Given("Açılan Active users sayfasında liste başlıklarının görüntülendiği doğrulanır")
    public void açılan_active_users_sayfasında_liste_başlıklarının_görüntülendiği_doğrulanır() {

        adminManageUsersPage.activeUserTableBaslikAssert();
    }

    @Given("Active users listesi üzerinde details button görünür oldugu dogrulanır.")
    public void active_users_listesi_üzerinde_details_button_görünür_oldugu_dogrulanır() {

        adminManageUsersPage.detailsButton.isDisplayed();
    }

    @Given("Liste üzerinde details butona tıklandıgında user details sayfasına yönlendirildiği dogrulanır.")
    public void liste_üzerinde_details_butona_tıklandıgında_user_details_sayfasına_yönlendirildiği_dogrulanır() {

        adminManageUsersPage.detailsButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminManageUsersPage.userDetailPageTitle.isDisplayed());
    }

    @Given("Active users listesi üzerinde details butona tıklanır.")
    public void active_users_listesi_üzerinde_details_butona_tıklanır() {

        adminManageUsersPage.detailsButton.click();
    }
    @Given("User Detail sayfasında Balance başlığı altında view all ikonunu görünür ve aktif oldugu dogrulanır.")
    public void user_detail_sayfasında_balance_başlığı_altında_view_all_ikonunu_görünür_ve_aktif_oldugu_dogrulanır() {

        ReusableMethods.bekle(2);
        adminManageUsersPage.viewAllBalanceIcon.isDisplayed();
    }

    @Given("User Detail sayfasında Balance başlığı altında view all ikonuna tıklanır ve transaction log sayfasına yönlendirildiği doğrulanır.")
    public void user_detail_sayfasında_balance_başlığı_altında_view_all_ikonuna_tıklanır_ve_transaction_log_sayfasına_yönlendirildiği_doğrulanır() {

        adminManageUsersPage.viewAllBalanceIcon.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(adminManageUsersPage.transactionLogsPageTitle.isDisplayed());
    }

    @Given("User Detail sayfasında Balance başlığı altında view all ikonuna tıklanır.")
    public void user_detail_sayfasında_balance_başlığı_altında_view_all_ikonuna_tıklanır() {

        adminManageUsersPage.viewAllBalanceIcon.click();
    }

    @Given("Açılan İşlem Günlükleri sayfasında liste ve liste başlıklarının görünür oldugu dogrulanır")
    public void açılan_işlem_günlükleri_sayfasında_liste_ve_liste_başlıklarının_görünür_oldugu_dogrulanır() {


        for (int i = 0; i < 6; i++) {

            System.out.println(adminManageUsersPage.tableTransactionLogsPage.get(i).getText());
            Assert.assertTrue(adminManageUsersPage.tableTransactionLogsPage.get(i).isDisplayed());
        }

    }

    @Given("Active users sayfasında username-email search kısmına {string} girilir ve entera basılır.")
    public void active_users_sayfasında_username_email_search_kısmına_girilir_ve_entera_basılır(String userName) {

        adminManageUsersPage.userNameSearchBox.sendKeys(ConfigReader.getProperty(userName), Keys.ENTER);
        ReusableMethods.bekle(1);
    }
    @Given("Sayfadaki Liste içinde arama yapmak için filtre simgelerinin görünür ve etkin oldukları dogrulanır.")
    public void sayfadaki_liste_içinde_arama_yapmak_için_filtre_simgelerinin_görünür_ve_etkin_oldukları_dogrulanır() {

        adminManageUsersPage.filterSelectedValidate();
    }

    @Given("Kullanıcı Detay Sayfasında {string} Butonu görünür ve aktif oldugu dogrulanır.")
    public void kullanıcı_detay_sayfasında_butonu_görünür_ve_aktif_oldugu_dogrulanır(String string) {

        Assert.assertTrue(adminManageUsersPage.balanceButton.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @Given("User Detail sayfasında Add balance butonuna tıklanır")
    public void user_detail_sayfasında_add_balance_butonuna_tıklanır() {
        adminManageUsersPage.balanceButton.click();
    }
    @Given("Add balance sayfasına yönlendirdiği dogrulanır.")
    public void add_balance_sayfasına_yönlendirdiği_dogrulanır() {

        ReusableMethods.bekle(1);
        Assert.assertTrue(adminManageUsersPage.addBalancePageTitle.isDisplayed());
    }

    @Given("Add Balance sayfasındaki Tutar ve Açıklama metin kutularının aktif olarak kullanıldıgı dogrulanır.")
    public void add_balance_sayfasındaki_tutar_ve_açıklama_metin_kutularının_aktif_olarak_kullanıldıgı_dogrulanır() {

        adminManageUsersPage.addBalancePageControl();
    }

    @Given("Sayfadaki Gönder Butonu görünür ve aktif olmalıdır. Tıklandığında $x başarıyla eklendi metninin görüntülendiği doğrulanır.")
    public void sayfadaki_gönder_butonu_görünür_ve_aktif_olmalıdır_tıklandığında_$x_başarıyla_eklendi_metninin_görüntülendiği_doğrulanır() {

        ReusableMethods.bekle(1);
        Assert.assertTrue(adminManageUsersPage.submitButton.isDisplayed());
        adminManageUsersPage.amountTextBox.sendKeys(ConfigReader.getProperty("amount"));
        adminManageUsersPage.remarkTextBox.sendKeys("remark");
        ReusableMethods.bekle(1);
        adminManageUsersPage.submitButton.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminManageUsersPage.addBalanceMessage.isDisplayed());
    }

    @Given("Kullanıcı Detay Sayfasında Subtract Balance Butonu görünür ve aktif oldugu dogrulanır.")
    public void kullanıcı_detay_sayfasında_subtract_balance_butonu_görünür_ve_aktif_oldugu_dogrulanır() {

        Assert.assertTrue(adminManageUsersPage.subtractBalanceButton.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @Given("User Detail sayfasında Subtract Balance butonuna tıklanır")
    public void user_detail_sayfasında_subtract_balance_butonuna_tıklanır() {

        adminManageUsersPage.subtractBalanceButton.click();
    }
    @Given("Subtract Balance sayfasına yönlendirdiği dogrulanır.")
    public void subtract_balance_sayfasına_yönlendirdiği_dogrulanır() {

        ReusableMethods.bekle(1);
        Assert.assertTrue(adminManageUsersPage.subtractBalancePageTitle.isDisplayed());
    }

    @Given("Subtract Balance sayfasındaki Tutar ve Açıklama metin kutularının aktif olarak kullanıldıgı dogrulanır.")
    public void subtract_balance_sayfasındaki_tutar_ve_açıklama_metin_kutularının_aktif_olarak_kullanıldıgı_dogrulanır() {

        adminManageUsersPage.subtractBalancePageControl();
    }

    @Given("Sayfadaki Gönder Butonu görünür ve aktif olmalıdır. Tıklandığında $x subtracted successfully metninin görüntülendiği doğrulanır.")
    public void sayfadaki_gönder_butonu_görünür_ve_aktif_olmalıdır_tıklandığında_$x_subtracted_successfully_metninin_görüntülendiği_doğrulanır() {

        ReusableMethods.bekle(1);
        Assert.assertTrue(adminManageUsersPage.submitButton.isDisplayed());
        adminManageUsersPage.amountTextBox.sendKeys(ConfigReader.getProperty("amount"));
        adminManageUsersPage.remarkTextBox.sendKeys(ConfigReader.getProperty("remark"));
        ReusableMethods.bekle(1);
        adminManageUsersPage.submitButton.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminManageUsersPage.subtractBalanceMessage.isDisplayed());

    }






}
