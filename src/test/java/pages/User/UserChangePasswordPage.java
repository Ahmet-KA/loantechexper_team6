package pages.User;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserChangePasswordPage {


    public  UserChangePasswordPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Change password sayfası
    @FindBy(xpath = "//div[@class='mb-4']")
    public WebElement changePasswordTeksti;
    //Change password sayfası
    @FindBy (xpath = "//input[@class='form-control form--control']")
    public WebElement currentPasswordAlani;
    //Change password sayfası
    @FindBy (xpath = "(//input[@class='form-control form--control'])[2]")
    public WebElement confirmPasswprdAlani;
    //Change password sayfası
    @FindBy (xpath = "//input[@class='form-control form--control  secure-password ']")
    public  WebElement passwordAlani;
    //Change password sayfası
    @FindBy(xpath = "//button[@class='btn btn--base w-100 mt-3'] ")
    public WebElement submitButonu;
    //Change Password Sayfasi
    @FindBy (xpath = "(//*[@class='iziToast-message slideIn'])[2]")
    public WebElement thePasswordConfirmationDoesnotUyarisi;

    @FindBy(xpath = "//*[text()='Change Password']")
    public WebElement changePasswordButonu;

    @FindBy (xpath = "//h3[@class='mb-2']")
    public WebElement cPSayfasiChangePasswordTexti;

    @FindBy (xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement passwordChangesSuccesfullyMesaji;



}
