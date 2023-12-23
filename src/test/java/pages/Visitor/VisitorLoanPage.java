package pages.Visitor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorLoanPage {

    public VisitorLoanPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static String unExpectedUrl = "https://qa.loantechexper.com/loan";

    //BASIC LOAN ELEMENTLERİ -VISITOR  ---Murat
    @FindBy(xpath = "//button[@id=\"pills-basic-loan-tab\"]")
    public  WebElement basicLoanButtonElement;
    @FindBy(xpath = "//*[@id=\"pills-basic-loan\"]/div/div[2]/div/div[2]/button")
    public  WebElement basicLoanApplyNowButtonElement;
    @FindBy(xpath = "(//ul[@class=\"plan-feature-list\"])[7]")
    public  WebElement basicLoanPlanCardBodyElement;
    @FindBy(xpath = "//button[@aria-label=\"Close\"]")
    public  WebElement notLoggedCloseElement; //you are not looed in! sayfasındaki close
    @FindBy(xpath = "//i[@aria-hidden=\"true\"]")
    public  WebElement applyNowAktiveXElement; //you are not looed in! sayfasındaki X

    @FindBy(xpath = "(//span[text()=\"Per Installment\"])[5]")
    public  WebElement installmentElement;




















    @FindBy (xpath = "//*[@id=\"pills-standart-loan-tab\"]")
    public WebElement standartLoanButton;

    @FindBy (xpath = "//*[@id=\"pills-basic-loan-tab\"]")
    public WebElement basicLoanButton;

    @FindBy (xpath = "//*[@id=\"pills-car-loan-2-tab\"]")
    public WebElement carLoanButton;

    @FindBy (xpath = "//*[@id=\"pills-basic-loan\"]/div/div[4]/div/div[1]/div[1]/div[1]/h4")
    public WebElement basicLoanText;

    @FindBy (xpath = "//*[@id=\"pills-basic-loan\"]/div/div[5]/div/div[1]/div[1]/div[1]/h4")
    public WebElement carLoanText;

    @FindBy (xpath = "//*[@id=\"pills-basic-loan\"]/div/div[6]/div/div[1]/div[1]/div[1]/h4")
    public WebElement testLoanText;

    @FindBy (xpath = "//*[@id=\"pills-basic-loan\"]/div/div[4]/div/div[2]/button")
    public WebElement applyNowButton;

    @FindBy (xpath = "//*[@id=\"exampleModalLabel\"]")
    public WebElement applyForText;

    @FindBy (xpath = "//*[@id=\"loanModal\"]/div/div/form/div[2]/div/div/input")
    public WebElement amountTextbox;

    @FindBy (xpath = "//*[@id=\"loanModal\"]/div/div/form/div[2]/button")
    public WebElement confirmButton;







}
