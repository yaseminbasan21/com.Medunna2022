package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.*;
import pojos.US20_registerPojo1;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US020_stepDefinitions1 {


    Login1_page loginPage = new Login1_page();
    US020_page userPage = new US020_page();
    US005_page us005_page= new US005_page();
    Faker faker = new Faker();
    US20_registerPojo1 registerpojo20= new US20_registerPojo1();
    US001_page us001_page = new US001_page();
    US002_page us002_page = new US002_page();

//tc_01

    @Given("Kullanici  Medunna adresine gider")
    public void kullanici_medunna_adresine_gider() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        Thread.sleep(1000);

    }

    @Then("Ardından Admin oturum açar")
    public void ardından_admin_oturum_açar() throws InterruptedException {

        us005_page.profileIcon.click();
        Thread.sleep(1000);
        us005_page.signInElementi.click();
        Thread.sleep(1000);
        loginPage.usernameBox.sendKeys("Irfan_team83");
        loginPage.passwordBox.sendKeys("Irfan_83");
        loginPage.signInButton.click();



    }

    @Then("Admin, Yönetimler'e ve ardından Kullanıcı Yönetimi'ne tıklar.")
    public void admin_yönetimler_e_ve_ardından_kullanıcı_yönetimi_ne_tıklar() {
        ReusableMethods.waitForVisibility(userPage.administration, 5).click();
        ReusableMethods.waitForVisibility(userPage.userManagement, 5).click();

    }

    @Then("Admin, Görüntüle düğmesine tıklar")
    public void admin_görüntüle_düğmesine_tıklar() {

        ReusableMethods.waitForVisibility(userPage.viewButton, 5).click();



    }

    @Then("Admin, kullanıcının sayfadaki bilgilerini doğrular")
    public void admin_kullanıcının_sayfadaki_bilgilerini_doğrular() {

        ReusableMethods.waitForVisibility(userPage.firstNameText, 5);
        Assert.assertTrue(userPage.firstNameText.isDisplayed());
        ReusableMethods.waitForVisibility(userPage.lastNameText, 5);
        Assert.assertTrue(userPage.lastNameText.isDisplayed());
        ReusableMethods.waitForVisibility(userPage.emailText, 5);
        Assert.assertTrue(userPage.emailText.isDisplayed());


    }

    @Then("Ardından Admin uygulamayı kapatır")
    public void ardından_admin_uygulamayı_kapatır() {

        Driver.closeDriver();

    }


//TC_02
/*
    @Given("Kullanici  Medunna adresine gider")
    public void kullanici_medunna_adresine_gider() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Ardından Admin oturum açar")
    public void ardından_admin_oturum_açar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Admin, Yönetimler'e ve ardından Kullanıcı Yönetimi'ne tıklar.")
    public void admin_yönetimler_e_ve_ardından_kullanıcı_yönetimi_ne_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

       */


    @Then("Admin Düzenle düğmesine tıklar")
    public void admin_düzenle_düğmesine_tıklar() {

        ReusableMethods.waitForVisibility(userPage.editButton, 5).click();
    }

    @Then("Admin kullanıcıya rol atar")
    public void admin_kullanıcıya_rol_atar() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        Select select = new Select(userPage.profileDropdown);
        select.selectByVisibleText("ROLE_USER");
    }

    @Then("Admin Kaydet düğmesine tıklar")
    public void admin_kaydet_düğmesine_tıklar() {
        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.saveButton, 5));
        Assert.assertTrue(ReusableMethods.waitForVisibility(userPage.successMessage, 5).isDisplayed());
    }



    //TC_03
/*
    @Given("Kullanici  Medunna adresine gider")
    public void kullanici_medunna_adresine_gider() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Ardından Admin oturum açar")
    public void ardından_admin_oturum_açar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Admin, Yönetimler'e ve ardından Kullanıcı Yönetimi'ne tıklar.")
    public void admin_yönetimler_e_ve_ardından_kullanıcı_yönetimi_ne_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Admin Düzenle düğmesine tıklar")
    public void admin_düzenle_düğmesine_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

     */


    @Then("Admin, kullanıcının durumunu etkinleştirir")
    public void admin_kullanıcının_durumunu_etkinleştirir() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        ReusableMethods.waitForVisibility(userPage.activatedCheckbox, 5).click();

        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.saveButton, 5));
        Assert.assertTrue(ReusableMethods.waitForVisibility(userPage.successMessage, 5).isDisplayed());



  /*  @Then("Ardından Admin uygulamayı kapatır")
    public void ardından_admin_uygulamayı_kapatır() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
*/
    }
//TC_04
    /*
        @Given("Kullanici  Medunna adresine gider")
       public void kullanici_medunna_adresine_gider() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        }
        */


    @Then("Verilen kullanıcı register sayfasında")
    public void verilen_kullanıcı_register_sayfasında() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("registerUrl"));
        Thread.sleep(1000);



    }

    @Then("Verilen kullanıcı {string} olarak geçerli bir SSN numarası girer")
    public void verilen_kullanıcı_olarak_geçerli_bir_ssn_numarası_girer(String string) {

        faker.idNumber().ssnValid();
        Driver.waitAndSendText(userPage.ssnBox, faker.idNumber().ssnValid());
        registerpojo20.setSsn(faker.idNumber().ssnValid());



    }

    @Then("Ve kullanıcı {string} olarak geçerli bir ad girer")
    public void ve_kullanıcı_olarak_geçerli_bir_ad_girer(String string) {
        faker.name().firstName();
        Driver.waitAndSendText(userPage.firstNameBox, "Team55_" );
        registerpojo20.setFirstName("Team55_" );
    }

    @Then("Ve kullanıcı {string} olarak geçerli bir soyadı girer")
    public void ve_kullanıcı_olarak_geçerli_bir_soyadı_girer(String string) {

        faker.name().lastName();
        Driver.waitAndSendText(userPage.lastNameBox, "_Team55");
        registerpojo20.setLastName("_Team55");
    }

    @Then("Ve kullanıcı {string} olarak bir kullanıcı adı girer")
    public void ve_kullanıcı_olarak_bir_kullanıcı_adı_girer(String string) {
        faker.name().username();
        Driver.waitAndSendText(userPage.usernameBox, "Team55_");
        registerpojo20.setLogin("Team55_");
    }

    @Then("Ve kullanıcı {string} olarak geçerli bir e-posta adresi girer")
    public void ve_kullanıcı_olarak_geçerli_bir_e_posta_adresi_girer(String string) {
        faker.internet().emailAddress();
        Driver.waitAndSendText(userPage.emailBox, faker.internet().emailAddress());
        registerpojo20.setEmail(faker.internet().emailAddress());
    }

    @Then("Ve kullanıcı {string} olarak yeni bir şifre girer ve şifreyi {string} olarak onaylar.")
    public void ve_kullanıcı_olarak_yeni_bir_şifre_girer_ve_şifreyi_olarak_onaylar(String string, String string2) {
        faker.internet().password();
        Driver.waitAndSendText(userPage.newPasswordBox, "Baterist91.");
        Driver.waitAndSendText(userPage.confirmPasswordBox, "Baterist91.");
        registerpojo20.setPassword("Baterist91.");
    }

    @Then("Ve kullanıcı kayıt düğmesine tıklar")
    public void ve_kullanıcı_kayıt_düğmesine_tıklar() {
        userPage.registerButton.submit();
    }

    @Then("Ardından kullanıcı kayıt başarılı mesajını görmelidir")
    public void ardından_kullanıcı_kayıt_başarılı_mesajını_görmelidir() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(userPage.registrationSuccessMessage, 5).isDisplayed());
    }




        /*
@Then("Ardından Admin oturum açar")
public void ardından_admin_oturum_açar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        }
        */

    @Then("Kullanici  Medunna login adresine gider")
    public void kullanici_medunna_login_adresine_gider() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaLoginUrl"));
        Thread.sleep(1000);


    }
    @Then("Ardından Admins oturum açar")
    public void ardından_admins_oturum_açar() throws InterruptedException {



        loginPage.usernameBox.sendKeys("Irfan_team83");
        loginPage.passwordBox.sendKeys("Irfan_83");
        loginPage.signInButton.click();


    }

    @Then("Admin, Yönetimler'e ve ardından Kullanıcıs Yönetimi'ne tıklar.")
    public void admin_yönetimler_e_ve_ardından_kullanıcıs_yönetimi_ne_tıklar() {
        ReusableMethods.waitForVisibility(userPage.administration, 5).click();
        ReusableMethods.waitForVisibility(userPage.userManagement, 5).click();

    }


    @Then("Ve Adminkullanıcıyı siler")
    public void ve_adminkullanıcıyı_siler() throws InterruptedException {

        Thread.sleep(3000);
        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.idButton, 5));
        Thread.sleep(3000);
        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.deleteButton, 5));
        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.deleteConfirmButton, 5));

        Assert.assertTrue(ReusableMethods.waitForVisibility(userPage.userDeletedMessage, 5).isDisplayed());

    }

        /*
@Then("Ardından Admin uygulamayı kapatır")
public void ardından_admin_uygulamayı_kapatır() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        }
      */
}

