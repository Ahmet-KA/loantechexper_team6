package stepdefinitions.Admin;

import io.cucumber.java.en.Given;
import pages.Admin.AdminDepositsPage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.bekle;

public class US_031_AdminDepositsTransactionsSteps {
    AdminDepositsPage adminDepositsPage=new AdminDepositsPage();
    AdminDepositsPage homePage= new AdminDepositsPage();

    @Given("Deposits menu basligini goruntuler")
    public void deposits_menu_basligini_goruntuler() {

        assertTrue(adminDepositsPage.depositsButon.isDisplayed());

    }
    @Given("Deposits menu basligi altindaki sayfa basliklari goruntuler")
    public void deposits_menu_basligi_altindaki_sayfa_basliklari_goruntuler() {
        adminDepositsPage.depositsButon.click();
        bekle(2);
        assertTrue(adminDepositsPage.pendingDepositBaslik.isDisplayed());
        assertTrue(adminDepositsPage.approvedDepositsBaslik.isDisplayed());
        assertTrue(adminDepositsPage.successDepositBaslik.isDisplayed());
        assertTrue(adminDepositsPage.rejectedDepositBaslik.isDisplayed());
        assertTrue(adminDepositsPage.initiatedDepositBaslik.isDisplayed());
        assertTrue(adminDepositsPage.allDepositsBaslik.isDisplayed());

        Driver.closeDriver();
        bekle(1);

    }
    @Given("Deposits menu basligi altindaki sayfalara yonlendirir")
    public void deposits_menu_basligi_altindaki_sayfalara_yonlendirir() {
        adminDepositsPage.depositsButon.click();
        bekle(1);

    }
    @Given("Deposits menu basligini tiklar")
    public void deposits_menu_basligini_tiklar() {
        adminDepositsPage.depositsButon.click();
        bekle(1);
    }

}
