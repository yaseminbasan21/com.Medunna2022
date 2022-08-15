@US_004
Feature: Giriş sayfası testi


  @TC01
  Scenario: TC_01 Gecerli kimlik bilgileri ile giris yapabilme
    Given Kullanıcı "<medunnaUrl>" sayfasına gider
    Then Kullanıcı Sing in butonuna tıklar ve giris sayfasına gider
    Then Kullanıcı geçerli bir kullanıcı adı ve şifre girer ve Sing in butonuna tıklar
    And Kulanıcı başarılı bir giriş yapabildiğini görür
    And Kullanıcı singOut yapar ve sayfayı kapatır


  @TC02
  Scenario: TC_02 Remember me butonu testi
    Given Kullanıcı "<medunnaUrl>" sayfasına gider
    Then Kullanıcı Sing in butonuna tıklar ve giris sayfasına gider
    And Kullanıcı Remember me sçeneğini görebilir
    Then Kullanıcı Remember me sçeneğine tıklayabilir

  @TC03
  Scenario: TC_03 Sifremi unuttum testi
    Given Kullanıcı "<medunnaUrl>" sayfasına gider
    Then Kullanıcı Sing in butonuna tıklar ve giris sayfasına gider
    Then Kullanıcı Did you forget your password? secenegini görür
    And Kullanıcı butona tıkladığında Reset your password sayfanına gider

  @TC04
  Scenario: TC_04 Hesap olusturma secenegi
    Given Kullanıcı "<medunnaUrl>" sayfasına gider
    Then Kullanıcı Sing in butonuna tıklar ve giris sayfasına gider
    And Kullanıcı You don't have an account yet? Register a new account seçeneğini görebilmeli
    Then Kullanıcı Register a new account butonuna tıkladığında Registration sayfasına gidebilmeli

  @TC05
  Scenario: TC_05 Cancel butonu ile cikis
    Given Kullanıcı "<medunnaUrl>" sayfasına gider
    Then Kullanıcı Sing in butonuna tıklar ve giris sayfasına gider
    And Kullanıcı Cancel butonunu görebilmeli
    Then Kullanıcı Cancel butonuna tıkladığında sayfadan çıkabilmeli
