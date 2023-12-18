package stepdefinitions.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import pages.Admin.AdminLogin;
import pages.Admin.AdminWithdrawalsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_38_AdminWithdrawalsPageStepdefinitions {

    AdminWithdrawalsPage adminWithdrawalsPage = new AdminWithdrawalsPage();
    AdminLogin loginpage=new AdminLogin();


    @Given("ilgili {string} e gider")
    public void ilgili_e_gider(String adminurl) {
        Driver.getDriver().get(ConfigReader.getProperty(adminurl));

    }

    @Given("gecerli {string} ve {string} ile sisteme giris yapar")
    public void gecerli_ve_ile_sisteme_giris_yapar(String username, String password) {


        loginpage.adminLoginGirisYap(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));

    }

    @Then("sol tarafta bulunan Withdrawals menusunun goruntulendigini dogrular")
    public void dashboard_altında_withdrawals_menusunun_goruntulendigini_dogrular() {

        Assert.assertTrue(adminWithdrawalsPage.witdrawalsDropdown.isDisplayed());

    }

    @Then("sol tarafta bulunan Withdrawals menusune tıklar")
    public void dashboard_altında_withdrawals_menusune_tıklar() {

        adminWithdrawalsPage.witdrawalsDropdown.click();
    }

    @And("Withdrawals menusu altında Withdrawal Methods baslıgının goruntulendigini  dogrular")
    public void acılanMenudeWithdrawalMethodsBaslıgınınGoruntulendiginiDogrular() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminWithdrawalsPage.withdrawMethodMenu.isDisplayed());
    }
    @And("Withdrawals menusu altında Pending Withdrawals baslıgının goruntulendigini  dogrular")
    public void acılanMenudePendingWithdrawalsBaslıgınınGoruntulendiginiDogrular() {
        Assert.assertTrue(adminWithdrawalsPage.pendingWithdrawMenu.isDisplayed());

    }

    @And("Withdrawals menusu altında Rejected Withdrawals baslıgının goruntulendigini  dogrular")
    public void acılanMenudeRejectedWithdrawalsBaslıgınınGoruntulendiginiDogrular() {
        Assert.assertTrue(adminWithdrawalsPage.rejectedWithdrawMenu.isDisplayed());
    }
    @And("Withdrawals menusu altında Approved Withdrawals baslıgının goruntulendigini  dogrular")
    public void acılanMenudeApprovedWithdrawalsBaslıgınınGoruntulendiginiDogrular() {

        Assert.assertTrue(adminWithdrawalsPage.approvedWithdrawMenu.isDisplayed());

    }

    @And("Withdrawals menusu altında All Withdrawals baslıgının goruntulendigini  dogrular")
    public void acılanMenudeAllWithdrawalsBaslıgınınGoruntulendiginiDogrular() {
        Assert.assertTrue(adminWithdrawalsPage.allWithdrawsMenu.isDisplayed());
    }

    @And("acılan menude Withdrawal Methods baslıgına tıklayarak ilgili sayfaya gidildigini dogrular")
    public void acılanMenudeWithdrawalMethodsBaslıgınaTıklayarakIlgiliSayfayaGidildiginiDogrular() {
        adminWithdrawalsPage.withdrawMethodMenu.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminWithdrawalsPage.withdrawMethodPageTitle.isDisplayed());
    }

    @Then("geri gelir Pending Withdrawals baslıgına tıklayarak ilgili sayfaya gidildigini dogrular")
    public void acılan_menude_pending_withdrawals_baslıgına_tıklayarak_ilgili_sayfaya_gidildigini_dogrular() {
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        adminWithdrawalsPage.pendingWithdrawMenu.click();
        Assert.assertTrue(adminWithdrawalsPage.pendingwithdrawPageTitle.isDisplayed());

    }
    @Then("geri gelir Approved Withdrawals baslıgına tıklayarak ilgili sayfaya gidildigini dogrular")
    public void acılan_menude_approved_withdrawals_baslıgına_tıklayarak_ilgili_sayfaya_gidildigini_dogrular() {
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        adminWithdrawalsPage.approvedWithdrawMenu.click();
        Assert.assertTrue(adminWithdrawalsPage.approveWithdrawPageTitle.isDisplayed());

    }
    @Then("geri gelir Rejected Withdrawals baslıgına tıklayarak ilgili sayfaya gidildigini dogrular")
    public void acılan_menude_rejected_withdrawals_baslıgına_tıklayarak_ilgili_sayfaya_gidildigini_dogrular() {
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        adminWithdrawalsPage.rejectedWithdrawMenu.click();
        Assert.assertTrue(adminWithdrawalsPage.rejectedWithdrawPageTitle.isDisplayed());

    }
    @Then("geri gelir All Withdrawals baslıgına tıklayarak ilgili sayfaya gidildigini dogrular")
    public void acılan_menude_all_withdrawals_baslıgına_tıklayarak_ilgili_sayfaya_gidildigini_dogrular() {
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);
        adminWithdrawalsPage.allWithdrawsMenu.click();
        Assert.assertTrue(adminWithdrawalsPage.allWithdrawPageTitle.isDisplayed());

    }

    @Then("sayfayı kapatır")
    public void sayfayı_kapatır() {
        Driver.closeDriver();

    }


}
