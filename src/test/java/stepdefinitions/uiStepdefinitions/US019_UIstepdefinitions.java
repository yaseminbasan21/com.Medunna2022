package stepdefinitions.uiStepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US019_page;

import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;


public class US019_UIstepdefinitions {
    US019_page us019_page = new US019_page();

    @And("kullanici admin olarak itemsTitles a tiklar")
    public void kullaniciAdminOlarakItemsTitlesATiklar() throws InterruptedException {
        Thread.sleep(1000);
        Driver.waitAndClick(us019_page.itemsTitles);

    }


    @And("kullanici admin olarak acilan DDM den Staff a tiklar")
    public void kullaniciAdminOlarakAcilanDDMDenStaffATiklar() {
        Driver.waitAndClick(us019_page.staff);
    }

    @And("kullanici admin olarak Create a new Staff butonuna tiklar")
    public void kullaniciAdminOlarakCreateANewStaffButonunaTiklar() {
        Driver.waitAndClick(us019_page.createStaff);
    }

    @And("kullanici admin olarak Use Search kutucugunu isaretleyip SSN kutusuna cagiracagi staff in SSN numarasini girer")
    public void kullaniciAdminOlarakUseSearchKutucugunuIsaretleyipSSNKutusunaCagiracagiStaffInSSNNumarasiniGirer() {
        Driver.waitAndClick(us019_page.useSearch);
        us019_page.ssnKutusu.sendKeys("652-32-3265");


    }

    @Then("kullanici admin olarak Search User butonuna tiklar")
    public void kullaniciAdminOlarakSearchUserButonunaTiklar() {
        JSUtils.clickElementByJS(us019_page.searchUser);
        //Assert.assertTrue(us019_page.userCagirText.isDisplayed());

    }

    @Given("kullanici admin olarak guncellemek istedigi bilgileri ilgili kutulara doldurur")
    public void kullaniciAdminOlarakGuncellemekIstedigiBilgileriIlgiliKutularaDoldurur() throws InterruptedException {
        Thread.sleep(1000);
        us019_page.firstNameKutusu.clear();
        Thread.sleep(1000);
        us019_page.firstNameKutusu.sendKeys("Emir can");
        Thread.sleep(1000);
        us019_page.lastNameKutusu.clear();
        Thread.sleep(1000);
        us019_page.lastNameKutusu.sendKeys("Ercik");
        Thread.sleep(1000);
        String date = ReusableMethods.setTheDateByRandomWithTime("dd-MM-00yyyy-HH:mm", 20, "past");
        us019_page.birthDay.clear();
        Thread.sleep(1000);
        us019_page.birthDay.sendKeys(date);
        Thread.sleep(1000);
        us019_page.phoneKutusu.clear();
        Thread.sleep(1000);
        Driver.waitAndSendText(us019_page.phoneKutusu, "532-684-9586");
        Thread.sleep(1000);
        Select gender = new Select(us019_page.genderDdm);
        gender.selectByVisibleText("MALE");
        Thread.sleep(1000);
        Select bloodGrup = new Select(us019_page.bloodGroupDdm);
        bloodGrup.selectByIndex(1);
        Thread.sleep(1000);
        Driver.waitAndSendText(us019_page.addressKutusu, "Adana");
        Thread.sleep(1000);
        Driver.waitAndSendText(us019_page.description, "Personel");
        Thread.sleep(1000);
        Select user = new Select(us019_page.huser);
        user.selectByVisibleText("huseyinstaff");
        Thread.sleep(1000);
        Select country = new Select(us019_page.countryDdm);
        country.selectByIndex(1);
        JSUtils.clickElementByJS(us019_page.saveButon);
        //Assert.assertTrue(us019_page.kayitMesaji.isDisplayed());
    }


    @Given("kullanici admin olarak bilgilerini duzenlemek istedigi Staff in uzerine gelip edit i tiklar")
    public void kullaniciAdminOlarakBilgileriniDuzenlemekIstedigiStaffInUzerineGelipEditITiklar() throws InterruptedException {
        Thread.sleep(3000);
        us019_page.sirala.click();
        Thread.sleep(3000);
        JSUtils.clickElementByJS(us019_page.editButon);
        Thread.sleep(1000);
        us019_page.firstNameKutusu.clear();
        Thread.sleep(1000);
        us019_page.firstNameKutusu.sendKeys("Huseyin");
        Thread.sleep(1000);
        us019_page.lastNameKutusu.clear();
        Thread.sleep(1000);
        us019_page.lastNameKutusu.sendKeys("Emir");

        Select country = new Select(us019_page.countryDdm);
        country.selectByIndex(2);

        JSUtils.clickElementByJS(us019_page.saveButon);
        Thread.sleep(3000);


    }

    @Given("kullanici admin olarak bilgilerini silmek istedigi Staff in uzerine gelip Delete ye tiklar")
    public void kullaniciAdminOlarakBilgileriniSilmekIstedigiStaffInUzerineGelipDeleteYeTiklar() throws InterruptedException {
        Thread.sleep(3000);
        JSUtils.clickElementByJS(us019_page.deleteButon);
    }

    @When("kullanici admin olarak Confirm delete operation dan tekrar Delete ye tiklar")
    public void kullaniciAdminOlarakConfirmDeleteOperationDanTekrarDeleteYeTiklar() throws InterruptedException {
        Thread.sleep(3000);
        JSUtils.clickElementByJS(us019_page.confirmDelete);
        //Assert.assertTrue(us019_page.silindiMesaj.isDisplayed());

    }
}
