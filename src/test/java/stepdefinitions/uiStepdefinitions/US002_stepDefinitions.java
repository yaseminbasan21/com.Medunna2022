package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.US001_page;
import pages.US002_page;

public class US002_stepDefinitions {

    US001_page us001_page = new US001_page();
    US002_page us002_page = new US002_page();
    Faker faker = new Faker();

    @When("Kullanici Username kismini bos birakir")
    public void kullanici_username_kismini_bos_birakir() {
        us002_page.usernameBox.sendKeys(Keys.ENTER);
    }

    @When("Kullanici Email kismini {string} ve {string} olmadan doldurur")
    public void kullanici_email_kismini_ve_olmadan_doldurur(String string, String string2) {
        us002_page.emailBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        us002_page.emailBox.sendKeys("asdfgh"+Keys.ENTER);
    }

    @When("Kullanici Email kismini {string} olmadan doldurur")
    public void kullanici_email_kismini_olmadan_doldurur(String str) {

        if (str.equals("@")){
            us002_page.emailBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
            us002_page.emailBox.sendKeys("hdfxjfhg.com");
        }
        else if (str.equals(".")){
            us002_page.emailBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
            us002_page.emailBox.sendKeys("afdshyk@dgslj"+Keys.ENTER);
        }

    }

    @When("Kullanici Email kismini {string} ve {string} kullanarak doldurur")
    public void kullanici_email_kismini_ve_kullanarak_doldurur(String string, String string2) {
        us002_page.emailBox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        us002_page.emailBox.sendKeys(faker.internet().emailAddress());

    }

    @When("Kullanici Email kismini bos birakir")
    public void kullanici_email_kismini_bos_birakir() {
        us002_page.emailBox.sendKeys(Keys.ENTER);
    }

}

