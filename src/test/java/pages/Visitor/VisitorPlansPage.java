package pages.Visitor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorPlansPage {

    public VisitorPlansPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //LOAN PLANS ELEMENTLERİ -VISITOR  ---Murat
    @FindBy(xpath = "//h2")
    public WebElement loansPlansTextElementi;
    @FindBy(xpath = "//a[text()=\"Home                            \"]")
    public WebElement loanPlansHomeLinkElement; // HOME / LOAN PLANS
    @FindBy(xpath = "//span[text()=\"Loan Plans\"]")
    public WebElement loanPlansLinkElement;  // HOME / LOAN PLANS
    @FindBy(xpath = "//h3[@class=\" text-capitalize mt-0 text-center text-md-start ps-xl-3\"]")
    public WebElement loanPlansLikeToBecomeTextElement;
}
