package pages.Visitor;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Set;

public class VisitorHomePage {

    public VisitorHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn--base btn--xl w-100 policy']")
    public WebElement allowCookies;

    @FindBy(xpath = "//*[@class='hero__content-title text-capitalize t-text-white']")
    public WebElement getStartedButton;

    @FindBy (xpath = "//h4[text()='About Loantech']")
    public WebElement aboutLoantechFooter;

    @FindBy (xpath = "//*[@class='fab fa-facebook']")
    public WebElement facebookIcon;

    @FindBy (xpath = "//*[@class='fab fa-twitter']")
    public WebElement twitterIcon;

    @FindBy (xpath = "//*[@class='fab fa-instagram']")
    public WebElement instagramIcon;

    @FindBy (xpath = "//*[@class='fab fa-youtube']")
    public WebElement youtubeIcon;

    @FindBy (xpath = "//*[@class='fab fa-linkedin']")
    public WebElement linkedInIcon;

    //HOMEPAGE ELEMENTLERİ -VISITOR  ---Murat
    @FindBy(xpath = "//a[text()=\"Plans\"]")
    public WebElement homePagePlansMenuElementi;
    @FindBy(xpath = "//a[text()=\"Allow\"]")
    public WebElement cookiesAllowElementi;
    @FindBy(xpath = "//a[contains(text(), 'Loan Plans')]")
    public WebElement footerLoanPlansLinkElementi;
    @FindBy(xpath = "//p[@class=\"mb-0 t-text-white text-center text-capitalize\"]")
    public WebElement footerCopyRightElement;









    @FindBy (xpath = "(//*[@class='vf-info-list__item'])[1]")
    public WebElement emailButon;
    @FindBy (xpath = "(//*[@class='vf-info-list__item'])[2]")
    public WebElement numberButon;
    @FindBy (xpath = "(//*[@class='vf-info-list__item'])[3]")
    public WebElement adressButon;
    @FindBy (xpath = "//*[@class='img-fluid logo__is']")
    public WebElement siteLogo;
    @FindBy (xpath = "//a[text()='Home']")
    public WebElement homeButon;
    @FindBy (xpath = "//a[text()='About']")
    public WebElement aboutButon;
    @FindBy (xpath = "//a[text()='Plans']")
    public WebElement plansButon;
    @FindBy (xpath = "//a[text()='Blogs']")
    public WebElement blogButon;
    @FindBy (xpath = "//a[text()='Contact']")
    public WebElement contactButon;
    @FindBy (xpath = "//*[@class='account d-none d-lg-block']")
    public WebElement loginButon;
    @FindBy (xpath = "//h2[@class='hero__content-title text-capitalize t-text-white']")
    public WebElement aboutSayfa;
    @FindBy (xpath = "//h2[@class='hero__content-title text-capitalize t-text-white']")
    public  WebElement plansSayfa;
    @FindBy (xpath = "//h2[@class='hero__content-title text-capitalize t-text-white']")
    public WebElement blogsSayfa;
    @FindBy (xpath = "//h2[@class='hero__content-title text-capitalize t-text-white']")
    public WebElement contactSayfa;
    @FindBy (xpath = "//h2[@class='hero__content-title text-capitalize t-text-white']")
    public WebElement loginSayfa;
    @FindBy (xpath = "//h3[@class='text-capitalize text-center mt-0 mb-4']")
    public WebElement getStartedDayfa;
    @FindBy (xpath = "//div[@class='auth-form__content']")
    public WebElement kayitFormu;
    @FindBy (xpath = "//*[@name='username']")
    public WebElement username;
    @FindBy (xpath = "//input[@*='Email Address']")
    public WebElement email;
    @FindBy (xpath = "//select[@name='country']")
    public WebElement country;
    @FindBy (xpath = "//*[@name='mobile']")
    public WebElement mobileNumber;
    @FindBy (xpath = "//*[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@class='auth-form__input-icon auth-form__toggle-pass']")
    public WebElement gizlemeButonu;
    @FindBy (xpath = "//*[@name='password_confirmation']")
    public WebElement confirmPassword;
    @FindBy (xpath = "//input[@type='checkbox']")
    public WebElement ıAgreeCheckBox;
    @FindBy (xpath = "//*[@class='btn btn--base btn--xxl w-100 text-capitalize xl-text']")
    public WebElement registerButon;
    @FindBy (xpath = "//h2[@class='hero__content-title text-capitalize t-text-white']")
    public WebElement userDataSayfa;
    @FindBy (xpath = "//*[@name='firstname']")
    public WebElement firstNameUserButon;
    @FindBy (xpath = "//*[@name='lastname']")
    public WebElement lastNameUserButon;
    @FindBy (xpath = "//*[@name='address']")
    public WebElement addresUserButon;
    @FindBy (xpath = "//*[@name='state']")
    public WebElement stateButon;
    @FindBy (xpath = "//*[@name='zip']")
    public WebElement zipButon;
    @FindBy (xpath = "//*[@name='city']")
    public WebElement cityButon;
    @FindBy (xpath = "//*[@class='btn btn--base btn--xxl w-100 text-capitalize xl-text']")
    public WebElement submitButon;



    //afife<<<< userhomepage
    @FindBy (xpath = "//*[@class='img-fluid logo__is']")
    public WebElement loanTechLogo;

    @FindBy(xpath = "//*[@class='footer-copyright']")
    public WebElement footerCopyright;
    @FindBy (xpath = "//*[@aria-label='Instagram']")
    public WebElement instagramHomePageLogo;

    public void switchWindow(){
        String homeNWD=Driver.getDriver().getWindowHandle();
        Set<String> whdSeti=Driver.getDriver().getWindowHandles();
        String newWHD="";
        for (String each:whdSeti) {
            if (!each.equals(homeNWD))
                newWHD=each;}
        Driver.getDriver().switchTo().window(newWHD);
    }



    //afife>>>>>>>userhomepage





    @FindBy (xpath = "")
    public WebElement successfulNotu;



    public void visitorEmailNumberadressGorunurTesti(){
        emailButon.isDisplayed();
        numberButon.isDisplayed();
        adressButon.isDisplayed();

    }

    public void visitorHomeButtonsVisibleEnabledTest(){

        siteLogo.isDisplayed();
        siteLogo.isEnabled();
        homeButon.isDisplayed();
        homeButon.isEnabled();
        aboutButon.isDisplayed();
        aboutButon.isEnabled();
        plansButon.isDisplayed();
        plansButon.isEnabled();
        blogButon.isDisplayed();
        blogButon.isEnabled();
        contactButon.isDisplayed();
        contactButon.isEnabled();
        loginButon.isDisplayed();
        loginButon.isEnabled();
        getStartedButton.isDisplayed();
        getStartedButton.isEnabled();

    }

    public void visitorHomePageisDisplsyedTest(){
        homeButon.click();
        Assert.assertTrue(siteLogo.isDisplayed());
        aboutButon.click();
        Assert.assertTrue(aboutSayfa.isDisplayed());
        plansButon.click();
        Assert.assertTrue(plansSayfa.isDisplayed());
        blogButon.click();
        Assert.assertTrue(aboutSayfa.isDisplayed());
        contactButon.click();
        Assert.assertTrue(contactButon.isDisplayed());
        loginButon.click();
        Assert.assertTrue(loginSayfa.isDisplayed());
        getStartedButton.click();
        Assert.assertTrue(getStartedDayfa.isDisplayed());


    }

}
