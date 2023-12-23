package pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminLoanPage {


    public AdminLoanPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[4]/a/span")
    public WebElement adminPanelLoanPlansElement;

    @FindBy(xpath = "//div[@class=\"col-lg-12\"]")
    public WebElement loanPlansList;

    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--primary'])[1]")
    public WebElement addNewButton;

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement planNameTextbox;

    @FindBy(xpath = "//*[@id=\"title\"]")
    public WebElement titleTextbox;

    @FindBy(xpath = "//*[@id=\"minimum_amount\"]")
    public WebElement minimumAmountTextbox;

    @FindBy(xpath = "//*[@id=\"maximum_amount\"]")
    public WebElement maximumAmountTextbox;

    @FindBy(xpath = "//*[@id=\"category_id\"]")
    public WebElement categoryCheckbox;

    @FindBy(xpath = "//*[@id=\"per_installment\"]")
    public WebElement perInstallmentTextbox;

    @FindBy(xpath = "//*[@id=\"installment_interval\"]")
    public WebElement installmentIntervalTextbox;

    @FindBy(xpath = "//*[@id=\"total_installment\"]")
    public WebElement totalInstallmentsTextbox;

    @FindBy(xpath = "//*[@id=\"application_fixed_charge\"]")
    public WebElement applicationFixedChargeTextbox;

    @FindBy(xpath = "//*[@id=\"application_percent_charge\"]")
    public WebElement applicationPercentChargeTextbox;

    @FindBy(xpath = "//div[@class=' nicEdit-main                                  ']")
    public WebElement instructionTextbox;

    @FindBy(xpath = "//*[@id=\"delay_value\"]")
    public WebElement chargeWillApplyIfDelayTextbox;

    @FindBy(xpath = "//*[@id=\"fixed_charge\"]")
    public WebElement fixedChargeTextbox;

    @FindBy(xpath = "//*[@id=\"percent_charge\"]")
    public WebElement percentChargeTextbox;

    @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    public WebElement submitButton;

    @FindBy(xpath = "//a[@class=\"btn btn-sm btn-outline--primary\"]")
    public WebElement backButton;

    @FindBy(xpath = "//*[@id=\"UGxhbiUyMGFkZGVkJTIwc3VjY2Vzc2Z1bGx5Z3JlZW4\"]/div[1]/div[1]/p")
    public WebElement planAddedsuccesfullyMessage;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/div/table/tbody/tr[2]/td[8]/div/a")
    public WebElement editButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/form/button")
    public WebElement editSubmitButton;

    @FindBy(xpath = "//*[@id=\"UGxhbiUyMHVwZGF0ZWQlMjBzdWNjZXNzZnVsbHlncmVlbg\"]/div[1]/div[1]/p")
    public WebElement planUpdatedSuccesfullyMessage;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/div/table/tbody/tr[2]/td[8]/div/button")
    public WebElement disableButton;

    @FindBy(xpath = "//*[@id=\"confirmationModal\"]/div/div/form/div[2]/button[2]")
    public WebElement yesButton;

    @FindBy(xpath = "//*[@id=\"U3RhdHVzJTIwY2hhbmdlZCUyMHN1Y2Nlc3NmdWxseWdyZWVu\"]/div[1]/div[1]/p")
    public WebElement statusChangedSuccesfullyMessage;

    @FindBy(xpath = "//*[@id=\"VGhlJTIwaW5zdGFsbG1lbnQlMjBpbnRlcnZhbCUyMG11c3QlMjBiZSUyMGdyZWF0ZXIlMjB0aGFuJTIwMC5yZWQ\"]/div[1]/div[1]/p")
    public WebElement errorMessage;





}