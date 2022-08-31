package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US017_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_17_stepdefinitions {

    US017_page us17 = new US017_page();
    Actions action = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Faker faker = new Faker();

    //Tc01
    @Given("HC Admin {string} anasayfasinda")
    public void hc_admin_anasayfasinda(String medunna) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("HC Admin login butonuna tiklar")
    public void hc_admin_login_butonuna_tiklar() {
        Driver.waitAndClick(us17.hesapButonu);
    }

    @Then("HC Admin sing in tiklar")
    public void hc_admin_sing_in_tiklar() throws InterruptedException {

        Driver.waitAndClick(us17.singIn);

    }

    @Then("HC Admin {string} ve {string} girer")
    public void hcAdminVeGirer(String username, String password) throws InterruptedException {
        Thread.sleep(1000);
        us17.username.sendKeys(ConfigReader.getProperty("admin_username"));
        us17.password.sendKeys(ConfigReader.getProperty("admin_password"));
    }

    @Then("HC Admin sing in butonununa tiklar")
    public void hc_admin_sing_in_butonununa_tiklar() throws InterruptedException {
        Driver.waitAndClick(us17.singInEnter);

    }

    @Then("HC Admin  tems& Titles butonunu tiklar")
    public void hc_admin_tems_titles_butonunu_tiklar() {
        Driver.waitAndClick(us17.itemsTitles);

    }

    @Then("HC Admin acilan sekmeden Tests items sekmesini tiklar")
    public void hc_admin_acilan_sekmeden_tests_items_sekmesini_tiklar() throws InterruptedException {
        Driver.waitAndClick(us17.testItems);
        Thread.sleep(1000);

    }

    @Then("HC {string} basligi gorur")
    public void hc_basligi_gorur(String testItemsBasligi) throws InterruptedException {

        Assert.assertTrue(us17.testItemsBasligi.isDisplayed());
        Thread.sleep(1000);
    }

    @And("HC Admin Create a new Tests Items butuna tiklar")
    public void hcAdminCreateANewTestsItemsButunaTiklar() {
        Driver.waitAndClick(us17.createTestItemsButonu);
    }

    @And("HC Admin {string}, {string}, {string}, {string}, {string} doldurur")
    public void hcAdminDoldurur(String name, String Description, String Price, String DefaultMinValue, String DefaultMaxValue) throws InterruptedException {
        us17.name.clear();
        Thread.sleep(1000);
        us17.name.sendKeys(name + Keys.ENTER);
        Thread.sleep(1000);
        us17.description.clear();
        Thread.sleep(1000);
        us17.description.sendKeys(Description + Keys.ENTER);
        Thread.sleep(1000);
        us17.price.clear();
        us17.price.sendKeys(Price + Keys.ENTER);
        us17.defaultValMin.clear();
        us17.defaultValMin.sendKeys(DefaultMinValue + Keys.ENTER);
        us17.defaultValMax.clear();
        us17.defaultValMax.sendKeys(DefaultMaxValue + Keys.ENTER);
        Thread.sleep(1000);
        //js.executeScript("window.scrollBy(0,200)");

    }

    @And("HC Admin save butonuna tiklar")
    public void hcAdminSaveButonunaTiklar() throws InterruptedException {
        Driver.waitAndClick(us17.saveButonu);
        Thread.sleep(2000);

    }

    @Then("HC Admin {string} gorur")
    public void hcAdminANewTestsItemsIsCreatedWithIdentifierGorur() throws InterruptedException {
        Assert.assertTrue(us17.kayitBasariliYazisi.isDisplayed());
        Thread.sleep(2000);
        Driver.waitAndClick(us17.hesap2Butonu);
        Driver.waitAndClick(us17.singoutButonu);

    }

    //TC_02

    @And("HC Admin edit butonuna tiklar")
    public void hcAdminEditButonunaTiklar() throws InterruptedException {
        Thread.sleep(1000);
        Driver.waitAndClick(us17.editButonu);
    }

    @And("HC Admin {string}, {string}, {string}, {string}, {string} gunceller")
    public void hcAdminGunceller(String Name, String Description, String Price, String DefaultMinValue, String DefaultMaxValue) throws InterruptedException {

        us17.name.clear();
        us17.name.sendKeys(Name);
        Thread.sleep(1000);
        us17.description.clear();
        us17.description.sendKeys(Description);
        Thread.sleep(1000);
        us17.price.clear();
        us17.price.sendKeys(Price);
        Thread.sleep(1000);
        us17.defaultValMin.clear();
        us17.defaultValMin.sendKeys(DefaultMinValue);
        Thread.sleep(1000);
        us17.defaultValMax.clear();
        us17.defaultValMax.sendKeys(DefaultMaxValue);
        js.executeScript("window.scrollBy(0,200)");
       //ReusableMethods.waitForVisibility(us17.saveButonu, 2);
        Thread.sleep(1000);
        us17.saveButonu.click();
        us17.backButonu.click();
        Thread.sleep(2000);
        Driver.waitAndClick(us17.hesap2Butonu);
        Driver.waitAndClick(us17.singoutButonu);


    }

    //TC_03

    @Then("HC Admin view butonuna tiklar")
    public void hc_admin_view_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(1000);
        Driver.waitAndClick(us17.viewButonu);

    }

    @Then("HC Admin name,descriptions,price,default min,default max ve ceated date gorur")
    public void hc_admin_id_name_descriptions_price_default_min_default_max_ve_ceated_date_gorur() throws InterruptedException {
        Assert.assertTrue(us17.nameBaslik.isDisplayed());
        Assert.assertTrue(us17.descriptionBaslik.isDisplayed());
        Assert.assertTrue(us17.priceBaslik.isDisplayed());
        Assert.assertTrue(us17.defaultValMinBaslik.isDisplayed());
        Thread.sleep(1000);
        Assert.assertTrue(us17.defaultValMaxBaslik.isDisplayed());
        Assert.assertTrue(us17.createDateBaslik.isDisplayed());
        us17.backButonu.click();
        Thread.sleep(1000);
        Driver.waitAndClick(us17.hesap2Butonu);
        Driver.waitAndClick(us17.singoutButonu);

    }

    //TC_04

    @And("HC Admin delete butonuna tiklar")
    public void hcAdminDeleteButonunaTiklar() throws InterruptedException {
        Driver.waitAndClick(us17.deleteButonu);
        Thread.sleep(1000);

    }

    @And("HC Admin acilan sayfada tekrardan delete butonuna tiklar")
    public void hcAdminAcilanSayfadaTekrardanDeleteButonunaTiklar() throws InterruptedException {

        Driver.waitAndClick(us17.deleteButonu2);
        Thread.sleep(1000);
    }

    @Then("HC Admin   A test items is delete with identifier' yazisini gorur")
    public void hcAdminATestItemsIsDeleteWithIdentifierYazisiniGorur() throws InterruptedException {

        Assert.assertTrue(us17.deleteSilindiMesaji.isDisplayed());
        Thread.sleep(1000);
    }

    @Then("HC admin hesap butonundan sing out butonu ile sayfayi kapatir")
    public void hc_admin_hesap_butonundan_sing_out_butonu_ile_sayfayi_kapatir() throws InterruptedException {


        Driver.waitAndClick(us17.hesap2Butonu);
        Thread.sleep(2000);
        Driver.waitAndClick(us17.singoutButonu);


    }


    //JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    //        jse.executeScript("window.scrollBy(0,700)");

}
