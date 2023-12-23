package stepdefinitions.Admin;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Admin.AdminDepositsPage;
import io.cucumber.java.en.Given;
import pages.Admin.AdminLogin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_051_AdminDepositPage extends ReusableMethods {
    WebDriver driver;

    AdminDepositsPage adminDepositsPage =new AdminDepositsPage();
    AdminLogin adminLogin=new AdminLogin();

    @Given("adminUrl sayfasina  gidilir")
    public void admin_url_sayfasina_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        adminLogin.adminLoginGirisYap(ConfigReader.getProperty("adminracar"),ConfigReader.getProperty("adminracarpassword"));

    }

    @Given("sol tarafta bulunan Deposit linkine tiklar")
    public void sol_tarafta_bulunan_deposit_linkine_tiklar() {
        adminDepositsPage.depositsButon.click();


    }
    @Given("acilan menu basliklarinda Pending Deposit linkine tiklanir")
    public void acilan_menu_basliklarinda_pending_deposit_linkine_tiklanir() {
       adminDepositsPage.pendingDepositslink.click();

    }
    @Given("ilgili sayfaya  erisildigi dogrulanir")
    public void ilgili_sayfaya_erisildigi_dogrulanir() {

        adminDepositsPage.pendingDepositsYazisi.isDisplayed();

    }
    @Given("Pending Deposits listesi goruntulenir")
    public void pending_deposits_listesi_goruntulenir() {
        adminDepositsPage.pendingDepositsListesi.isDisplayed();

    }
    @Given("listede başlıkları kullanıcı adı,miktar,başlatılma tarihi gibi bilgiler icerdigi dogrulanir.")
    public void listede_başlıkları_kullanıcı_adı_miktar_başlatılma_tarihi_gibi_bilgiler_icerdigi_dogrulanir() {

        adminDepositsPage.gatewaySutunBaslik.isDisplayed();
        adminDepositsPage.amountSutunBaslik.isDisplayed();
        adminDepositsPage.userSutunBaslik.isDisplayed();
        adminDepositsPage.initiatedSutunBaslik.isDisplayed();

    }
    @Given("ilgili details butonuna tıklar ve Approve,Reject butonunu goruntuler")
    public void ilgili_details_butonuna_tıklar_ve_approve_reject_butonunu_goruntuler() {
        adminDepositsPage.pendingDepositDetailsButton.click();
        adminDepositsPage.approveButton.isDisplayed();
        adminDepositsPage.rejectButton.isDisplayed();

    }
    @Given("Approve tiklandiginda uyari mesajini gorur ve listeden kaldirildigini goruntuler")
    public void approve_tiklandiginda_uyari_mesajini_gorur_ve_listeden_kaldirildigini_goruntuler() {
        adminDepositsPage.approveButton.click();
        adminDepositsPage.approveUyariMesaji.isDisplayed();
        adminDepositsPage.approveButton.isSelected();


    }


}