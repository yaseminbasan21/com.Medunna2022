package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US006_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_006_Stepdefinitions {

    US006_page us006_page =new US006_page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanıcı {string} adresine gider.")
    public void kullanıcıAdresineGider(String medunna) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }


    @And("Giriş hesap butonunun ardından sign in butonuna tıklar.")
    public void girişHesapButonununArdındanSignInButonunaTıklar() {
        us006_page.girisHesapButonu.click();
        ReusableMethods.waitFor(3);
        us006_page.signInButonu.click();
        ReusableMethods.waitFor(3);
    }


    @And("Kullanıcı geçerli bir username girer.")
    public void kullanıcıGeçerliBirUsernameGirer(){
        us006_page.usernameBox.click();
        us006_page.usernameBox.sendKeys(ConfigReader.getProperty("US006_Username"));
        ReusableMethods.waitFor(3);
    }


    @And("Kullanıcı geçerli bir password girer.")
    public void kullanıcıGeçerliBirPasswordGirer() {
        us006_page.passwordBox.click();
        us006_page.passwordBox.sendKeys(ConfigReader.getProperty("US006_Password"));
        ReusableMethods.waitFor(3);
    }


    @And("Kullanıcı sign in butonuna tıklar ve hesabına giriş yapar.")
    public void kullanıcıSignInButonunaTıklarVeHesabınaGirişYapar() {
        us006_page.girisSignInButonu.click();
        ReusableMethods.waitFor(3);
    }


    @And("Kullanıcı,kullanıcı hesap butonunun ardından settings butonuna tıklar.")
    public void kullanıcıKullanıcıHesapButonununArdındanSettingsButonunaTıklar() {
        us006_page.HesapButonu.click();
        ReusableMethods.waitFor(5);
        us006_page.settingsButonu.click();
    }


    @And("Kullanıcı,metin için kullanıcı ayarları yazısını görür.")
    public void kullanıcıMetinIçinKullanıcıAyarlarıYazısınıGörür() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(us006_page.userSettingsFor,3).isDisplayed());

    }

    @And("Kullanıcı ayarlarındaki Firstname, Lastname ve Email kutusunda yazan kullanıcı bilgilerinin kullanıcıya ait olduğunu görüntüler.")
    public void kullanıcıAyarlarındakiFirstnameLastnameVeEmailKutusundaYazanKullanıcıBilgilerininKullanıcıyaAitOlduğunuGörüntüler() {
        Assert.assertTrue(us006_page.firstnameBox.isDisplayed());
        Assert.assertTrue(us006_page.lastnameBox.isDisplayed());
        Assert.assertTrue(us006_page.emailBox.isDisplayed());

    }

    @And("Sayfayı kapatır")
    public void sayfayıKapatır() {
        Driver.closeDriver();
    }

    @Then("Firstname kutusu görüntülenmeli ve {string} olarak güncellenmelidir")
    public void firstnameKutusuGörüntülenmeliVeOlarakGüncellenmelidir(String firstname) {
        Assert.assertTrue(us006_page.firstnameBox.isDisplayed());
        us006_page.firstnameBox.clear();
        us006_page.firstnameBox.sendKeys(firstname);
        ReusableMethods.waitFor(5);

    }

    @Then("Lastname kutusu görüntülenmeli ve {string} olarak güncellenmelidir.")
    public void lastnameKutusuGörüntülenmeliVeOlarakGüncellenmelidir(String lastname) {
        Assert.assertTrue(us006_page.lastnameBox.isDisplayed());
        us006_page.lastnameBox.clear();
        us006_page.lastnameBox.sendKeys(lastname);
        ReusableMethods.waitFor(5);

    }

    @Then("Email kutusu görüntülenmeli ve {string} olarak güncellenmelidir.")
    public void emailKutusuGörüntülenmeliVeOlarakGüncellenmelidir(String email) {
        Assert.assertTrue(us006_page.emailBox.isDisplayed());
        us006_page.emailBox.clear();
        us006_page.emailBox.sendKeys(email);
    }

    @Then("Kullanıcı Save butonuna tıklamalıdır.")
    public void kullanıcıSaveButonunaTıklamalıdır() {
        us006_page.saveButonu.click();
        ReusableMethods.waitFor(5);
    }


    @Then("Kullanıcı Settings saved! yazısını görüntüleyebilmelidir.")
    public void kullanıcıSettingsSavedYazısınıGörüntüleyebilmelidir() {
        Assert.assertTrue(us006_page.settingsSaved.isDisplayed());
    }

    @Then("Kullanıcı firstname kutusunu boş bırakır")
    public void kullanıcıFirstnameKutusunuBoşBırakır() {
        ReusableMethods.waitForVisibility(us006_page.firstnameBox,3).clear();
        Driver.waitAndSendText(us006_page.firstnameBox,"");
        actions.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(5);
        actions.sendKeys(Keys.TAB).build().perform();


    }

    @Then("kullanıcı Your first name is required. yazısını görmelidir")
    public void kullanıcıYourFirstNameIsRequiredYazısınıGörmelidir() {
      Assert.assertTrue(us006_page.firstnameRequired.isDisplayed());
    }

    @Then("Kullanıcı lastname kutusunu boş bırakır")
    public void kullanıcıLastnameKutusunuBoşBırakır() {
        ReusableMethods.waitForVisibility(us006_page.lastnameBox,3).clear();
        Driver.waitAndSendText(us006_page.lastnameBox,"");
        actions.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(5);
        actions.sendKeys(Keys.TAB).build().perform();
    }

    @Then("Kullanıcı Your last name is required. yazısını görmelidir.")
    public void kullanıcıYourLastNameIsRequiredYazısınıGörmelidir() {
        Assert.assertTrue(us006_page.lastnameRequired.isDisplayed());
    }

    @Then("Kullanıcı email kutusunu boş bırakır")
    public void kullanıcıEmailKutusunuBoşBırakır() {
        ReusableMethods.waitForVisibility(us006_page.emailBox,3).clear();
        Driver.waitAndSendText(us006_page.emailBox,"");
        actions.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(5);
        actions.sendKeys(Keys.TAB).build().perform();

    }

    @Then("Your email is required. yazısını görmelidir")
    public void yourEmailIsRequiredYazısınıGörmelidir() {
        Assert.assertTrue(us006_page.emailRequired.isDisplayed());
    }

    @Then("Kullanıcı geçerli bir firstname girer {string}")
    public void kullanıcıGeçerliBirFirstnameGirer(String firstname) {
          us006_page.firstnameBox.sendKeys(firstname);
          ReusableMethods.waitFor(5);
    }

    @Then("Kullanıcı geçerli bir lastname girer {string}")
    public void kullanıcıGeçerliBirLastnameGirer(String lastname) {
        us006_page.lastnameBox.sendKeys(lastname);
        ReusableMethods.waitFor(5);
    }

    @Then("Kullanıcı hatalı bir email girer {string}")
    public void kullanıcıHatalıBirEmailGirer(String email) {
        us006_page.emailBox.sendKeys(email);
    }



}
