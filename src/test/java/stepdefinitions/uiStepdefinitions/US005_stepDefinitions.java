package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.US005_page;
import utilities.ConfigReader;
import utilities.Driver;

public class US005_stepDefinitions {


    US005_page us005_page=new US005_page();








    @Given("Kullanıcı Medunna sitesine gider")
    public void kullanıcıMedunnaSitesineGider() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
        Thread.sleep(1000);
    }

    @When("Kullanıcı  Make an Appointment butonuna tıklar.")
    public void kullanıcıMakeAnAppointmentButonunaTıklar() throws InterruptedException {

        us005_page.mainpageMakeAnAppointmentButtonu.click();
        Thread.sleep(1000);


    }

    @And("Kullanıcı geçerli bir isim girer.")
    public void kullanıcıGeçerliBirIsimGirer() throws InterruptedException {
        us005_page.mainpageFirstnameTextBox.sendKeys("Hasta");
        Thread.sleep(1000);



    }

    @And("Kullanıcı geçerli bir soyisim girer.")
    public void kullanıcıGeçerliBirSoyisimGirer() throws InterruptedException {
        us005_page.mainpageLastnameTextBox.sendKeys("Medunna");
        Thread.sleep(1000);
    }

    @And("Kullanıcı geçerli bir SSN girer")
    public void kullanıcıGeçerliBirSSNGirer() throws InterruptedException {
        us005_page.mainpageSSNTextBox.sendKeys("159-75-7899");
        Thread.sleep(1000);
    }

    @And("Kullanıcı geçerli bir e mail girer.")
    public void kullanıcıGeçerliBirEMailGirer() throws InterruptedException {
        us005_page.mainpageEmailTextBox.sendKeys("semiharpacik42@gmail.com");
        Thread.sleep(1000);
    }

    @And("Kullanıcı geçerli bir numara girer.")
    public void kullanıcıGeçerliBirNumaraGirer() throws InterruptedException {

        us005_page.mainpagePhoneTextBox.sendKeys("555-255-5555");
        Thread.sleep(6000);
    }

    @And("Kullanıcı randevu oluştur butonua tıklar.")
    public void kullanıcıRandevuOluşturButonuaTıklar() throws InterruptedException {
        us005_page.mainpageSendAnAppointmentRequestButton.click();


    }

    @And("Kullanıcı randevu oluşturuldu yazısını görür.")
    public void kullanıcıRandevuOluşturulduYazısınıGörür() throws InterruptedException {

        Thread.sleep(6000);


    }


    // tc_02




    @Given("Kullanıcı giriş butonuna tıklar.")
    public void kullanıcıGirişButonunaTıklar() throws InterruptedException {

        us005_page.profileIcon.click();
        Thread.sleep(1000);

    }

    @When("Kullanıcı sign in giriş butonuna tıklar")
    public void kullanıcıSignInGirişButonunaTıklar() throws InterruptedException {

        us005_page.signInElementi.click();
        Thread.sleep(1000);
    }

    @When("Kullanıcı username girer")
    public void kullanıcıUsernameGirer() throws InterruptedException {

        us005_page.usernameTextbox.sendKeys("HastaMedunna");
        Thread.sleep(1000);
    }

    @When("Kullanıcı password girer.")
    public void kullanıcıPasswordGirer() throws InterruptedException {

        us005_page.passwordTextbox.sendKeys("Baterist91.");
        Thread.sleep(1000);
    }

    @When("Kullanıcı giriş sign in butonuna tıklar.")
    public void kullanıcıGirişSignInButonunaTıklar() throws InterruptedException {
        us005_page.signInButtonu.click();
        Thread.sleep(1000);
    }

    @When("Kullanıcı My Pages butonuna tıklar")
    public void kullanıcıMyPagesButonunaTıklar() throws InterruptedException {

        us005_page.myPagesButtonu.click();
        Thread.sleep(1000);
    }

    @When("Kullanıcı My Appointments butonuna tıklar")
    public void kullanıcıMyAppointmentsButonunaTıklar() throws InterruptedException {
        us005_page.loginPageMyAppointmentsButtonu.click();
        Thread.sleep(1000);
    }

    @When("Kullanıcı oluşturduğu hasta randevusunu görür.")
    public void kullanıcıOluşturduğuHastaRandevusunuGörür() throws InterruptedException {
        Thread.sleep(9000);
    }
}



