package stepdefinitions.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Admin.AdminDepositsPage;
import pages.Admin.AdminManageUsersPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class US_38_AdminActiveUserPageStepDefinition {
    AdminManageUsersPage manageUsersPage = new AdminManageUsersPage();
    AdminDepositsPage depositHistoryPage = new AdminDepositsPage();

    @Given("sol tarafta bulunan Manage Users menusune tiklar")
    public void sol_tarafta_bulunan_manage_users_menusune_tiklar() {
        manageUsersPage.manageUserDropdownMenu.click();
        ReusableMethods.bekle(1);
    }

    @Given("Manage Users altinda Active Users basliginin gorunebilir ve aktif oldugunu  dogrular")
    public void manage_users_altinda_active_users_basliginin_gorunebilir_ve_aktif_oldugunu_dogrular() {
        Assert.assertTrue(manageUsersPage.activeUsersMenu.isDisplayed());
        Assert.assertTrue(manageUsersPage.activeUsersMenu.isEnabled());
    }

    @And("acilan menude Active Users basligina tiklar")
    public void acilanMenudeActiveUsersBasliginaTiklar() {
        manageUsersPage.activeUsersTitle.click();

    }

    @And("sayfada Active Users listesinin oldugunu ve  liste baslıklarının goruntulendigini dogrular")
    public void sayfadaActiveUsersListesininOldugunuVeListeBaslıklarınınGoruntulendiginiDogrular() {
        ReusableMethods.bekle(1);
        Assert.assertFalse(manageUsersPage.activeUsersList.isEmpty());
        manageUsersPage.activeUserTableBaslikAssert();
    }

    @And("Active Users sayfasındaki search kutusuna {string} girer ve ara butonuna tıklar")
    public void activeUsersSayfasındakiSearchKutusunaGirerVeAraButonunaTıklar(String isim) {
        manageUsersPage.userNameSearchBox.sendKeys(ConfigReader.getProperty(isim));
        ReusableMethods.bekle(1);
        manageUsersPage.searchSubmitButton.click();
        ReusableMethods.bekle(1);

    }

    @And("acilan listedeki ilk satirin sonunda yer alan Details butonunun gorunur ve aktif oldugunu dogrular")
    public void acilanListedekiIlkSatirinSonundaYerAlanDeatilsButonununGorunurVeAktifOldugunuDogrular() {
        Assert.assertTrue(manageUsersPage.detailsButton.isDisplayed());
        Assert.assertTrue(manageUsersPage.detailsButton.isEnabled());
        ReusableMethods.bekle(1);
    }

    @And("satir sonundaki Details butonuna tiklar")
    public void satirSonundakiDetailsButonunaTiklar() {
        manageUsersPage.detailsButton.click();
        ReusableMethods.bekle(1);
    }

    @And("acilan sayfa basliginin User Detail-Username oldugunu dogrular")
    public void acilanSayfaBasligininUserDetailUsernameOldugunuDogrular() {
        Assert.assertTrue(manageUsersPage.userDetailPageTitle.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @And("acilan sayfada User Detail basliginin altında Deposited bolumundeki View All iconunun gorunur ve aktif oldugunu dogrular")
    public void acilanSayfadaUserDetailBasligininAltındaDepositedBolumundekiViewAllIconununGorunurVeAktifOldugunuDogrular() {
        Assert.assertTrue(manageUsersPage.viewAllDepositIcon.isDisplayed());
        Assert.assertTrue(manageUsersPage.viewAllDepositIcon.isEnabled());
    }

    @And("Deposited bolumundeki View All iconuna tıklar")
    public void depositedBolumundekiViewAllIconunaTıklar() {
        manageUsersPage.viewAllDepositIcon.click();
        ReusableMethods.bekle(1);
    }

    @And("acilan sayfa basliginin Deposit History oldugunu dogrular")
    public void acilanSayfaBasligininDepositHistoryOldugunuDogrular() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(manageUsersPage.depositHistoryPageTitle.isDisplayed());
    }

    @And("acilan sayfada kisiye ait Deposit History listesinin ve liste baslıklarının goruntulendigini dogrular")
    public void acilanSayfadaKisiyeAitDepositHistoryListesininVeListeBaslıklarınınGoruntulendiginiDogrular() {
        ReusableMethods.bekle(1);
        Assert.assertFalse(depositHistoryPage.userDepositHistoryList.isEmpty());
        depositHistoryPage.userDepositTableBaslikAssert();
    }

    @And("acilan sayfada kisi satirinda Details butonunun gorunur ve aktif oldugunu dogrular")
    public void acilanSayfadaKisiyeAitDetailsButonununGorunurVeAktifOldugunuDogrular() {
        Assert.assertTrue(depositHistoryPage.depoHistoryDetailsButton.isDisplayed());
        Assert.assertTrue(depositHistoryPage.depoHistoryDetailsButton.isEnabled());
    }

    @And ("kisiye ait satırda Details butonuna tiklar")
    public void kisiye_ait_satırda_details_butonuna_tiklar() {
        depositHistoryPage.depoHistoryDetailsButton.click();
    }

    @And("acilan sayfada requested bilgi yazısının goruntulendigini dogrular")
    public void acilanSayfadaKisiRequestedMiktarYazısınınGoruntulendiginiDogrular() {
        Assert.assertTrue(depositHistoryPage.userRequestedText.isDisplayed());
    }

    @And("acilan sayfada Deposit Cardın goruntulendigini dogrular")
    public void acilanSayfadaDepositCardınGoruntulendiginiDogrular() {
        Assert.assertTrue(depositHistoryPage.depositCardBody.isDisplayed());

    }
    @And("ayrica Deposit Card icerisinde baslik ve degerlerinin goruntulendigini dogrular")
    public void ayricaDepositCardIcerisindeVeDegerlerininGoruntulendiginiDogrular() {
        depositHistoryPage.cardBilgiGoruntuleAssert();
    }

    @And("acilan sayfada Successful Deposit baslik ve degerinin goruntulendigini dogrular")
    public void acilanSayfadaSuccessfulDepositBaslikVeDegerininGoruntulendiginiDogrular() {
        Assert.assertTrue(depositHistoryPage.successDepositBaslik.isDisplayed());
        Assert.assertTrue(depositHistoryPage.successDepositDeger.isDisplayed());
    }

    @And("acilan sayfada Pending Deposit baslik ve degerinin goruntulendigini dogrular")
    public void acilanSayfadaPendingDepositBaslikVeDegerininGoruntulendiginiDogrular() {
        Assert.assertTrue(depositHistoryPage.pendingDepositBaslik.isDisplayed());
        Assert.assertTrue(depositHistoryPage.pendingDepositDeger.isDisplayed());
    }

    @And("acilan sayfada Rejected Deposit baslik ve degerinin goruntulendigini dogrular")
    public void acilanSayfadaRejectedDepositBaslikVeDegerininGoruntulendiginiDogrular() {
        Assert.assertTrue(depositHistoryPage.rejectedDepositBaslik.isDisplayed());
        Assert.assertTrue(depositHistoryPage.rejectedDepositDeger.isDisplayed());
    }

    @And("acilan sayfada Initiated Deposit baslik ve degerinin goruntulendigini dogrular")
    public void acilanSayfadaInitiatedDepositBaslikVeDegerininGoruntulendiginiDogrular() {
        Assert.assertTrue(depositHistoryPage.initiatedDepositBaslik.isDisplayed());
        Assert.assertTrue(depositHistoryPage.initiatedDepositDeger.isDisplayed());
    }

    @And("acilan sayfada Successful Deposit basliginin aktif oldugunu dogrular")
    public void acilanSayfadaSuccessfulDepositBasliginiAktifOldugunuDogrular() {
        Assert.assertTrue(depositHistoryPage.successDepositLink.isEnabled());
    }

    @And("Successfull Deposit basligina tiklar")
    public void pendingDepositBasliginaTiklar() {
        depositHistoryPage.successDepositLink.click();
    }

    @And("acilan sayfa basliginin Successfull Deposit oldugunu dogrular")
    public void acilanSayfaBasligininSuccessfullDepositOldugunuDogrular() {
        Assert.assertTrue(depositHistoryPage.successDepositPageTitle.isDisplayed());
    }

    @And("Successfull deposit sayfasinda tarih filtreleme ve search butonlarinin aktif oldugunu dogrular")
    public void successfullDepositSayfasindaFiltrelemeVeSearchButonlarininAktifOldugunuDogrular() {
        Assert.assertTrue(depositHistoryPage.searchBox.isEnabled()&depositHistoryPage.searchButton.isEnabled());
        Assert.assertTrue(depositHistoryPage.dateBox.isEnabled()&depositHistoryPage.dateSearchButton.isEnabled());
    }

    @Given("acilan sayfada Pending Deposit basliginin aktif oldugunu dogrular")
    public void acilan_sayfada_pending_deposit_basliginin_aktif_oldugunu_dogrular() {
     Assert.assertTrue(depositHistoryPage.pendingDepositLink.isEnabled());
    }
    @Given("Pending Deposit basligina tiklar")
    public void pending_deposit_basligina_tiklar() {
        ReusableMethods.bekle(1);
        depositHistoryPage.pendingDepositLink.click();
    }
    @Given("acilan sayfa basliginin Pending Deposit oldugunu dogrular")
    public void acilan_sayfa_basliginin_pending_deposit_oldugunu_dogrular() {
     Assert.assertTrue(depositHistoryPage.pendingDepositPageTitle.isDisplayed());
    }
    @Given("Pending deposit sayfasinda listedeki Details butonunun gorunur ve aktif oldugunu dogrular")
    public void pending_deposit_sayfasinda_listedeki_details_butonunun_gorunur_ve_aktif_oldugunu_dogrular() {
      Assert.assertTrue(depositHistoryPage.ilkPendingDetailsButton.isDisplayed());
      Assert.assertTrue(depositHistoryPage.ilkPendingDetailsButton.isEnabled());
      ReusableMethods.bekle(3);
    }

    @Given("search kutusuna {string} yazıp ara butonuna tıklar")
    public void search_kutusuna_yazıp_ara_butonuna_tıklar(String isim) {
        depositHistoryPage.searchBox.sendKeys(ConfigReader.getProperty(isim));
        depositHistoryPage.searchButton.click();
        ReusableMethods.bekle(1);
    }
    @Given("acilan islem detay sayfasında approve ve reject butonlarının gorunur ve aktif oldugunu dogrular")
    public void acilan_islem_detay_sayfasında_approve_ve_reject_butonlarının_gorunur_ve_aktif_oldugunu_dogrular() {
     Assert.assertTrue(depositHistoryPage.approveButton.isDisplayed()&depositHistoryPage.approveButton.isEnabled());
     Assert.assertTrue(depositHistoryPage.rejectButton.isDisplayed()&depositHistoryPage.rejectButton.isEnabled());
    }

    @Given("acilan islem detay sayfasında reject butonuna tiklar")
    public void acilan_islem_detay_sayfasında_reject_butonuna_tiklar() {

        depositHistoryPage.rejectButton.click();
    }
    @Given("acilan sayfada Reject Deposit Confirmation basliginin gorundugunu dogrular")
    public void acilan_sayfada_reject_deposit_confirmation_basliginin_gorundugunu_dogrular() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(depositHistoryPage.rejDepoConfirmModal));
        Assert.assertTrue(depositHistoryPage.rejDepoConfirmSayfaBaslik.isDisplayed());
    }
    @Given("Reason for Rejection kutusuna {string} girer ve submit butonuna tiklar")
    public void reason_for_rejection_kutusuna_girer_ve_submit_butonuna_tiklar(String bilgi) {
      depositHistoryPage.rejDepoMessageBox.sendKeys(ConfigReader.getProperty(bilgi));
      depositHistoryPage.rejMessageSubmitButton.click();
    }
    @Given("Deposit request rejected successfully yazisinin gorundugunu dogrular")
    public void deposit_request_rejected_successfully_yazisinin_gorundugunu_dogrular() {
        ReusableMethods.bekle(1);
      Assert.assertTrue(depositHistoryPage.rejectSuccessText.isDisplayed());
    }


    @Given("acilan islem detay sayfasında approve butonuna tiklar ve cıkan alertte yes butonuna tıklar")
    public void acilan_islem_detay_sayfasında_approve_butonuna_tiklar() {
        depositHistoryPage.approveButton.click();
        depositHistoryPage.approveAlertYesButton.click();

    }
    @Given("Deposit request approved successfully yazisinin gorundugunu dogrular")
    public void deposit_request_approved_successfully_yazisinin_gorundugunu_dogrular() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(depositHistoryPage.approveSuccessText.isDisplayed());

    }

}
