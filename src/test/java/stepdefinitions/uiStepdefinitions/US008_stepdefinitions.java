package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.US008_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;

public class US008_stepdefinitions {
    US008_page us008_page = new US008_page();
    //WebDriver driver;


    @Given("kullanici medunna anasayfasinda")
    public void kullaniciMedunnaAnasayfasinda() throws MalformedURLException {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
       //driver = new RemoteWebDriver(new URL("http://192.168.1.38:4444"), new ChromeOptions());
       //driver.manage().window().maximize();
       //driver.get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("kullanici giris ikonuna tiklar")
    public void kullaniciGirisIkonunaTiklar() {
        us008_page.giris.click();
       // driver.findElement(By.xpath("//a[@class='d-flex align-items-center dropdown-toggle nav-link']")).click();
    }

    @When("kullanici Signin'a tiklar")
    public void kullaniciSigninATiklar() {
        us008_page.signIn.click();
       // driver.findElement(By.xpath("//a[@class=\"dropdown-item\"]")).click();
    }

    @And("kullanici {string} olarak gecerli bir username ve {string} password girer")
    public void kullaniciOlarakGecerliBirUsernameVePasswordGirer(String istenenKullanici, String istenenPassword) throws InterruptedException {
        us008_page.userNameKutusu.sendKeys(ConfigReader.getProperty(istenenKullanici));
        us008_page.passwordKutusu.sendKeys(ConfigReader.getProperty(istenenPassword));
        us008_page.signInButon.click();
        //Thread.sleep(3000);
        // driver.findElement(By.xpath("//input[@id='username']")).sendKeys("team55.");
        //driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Team55..");
        //driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        ReusableMethods.waitFor(3);

    }

    @And("kullanici admin hesap kismina tiklar")
    public void kullaniciAdminHesapKisminaTiklar() throws InterruptedException {
        Driver.clickWithJS(us008_page.admin);
        //Thread.sleep(2000);
        // JSUtils.clickElementByJS(driver.findElement(By.xpath("//span[normalize-space()='team55 team55']")));
        ReusableMethods.waitFor(2);
    }

    @And("kullanici doktor hesap kismina tiklar")
    public void kullaniciDoktorHesapKisminaTiklar() throws InterruptedException {
        Driver.clickWithJS(us008_page.doktor);
        //Thread.sleep(2000);
        // JSUtils.clickElementByJS(driver.findElement(By.xpath("//span[normalize-space()='huseyin ercik']")));
        ReusableMethods.waitFor(2);
    }

    @And("kullanici personel hesap kismina tiklar")
    public void kullaniciPersonelHesapKisminaTiklar() throws InterruptedException {
        Driver.clickWithJS(us008_page.personel);
        // Thread.sleep(2000);
        // JSUtils.clickElementByJS(driver.findElement(By.xpath("//span[normalize-space()='stafteam55 stafteam55']")));
        ReusableMethods.waitFor(2);

    }

    @And("kullanici hasta hesap kismina tiklar")
    public void kullaniciHastaHesapKisminaTiklar() throws InterruptedException {
        Driver.clickWithJS(us008_page.hasta);
        //Thread.sleep(2000);
//
        //JSUtils.clickElementByJS(driver.findElement(By.xpath("//span[normalize-space()='Hasta Team55 Hasta Team55']")));
        ReusableMethods.waitFor(2);

    }

    @And("kullanici acilan menuden password'a tiklar")
    public void kullaniciAcilanMenudenPasswordATiklar() {

        us008_page.password.click();
        //driver.findElement(By.xpath("//a[@href=\"/account/password\"]")).click();
    }

    @And("kullanici current password kutusuna eski parolasini {string} girer")
    public void kullaniciCurrentPasswordKutusunaEskiParolasiniGirer(String istenenPassword) {
        us008_page.currentPasswordKutusu.sendKeys(ConfigReader.getProperty(istenenPassword));
        //driver.findElement(By.xpath("//input[@name=\"currentPassword\"]")).sendKeys("Team55..");
    }

    @And("kullanici new password kutusuna yeni parolasini girer ve Password strength seviyesinin degistigini gorur")
    public void kullaniciNewPasswordKutusunaYeniParolasiniGirerVePasswordStrengthSeviyesininDegistiginiGorur() throws InterruptedException {
        us008_page.newPasswordKutusu.sendKeys("abcdefg");
        // driver.findElement(By.xpath("//input[@name=\"newPassword\"]")).sendKeys("abcdefg");
        Assert.assertTrue(us008_page.birinciLamba.isDisplayed());
        // Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"point\"])[1]")).isDisplayed());
        // Thread.sleep(2000);
        ReusableMethods.waitFor(2);
        us008_page.newPasswordKutusu.clear();
        // driver.findElement(By.xpath("//input[@name=\"newPassword\"]")).clear();
        // Thread.sleep(2000);
        ReusableMethods.waitFor(2);
        us008_page.newPasswordKutusu.sendKeys("Abcdefg");
        // driver.findElement(By.xpath("//input[@name=\"newPassword\"]")).sendKeys("Abcdefg");
        Assert.assertTrue(us008_page.ikinciLamba.isDisplayed());
        //Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"point\"])[2]")).isDisplayed());
        // Thread.sleep(2000);
        ReusableMethods.waitFor(2);
        us008_page.newPasswordKutusu.clear();
        // driver.findElement(By.xpath("//input[@name=\"newPassword\"]")).clear();
        // Thread.sleep(2000);
        ReusableMethods.waitFor(2);
        us008_page.newPasswordKutusu.sendKeys("Abcdef1");
        // driver.findElement(By.xpath("//input[@name=\"newPassword\"]")).sendKeys("Abcdef1");
        Assert.assertTrue(us008_page.donduncuLamba.isDisplayed());
        //Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"point\"])[4]")).isDisplayed());
        // Thread.sleep(2000);
        ReusableMethods.waitFor(2);
        us008_page.newPasswordKutusu.clear();
        // driver.findElement(By.xpath("//input[@name=\"newPassword\"]")).clear();
        // Thread.sleep(2000);
        ReusableMethods.waitFor(2);
        us008_page.newPasswordKutusu.sendKeys("Team55..");
        // driver.findElement(By.xpath("//input[@name=\"newPassword\"]")).sendKeys("Team55..");
        Assert.assertTrue(us008_page.besinciLamba.isDisplayed());
        //Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"point\"])[5]")).isDisplayed());


    }

    @And("kullanici Confirm the new password kutusuna yeni sifreyi {string} tekrar girer")
    public void kullaniciConfirmTheNewPasswordKutusunaYeniSifreyiTekrarGirer(String istenenPassword) throws InterruptedException {
        us008_page.confirmPasswordKutusu.sendKeys(ConfigReader.getProperty(istenenPassword));
        // Thread.sleep(2000);
        // driver.findElement(By.xpath("//input[@id=\"confirmPassword\"]")).sendKeys("Team55..");
        ReusableMethods.waitFor(2);
    }

    @And("kullanici Save butonuna tiklar ve Pasword Changed mesajini gorur")
    public void kullaniciSaveButonunaTiklarVePaswordChangedMesajiniGorur() throws InterruptedException {
        Driver.clickWithJS(us008_page.saveButonu);
        //  JSUtils.clickElementByJS(driver.findElement(By.xpath("//button[@type=\"submit\"]")));
        // Thread.sleep(2000);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us008_page.basariMesaji.isDisplayed());
        //  Assert.assertTrue(driver.findElement(By.xpath("//strong[normalize-space()='Password changed!']")).isDisplayed());
        // Thread.sleep(2000);
        ReusableMethods.waitFor(2);


    }


    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() throws InterruptedException {
        // Thread.sleep(2000);
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
        //driver.close();
    }


    @And("kullanici new password kutusuna eski parolasini girer ve Password strength seviyesinin degistigini gorur")
    public void kullaniciNewPasswordKutusunaEskiParolasiniGirerVePasswordStrengthSeviyesininDegistiginiGorur() throws InterruptedException {
        us008_page.newPasswordKutusu.sendKeys(ConfigReader.getProperty("eskiPassword"));
        // driver.findElement(By.xpath("//input[@name=\"newPassword\"]")).sendKeys(ConfigReader.getProperty("eskiPassword"));
        // Thread.sleep(2000);
        ReusableMethods.waitFor(2);
    }


    @And("kullanici Save butonuna tiklar ve Pasword Changed mesajini gormemelidir")
    public void kullaniciSaveButonunaTiklarVePaswordChangedMesajiniGormemelidir() throws InterruptedException {
        Driver.clickWithJS(us008_page.saveButonu);
        //  Driver.clickWithJS(driver.findElement(By.xpath("//button[@type=\"submit\"]")));
        //  Thread.sleep(2000);
        ReusableMethods.waitFor(2);
        Assert.assertFalse("Password Changed", us008_page.basariMesaji.isDisplayed());
        //  Assert.assertFalse("Password Changed",driver.findElement(By.xpath("//strong[normalize-space()='Password changed!']")).isDisplayed());
    }

    @And("kullanici signout'a tiklar")
    public void kullaniciLogoutATiklar() throws InterruptedException {
        // Thread.sleep(2000);
        ReusableMethods.waitFor(2);
        us008_page.signOut.click();
        // driver.findElement(By.xpath("//span[normalize-space()='Sign out']")).click();
    }

    @And("kullanici current password kutusuna eski parolasini girer")
    public void kullaniciCurrentPasswordKutusunaEskiParolasiniGirer() {
        us008_page.currentPasswordKutusu.sendKeys(ConfigReader.getProperty("eskiPassword"));
        // driver.findElement(By.xpath("//input[@name=\"currentPassword\"]")).sendKeys(ConfigReader.getProperty("eskiPassword"));
    }

    @And("kullanici Confirm new password kutusuna eski parolasini tekrar girer")
    public void kullaniciConfirmNewPasswordKutusunaEskiParolasiniTekrarGirer() throws InterruptedException {
        us008_page.confirmPasswordKutusu.sendKeys(ConfigReader.getProperty("eskiPassword"));
        // driver.findElement(By.xpath("//input[@id=\"confirmPassword\"]")).sendKeys(ConfigReader.getProperty("eskiPassword"));
        // Thread.sleep(2000);
        ReusableMethods.waitFor(2);
    }
    //test
}
