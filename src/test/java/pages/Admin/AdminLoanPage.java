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

    @FindBy(xpath = "//span[text()='Loans']")
    public WebElement adminPanelLoansLinki;
    @FindBy(xpath = "//span[text()='Rejected Loans']")
    public WebElement adminPanelRejectedLoansLinki;
    @FindBy(xpath = "//h6[text()='Rejected Loans']")
    public WebElement adminPanelRejectedLoansYazisi;
    @FindBy(xpath = "//th[text()='S.N.']")
    public WebElement rejectedLoansSn;
    @FindBy(xpath = "//th[text()='Loan No. | Plan']")
    public WebElement rejectedLoansNoPlan;
    @FindBy(xpath = "//th[text()='User']")
    public WebElement rejectedLoansUser;
    @FindBy(xpath = "//th[text()='Amount']")
    public WebElement rejectedLoansAmount;
    @FindBy(xpath = "//th[text()='Installment Amount']")
    public WebElement rejectedLoansInsAmnt;
    @FindBy(xpath = "//th[text()='Installment']")
    public WebElement rejectedLoansInstallment;
    @FindBy(xpath = "//th[text()='Status']")
    public WebElement rejectedLoansStatus;
    @FindBy(xpath = "//th[text()='Action']")
    public WebElement rejectedLoansAction;
    @FindBy(xpath = "//input[@placeholder='Loan No.']")
    public WebElement rejectedLoanNo;
    @FindBy(xpath = "//input[@placeholder='Start Date - End Date']")
    public WebElement rejectedLoanStartEndDate;
    @FindBy(xpath = "//button[@class='btn btn--primary input-group-text']")
    public WebElement rejectedLoanfiltreSearch;
    @FindBy(xpath = "//div[@class='col-lg-12']")
    public WebElement rejectedLoanfiltreSonucSayfasi;
    @FindBy(xpath = "//span[@class='badge badge--danger']")
    public WebElement rejectedLoanstatusrapor;
    @FindBy(xpath = "//span[text()='Loan Number']")
    public WebElement InstallmentSumLoanNumber;
    @FindBy(xpath = "//span[text()='Plan']")
    public WebElement InstallmentSumPlan;
    @FindBy(xpath = "//span[text()='Loan Amount']")
    public WebElement InstallmentSumLoanAmount;
    @FindBy(xpath = "//span[text()='Per Installment']")
    public WebElement InstallmentSumPerIns;
    @FindBy(xpath = "//span[text()='Total Installment']")
    public WebElement InstallmentSumTotalIns;
    @FindBy(xpath = "//span[text()='Given Installment']")
    public WebElement InstallmentSumGivenIns;
    @FindBy(xpath = "//span[text()='Receivable']")
    public WebElement InstallmentSumReceivable;
    @FindBy(xpath = "//span[text()='Delay Charge']")
    public WebElement InstallmentSumDelayCharge;
    @FindBy(xpath = "//th[text()='S.N.']")
    public WebElement InstallmentsSn;
    @FindBy(xpath = "//th[text()='Installment Date']")
    public WebElement InstallmentsInsDate;
    @FindBy(xpath = "//th[text()='Given On']")
    public WebElement InstallmentsGivenOn;
    @FindBy(xpath = "//th[text()='Delay']")
    public WebElement InstallmentsDelay;
    @FindBy(xpath = "//th[text()='Charge']")
    public WebElement InstallmentsCharge;






    //span[text()='Loan Number']

    //span[@class='badge badge--dark']

    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--primary'])[1]")
    public WebElement rejectedLoanDetailsButton;
    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--success'])[1]")
    public WebElement rejectedLoanInstallmentButton;

    @FindBy(xpath = "((//div[@class='card-body'])[1]")
    public WebElement rejectedLoanDetailsChart;
    @FindBy(xpath = "//div[@class='card-body']")
    public WebElement rejectedLoanInstallmentChart;
    @FindBy(xpath = "(//span[@class='fw-bold'])[1]")
    public WebElement rejectedLoanDetailsChartPlan;
    @FindBy(xpath = "(//span[@class='fw-bold'])[2]")
    public WebElement rejectedLoanInstallmentChartDateAppl;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div/ul/li[3]/span[1]")
    public WebElement rejectedLoanDetailsChartLoanNumber;
    @FindBy(xpath = "//span[text()='Amount']")
    public WebElement rejectedLoanDetailsChartAmount;
    @FindBy(xpath = "//span[text()='Total Installment']")
    public WebElement rejectedLoanDetailsChartTotalIns;
    @FindBy(xpath = "//span[text()='Given Installment']")
    public WebElement rejectedLoanDetailsChartGivenIns;
    @FindBy(xpath = "//span[text()='Total Payable']")
    public WebElement rejectedLoanDetailsChartTotalPay;
    @FindBy(xpath = "//span[text()='Profit']")
    public WebElement rejectedLoanDetailsChartProfit;
    @FindBy(xpath = "//span[text()='Status']")
    public WebElement rejectedLoanDetailsChartStatus;
    @FindBy(xpath = "//ul[@class='list-group list-group-flush']")
    public WebElement rejectedLoanDetailsChartListesi;
    @FindBy(xpath = "//span[@class='badge badge--danger']")
    public WebElement rejectedLoanDetailsChartStatusPos;

























    // LOANS MENU ELEMENTLERİ  -Admin----Murat
    @FindBy(xpath = "//div[2]/div[1]/ul/li[5]/a")
    public WebElement adminPanelLoansElement;
    @FindBy(xpath = "//span[text()=\"Pending Loans\"]")
    public WebElement loansMenuPendingLoansElement;
    @FindBy(xpath = "//span[text()=\"Running Loans\"]")
    public WebElement loansMenuRunningLoansElement;
    @FindBy(xpath = "//span[text()=\"Due Loans\"]")
    public WebElement loansMenuDuoLoansElement;
    @FindBy(xpath = "//span[text()=\"Paid Loans\"]")
    public WebElement loansMenuPaidLoansElement;
    @FindBy(xpath = "//span[text()=\"Rejected Loans\"]")
    public WebElement loansMenuRejectedLoansElement;
    @FindBy(xpath = "//span[text()=\"All Loans\"]")
    public WebElement loansMenuAllLoansElement;
    @FindBy(xpath = "//h6[text()='Due Installment Loans']")
    public WebElement dueLoansPage;
    @FindBy(xpath = "//div[@class='card b-radius--10']")
    public WebElement dueInstallmentLoansTablosu;
    @FindBy(xpath = "//*[text()='Data not found']")
    public WebElement dataNotFoundElement;







}