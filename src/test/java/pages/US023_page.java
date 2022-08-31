package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US023_page {

    public US023_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesPatientButton;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppoPatientButton;

    @FindBy(xpath = "//*[@href='/make-appointment']")
    public WebElement makeAnAppoButton;

    @FindBy(name = "phone")
    public WebElement phoneTextBox;

    @FindBy(name = "appoDate")
    public WebElement apppoDateTextBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//tbody/tr[2]//span[text()='Edit']")
    public WebElement staffEditButton;

    @FindBy(name = "status")
    public WebElement statusSelectBox;

    @FindBy(xpath = "//*[@value='PENDING']")
    public WebElement pendingSelect;

    @FindBy(xpath = "//*[@value='COMPLETED']")
    public WebElement completedSelect;

    @FindBy(name = "physician.id")
    public WebElement physicianSelectBox;

    @FindBy(xpath = "//*[@value='208866']")
    public WebElement selectDoktor;

    @FindBy(name = "id")
    public WebElement idselect;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppoButton;

    @FindBy(xpath = "//tbody/tr[1]//span[text()='Edit']")
    public WebElement doktorAppoEdit;

    @FindBy(name = "toDate")
    public WebElement doktorSonDate;

    @FindBy(name = "fromDate")
    public WebElement doktorIlkDate;

    @FindBy(xpath = "//*[text()='Request A Test']")
    public WebElement doktorRequestTestButton;

    @FindBy(xpath = "//tr[1]//*[@type='checkbox']")
    public WebElement ilkTest;

    @FindBy(xpath = "//tr[2]//*[@type='checkbox']")
    public WebElement ikinciTest;

    @FindBy(xpath = "//tr[3]//*[@type='checkbox']")
    public WebElement ucuncuTest;

    @FindBy(name = "anamnesis")
    public WebElement anamnesisTextBox;

    @FindBy(name = "treatment")
    public WebElement treatmentTextBox;

    @FindBy(name = "diagnosis")
    public WebElement diagnosisTextBox;

    @FindBy(name = "prescription")
    public WebElement prescriptionTextBox;

    @FindBy(xpath = "//tr[2]//span[text()='Payment / Invoice Process']")
    public WebElement paymentButton;

    @FindBy(xpath = "//a[text()=' Create Invoice']")
    public WebElement creatInvoiceButton;

    @FindBy(xpath = "//*[text()='A Bill is updated with identifier 236834']")
    public WebElement basariMesaj;

    @FindBy(xpath = "//tr[1]//span[text()='Show Invoice']")
    public WebElement showInvoiceButton;

    @FindBy(xpath = "//*[text()='654-87-1329']")
    public WebElement ssnDogrulama;

    @FindBy(xpath = "//*[text()='hasta hakki']")
    public WebElement nameDogrulama;

    @FindBy(xpath = "//*[text()='CASH']")
    public WebElement methodDogrulama;

    @FindBy(xpath = "//tr[7]//th[2][@style='font-size: 25px;']")
    public WebElement totalCostDogrulama;

    @FindBy(xpath = "//tbody//tr[1]//*[text()='Payment / Invoice Process']")
    public WebElement complatedPaymetButton;

    @FindBy(xpath = "//tbody//tr[2]//*[text()='Payment / Invoice Process']")
    public WebElement canceledPaymetButton;

    @FindBy(xpath = "//*[text()='Payment / Invoice Process']")
    public WebElement payment23Button;

    @FindBy(xpath = "//*[text()='Exam Fee:']")
    public WebElement examFee;

    @FindBy(xpath = "//*[text()='Test Item Fee']")
    public WebElement itemFee;

    @FindBy(xpath = "//*[text()=' Show Invoice']")
    public WebElement showInvoice23Button;

    @FindBy(xpath = "//*[text()='INVOICE']")
    public WebElement invoicetextElement;

}
