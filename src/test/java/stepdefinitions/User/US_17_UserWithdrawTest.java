package stepdefinitions.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Admin.AdminWithdrawalsPage;
import pages.User.UserLoginPage;
import pages.User.UserWithdrawPage;
import utilities.ReusableMethods;

public class US_17_UserWithdrawTest {
    AdminWithdrawalsPage adminWithdrawalsPage = new AdminWithdrawalsPage();
    UserLoginPage userLoginPage = new UserLoginPage();
    UserWithdrawPage userWithdrawPage = new UserWithdrawPage();

    @Given("dashboarddaki withdraw butonunu gorur")
    public void dashboarddaki_withdraw_butonunu_gorur() {
        ReusableMethods.clickWithJS(userLoginPage.allowCookies);
        ReusableMethods.bekle(1);
        userWithdrawPage.withdrawButton.isDisplayed();
    }

    @And("dashboarddaki withdraw butonuna tiklar")
    public void dashboarddakiWithdrawButonunaTiklar() {
        ReusableMethods.clickWithJS(userLoginPage.allowCookies);
        ReusableMethods.bekle(1);
        userWithdrawPage.withdrawButton.click();
    }




    @And("method kismindan select gateway'e tiklar ve {string} i secer")
    public void methodKismindanSelectGatewayETiklarVeISecer(String arg0) {
        ReusableMethods.bekle(1);
        userWithdrawPage.methodMenu.click();
        userWithdrawPage.method5.click();
    }

    @And("amount box'a {string} arasinda bir deger girer")
    public void amountBoxAArasindaBirDegerGirer(String arg0) {
        userWithdrawPage.amountBox.sendKeys("500");
    }

    @Then("submit butonuna basar")
    public void submitButonunaBasar() {
        userWithdrawPage.submitButton.click();
        Assert.assertTrue(userWithdrawPage.withdrawTextBox.isDisplayed());
    }

    @Then("tekrar submit butonuna basar")
    public void tekrarSubmitButonunaBasar() {
        userWithdrawPage.submitButton.click();
        Assert.assertTrue(adminWithdrawalsPage.confirmationAlertBox.isDisplayed());
    }

    @And("withdraw log a tiklar ve accordion table i gorur")
    public void withdrawLogATiklarVeAccordionTableIGorur() {
        ReusableMethods.bekle(1);
        userWithdrawPage.withdrawLog.click();
        Assert.assertTrue(userWithdrawPage.withdrawAccordion.isDisplayed());
    }

    @And("accordion table a tiklar ve detaylari gorur")
    public void accordionTableATiklarVeDetaylariGorur() {
        userWithdrawPage.withdrawAccordion.click();
        Assert.assertTrue(userWithdrawPage.accordionCharge.isDisplayed());
        Assert.assertTrue(userWithdrawPage.accordionAfterCharge.isDisplayed());
        Assert.assertTrue(userWithdrawPage.accordionConversion.isDisplayed());
        Assert.assertTrue(userWithdrawPage.accordionStatus.isDisplayed());
    }

    @And("withdraw log a tiklar")
    public void withdrawLogATiklar() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(userWithdrawPage.withdrawLog.isDisplayed());
        userWithdrawPage.withdrawLog.click();
    }

    @And("withdraw money e tiklar")
    public void withdrawMoneyETiklar() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(userWithdrawPage.withdrawMoneyButton.isDisplayed());
        userWithdrawPage.withdrawMoneyButton.click();

    }
}
