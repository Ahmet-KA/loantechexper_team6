package pages.Visitor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorContactPage {
    public VisitorContactPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Contact']")
    public WebElement ContactButonu;

    @FindBy(xpath = "//h2[@class='hero__content-title text-capitalize t-text-white']")
    public WebElement ContactUsSayfasi;

    @FindBy(xpath = "//*[text()='Contact Us']")
    public WebElement ContactUsButonu;

    @FindBy(xpath = "//*[text()='Important Link']")
    public WebElement ImportantLinkTitle;

    @FindBy(xpath = "(//a[@class=\"t-link t-link--primary t-text-white text-capitalize\"])[3]")
    public WebElement ContactUsLink;

    @FindBy(xpath = "(//div[@class=\"ms-5\"])[1]")
    public WebElement AdresBilgisi;

    @FindBy(xpath = "//*[text()='info@loantechexper.com']")
    public WebElement Email;

    @FindBy(xpath = "//*[text()='+12523698521']")
    public WebElement Telefon;

    @FindBy(xpath = "//*[text()='105 Evergreen Ave, Brooklyn, NY 11206, USA']")
    public WebElement Adres;

    @FindBy (xpath = "//*[@name='name']")
    public WebElement NameBox;

    @FindBy (xpath = "(//*[@name='email'])[1]")
    public WebElement EmailBox;

    @FindBy (xpath = "//*[@name='subject']")
    public WebElement SubjectBox;

    @FindBy (xpath = "//*[@name='message']")
    public WebElement MessageBox;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement IsimBilgisi;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement MailBilgisi;

    @FindBy (xpath = "//input[@name='subject']")
    public WebElement KonuBilgisi;

    @FindBy (xpath = "//*[@name='message']")
    public WebElement MesajBilgisi;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement MesajButonu;

    @FindBy(xpath = "//*[@class='text-muted fw-bold my-3']")
    public WebElement MesajBildirimi;

    @FindBy (xpath = "(//h5)[1]")
    public WebElement MesajOnayElementi;

}
