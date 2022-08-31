package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.Select;
import pages.US016_page;
import pojos.User;
import utilities.*;

import javax.print.DocFlavor;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import static utilities.Driver.driver;

public class US016_stepDefinitions {

    US016_page us016Page = new US016_page();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();


    @Given("{string} e gidilir, ikon ve Sign in butonu tiklanir.")
    public void eGidilirIkonVeSignInButonuTiklanir(String medunnaUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));
        ReusableMethods.waitFor(2);
        us016Page.ikon.click();
        Thread.sleep(1000);
        JSUtils.clickElementByJS(us016Page.firstSignIn);

    }

    @And("Gecerli kullanici bilgisi {string} ve {string} girilir ve Signin tiklanir.")
    public void gecerliKullaniciBilgisiVeGirilirVeSigninTiklanir(String admin_username, String admin_password) {
        ReusableMethods.waitFor(2);
        actions.click(us016Page.username).sendKeys(ConfigReader.getProperty(admin_username)).
                sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty(admin_password)).perform();
        //  us016Page.secondSignIn.click();
        JSUtils.clickElementByJS(us016Page.secondSignIn);


    }

    @And("Items&Titles basligi ve Room tiklanir.")
    public void itemsTitlesBasligiVeRoomTiklanir() {
        ReusableMethods.waitFor(2);
        us016Page.itemsTitles.click();
        us016Page.room.click();
    }

    @And("Create a new Room butonu tiklanir ve acilan sayfada Create or edit a Room yazisinin gorunur oldugu dogrulanir.")
    public void createANewRoomButonuTiklanirVeAcilanSayfadaCreateOrEditARoomYazisininGorunurOlduguDogrulanir() {
        ReusableMethods.waitFor(1);
        us016Page.createNewButon.click();
        Assert.assertTrue(us016Page.createText.isDisplayed());


    }


    @And("Room number textbox'ina gecerli deger girilir, gecersiz deger girildiginde This field should be a number. uyarisi alinir.")
    public void roomNumberTextboxInaGecerliDegerGirilirGecersizDegerGirildigindeThisFieldShouldBeANumberUyarisiAlinir() {
        ReusableMethods.waitFor(2);
        actions.click(us016Page.roomNumberTextBox).sendKeys("ad2014").sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(us016Page.requrimentIncorrect.isDisplayed());
        ReusableMethods.waitFor(1);
        us016Page.roomNumberTextBox.clear();
        ReusableMethods.waitFor(2);

        Random rnd = new Random();

        String roomNo = String.valueOf(rnd.nextInt(70000));

        us016Page.roomNumberTextBox.sendKeys(roomNo);

    }


    @And("Room Type TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE olarak secilir.")
    public void roomTypeTWINDELUXEPREMIUM_DELUXESUITVeDAYCAREOlarakSecilir() {
        ReusableMethods.waitFor(2);
        Select select = new Select(us016Page.roomTypeButon);
        List<WebElement> roomType = select.getOptions();
        for (WebElement each : roomType) {
            each.click();
            System.out.println(each.getText());
        }
    }

    @And("Status butonunun secilebilir oldugu test edilir.")
    public void statusButonununSecilebilirOlduguTestEdilir() {
        ReusableMethods.waitFor(2);
        us016Page.statusButon.click();
        Assert.assertTrue(us016Page.statusButon.isSelected());
    }

    @And("Price textbox'ina gecerli deger girilir ve gecerli deger girildigi dogrulanir.")
    public void priceTextboxInaGecerliDegerGirilirVeGecerliDegerGirildigiDogrulanir() {
        ReusableMethods.waitFor(2);
        us016Page.priceTextbox.clear();
        us016Page.priceTextbox.sendKeys("2850");
    }


    @And("Price textbox'i bos birakilir ve This field is required. uyarisi aldigi goruntulenir.")
    public void priceTextboxIBosBirakilirVeThisFieldIsRequiredUyarisiAldigiGoruntulenir() {
        ReusableMethods.waitFor(2);
        actions.click(us016Page.priceTextbox).sendKeys("").sendKeys(Keys.TAB).perform();
        Assert.assertTrue(us016Page.requirementEmpty.isDisplayed());
    }


    @And("Price textbox'ina gecersiz deger girilir ve This field should be at least . uyarisi aldigi goruntulenir")
    public void priceTextboxInaGecersizDegerGirilirVeThisFieldShouldBeAtLeastUyarisiAldigiGoruntulenir() {
        ReusableMethods.waitFor(3);
        actions.click(us016Page.priceTextbox).sendKeys("-s1235").sendKeys(Keys.TAB).perform();
        Assert.assertTrue(us016Page.priceIncorrect.isDisplayed());

    }

    @And("Description textbox'i bos birakilir ve bos birakildigi dogrulanir")
    public void descriptionTextboxIBosBirakilirVeBosBirakildigiDogrulanir() {
        actions.click(us016Page.description).sendKeys("").sendKeys(Keys.ENTER).perform();
    }


    @And("Created Date icin tarih bilgisi {string} seklinde gunayyil girilir.")
    public void createdDateIcinTarihBilgisiSeklindeGunayyilGirilir(String date) {
        String date1 = ReusableMethods.setTheDateByRandomWithTime("MM-dd-00yyyy-HH:mm", 1, "feature");
        System.out.println(date1);
        us016Page.createDate.clear();
        us016Page.createDate.sendKeys(date1);


    }

    @And("Created Date icin girilen tarih bilgisinin gunayyil \\(aygunyil) seklinde oldugu test edilir.")
    public void createdDateIcinGirilenTarihBilgisininGunayyilAygunyilSeklindeOlduguTestEdilir() throws IOException {

        ReusableMethods.getScreenshot("Created Date gun/ay/yil olarak goruntulenir.");

    }

    @And("Oda basarili bir sekilde kaydedilir ve dogrulanir.")
    public void odaBasariliBirSekildeKaydedilirVeDogrulanir() {

        //us016Page.saveButon.click();
        JSUtils.clickElementByJS(us016Page.saveButon);
        Driver.waitForVisibility(us016Page.kayitMesaji, 2);
        Assert.assertTrue(us016Page.kayitMesaji.isDisplayed());


    }

    @And("Acilan sayfada Room Type tiklanir ve ayni tur olan odalarin gorunur oldugu dogrulanir.")
    public void acilanSayfadaRoomTypeTiklanirVeAyniTurOlanOdalarinGorunurOlduguDogrulanir() throws IOException {
        us016Page.roomTypeDropDown.click();

        ReusableMethods.waitFor(2);

        List<WebElement> basliklarListesi = driver.findElements(By.xpath("//thead//tr[1]//th"));
        int roomTypeSutunNo = 0;
        for (int i = 0; i < basliklarListesi.size(); i++) {
            if (basliklarListesi.get(i).getText().equals("Room Type")) {
                roomTypeSutunNo = i;
            }
        }
        List<WebElement> roomTypeSutunListesi =
                driver.findElements(By.xpath("//tbody//td[" + (roomTypeSutunNo + 1) + "]"));
        for (WebElement each : roomTypeSutunListesi) {
            System.out.println(each.getText());
            Assert.assertTrue(each.getText().equals(each.getText()));
        }

        ReusableMethods.getScreenshot("Ayni Tipte Odalar Gorunuyor");
    }


    @And("Olusturulan oda bulunur ve edit tiklanir, gerekli guncellemeler yapilir ve save butonu tiklanir.")
    public void olusturulanOdaBulunurVeEditTiklanirGerekliGuncellemelerYapilirVeSaveButonuTiklanir() throws InterruptedException {
        // ID tiklanir ve enson olusturulan oda bulunur
        us016Page.id.click();
        Thread.sleep(1000);
        us016Page.editButon.click();
        Thread.sleep(1000);
        us016Page.roomNumberTextBox.click();
        us016Page.roomNumberTextBox.clear();
        us016Page.roomNumberTextBox.sendKeys("8745412");
        Thread.sleep(1000);
        Select select = new Select(us016Page.roomTypeButon);
        List<WebElement> roomType = select.getOptions();
        for (WebElement each : roomType) {
            if (each.equals("DELUXE"))
                each.click();

        }
        us016Page.statusButon.click();
        Thread.sleep(1000);
        JSUtils.clickElementByJS(us016Page.priceTextbox);
        Thread.sleep(1000);
        us016Page.priceTextbox.clear();
        Thread.sleep(1000);
        us016Page.priceTextbox.sendKeys("1800");
        Thread.sleep(1000);
        JSUtils.clickElementByJS(us016Page.description);
        Thread.sleep(1000);
        us016Page.description.clear();
        Thread.sleep(1000);
        JSUtils.clickElementByJS(us016Page.saveButon);


    }

    @And("Basarili sekilde guncelleme yapildigi cikan A Message is updated with identifier yazisi ile dogrulanir.")
    public void basariliSekildeGuncellemeYapildigiCikanAMessageIsUpdatedWithIdentifierYazisiIleDogrulanir() throws InterruptedException {
        Thread.sleep(1000);
        Driver.waitForVisibility(us016Page.kayitMesaji, 2);
        Assert.assertTrue(us016Page.kayitMesaji.isDisplayed());

    }

    @And("Olusturulan oda bulunur ve delete tiklanir.")
    public void olusturulanOdaBulunurVeDeleteTiklanir() throws InterruptedException {
        Thread.sleep(1000);
        us016Page.id.click();
        Thread.sleep(1000);
        us016Page.deleteButon.click();
        Thread.sleep(1000);
        us016Page.deleteButon2.click();

    }

    @And("Silme isleminin basarili sekilde gerceklestigi  A Message is deleted with identifier mesaji ile dogrulanir.")
    public void silmeIslemininBasariliSekildeGerceklestigiAMessageIsDeletedWithIdentifierMesajiIleDogrulanir() throws InterruptedException {

        Thread.sleep(1000);
        Driver.waitForVisibility(us016Page.kayitMesaji, 2);
        Assert.assertTrue(us016Page.kayitMesaji.isDisplayed());


    }

    // Negatif Senaryo /Bug var

    @And("Room Number, Room Type, Status, Price, Description kisimlari istenilen sekilde doldurulur.")
    public void roomNumberRoomTypeStatusPriceDescriptionKisimlariIstenilenSekildeDoldurulur() throws InterruptedException {
        Thread.sleep(1000);
        actions.click(us016Page.roomNumberTextBox).sendKeys("65387415").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("985").sendKeys(Keys.TAB).sendKeys("Diyet").perform();
    }

    @And("Created Date gecmis bir tarih bilgisi ile doldurulur ve Save butonuna basildiginda {string} mesajinin gorunmedigi dogrulanir.")
    public void createdDateGecmisBirTarihBilgisiIleDoldurulurVeSaveButonunaBasildigindaANewRoomIsCreatedWithIdentifierMesajininGorunmedigiDogrulanir
            () {
        String date = ReusableMethods.setTheDateByRandomWithTime("dd-MM-00yyyy-HH:mm", 1, "past");
        us016Page.createDate.clear();
        us016Page.createDate.sendKeys(date);
        ReusableMethods.waitFor(10);
        us016Page.saveButon.click();
        Assert.assertFalse(us016Page.saveText.isDisplayed());
    }
}

