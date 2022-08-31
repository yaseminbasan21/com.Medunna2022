package stepdefinitions.uiStepdefinitions;


import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US026_page;
import utilities.Driver;

import utilities.ReusableMethods;

import java.io.IOException;


public class US026_stepDefinitions {

    US026_page us026_page=new US026_page();
    Actions actions=new Actions(Driver.getDriver());

    @Then("Kullanıcı CONTACT butonuna tıklar.")
    public void kullanıcıCONTACTButonunaTıklar() throws InterruptedException {
        us026_page.contButonu.click();
        Thread.sleep(3000);
    }

    @Then("Kullanıcı Contact Portal'a erişir.")
    public void kullanıcıContactPortalAErişir() throws IOException {
        Assert.assertTrue( Driver.getDriver().getCurrentUrl().equals("https://www.medunna.com/contact"));
        ReusableMethods.getScreenshot("US26_TC01");
    }


    @Then("Kullanıcı Name kutusunu görüntüler ve bir {string} girer.")
    public void kullanıcıNameKutusunuGörüntülerVeBirGirer(String name) {

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(us026_page.contNameBox.isDisplayed());
        us026_page.contNameBox.sendKeys(name);
        ReusableMethods.waitFor(3);


    }

    @Then("Kullanıcı Email kutusunu görüntüler ve bir {string} girer.")
    public void kullanıcıEmailKutusunuGörüntülerVeBirGirer(String email) {
        Assert.assertTrue(us026_page.contEmailbox.isDisplayed());
        us026_page.contEmailbox.sendKeys(email);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanıcı Subject kutusunu görüntüler ve bir {string} girer.")
    public void kullanıcıSubjectKutusunuGörüntülerVeBirGirer(String subject) {
        Assert.assertTrue(us026_page.contSubjectBox.isDisplayed());
        us026_page.contSubjectBox.sendKeys(subject);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanıcı Message kutusunu görüntüler ve bir {string} girer.")
    public void kullanıcıMessageKutusunuGörüntülerVeBirGirer(String message) {
        Assert.assertTrue(us026_page.contMessageBox.isDisplayed());
        us026_page.contMessageBox.sendKeys(message);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanıcı Send butonuna tıklar.")
    public void kullanıcıSendButonunaTıklar() {
        us026_page.contSendButonu.click();
        ReusableMethods.waitFor(5);


    }

    @Then("Kullanıcı {string} yazısını görüntüler.")
    public void kullanıcıYazısınıGörüntüler(String arg0) {
        Assert.assertTrue(us026_page.receivedYazısı.isDisplayed());
        ReusableMethods.waitFor(3);
    }



}
