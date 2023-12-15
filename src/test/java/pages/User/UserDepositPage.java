package pages.User;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDepositPage {


    public UserDepositPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    // DEPOsIT MENU ELEMENTLERI -USER---Murat
    @FindBy(xpath = "//div[3]//div[1]/ul/li[4]/a")
    public WebElement dashboardDepositMenuButtonElement;
    @FindBy(xpath = "//h3")
    public WebElement depositMethodsTextElement;
    @FindBy(xpath = "//span/a")
    public WebElement depositHistoryButtonElement;
    @FindBy(xpath = "//div/h3")
    public WebElement depositHistoryTextElement;
    @FindBy(xpath = "//*[@id=\"transactionAccordion\"]")
    public WebElement accordionTableElement;
    @FindBy(xpath = "//div/span/a")
    public WebElement depositNowButtonElement;
    @FindBy(xpath = "//select[@name=\"gateway\"]")
    public WebElement selectGatewayBoxElement;
    @FindBy(xpath = "//option[text()=\"Manual\"]")
    public WebElement optionManuelElement;
    @FindBy(xpath = "//input[@name=\"amount\"]")
    public WebElement amountBoxElement;
    @FindBy(xpath = "//form//ul/li[1]")
    public WebElement amountBoxLimitElement;
    @FindBy(xpath = "//form//ul/li[2]")
    public WebElement amountBoxChargeElement;
    @FindBy(xpath = "//form//ul/li[3]")
    public WebElement amountBoxPayableElement;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement submitButtonElement;
    @FindBy(xpath = "//p[@class=\"text-center mt-2\"]")
    public WebElement successfulPaymentTextElement;
    @FindBy(xpath = "//button[text()=\"Pay Now\"]")
    public WebElement payNowButtonElement;
}
