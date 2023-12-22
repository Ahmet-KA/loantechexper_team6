package stepdefinitions.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Admin.AdminDepositsPage;
import pages.Admin.AdminLogin;
import pages.Admin.AdminManageUsersPage;
import pages.Admin.AdminWithdrawalsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_40_AdminWithdrawTest {
    AdminLogin adminLogin = new AdminLogin();
    AdminDepositsPage adminDepositsPage = new AdminDepositsPage();
    AdminWithdrawalsPage adminWithdrawalsPage = new AdminWithdrawalsPage();
    AdminManageUsersPage adminManageUsersPage = new AdminManageUsersPage();

    @Given("Kullanici loantechAdmin sayfasina gider")
    public void kullanici_loantech_admin_sayfasina_gider() {
        ReusableMethods.bekle(1);
        Driver.getDriver().get(ConfigReader.getProperty("urladmin"));
    }
    @And("yonetici bilgileriyle giris yapar")
    public void yoneticiBilgileriyleGirisYapar() {
        adminLogin.adminLoginGirisYap("mertkan","123123123");
    }
    @Given("Dashboarddan manage users basligina tiklar")
    public void dashboarddan_manage_users_basligina_tiklar() {
        adminManageUsersPage.manageUserDropdownMenu.click();

    }


    @And("acilan menuden active users basligina tiklar")
    public void acilanMenudenActiveUsersBasliginaTiklar() {
        adminManageUsersPage.activeUsersMenu.click();
    }

    @And("search boxa aramak istedigi kullanici ismini girer")
    public void searchBoxaAramakIstedigiKullaniciIsminiGirer() {
        adminWithdrawalsPage.activeUsersSearchTextBox.sendKeys("mertkan");
        adminWithdrawalsPage.activeUsersSearchButton.click();
    }

    @And("cikan sonuclardan detailse tiklar")
    public void cikanSonuclardanDetailseTiklar() {
        adminWithdrawalsPage.activeUsersDetalis.click();

    }

    @And("details sayfasindaki view withdraw all butonuna basar")
    public void detailsSayfasindakiViewWithdrawAllButonunaBasar() {
        adminWithdrawalsPage.withdrawViewAll.click();
        ReusableMethods.bekle(1);
    }

    @And("liste ve liste basliklarini goruntuler")
    public void listeVeListeBasliklariniGoruntuler() {
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader1.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader2.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader3.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader4.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader5.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader6.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader7.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawTable.isDisplayed());


    }

    @And("Approved,Rejected ve Pending withdrawals butonlarini sirasiyla tiklar")
    public void approvedRejectedVePendingWithdrawalsButonlariniSirasiylaTiklar() {
        adminWithdrawalsPage.approvedWithdrawals.click();
        Driver.getDriver().navigate().back();
        adminWithdrawalsPage.pendingWithdrawals.click();
        Driver.getDriver().navigate().back();
        adminWithdrawalsPage.rejectedWithdrawals.click();
        Driver.getDriver().navigate().back();
    }

    @And("Approved withdrawals sayfasina gider")
    public void approvedWithdrawalsSayfasinaGider() {
        adminWithdrawalsPage.approvedWithdrawals.click();
    }

    @And("search boxa gecmisini goruntulemek istedigi kullaniciyi girer")
    public void searchBoxaGecmisiniGoruntulemekIstedigiKullaniciyiGirer() {
        adminWithdrawalsPage.activeUsersSearchTextBox.sendKeys("mertkan");
        adminWithdrawalsPage.activeUsersSearchButton.click();
    }

    @And("details butonuna tiklar ve detay sayfasini acar")
    public void detailsButonunaTiklarVeDetaySayfasiniAcar() {
        adminWithdrawalsPage.withdrawalsUsersDetails.click();
    }

    @And("kullanicinin islem detaylarini goruntuler")
    public void kullanicininIslemDetaylariniGoruntuler() {
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation1.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation2.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation3.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation4.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation5.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation6.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation7.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation8.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation9.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation10.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation11.isDisplayed());
        ReusableMethods.bekle(1);



    }

    @And("Pending withdrawals sayfasina gider")
    public void pendingWithdrawalsSayfasinaGider() {
        adminWithdrawalsPage.pendingWithdrawals.click();

    }

    @And("aramak istedigi kullanicinin ismini yazar ve islemlerini goruntuler")
    public void aramakIstedigiKullanicininIsminiYazarVeIslemleriniGoruntuler() {
        adminWithdrawalsPage.activeUsersSearchTextBox.sendKeys("mertkan");
        adminWithdrawalsPage.activeUsersSearchButton.click();
        Assert.assertTrue(adminWithdrawalsPage.statusPendingElementi.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawalsUsersDetails.isDisplayed());

    }

    @And("Detay sayfasindaki butonlari ve islem detaylarini goruntuler")
    public void detaySayfasindakiButonlariVeIslemDetaylariniGoruntuler() {
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation1.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation2.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation3.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation4.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation5.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation6.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation7.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation8.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation9.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.withdrawDetailedInformation10.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.approvePendingWithdrawButton.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.rejecetPendingWithdrawButton.isDisplayed());
        ReusableMethods.bekle(1);

    }

    @And("Reject butonuna tiklar")
    public void rejectButonunaTiklar() {
        adminWithdrawalsPage.rejecetPendingWithdrawButton.click();
    }

    @And("Gerekli bilgileri girer")
    public void gerekliBilgileriGirer() {
        adminWithdrawalsPage.reasonOfRejectionTextBox.sendKeys("too many request in a short time");

    }

    @And("Reject submit butonuna tiklar")
    public void rejectsubmitButonunaTiklar() {
        adminWithdrawalsPage.reasonSubmitButton.click();
    }

    @And("Withdrawal Rejected Successfully yazisini goruntuler")
    public void withdrawalRejectedSuccessfullyYazisiniGoruntuler() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminWithdrawalsPage.confirmationAlertBox.isDisplayed());

    }

    @And("approve butonuna tiklar")
    public void approveButonunaTiklar() {
        String transactionNumberTextText = adminWithdrawalsPage.transactionNumberText.getText();
        ReusableMethods.bekle(1);
        adminWithdrawalsPage.approvePendingWithdrawButton.click();
        adminWithdrawalsPage.reasonOfApproveTextBox.sendKeys(transactionNumberTextText);
        adminWithdrawalsPage.reasonApproveSubmitButton.click();
    }

    @And("Withdrawal Aprroved Successfully yazisini goruntuler")
    public void withdrawalAprrovedSuccessfullyYazisiniGoruntuler() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminWithdrawalsPage.confirmationAlertBox.isDisplayed());
    }

    @And("Rejected withdrawals sayfasina gider")
    public void rejectedWithdrawalsSayfasinaGider() {
        adminWithdrawalsPage.rejectedWithdrawals.click();
    }

    @And("aratilan kullanicinin bilgilerini goruntuler")
    public void aratilanKullanicininBilgileriniGoruntuler() {
        adminWithdrawalsPage.activeUsersSearchTextBox.sendKeys("mertkan");
        adminWithdrawalsPage.activeUsersSearchButton.click();
        Assert.assertTrue(adminWithdrawalsPage.withdrawalsUsersDetails.isDisplayed());
        Assert.assertTrue(adminWithdrawalsPage.rejectedStatusTextBox.isDisplayed());
        ReusableMethods.bekle(1);

    }


}
