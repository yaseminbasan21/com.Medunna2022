package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US007_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static org.apache.commons.lang3.time.DateUtils.addDays;

public class US007_stepDefinitions {

    US007_page us007_page=new US007_page();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
    String dateTextboxValue;
    String sistemDateValue;

    @And("MY PAGES\\(PATIENT)  butonuna tiklar ve menu'den Make An Appointment secenegini tiklar.")
    public void myPAGESPATIENTButonunaTiklarVeMenuDenMakeAnAppointmentSeceneginiTiklar() {
        ReusableMethods.waitFor(2);
        us007_page.myPagesPatient.click();
        us007_page.makeAnAppointment.click();
    }

    @And("Acilan sayfada Make an Appointment yazisinin gorunur oldugu test edilir.")
    public void acilanSayfadaMakeAnAppointmentYazisininGorunurOlduguTestEdilir() {

        Assert.assertTrue(us007_page.makeAnAppointmentText.isDisplayed());
    }

    @And("Firstname, Lastname,SSN,Email ve Phone textbox'ini gecerli bir deger ile doldurur.")
    public void firstnameLastnameSSNEmailVePhoneTextboxIniGecerliBirDegerIleDoldurur() {
        ReusableMethods.waitFor(3);

        us007_page.firstName.clear();
        us007_page.lastName.clear();
        us007_page.ssn.clear();
        us007_page.email.clear();
        us007_page.phoneTextBox.clear();

        ReusableMethods.waitFor(3);

        actions.click(us007_page.firstName).sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).sendKeys(faker.idNumber().ssnValid()).
                sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.TAB).sendKeys("9015462324").perform();

    }

    @And("Appointment DateTime icin guncel tarih bilgisi girilir.")
    public void appointmentDateTimeIcinGuncelTarihBilgisiGirilir() {
        ReusableMethods.waitFor(2);
        dateTextboxValue = us007_page.dateBox.getAttribute("value");
        LocalDate tarih = LocalDate.now();
        sistemDateValue = "" + tarih ;


    }

    @And("Date textbox'inda yer alan tarihin girilen tarih ile ayni oldugu test edilir.")
    public void dateTextboxIndaYerAlanTarihinGirilenTarihIleAyniOlduguTestEdilir() {

        Assert.assertTrue(dateTextboxValue.equals(sistemDateValue));
    }


    @And("Send an Appointment Request butonunu tiklar.")
    public void sendAnAppointmentRequestButonunuTiklar() {
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",us007_page.sendAnAppointmentRequestButon);


    }

    @And("Randevunun basarili bir sekilde kaydedildigini cikan popup ile dogrular.")
    public void randevununBasariliBirSekildeKaydedildiginiCikanPopupIleDogrular() {

        ReusableMethods.waitFor(2);

        String expectedAlertYazisi = ConfigReader.getProperty("BasariliAlertYazisi");
        String actualAlertYazisi = us007_page.dogrulamaText.getAttribute("innerText");
        Assert.assertTrue(actualAlertYazisi.contains(expectedAlertYazisi));
        //Assert.assertTrue(us007_page.dogrulamaText.isDisplayed());
    }

    // ======================================TC02======================================

    @And("Date textbox'ini gecmis bir tarih ile doldurur.")
    public void dateTextboxIniGecmisBirTarihIleDoldurur() {

        ReusableMethods.waitFor(2);

        String date = ReusableMethods.setTheDateByRandom("dd-MM-yyy",1,"past");
        us007_page.dateBox.clear();
        us007_page.dateBox.sendKeys(date);
    }


    @And("Date textboxinin altinda Appointment date can not be past date! uyarisinin gorundugunu dogrular.")
    public void dateTextboxininAltindaAppointmentDateCanNotBePastDateUyarisininGorundugunuDogrular() {

       // String expectedHataPastDateText = ConfigReader.getProperty("HataliPastDate");
       // Assert.assertEquals(expectedHataPastDateText,us007_page.pastDateText.getText());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us007_page.pastDateText.isDisplayed());
    }

    @And("Send an Appointment Request butonuna basildiginda kayit yapilmadigi gorulur.")
    public void sendAnAppointmentRequestButonunaBasildigindaKayitYapilmadigiGorulur() {

        ReusableMethods.waitFor(2);

        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",us007_page.sendAnAppointmentRequestButon);

        ReusableMethods.waitFor(2);

        String expectedAlertYazisi = ConfigReader.getProperty("BasariliAlertYazisi");
        String actualAlertYazisi = us007_page.dogrulamaText.getAttribute("innerText");
        Assert.assertFalse(actualAlertYazisi.contains(expectedAlertYazisi));



    }

    // ===============================TC03=========================================

    @And("Date textbox'ini ileri bir tarih ile doldurur.")
    public void dateTextboxIniIleriBirTarihIleDoldurur() {
        String date = ReusableMethods.setTheDateByRandom("dd-MM-yyy",1,"feature");
        us007_page.dateBox.clear();
        us007_page.dateBox.sendKeys(date);

    }

    @And("Send an Appointment Request butonuna basildiginda Appointment registration saved yazisi gorulmeli.")
    public void sendAnAppointmentRequestButonunaBasildigindaAppointmentRegistrationSavedYazisiGorulmeli() {
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",us007_page.sendAnAppointmentRequestButon);

        String expectedAlertYazisi = ConfigReader.getProperty("BasariliAlertYazisi");
        String actualAlertYazisi = us007_page.dogrulamaText.getAttribute("innerText");
        Assert.assertTrue(actualAlertYazisi.contains(expectedAlertYazisi));



    }

    // =======================================TC04=======================================


    @And("Tarih bilgisi alani {string} seklinde girilir ve gunayyil seklinde oldugu test edilir.")
    public void tarihBilgisiAlaniSeklindeGirilirVeGunayyilSeklindeOlduguTestEdilir(String date) {

          us007_page.dateBox.sendKeys(date); // 17.01.2040
          date = ReusableMethods.stringDateFormat2(date); // 2040.01.17  yıl gun ay
          System.out.println("date = " + date);
          System.out.println(us007_page.dateBox.getAttribute("value"));
          Assert.assertEquals(date,us007_page.dateBox.getAttribute("value"));

     // Date simdikiZaman = new Date();
     // System.out.println(simdikiZaman.toString());
     // DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
     // System.out.println(df.format(simdikiZaman));

     // Date addedDate1 = addDays(simdikiZaman, 15);

     // us007_page.dateBox.sendKeys(df.format(addedDate1));







    }


}
