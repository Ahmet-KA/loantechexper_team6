package pages.User;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class UserDashboardPage {

    public UserDashboardPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Change Password']")
    WebElement changePasswordButonu;

    @FindBy(xpath = "//*[@id=\"header\"]/div/nav/div[2]/a")
    public WebElement dashboardLoginElement;

    @FindBy(xpath = "//h5[text()='Successful Deposits']")
    public WebElement successfulDepositsText;

    @FindBy(xpath = "//h5[text()='Successful Withdrawals']")
    public WebElement successfulWithdrawalsText;

    @FindBy(xpath = "//h5[text()='Total Loan']")
    public  WebElement totalLoanText;

    @FindBy(xpath = "//*[@class='text--secondary my-4'][1]")
    public  WebElement toplamTutar;

    @FindBy(xpath = "//*[@class='col-4'][1]")
    public WebElement submitedTotal;

    public void dashbordVisibility(){

        Assert.assertTrue(successfulDepositsText.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(successfulWithdrawalsText.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(totalLoanText.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(toplamTutar.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(submitedTotal.isDisplayed());
        ReusableMethods.bekle(1);
    }
}
