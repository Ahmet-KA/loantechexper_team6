package pages.User;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserWithdrawPage {

    public UserWithdrawPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath  = "(//a[@href='https://qa.loantechexper.com/user/withdraw'])[2]")
    public WebElement withdrawButton;
    @FindBy(xpath ="//select[@name='method_code']")
    public WebElement methodMenu;
    @FindBy(xpath ="//option[@value='9']")
    public WebElement method5;
    @FindBy(xpath ="//input[@type='number']")
    public WebElement amountBox;
    @FindBy(xpath ="//button[@type='submit']")
    public WebElement submitButton;
    @FindBy(xpath ="//h5[@class='card-title']")
    public WebElement withdrawTextBox;
    @FindBy(xpath ="//button[@class='accordion-button collapsed']")
    public WebElement withdrawAccordion;
    @FindBy(xpath ="(//span[@class='value'])[1]")
    public WebElement accordionCharge;
    @FindBy(xpath ="(//span[@class='value'])[2]")
    public WebElement accordionAfterCharge;
    @FindBy(xpath ="(//span[@class='value'])[3]")
    public WebElement accordionConversion;
    @FindBy(xpath ="(//span[@class='value'])[4]")
    public WebElement accordionStatus;
    @FindBy(xpath  = "(//a[@href='https://qa.loantechexper.com/user/withdraw'])[3]")
    public WebElement withdrawMoneyButton;
    @FindBy(xpath  = "//a[@href='https://qa.loantechexper.com/user/withdraw/history']")
    public WebElement withdrawLog;
    @FindBy(xpath  = "//h3[@class='mb-2']")
    public WebElement withdrawHistory;
}
