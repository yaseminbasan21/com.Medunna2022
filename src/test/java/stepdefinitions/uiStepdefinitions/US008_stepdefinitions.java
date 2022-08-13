package stepdefinitions.uiStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US008_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US008_stepdefinitions {
    US008_page us008_page=new US008_page();
    @Given("kullanici medunna anasayfasinda")
    public void kullaniciMedunnaAnasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("kullanici giris ikonuna tiklar")
    public void kullaniciGirisIkonunaTiklar() {
        us008_page.giris.click();
    }

    @When("kullanici Signin'a tiklar")
    public void kullaniciSigninATiklar() {
        us008_page.signIn.click();
    }

    @And("kullanici {string} olarak gecerli bir username ve {string} password girer")
    public void kullaniciOlarakGecerliBirUsernameVePasswordGirer(String istenenKullanici, String istenenPassword) {
        us008_page.userNameKutusu.sendKeys(ConfigReader.getProperty(istenenKullanici));
        us008_page.passwordKutusu.sendKeys(ConfigReader.getProperty(istenenPassword));
        us008_page.signInButon.click();
    }

    @And("kullanici admin hesap kismina tiklar")
    public void kullaniciAdminHesapKisminaTiklar() throws InterruptedException {Driver.clickWithJS(us008_page.admin);
        Thread.sleep(2000);
    }
    @And("kullanici doktor hesap kismina tiklar")
    public void kullaniciDoktorHesapKisminaTiklar() throws InterruptedException {Driver.clickWithJS(us008_page.doktor);
        Thread.sleep(2000);

    }
    @And("kullanici personel hesap kismina tiklar")
    public void kullaniciPersonelHesapKisminaTiklar() throws InterruptedException {Driver.clickWithJS(us008_page.personel);
        Thread.sleep(2000);

    }

    @And("kullanici hasta hesap kismina tiklar")
    public void kullaniciHastaHesapKisminaTiklar() throws InterruptedException {Driver.clickWithJS(us008_page.hasta);
        Thread.sleep(2000);

    }

    @And("kullanici acilan menuden password'a tiklar")
    public void kullaniciAcilanMenudenPasswordATiklar() {
        us008_page.password.click();
    }

    @And("kullanici current password kutusuna eski parolasini {string} girer")
    public void kullaniciCurrentPasswordKutusunaEskiParolasiniGirer(String istenenPassword) {
        us008_page.currentPasswordKutusu.sendKeys(ConfigReader.getProperty(istenenPassword));
    }

    @And("kullanici new password kutusuna yeni parolasini girer ve Password strength seviyesinin degistigini gorur")
    public void kullaniciNewPasswordKutusunaYeniParolasiniGirerVePasswordStrengthSeviyesininDegistiginiGorur() throws InterruptedException {
        us008_page.newPasswordKutusu.sendKeys("abcdefg");
        Assert.assertTrue(us008_page.birinciLamba.isDisplayed());
        Thread.sleep(2000);
        us008_page.newPasswordKutusu.clear();
        Thread.sleep(2000);
        us008_page.newPasswordKutusu.sendKeys("Abcdefg");
        Assert.assertTrue(us008_page.ikinciLamba.isDisplayed());
        Thread.sleep(2000);
        us008_page.newPasswordKutusu.clear();
        Thread.sleep(2000);
        us008_page.newPasswordKutusu.sendKeys("Abcdef1");
        Assert.assertTrue(us008_page.donduncuLamba.isDisplayed());
        Thread.sleep(2000);
        us008_page.newPasswordKutusu.clear();
        Thread.sleep(2000);
        us008_page.newPasswordKutusu.sendKeys("Team55..");
        Assert.assertTrue(us008_page.besinciLamba.isDisplayed());

    }

    @And("kullanici Confirm the new password kutusuna yeni sifreyi {string} tekrar girer")
    public void kullaniciConfirmTheNewPasswordKutusunaYeniSifreyiTekrarGirer(String istenenPassword) throws InterruptedException {
        us008_page.confirmPasswordKutusu.sendKeys(ConfigReader.getProperty(istenenPassword));
        Thread.sleep(2000);
    }

    @And("kullanici Save butonuna tiklar ve Pasword Changed mesajini gorur")
    public void kullaniciSaveButonunaTiklarVePaswordChangedMesajiniGorur() throws InterruptedException {
        Driver.clickWithJS(us008_page.saveButonu);
        Thread.sleep(2000);
        Assert.assertTrue(us008_page.basariMesaji.isDisplayed());
        Thread.sleep(2000);

    }


    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }


    @And("kullanici new password kutusuna eski parolasini girer ve Password strength seviyesinin degistigini gorur")
    public void kullaniciNewPasswordKutusunaEskiParolasiniGirerVePasswordStrengthSeviyesininDegistiginiGorur() throws InterruptedException {
        us008_page.newPasswordKutusu.sendKeys(ConfigReader.getProperty("eskiPassword"));
        Thread.sleep(2000);
    }



    @And("kullanici Save butonuna tiklar ve Pasword Changed mesajini gormemelidir")
    public void kullaniciSaveButonunaTiklarVePaswordChangedMesajiniGormemelidir() throws InterruptedException {
        Driver.clickWithJS(us008_page.saveButonu);
        Thread.sleep(2000);

        Assert.assertFalse("Password Changed",us008_page.basariMesaji.isDisplayed());
    }

    @And("kullanici signout'a tiklar")
    public void kullaniciLogoutATiklar() throws InterruptedException {
        Thread.sleep(2000);
        us008_page.signOut.click();
    }

    @And("kullanici current password kutusuna eski parolasini girer")
    public void kullaniciCurrentPasswordKutusunaEskiParolasiniGirer() {
        us008_page.currentPasswordKutusu.sendKeys(ConfigReader.getProperty("eskiPassword"));
    }

    @And("kullanici Confirm new password kutusuna eski parolasini tekrar girer")
    public void kullaniciConfirmNewPasswordKutusunaEskiParolasiniTekrarGirer() throws InterruptedException {
        us008_page.confirmPasswordKutusu.sendKeys(ConfigReader.getProperty("eskiPassword"));
        Thread.sleep(2000);
    }
}
