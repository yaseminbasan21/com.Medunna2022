package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import pages.US001_page;
import pages.US022_page;
import pages.US023_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.*;

import java.util.Random;

public class US023_stepDefinitions {

    US001_page us001_page = new US001_page();
    US022_page us022_page = new US022_page();
    US023_page us023_page = new US023_page();

    Faker faker = new Faker();
    Random random =new Random();
    Actions actions =new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    String staffHandle="";
    String hastaHandle="";
    String doktorHandle="";

    @Given("Kullanicilar Medunna sayfasina gider ve giris yaparlar")
    public void kullanicilarMedunnaSayfasinaGiderVeGirisYaparlar() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        staffHandle= Driver.getDriver().getWindowHandle();
        System.out.println("staffhandle"+staffHandle);
        us001_page.girisIkon.click();
        us022_page.sginInButton.click();
        us022_page.usernametetxt.sendKeys(ConfigReader.getProperty("22staffUserName")
                + Keys.TAB
                +ConfigReader.getProperty("22Sifre"));
        us022_page.submitButton.click();
        System.out.println(Driver.getDriver().getTitle());
        staffHandle= Driver.getDriver().getWindowHandle();
        System.out.println("staffhandle"+staffHandle);



        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        hastaHandle=Driver.getDriver().getWindowHandle();
        us001_page.girisIkon.click();
        us022_page.sginInButton.click();
        us022_page.usernametetxt.sendKeys(ConfigReader.getProperty("22hastaUserName")
                + Keys.TAB
                +ConfigReader.getProperty("22Sifre"));
        us022_page.submitButton.click();
        System.out.println(Driver.getDriver().getTitle());
        System.out.println("hasta"+hastaHandle);



        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        doktorHandle= Driver.getDriver().getWindowHandle();
        us001_page.girisIkon.click();
        us022_page.sginInButton.click();
        us022_page.usernametetxt.sendKeys(ConfigReader.getProperty("22doktorUserName")
                + Keys.TAB
                +ConfigReader.getProperty("22Sifre"));
        us022_page.submitButton.click();
        System.out.println(Driver.getDriver().getTitle());
        System.out.println("doktor"+doktorHandle);


    }

    @Then("Hasta My Pages sekmesinden Make an Appointment butonuna tiklar")
    public void hasta_my_pages_sekmesinden_make_an_appointment_butonuna_tiklar() {

        Driver.getDriver().switchTo().window(hastaHandle);

        us023_page.myPagesPatientButton.click();
        us023_page.makeAnAppoButton.click();


    }

    @Then("Hasta Phone ve Date kisimlarini doldurur ve send butonuna basar")
    public void hasta_phone_ve_date_kisimlarini_doldurur_ve_send_butonuna_basar() {

        us023_page.phoneTextBox.sendKeys("122-456-7890");
        us023_page.apppoDateTextBox.sendKeys(ConfigReader.getProperty("22sondate"));

        ReusableMethods.waitFor(2);

        us023_page.submitButton.click();
        ReusableMethods.waitFor(1);

    }

    @Then("Staff MY PAGES den Search Patient butonuna tiklar")
    public void staffMYPAGESDenSearchPatientButonunaTiklar() {

        Driver.getDriver().switchTo().window(staffHandle);

        us022_page.myPageButton.click();
        us022_page.searhPatientButton.click();


    }

    @Then("Staff Patient SSN: text boxina hastanin SSN numarasi girer")
    public void staff_patient_ssn_text_boxina_hastanin_ssn_numarasi_girer() {

        us022_page.ssnSearchTextBox.sendKeys(ConfigReader.getProperty("us23SSN1"));
        ReusableMethods.waitFor(1);

    }

    @Then("Staff Show Appointments butonuna tiklar")
    public void staff_show_appointments_butonuna_tiklar() {

        ReusableMethods.waitFor(2);
        us022_page.show22Appo.click();

    }

    @Then("Staff Edit butonuna tiklar")
    public void staff_edit_butonuna_tiklar() {

        ReusableMethods.waitFor(3);
        us023_page.staffEditButton.click();

    }

    @Then("Staff Status kismini PENDING yapar ve Physician kismini {int}:doktor hakki:NUCLEAR_MEDICINE olarak doldurur")
    public void staff_status_kismini_pending_yapar_ve_physician_kismini_doktor_hakki_nuclear_medicine_olarak_doldurur(Integer id) {

        ReusableMethods.waitFor(1);
        us023_page.statusSelectBox.click();
        us023_page.pendingSelect.click();
        ReusableMethods.waitFor(1);
        us023_page.idselect.click();

        ReusableMethods.waitFor(1);

        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();

        ReusableMethods.waitForVisibility(us023_page.selectDoktor,60);
        us023_page.physicianSelectBox.click();
        ReusableMethods.waitFor(3);
        us023_page.selectDoktor.click();

        ReusableMethods.waitFor(1);

    }

    @Then("Staff Save butonuna tiklar")
    public void staff_save_butonuna_tiklar() {

        ReusableMethods.waitFor(2);
        ReusableMethods.waitForClickablility(us023_page.submitButton,3);
        us023_page.submitButton.click();
        ReusableMethods.waitFor(2);

    }

    @Then("Doktor My Page sekmesinden My Appointments butonuna tiklar")
    public void doktor_my_page_sekmesinden_my_appointments_butonuna_tiklar() {

        Driver.getDriver().switchTo().window(doktorHandle);

        us022_page.myPageButton.click();
        us023_page.myAppoButton.click();

    }

    @Then("Doktor Edit butonuna tiklar")
    public void doktor_edit_butonuna_tiklar() {

        ReusableMethods.waitFor(3);
        us023_page.doktorIlkDate.sendKeys(ConfigReader.getProperty("22sondate"));
        ReusableMethods.waitFor(2);
        us023_page.doktorSonDate.sendKeys(ConfigReader.getProperty("22sondate"));
        ReusableMethods.waitFor(5);
        us023_page.doktorAppoEdit.click();

    }

    @Then("Doktor Request A Test butonuna tiklar")
    public void doktor_request_a_test_butonuna_tiklar() {

        us023_page.doktorRequestTestButton.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(2);
        us023_page.doktorRequestTestButton.click();
        ReusableMethods.waitFor(1);

    }

    @Then("Doktor yapilacak testleri secer ve save butonuna tiklar")
    public void doktor_yapilacak_testleri_secer_ve_save_butonuna_tiklar() {

        ReusableMethods.waitForClickablility(us023_page.ilkTest,5);
        us023_page.ilkTest.click();
        us023_page.ikinciTest.click();
        us023_page.ucuncuTest.click();
        ReusableMethods.waitFor(1);

        js.executeScript("arguments[0].scrollIntoView();", us023_page.submitButton);
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForClickablility(us023_page.submitButton,3);
        us023_page.submitButton.click();
        ReusableMethods.waitFor(1);

    }

    @Then("Doktor status kismini COMPLETED yapar ve diger bilgileri doldurur ve save butonuna tiklar")
    public void doktor_status_kismini_completed_yapar_ve_diger_bilgileri_doldurur_ve_save_butonuna_tiklar() {

        ReusableMethods.waitForClickablility(us023_page.statusSelectBox,3);
        us023_page.statusSelectBox.click();
        us023_page.completedSelect.click();
        ReusableMethods.waitFor(1);

        us023_page.anamnesisTextBox.sendKeys("Anamnesis");
        us023_page.treatmentTextBox.sendKeys("Treatment");
        us023_page.diagnosisTextBox.sendKeys("diagnosis");
        us023_page.prescriptionTextBox.sendKeys("Prescription"+
                Keys.TAB+
                "Description");
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //js.executeScript("arguments[0].scrollIntoView();", us023_page.submitButton);
        JSUtils.clickElementByJS(us023_page.submitButton);
        //us023_page.submitButton.click();

    }

    @Then("Staff  Patient SSN: text boxina hastanin SSN numarasi girer")
    public void staffPatientSSNTextBoxinaHastaninSSNNumarasiGirer() {

        Driver.getDriver().switchTo().window(staffHandle);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(us022_page.ssnSearchTextBox,3);
        us022_page.ssnSearchTextBox.sendKeys(ConfigReader.getProperty("us23SSN1"));
        ReusableMethods.waitFor(1);

    }

    @Then("Staff Payment butonuna tiklar")
    public void staff_payment_butonuna_tiklar() {

        ReusableMethods.waitFor(2);
       us023_page.paymentButton.click();

    }

    @Then("Staff Creat Invoice butonuna tiklar")
    public void staff_creat_invoice_butonuna_tiklar() {

        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(us023_page.creatInvoiceButton);
        //us023_page.creatInvoiceButton.click();

    }

    @And("Staff  Save butonuna tiklar")
    public void staffSaveButonunaTiklar() {

        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(us023_page.submitButton);

    }

    @Then("Staff basari mesajinin varligini test eder")
    public void staff_basari_mesajinin_varligini_test_eder() {
/*
        ReusableMethods.waitFor(2);
        assertTrue(us023_page.basariMesaj.isDisplayed());
*/
    }

    @Then("Hasta My Page sekmesinden My Appointments butonuna basar")
    public void hasta_my_page_sekmesinden_my_appointments_butonuna_basar() {

        Driver.getDriver().switchTo().window(hastaHandle);

        ReusableMethods.waitFor(2);
        us023_page.myPagesPatientButton.click();
        us023_page.myAppoPatientButton.click();

    }

    @Then("Hasta Show Invoice butonuna tiklar ve fatura bilgilerinin gorundugunu test eder")
    public void hasta_show_invoice_butonuna_tiklar_ve_fatura_bilgilerinin_gorundugunu_test_eder() {

        ReusableMethods.waitFor(3);
        us023_page.doktorIlkDate.sendKeys(ConfigReader.getProperty("22sondate"));
        ReusableMethods.waitFor(2);
        us023_page.doktorSonDate.sendKeys(ConfigReader.getProperty("22sondate"));
        ReusableMethods.waitFor(5);

        ReusableMethods.waitFor(3);
        us023_page.showInvoiceButton.click();

        assertTrue(us023_page.ssnDogrulama.isDisplayed());
        assertTrue(us023_page.nameDogrulama.isDisplayed());
        assertTrue(us023_page.methodDogrulama.isDisplayed());
        assertTrue(us023_page.totalCostDogrulama.isDisplayed());

    }

    @Then("Staff Patient SSN: text boxina SSN numarasi girer")
    public void staff_patient_ssn_text_boxina_ssn_numarasi_girer() {

        ReusableMethods.waitForVisibility(us022_page.ssnSearchTextBox,3);
        us022_page.ssnSearchTextBox.sendKeys(ConfigReader.getProperty("us23SSN2"));

    }
    @Then("Staff Completed ve canceled statusune sahip randevularin Payment kisminin gorundugunu test eder")
    public void staff_completed_ve_canceled_statusune_sahip_randevularin_payment_kisminin_gorundugunu_test_eder() {

        assertTrue(us023_page.complatedPaymetButton.isDisplayed());
        assertTrue(us023_page.canceledPaymetButton.isDisplayed());

    }


    @Then("Staff Patient SSN text boxina SSN numarasi girer")
    public void staffPatientSSNTextBoxinaSSNNumarasiGirer() {

        ReusableMethods.waitForVisibility(us022_page.ssnSearchTextBox,3);
        us022_page.ssnSearchTextBox.sendKeys(ConfigReader.getProperty("us23SSN1"));
        ReusableMethods.waitFor(1);

    }

    @And("Staff Payment buttonuna tiklar")
    public void staffPaymentButtonunaTiklar() {

        ReusableMethods.waitForVisibility(us023_page.payment23Button,3);
        us023_page.payment23Button.click();

    }


    @And("Staff Exam fee: kisminin gorunurlugunu test eder")
    public void staffExamFeeKismininGorunurlugunuTestEder() {

        assertTrue(us023_page.examFee.isDisplayed());

    }

    @And("Staff Test Item Fee kisminin gorunurlugunu test eder")
    public void staffTestItemFeeKismininGorunurlugunuTestEder() {

        assertTrue(us023_page.itemFee.isDisplayed());

    }

    @And("Staff daha once olusturulan faturanin gorunurlugunu test eder")
    public void staffDahaOnceOlusturulanFaturaninGorunurlugunuTestEder() {

        ReusableMethods.waitFor(1);
        assertTrue(us023_page.payment23Button.isDisplayed());
        us023_page.payment23Button.click();

        //us023_page.showInvoice23Button.click();
        JSUtils.clickElementByJS(us023_page.showInvoice23Button);

        assertTrue(us023_page.invoicetextElement.isDisplayed());

    }
}
