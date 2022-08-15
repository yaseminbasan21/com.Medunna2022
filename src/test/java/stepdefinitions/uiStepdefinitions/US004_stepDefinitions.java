package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.US004_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

public class US004_stepDefinitions {

    private WebDriver driver;

    US004_page ali = new US004_page();

    @And("Kullanıcı Sing in butonuna tıklar ve giris sayfasına gider")
    public void KullanıcıSingInButonunaTıklarVeGirisSayfasınaGider()  {
        ali.kullaniciSembol.click();
        ali.singInButton1.click();


    }

    @Then("Kullanıcı geçerli bir kullanıcı adı ve şifre girer ve Sing in butonuna tıklar")
    public void KullanıcıGeçerliBirKullanıcıAdıVeŞifreGirerVeSingInButonunaTıklar() throws InterruptedException {
        ali.userNameBox.sendKeys(ConfigReader.getProperty("myUserName") + Keys.TAB);
        ali.passwordBox.sendKeys(ConfigReader.getProperty("myPassword") + Keys.ENTER);
        Thread.sleep(1000);

    }


    @And("Kulanıcı başarılı bir giriş yapabildiğini görür")
    public void KullanıcıBaşarılıBirGirişYapabildiğiniGörür() throws InterruptedException {
        String actualUrl= JSUtils.getUrlByJS();
        String expectedUrl="https://www.medunna.com/";
        Assert.assertEquals(expectedUrl,actualUrl);
        Thread.sleep(1000);

    }

    @And("Kullanıcı Remember me sçeneğini görebilir")
    public void KullanıcıRememberMeSçeneğiniGörebilir() throws InterruptedException {
        ali.rememberMe.isDisplayed();
        Thread.sleep(1000);
    }

    @Then("Kullanıcı Remember me sçeneğine tıklayabilir")
    public void KullanıcıRememberMeSçeneğineTıklayabilir() throws InterruptedException {
        JSUtils.clickElementByJS(ali.rememberMe);
        ali.rememberCheckBox.isDisplayed();
        Thread.sleep(1000);
    }

    @Then("Kullanıcı Did you forget your password? secenegini görür")
    public void KullanıcıDidYouForgetYourPasswordSeceneginiGörür() throws InterruptedException {
        ali.sifremiUnuttum.isDisplayed();
        Thread.sleep(1000);
    }

    @And("Kullanıcı butona tıkladığında Reset your password sayfanına gider")
    public void ButonaTıkladığındaResetYourPasswordSayfanınaGider() {
        JSUtils.clickElementByJS(ali.sifremiUnuttum);
        String expectedUrl="https://www.medunna.com/account/reset/request";
        String actualUrl =JSUtils.getUrlByJS();
        Assert.assertEquals(expectedUrl,actualUrl);


    }

    @And("Kullanıcı You don't have an account yet? Register a new account seçeneğini görebilmeli")
    public void KullanıcıYouDonTHaveAnAccountYetRegisterANewAccountSeçeneğiniGörebilmeli() throws InterruptedException {
        ali.newAccount.isDisplayed();
        Thread.sleep(1000);
    }

    @Then("Kullanıcı Register a new account butonuna tıkladığında Registration sayfasına gidebilmeli")
    public void KullanıcıRegisterANewAccountButonunaTıkladığındaRegistrationSayfasınaGidebilmeli() throws InterruptedException {
        JSUtils.clickElementByJS(ali.newAccount);
        String actualUrl=JSUtils.getUrlByJS();
        String expectedUrl="https://www.medunna.com/account/register";
        Assert.assertEquals(expectedUrl,actualUrl);
        Thread.sleep(1000);
    }

    @And("Kullanıcı Cancel butonunu görebilmeli")
    public void KullanıcıCancelButonunuGörebilmeli() throws InterruptedException {
        ali.cancel.isDisplayed();
        System.out.println(JSUtils.getUrlByJS());
        Thread.sleep(1000);
    }

    @Then("Kullanıcı Cancel butonuna tıkladığında sayfadan çıkabilmeli")
    public void KullanıcıCancelButonunaTıkladığındaSayfadanÇıkabilmeli() throws InterruptedException {
        JSUtils.clickElementByJS(ali.cancel);
        String actualUrl=JSUtils.getUrlByJS();
        String expectedUrl="https://www.medunna.com/home";
        Assert.assertEquals(expectedUrl,actualUrl);
        Thread.sleep(1000);

    }

    @And("Kullanıcı singOut yapar ve sayfayı kapatır")
    public void KullanıcısingoutYaparVeSayfayıKapatır() {
        ali.kullaniciSembol.click();
        ali.singOut.click();
        Driver.closeDriver();
    }


}
