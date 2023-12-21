package stepdefinitions.User;

import io.cucumber.java.en.Given;
import pages.User.UserDashboardPage;
import pages.User.UserLoginPage;
import pages.Visitor.VisitorHomePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_024_UserDashboardStepDefinitions {

    UserDashboardPage userDashboardPage = new UserDashboardPage();
    VisitorHomePage visitorHomePage = new VisitorHomePage();
    UserLoginPage userLoginPage = new UserLoginPage();

    @Given("Anasayfada login buton tıklanır ve kayıtlı kullanıcı {string} ve {string} girilerek login olunur.")
    public void anasayfada_login_buton_tıklanır_ve_kayıtlı_kullanıcı_ve_girilerek_login_olunur(String userName, String userPassword) {

        visitorHomePage.loginButon.click();
        ReusableMethods.bekle(1);
        userLoginPage.userNameTextBox.sendKeys(ConfigReader.getProperty(userName));
        ReusableMethods.bekle(1);
        userLoginPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty(userPassword));
        ReusableMethods.bekle(1);
        userLoginPage.scrolling(userLoginPage.welcomeText);
        ReusableMethods.bekle(2);
        userLoginPage.loginButton.click();


    }
    @Given("Dashboard sayfasinda\\(Successful Deposits,Successful Withdrawals,Total Loan) başlıkları görünür olmalı.Başlıkların altında\\(Toplam tutar,Submitted,Pending,Rejected) edilen tutarlar ve kredi adetleri görüntülenebilmelidir.")
    public void dashboard_sayfasinda_successful_deposits_successful_withdrawals_total_loan_başlıkları_görünür_olmalı_başlıkların_altında_toplam_tutar_submitted_pending_rejected_edilen_tutarlar_ve_kredi_adetleri_görüntülenebilmelidir() {

        userDashboardPage.dashbordVisibility();
    }
}
