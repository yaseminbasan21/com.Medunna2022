@grid
Feature:US008 Kullanıcı giriş yaptığında Password sekmesi düzenlenebilir olmalıdır.

  @Admin,@Smoke
  Scenario: kullanici Admin olarak giris yapar
    Given kullanici medunna anasayfasinda
    When kullanici giris ikonuna tiklar
    And kullanici Signin'a tiklar
    And kullanici "admin" olarak gecerli bir username ve "adminPassword" password girer
    And kullanici admin hesap kismina tiklar
    And kullanici acilan menuden password'a tiklar
    And kullanici current password kutusuna eski parolasini "adminPassword" girer
    And kullanici new password kutusuna yeni parolasini girer ve Password strength seviyesinin degistigini gorur
    And kullanici Confirm the new password kutusuna yeni sifreyi "yeniPassword" tekrar girer
    And kullanici Save butonuna tiklar ve Pasword Changed mesajini gorur
    And kullanici admin hesap kismina tiklar
    And kullanici signout'a tiklar


  @Doktor,@Smoke
  Scenario: kullanici Doktor olarak giris yapar
    Given kullanici giris ikonuna tiklar
    When kullanici Signin'a tiklar
    And kullanici "doktor" olarak gecerli bir username ve "doktorPassword" password girer
    And kullanici doktor hesap kismina tiklar
    And kullanici acilan menuden password'a tiklar
    And kullanici current password kutusuna eski parolasini "doktorPassword" girer
    And kullanici new password kutusuna yeni parolasini girer ve Password strength seviyesinin degistigini gorur
    And kullanici Confirm the new password kutusuna yeni sifreyi "yeniPassword" tekrar girer
    And kullanici Save butonuna tiklar ve Pasword Changed mesajini gorur
    And kullanici doktor hesap kismina tiklar
    And kullanici signout'a tiklar

  @Personel,@Smoke
  Scenario: kullanici Personel olarak giris yapar
    Given kullanici giris ikonuna tiklar
    When kullanici Signin'a tiklar
    And kullanici "personel" olarak gecerli bir username ve "personelPassword" password girer
    And kullanici personel hesap kismina tiklar
    And kullanici acilan menuden password'a tiklar
    And kullanici current password kutusuna eski parolasini "personelPassword" girer
    And kullanici new password kutusuna yeni parolasini girer ve Password strength seviyesinin degistigini gorur
    And kullanici Confirm the new password kutusuna yeni sifreyi "yeniPassword" tekrar girer
    And kullanici Save butonuna tiklar ve Pasword Changed mesajini gorur
    And kullanici personel hesap kismina tiklar
    And kullanici signout'a tiklar


  @Hasta,@Smoke
  Scenario: kullanici Hasta olarak giris yapar
    Given kullanici giris ikonuna tiklar
    When kullanici Signin'a tiklar
    And kullanici "hasta" olarak gecerli bir username ve "hastaPassword" password girer
    And kullanici hasta hesap kismina tiklar
    And kullanici acilan menuden password'a tiklar
    And kullanici current password kutusuna eski parolasini "hastaPassword" girer
    And kullanici new password kutusuna yeni parolasini girer ve Password strength seviyesinin degistigini gorur
    And kullanici Confirm the new password kutusuna yeni sifreyi "yeniPassword" tekrar girer
    And kullanici Save butonuna tiklar ve Pasword Changed mesajini gorur
    And kullanici hasta hesap kismina tiklar
    And kullanici signout'a tiklar
    And kullanici sayfayi kapatir

  @EskiParola
  Scenario: kullanici eski password u  yeni password olarak guncelleyemez
    Given kullanici medunna anasayfasinda
    When kullanici giris ikonuna tiklar
    And kullanici Signin'a tiklar
    And kullanici "admin" olarak gecerli bir username ve "adminPassword" password girer
    And kullanici admin hesap kismina tiklar
    And kullanici acilan menuden password'a tiklar
    And kullanici current password kutusuna eski parolasini girer
    And kullanici new password kutusuna eski parolasini girer ve Password strength seviyesinin degistigini gorur
    And kullanici Confirm new password kutusuna eski parolasini tekrar girer
    And kullanici Save butonuna tiklar ve Pasword Changed mesajini gormemelidir
    And kullanici signout'a tiklar
    And kullanici sayfayi kapatir