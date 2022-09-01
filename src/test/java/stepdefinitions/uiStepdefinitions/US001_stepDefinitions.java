package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.US001_page;
import pages.US002_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import static org.junit.Assert.*;

public class US001_stepDefinitions {

    US001_page us001_page = new US001_page();
    US002_page us002_page = new US002_page();
    Faker faker = new Faker();

    @Given("Kullanici Medunna sayfasina gider")
    public void kullanici_medunna_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Kullanici register sayfasina gider")
    public void kullanici_register_sayfasina_gider() {

        us001_page.girisIkon.click();
        us001_page.registerButton.click();

    }

    @Then("Kullanici SSN kismina {int}. ve {int}. rakamdan sonra {string} isareti olmadan {int} haneli bir sayi girer")
    public void kullanici_ssn_kismina_ve_rakamdan_sonra_isareti_olmadan_haneli_bir_sayi_girer(Integer int1, Integer int2, String string, Integer int3) {
        us001_page.ssnBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        us001_page.ssnBox.sendKeys("532854962" + Keys.ENTER);
    }

    @Then("Kullanici {string} yazisinin gorundugunu kontrol eder")
    public void kullanici_yazisinin_gorundugunu_kontrol_eder(String mesaj) {

        if (mesaj.equals("Your SSN is invalid")){
            assertTrue(us001_page.ssnInvalidYazisi.isDisplayed());
        }
        else if (mesaj.equals("Your SSN is required.")){
            assertTrue(us001_page.ssnRequiredYazisi.isDisplayed());
        }
        else if (mesaj.equals("Your FirstName is required.")){
            assertTrue(us001_page.firstNameRequiredYazisi.isDisplayed());
        }
        else if (mesaj.equals("Your LastName is required.")){
            assertTrue(us001_page.lastNameRequiredYazisi.isDisplayed());
        }
        else if (mesaj.equals("Your username is required.")){
            assertTrue(us002_page.userNameReqiredYazisi.isDisplayed());
        }
        else if (mesaj.equals("This field is invalid")){
            assertTrue(us002_page.emailInvalidYazisi.isDisplayed());
        }
        else if (mesaj.equals("Your email is required.")){
            assertTrue(us002_page.emailRequiredYazisi.isDisplayed());
        }


    }

    @Then("Kullanici SSN kismina {int}. ve {int}. rakamdan sonra {string} isareti koyarak sekiz haneli bir sayi girer")
    public void kullanici_ssn_kismina_ve_rakamdan_sonra_isareti_koyarak_sekiz_haneli_bir_sayi_girer(Integer int1, Integer int2, String string) {
        us001_page.ssnBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        us001_page.ssnBox.sendKeys("564-56-205"+Keys.ENTER);
    }

    @Then("Kullanici SSN kismina {int}. ve {int}. rakamdan sonra {string} isareti koyarak dokuz haneli bir sayi girer")
    public void kullanici_ssn_kismina_ve_rakamdan_sonra_isareti_koyarak_dokuz_haneli_bir_sayi_girer(Integer int1, Integer int2, String string) {
        us001_page.ssnBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        us001_page.ssnBox.sendKeys("564-56-2052"+Keys.ENTER);
    }

    @Then("Kullanici {string} ve {string} yazilarinin gorunmedigini kontrol eder")
    public void kullanici_ve_yazilarinin_gorunmedigini_kontrol_eder(String string, String string2) {

        us001_page.firstNameBox.sendKeys(faker.name().firstName());
        us001_page.lastNameBox.sendKeys(faker.name().lastName());
        us001_page.usernameBox.sendKeys(faker.name().username());
        us001_page.emailBox.sendKeys(faker.internet().emailAddress());

        String fakePassword= faker.internet().password(8,10);
        us001_page.firstPasswordBox.sendKeys(fakePassword);
        us001_page.secondPassworddBox.sendKeys(fakePassword + Keys.TAB + Keys.ENTER);

        ReusableMethods.waitFor(1);
        assertTrue(us001_page.ssngirisDogrulamaYazisi.isDisplayed());

    }

    @Then("Kullanici SSN kismini bos birakir")
    public void kullanici_ssn_kismini_bos_birakir() {
        us001_page.ssnBox.sendKeys(Keys.ENTER);
    }

    @When("Kullanici Firstname kismini bos birakir")
    public void kullanici_firstname_kismini_bos_birakir() {
        us001_page.firstNameBox.sendKeys(Keys.ENTER);
    }

    @When("Kullanici Firstname kismina rastgele bir karakter girer")
    public void kullanici_firstname_kismina_rastgele_bir_karakter_girer() {
        us001_page.firstNameBox.sendKeys(faker.internet().password(1,2)+Keys.ENTER);
    }

    @When("Kullanici {string} yazisinin gorunmedigini kontrol eder")
    public void kullanici_yazisinin_gorunmedigini_kontrol_eder(String mesaj) {

        if (mesaj.equals("Your FirstName is required.")){
            us001_page.ssnBox.sendKeys(faker.idNumber().ssnValid());
            us001_page.lastNameBox.sendKeys(faker.name().lastName());
            us001_page.usernameBox.sendKeys(faker.name().username());
            us001_page.emailBox.sendKeys(faker.internet().emailAddress());
            String fakePassword= faker.internet().password(8,10);
            us001_page.firstPasswordBox.sendKeys(fakePassword);
            us001_page.secondPassworddBox.sendKeys(fakePassword + Keys.TAB + Keys.ENTER);
            ReusableMethods.waitFor(1);
            assertTrue(us001_page.girisDogrulamaYazisi.isDisplayed());
        }
        else if (mesaj.equals("Your LastName is required.")){
            us001_page.ssnBox.sendKeys(faker.idNumber().ssnValid());
            us001_page.firstNameBox.sendKeys(faker.name().firstName());
            us001_page.usernameBox.sendKeys(faker.name().username());
            us001_page.emailBox.sendKeys(faker.internet().emailAddress());
            String fakePassword= faker.internet().password(8,10);
            us001_page.firstPasswordBox.sendKeys(fakePassword);
            us001_page.secondPassworddBox.sendKeys(fakePassword + Keys.TAB + Keys.ENTER);
            ReusableMethods.waitFor(1);
            assertTrue(us001_page.girisDogrulamaYazisi.isDisplayed());
        }
        else if (mesaj.equals("This field is invalid")){
            us001_page.ssnBox.sendKeys(faker.idNumber().ssnValid());
            us001_page.firstNameBox.sendKeys(faker.name().firstName());
            us001_page.lastNameBox.sendKeys(faker.name().lastName());
            us001_page.usernameBox.sendKeys(faker.name().username());
            String fakePassword= faker.internet().password(8,10);
            us001_page.firstPasswordBox.sendKeys(fakePassword);
            us001_page.secondPassworddBox.sendKeys(fakePassword + Keys.TAB + Keys.ENTER);
            ReusableMethods.waitFor(1);
            assertTrue(us001_page.girisDogrulamaYazisi.isDisplayed());
        }
        else if (mesaj.equals("Your email is required.")){
            assertFalse(us002_page.emailRequiredYazisi.isDisplayed());
        }

    }

    @When("Kullanici Last Name kismini bos birakir")
    public void kullanici_last_name_kismini_bos_birakir() {
        us001_page.lastNameBox.sendKeys(Keys.ENTER);
    }

    @When("Kullanici lastname kismina rastgele bir karakter girer")
    public void kullanici_lastname_kismina_rastgele_bir_karakter_girer() {
        us001_page.lastNameBox.sendKeys(faker.internet().password(1,2)+ Keys.ENTER);
    }



}
