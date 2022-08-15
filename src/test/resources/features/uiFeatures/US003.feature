
@US03
Feature: US_03 Registration Password


  @TekHaneSifre
  Scenario: Kullanıcı sayfaya gider
    Given Kullanıcı "<medunnaUrl>" sayfasına gider
    Then Kullanıcı kullanıcı sembolüne tıklar
    Then Kullanıcı register butonuna tıklar
    Then Kullanıcı tek haneli şifre  girer ve yeterli uzunlukta olmadığını görür

  @CiftHaneSifre
  Scenario: Kullanıcı sayfaya gider
    Given Kullanıcı "<medunnaUrl>" sayfasına gider
    Then Kullanıcı kullanıcı sembolüne tıklar
    Then Kullanıcı register butonuna tıklar
    Then Kullanıcı çift haneli şifre  girer ve yeterli uzunlukta olmadığını görür

  @UcHaneSifre
  Scenario: Kullanıcı sayfaya gider
    Given Kullanıcı "<medunnaUrl>" sayfasına gider
    Then Kullanıcı kullanıcı sembolüne tıklar
    Then Kullanıcı register butonuna tıklar
    Then Kullanıcı uc haneli şifre  girer ve yeterli uzunlukta olmadığını görür

  @DortHaneSifre
  Scenario: Kullanıcı sayfaya gider
    Given Kullanıcı "<medunnaUrl>" sayfasına gider
    Then Kullanıcı kullanıcı sembolüne tıklar
    Then Kullanıcı register butonuna tıklar
    Then Kullanıcı dort haneli şifre  girer ve kabul edildiğini görür
    
  @KucukHarf
  Scenario: Kullanıcı en az bir küçük harf girer
    Given Kullanıcı "<medunnaUrl>" sayfasına gider
    Then Kullanıcı kullanıcı sembolüne tıklar
    Then Kullanıcı register butonuna tıklar
    Then Kullanıcı içerisinde en az bir küçük harf olan yedi karakterli şifre girer

  @BuyukHarf
  Scenario: Kullanıcı en az bir büyük harf girer
    Given Kullanıcı "<medunnaUrl>" sayfasına gider
    Then Kullanıcı kullanıcı sembolüne tıklar
    Then Kullanıcı register butonuna tıklar
    Then Kullanıcı içerisinde en az bir büyük harf olan yedi karakterli şifre girer

  @Rakam
  Scenario: Kullanıcı en az bir rakam girer
    Given Kullanıcı "<medunnaUrl>" sayfasına gider
    Then Kullanıcı kullanıcı sembolüne tıklar
    Then Kullanıcı register butonuna tıklar
    Then Kullanıcı içerisinde bir küçük bir büyük harf ve rakam olan yedi karakterli şifre girer

  @OzelKarakter
  Scenario: Kullanıcı en az bir özel karakter girer
    Given Kullanıcı "<medunnaUrl>" sayfasına gider
    Then Kullanıcı kullanıcı sembolüne tıklar
    Then Kullanıcı register butonuna tıklar
    Then Kullanıcı içerisinde bir küçük bir büyük harf  rakam ve özel karakter olan yedi karakterli şifre girer


