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
    WebElement ContactButonu;

    @FindBy(xpath = "//h2[@class='hero__content-title text-capitalize t-text-white']")
    WebElement ContactUsSayfasi;

    @FindBy(xpath = "//*[text()='Contact Us']")
    WebElement ContactUsButonu;

    @FindBy(xpath = "//*[text()='Important Link']")
    WebElement ImportantLinkTitle;

    @FindBy(xpath = "//*[@class='t-link t-link--primary t-text-white text-capitalize']")
    WebElement ContactUsLink;

    @FindBy(xpath = "//*[@class='address']")
    WebElement AdresBilgisi;

    @FindBy(xpath = "//*[text()='info@loantechexper.com']")
    WebElement Email;

    @FindBy(xpath = "//*[text()='+12523698521']")
    WebElement Telefon;

    @FindBy(xpath = "//*[text()='105 Evergreen Ave, Brooklyn, NY 11206, USA']")
    WebElement Adres;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement İsimBilgisi;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement MailBilgisi;

    @FindBy (xpath = "//input[@name='subject']")
    public WebElement KonuBilgisi;

    @FindBy (xpath = "//*[@name='message']")
    public WebElement MesajBilgisi;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement MesajButonu;

    @FindBy(xpath = "//*[@class='text-muted fw-bold my-3']")
    WebElement MesajBildirimi;

}
