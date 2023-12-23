package stepdefinitions.Visitor;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Visitor.VisitorHomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us012_GetStartedRegisterPage {

    VisitorHomePage visitorHomePage = new VisitorHomePage();


    @Given("Anasayfada getStrated butonu test edilir")
    public void anasayfada_get_strated_butonu_test_edilir() {

        visitorHomePage.getStartedButton.isDisplayed();
        visitorHomePage.getStartedButton.isEnabled();
    }

    @Given("Anasayfada getstrated butona tiklar ve register sayfasina yonlendirdigi test edilir")
    public void anasayfada_getstrated_butona_tiklar_ve_register_sayfasina_yonlendirdigi_test_edilir() {

        ReusableMethods.bekle(2);
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.clickWithJS(visitorHomePage.allowCookies);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(visitorHomePage.getStartedButton).sendKeys(Keys.ENTER).perform();
        //visitorHomePage.getStartedButton.click();
        ReusableMethods.bekle(3);
        Assert.assertTrue(visitorHomePage.kayitFormu.isEnabled());
    }

    @Given("Anasayfada getstrated butona tiklar ve register sayfasindaki kayit formu gorunurlugu test edilir")
    public void anasayfada_getstrated_butona_tiklar_ve_register_sayfasindaki_kayit_formu_gorunurlugu_test_edilir() {

        ReusableMethods.bekle(2);
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.clickWithJS(visitorHomePage.allowCookies);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(visitorHomePage.getStartedButton,Keys.ENTER).perform();
        //visitorHomePage.getStartedButton.click();
        ReusableMethods.bekle(3);
        Assert.assertTrue(visitorHomePage.kayitFormu.isDisplayed());

    }

    @Given("Kayit formu bilgileri gorunur oldugu test edilir")
    public void kayit_formu_bilgileri_gorunur_oldugu_test_edilir() {
        visitorHomePage.registerFormuisDisplayedTest();

    }

    @Given("Anasayfada getstrated butona tiklar ve register sayfasindaki kayit formu doldurulur")
    public void anasayfada_getstrated_butona_tiklar_ve_register_sayfasindaki_kayit_formu_doldurulur() {
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.clickWithJS(visitorHomePage.allowCookies);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(visitorHomePage.getStartedButton,Keys.ENTER).perform();
        ReusableMethods.bekle(2);
         visitorHomePage.kayitFormVeriGirisiTest();
    }

    @Given("User Data sayfasinin acildigi test edilir")
    public void user_data_sayfasinin_acildigi_test_edilir() {

        visitorHomePage.userDataSayfa.isDisplayed();


    }
    @Given("User Data formun gorunur ve aktif oldugu test edilir")
    public void user_data_formun_gorunur_ve_aktif_oldugu_test_edilir() {
        visitorHomePage.userDataFormu.isDisplayed();
        visitorHomePage.userDataFormu.isEnabled();

    }
    @Given("form ici bilgiler girilir")
    public void form_ici_bilgiler_girilir() {
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.bekle(2);
        String adres = faker.name().username();
        adres = adres.replaceAll("\\W", "");
        ReusableMethods.bekle(1);

        actions.click(visitorHomePage.firstNameUserButon).sendKeys(faker.name().username()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(adres).perform();
        ReusableMethods.bekle(2);
        ReusableMethods.clickWithJS(visitorHomePage.submitButon);


    }
    @Given("Kayit basarili mesaji goruntulenir")
    public void kayit_basarili_mesaji_goruntulenir() {

        Assert.assertTrue(visitorHomePage.successfulNotu.isDisplayed());

    }





}
