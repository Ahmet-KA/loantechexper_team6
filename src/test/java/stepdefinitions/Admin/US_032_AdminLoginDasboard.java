package stepdefinitions.Admin;

import io.cucumber.java.en.Given;
import pages.Admin.AdminLogin;
import utilities.ConfigReader;
import utilities.Driver;

public class US_032_AdminLoginDasboard {
    AdminLogin adminLogin=new AdminLogin();

    @Given("Admin kullanıcı olarak {string} adresine gidilir.")
    public void admin_kullanıcı_olarak_adresine_gidilir(String adminUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(adminUrl));

    }

    @Given("Sayfada username,password checkbox'ları ve login butonu görüntülenir")
    public void sayfada_username_password_checkbox_ları_ve_login_butonu_görüntülenir() {
        adminLogin.usernameTextBox.isDisplayed();
        adminLogin.passwordTextBox.isDisplayed();
        adminLogin.adminLoginButton.isDisplayed();

    }
    @Given("Kayıtlı e-mail ve password girilerek login'e tıklanır")
    public void kayıtlı_e_mail_ve_password_girilerek_login_e_tıklanır() {
        adminLogin.usernameTextBox.sendKeys(ConfigReader.getProperty("adminracar"));
        adminLogin.passwordTextBox.sendKeys(ConfigReader.getProperty("adminracarpassword"));
        adminLogin.adminLoginButton.click();

    }
    @Given("Admin dashboard sayfasına gidildiği doğrulanır")
    public void admin_dashboard_sayfasına_gidildiği_doğrulanır() {
        adminLogin.adminDashoardyazisi.isDisplayed();

    }
    @Given("Sayfa kapatılır.")
    public void sayfa_kapatılır() {
        Driver.closeDriver();
    }

}
