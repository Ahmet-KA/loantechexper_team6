package pages.Visitor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorLoanPage {

    public VisitorLoanPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    //BASIC LOAN ELEMENTLERİ -VISITOR  ---Murat
    @FindBy(xpath = "//button[@id=\"pills-basic-loan-tab\"]")
    public WebElement basicLoanButtonElement;
    @FindBy(xpath = "(//button[text()=\"Apply Now                                        \"])[3]")
    public WebElement basicLoanApplyNowButtonElement;
    @FindBy(xpath = "(//div[@class=\"plan-card-header-body\"])[3]")
    public WebElement basicLoanPlanCardBodyElement;
    @FindBy(xpath = "//button[@aria-label=\"Close\"]")
    public WebElement notLoggedCloseElement; //you are not looed in! sayfasındaki close
    @FindBy(xpath = "//i[@aria-hidden=\"true\"]")
    public WebElement applyNowAktiveXElement; //you are not looed in! sayfasındaki X
}
