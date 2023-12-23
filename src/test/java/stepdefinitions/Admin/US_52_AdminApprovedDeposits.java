package stepdefinitions.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Admin.AdminDepositsPage;
import pages.Admin.AdminLogin;
import pages.Admin.AdminWithdrawalsPage;
import utilities.ReusableMethods;

public class US_52_AdminApprovedDeposits {
    AdminLogin adminLogin = new AdminLogin();
    AdminDepositsPage adminDepositsPage = new AdminDepositsPage();
    AdminWithdrawalsPage adminWithdrawalsPage = new AdminWithdrawalsPage();

    @Given("Dashboarddan deposits basligina tiklar")
    public void dashboarddan_deposits_basligina_tiklar() {
        adminDepositsPage.depositsButon.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminDepositsPage.adminDashboardApprovedDepositButton.isDisplayed());
    }

    @And("acilan menuden approved deposits basligina tiklar")
    public void acilanMenudenApprovedDepositsBasliginaTiklar() {
        adminDepositsPage.adminDashboardApprovedDepositButton.click();
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader1.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader2.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader3.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader4.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader5.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader6.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsHeader7.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositTable.isDisplayed());
        ReusableMethods.bekle(1);

    }
    @And("cikan sonuclardan details butonuna tiklar")
    public void cikanSonuclardanDetailsButonunaTiklar() {
        adminDepositsPage.approvedDepositsUsersDetails.click();
    }

    @And("details sayfasindaki icerigi goruntuler")
    public void detailsSayfasindakiIcerigiGoruntuler() {
        Assert.assertTrue(adminDepositsPage.approvedDepositsDetailedInformation1.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsDetailedInformation2.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsDetailedInformation3.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsDetailedInformation4.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsDetailedInformation5.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsDetailedInformation6.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsDetailedInformation7.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsDetailedInformation8.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsDetailedInformation9.isDisplayed());
        Assert.assertTrue(adminDepositsPage.approvedDepositsDetailedInformation10.isDisplayed());
        ReusableMethods.bekle(1);

    }


}
