package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US014_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_14_stepdefinitions {
    US014_page us14 =new US014_page();
    Actions action=new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("doktorHaticee {string} anasayfasinda")
    public void doktorhaticeeAnasayfasinda(String hMedunna) {
        ReusableMethods.waitFor(3);
        Driver.getDriver().get(ConfigReader.getProperty("hMedunnaUrl"));
    }

    @Then("doktorHaticee login butonuna tiklar")
    public void doktorhaticeeLoginButonunaTiklar() {
        ReusableMethods.waitFor(2);
        us14.login.click();
    }

    @Then("doktorHaticee sing in tiklar")
    public void doktorhaticeeSingInTiklar() {
        ReusableMethods.waitFor(2);
        us14.singInButonu.click();
    }

    @Then("doktorHaticee username ve password girer")
    public void doktorhaticeeUsernameVePasswordGirer() {
        ReusableMethods.waitFor(2);
        us14.username.sendKeys(ConfigReader.getProperty("hdoktorusername"));
        us14.password.sendKeys(ConfigReader.getProperty("hdoktorpassword"));
    }

    @And("doktorHaticee sing in butonununa tiklar")
    public void doktorhaticeeSingInButonununaTiklar() {
        ReusableMethods.waitFor(2);
        us14.singInEnter.click();

    }

    @And("doktorHatice MY PAGES butonuna tiklar")
    public void doktorhaticeMYPAGESButonunaTiklar() {
        ReusableMethods.waitFor(2);
        us14.myPagesButonu.click();
    }

    @When("My Inpatients butonuna tiklar")
    public void myInpatientsButonunaTiklar() {
        ReusableMethods.waitFor(2);
        us14.myInpatientsButonu.click();

    }

    @Then("In Patiens basligi gorulur")
    public void ınPatiensBasligiGorulur() {
        ReusableMethods.waitFor(2);
        us14.inPatientsBasligi.click();
    }
    @And("doktorHaticee yatan hastalarin tum bilgilerini gorur")
    public void doktorhaticeeYatanHastalarinTumBilgileriniGorur() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(us14.id.isDisplayed());
        Assert.assertTrue(us14.startDate.isDisplayed());
        Assert.assertTrue(us14.enddate.isDisplayed());
        Assert.assertTrue(us14.status.isDisplayed());
        Assert.assertTrue(us14.description.isDisplayed());
        Assert.assertTrue(us14.createdDate.isDisplayed());
        Assert.assertTrue(us14.room.isDisplayed());
        Assert.assertTrue(us14.appointment.isDisplayed());
        Assert.assertTrue(us14.patient.isDisplayed());
    }

    @And("doktorHatice edit butonuna tiklar")
    public void doktorhaticeEditButonunaTiklar() {
        ReusableMethods.waitFor(2);
        us14.editButonu.click();
    }

    @And("Create or edit a in Patient basligi gorulur")
    public void createOrEditAInPatientBasligiGorulur() {
        String expectedResult="Create or edit a In Patient";
        String actualResult= us14.createoreditbasligi.getText();
        Driver.wait(5);
        Assert.assertEquals(expectedResult,actualResult);
    }


    @And("statusu sekmesine tiklar unapproved,discharged,still staying,cancelled birini secebilir")
    public void unapprovedDischargedStillStayingCancelledBiriniSecebilir() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForVisibility(us14.statusSekmesi,15);
        Select select=new Select(us14.statusSekmesi);
        List<WebElement> statuler=select.getOptions();
        for (WebElement each: statuler
        ) {
            each.click();
        }
        System.out.println("statuler = " + statuler);

    }

    @Then("doktorHatice rezerve edilmis odayi gunceller")
    public void doktorhaticeRezerveEdilmisOdayiGunceller() {
        ReusableMethods.waitFor(2);
        Select select =new Select(us14.roomSekmesi);
        List<WebElement> roomOptions = select.getOptions();

        for (int i =1; i <roomOptions.size(); i++){
            if (!(roomOptions.get(i).getText().contains("FULL-UNAVAILABLE"))){
                roomOptions.get(i).click();
                break;
            }
        }
    }

   @And("doktorHaticee sayfayi kapatir")
    public void doktorhaticeeSayfayiKapatir() {
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }

    /*
     @And("select a  room with available room")
    public void selectARoomWithAvailableRoom() {
        ReusableMethods.waitFor(2);
        Select select =new Select(mp.roomSelect);
        List<WebElement> roomOptions = select.getOptions();

        for (int i =1; i <roomOptions.size(); i++){
            if (!(roomOptions.get(i).getText().contains("FULL-UNAVAILABLE"))){
                roomOptions.get(i).click();
                break;
            }
        }
        ReusableMethods.waitFor(2);
        select.getFirstSelectedOption().getText();
    }

     */

}
