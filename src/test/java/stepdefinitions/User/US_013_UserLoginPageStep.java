package stepdefinitions.User;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.User.UserLoginPage;
import pages.Visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_013_UserLoginPageStep {

    VisitorHomePage visitorHomePage = new VisitorHomePage();
    UserLoginPage userLoginPage = new UserLoginPage();
    @Given("Kayitli kullanici olarak {string} adresine gidilir.")
    public void kayitli_kullanici_olarak_adresine_gidilir(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Given("Anasayfada login button gorunurlugu ve aktifligi dogrulanır.")
    public void anasayfada_login_button_gorunurlugu_ve_aktifligi_dogrulanır() {
       Assert.assertTrue(visitorHomePage.loginButon.isDisplayed());
    }

    @Given("Login button tiklanir ve login sayfasina yonlendirildigi dogrulanır.")
    public void login_button_tiklanir_ve_login_sayfasina_yonlendirildigi_dogrulanır() {

        visitorHomePage.loginButon.click();
        String expectedData = ConfigReader.getProperty("urlLogin");
        String actualData = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedData,actualData);
    }

    @Given("Login button tiklanir ve login formun gorunurlugu dogrulanir.")
    public void login_button_tiklanir_ve_login_formun_gorunurlugu_dogrulanir() {
        visitorHomePage.loginButon.click();
        Assert.assertTrue(userLoginPage.loginForm.isDisplayed());
    }

    @Given("Browser kapatilir.")
    public void browser_kapatilir() {
        Driver.quitDriver();
    }

    @Given("Login button tiklanir ve Login form üzerinde username,password textbox,remember me checkbox,forgotpassword linki ve login button gorunur ve aktif olmalidir.")
    public void login_button_tiklanir_ve_login_form_üzerinde_username_password_textbox_remember_me_checkbox_forgotpassword_linki_ve_login_button_gorunur_ve_aktif_olmalidir() {
        userLoginPage.loginPageVisibilityControl();
    }

    @Given("Login buton tıklanır ve Giriş Formunda kullanıcı adı ve şifre textbox ların erişilebilir oldugu doğrulanır")
    public void login_buton_tıklanır_ve_giriş_formunda_kullanıcı_adı_ve_şifre_textbox_ların_erişilebilir_oldugu_doğrulanır() {

       userLoginPage.loginPageUserNamePasswordİsEnabled();
    }

    @Given("Login button tıklanır ve Login form üzerinde bulunan username ve password alanlarına kayıtlı {string} ve {string} girilir.")
    public void login_button_tıklanır_ve_login_form_üzerinde_bulunan_username_ve_password_alanlarına_kayıtlı_ve_girilir(String userName, String password) {

        visitorHomePage.loginButon.click();
        userLoginPage.userNameTextBox.sendKeys(ConfigReader.getProperty("userName"));
        userLoginPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
        ReusableMethods.bekle(1);

    }
    @Given("Remember me checkboxın seçilebilir oldugu doğrulanır ve click yapılır.")
    public void remember_me_checkboxın_seçilebilir_oldugu_doğrulanır_ve_click_yapılır() {

        Assert.assertTrue(userLoginPage.rememberMeCheckbox.isEnabled());
        userLoginPage.scrolling(userLoginPage.welcomeText);
        ReusableMethods.bekle(1);
        userLoginPage.rememberMeCheckbox.click();
    }
    @Given("Login buton tıklanarak giriş yapılır.")
    public void login_buton_tıklanarak_giriş_yapılır() {

        userLoginPage.loginButton.click();
    }
    @Given("Açılan sayfada logout tıklanır ve sistemden çıkış yapılır.")
    public void açılan_sayfada_logout_tıklanır_ve_sistemden_çıkış_yapılır() {

        userLoginPage.userLogout.click();
        userLoginPage.scrolling(userLoginPage.welcomeText);
        ReusableMethods.bekle(3);
    }
    @Given("Açılan login sayfasında kullanıcı adı ve şifre alanlarının dolu olarak geldiği ve remember me checkboxın seçili oldugu doğrulanır.")
    public void açılan_login_sayfasında_kullanıcı_adı_ve_şifre_alanlarının_dolu_olarak_geldiği_ve_remember_me_checkboxın_seçili_oldugu_doğrulanır() {

        String userNameExpected = ConfigReader.getProperty("userName");
        String userNameActual = userLoginPage.userNameTextBox.getText();

        Assert.assertEquals(userNameExpected,userNameActual);
    }

    @Given("Anasayfada login button tıklanır")
    public void anasayfada_login_button_tıklanır() {

        visitorHomePage.loginButon.click();
    }
    @Given("Açılan login sayfasında kayıtlı {string} ve {string} girilir.")
    public void açılan_login_sayfasında_kayıtlı_ve_girilir(String string, String string2) {

        userLoginPage.userNameTextBox.sendKeys(ConfigReader.getProperty("userName"));
        userLoginPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
    }
    @Given("Login sayfasındaki login buton tıklanır.")
    public void login_sayfasındaki_login_buton_tıklanır() {

        userLoginPage.scrolling(userLoginPage.welcomeText);
        ReusableMethods.bekle(1);
        userLoginPage.loginButton.click();
    }
    @Given("User dashboard sayfasına yönlendirildiği doğrulanır.")
    public void user_dashboard_sayfasına_yönlendirildiği_doğrulanır() {

        String expectedData = userLoginPage.userDashboard;
        String actualData = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedData,actualData);
    }

    @Given("Açılan login sayfasında kayıtlı olmayan {string} ve {string} girilir.")
    public void açılan_login_sayfasında_kayıtlı_olmayan_ve_girilir(String string, String string2) {

        userLoginPage.userNameTextBox.sendKeys(ConfigReader.getProperty("url"));
        userLoginPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty("userPassword"));
    }

    @Given("These credentials do not match our records. uyarısının alındıgı doğrulanır")
    public void these_credentials_do_not_match_our_records_uyarısının_alındıgı_doğrulanır() {

        Assert.assertTrue(userLoginPage.hataliLoginGirişUyarisi.isDisplayed());
    }

    @Given("Login form üzerinde bulunan Forgot  password linke tıklanır")
    public void login_form_üzerinde_bulunan_forgot_password_linke_tıklanır() {

        userLoginPage.scrolling(userLoginPage.welcomeText);
        ReusableMethods.bekle(1);
        userLoginPage.forgotPassword.click();
        ReusableMethods.bekle(1);
    }
    @Given("Email doğrulama sayfasına yönlendirildiği doğrulanır")
    public void email_doğrulama_sayfasına_yönlendirildiği_doğrulanır() {

        Assert.assertTrue(userLoginPage.accountRecoveryText.isDisplayed());
    }

    @Given("Email doğrulama sayfasında email textboxın görünür oldugu doğrulanır.")
    public void email_doğrulama_sayfasında_email_textboxın_görünür_oldugu_doğrulanır() {

        Assert.assertTrue(userLoginPage.accountRecoveryText.isDisplayed());
    }

    @Given("Yönlendirilen email doğrulama sayfasında İlgili alana Email girişi yapıılır ve submit butona tıklanır")
    public void yönlendirilen_email_doğrulama_sayfasında_ilgili_alana_email_girişi_yapıılır_ve_submit_butona_tıklanır() {

        userLoginPage.scrolling(userLoginPage.allowCookies);
        ReusableMethods.bekle(2);
        userLoginPage.allowCookies.click();
        userLoginPage.scrolling(userLoginPage.accountRecoveryText);
        userLoginPage.accountRecoveryEmailTextbox.sendKeys(userLoginPage.email);
        userLoginPage.accountRecoverySubmitButton.click();
        ReusableMethods.bekle(1);
    }
    @Given("Parola sıfırlama e-postası başarıyla gönderildi uyarısının alındıgı doğrulanır")
    public void parola_sıfırlama_e_postası_başarıyla_gönderildi_uyarısının_alındıgı_doğrulanır() {

        Assert.assertTrue(userLoginPage.passwordResetMessage.isDisplayed());
    }







}
