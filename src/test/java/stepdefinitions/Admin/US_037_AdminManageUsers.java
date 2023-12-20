package stepdefinitions.Admin;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Admin.AdminLogin;
import pages.Admin.AdminManageUsersPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_037_AdminManageUsers {

    AdminLogin adminLogin = new AdminLogin();
    AdminManageUsersPage adminManageUsersPage = new AdminManageUsersPage();

    @Given("Admin kullanıcı olarak qa.loantechexper.com\\/admin adresine gidilir.")
    public void admin_kullanıcı_olarak_qa_loantechexper_com_admin_adresine_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("urlAdmin"));
    }

    @Given("Açılan admin login sayfasında admin {string} ve {string} girilir ve login button tıklanır.")
    public void açılan_admin_login_sayfasında_admin_ve_girilir_ve_login_button_tıklanır(String string, String string2) {

        adminLogin.adminLoginGirisYap(ConfigReader.getProperty("adminsmy"),ConfigReader.getProperty("adminsmypsswrd"));
    }
    @Given("Açılan dashboard sayfasında soldaki menüden manage users'a tıklanır ve altında Active users linki görüntülentiği dogrulanir.")
    public void açılan_dashboard_sayfasında_soldaki_menüden_manage_users_a_tıklanır_ve_altında_active_users_linki_görüntülentiği_dogrulanir() {

        adminManageUsersPage.manageUserDropdownMenu.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminManageUsersPage.activeUsersMenu.isDisplayed());
    }
}
