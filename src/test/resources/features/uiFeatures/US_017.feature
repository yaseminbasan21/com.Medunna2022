
@US017
Feature:  US_017 Admin tarafindan test items(oge) olustur/guncelle/sil islemleri yapilmal
 @US017TC01
  Scenario Outline: TC_001_Admin_yeni_test_ogesi_olusturabilir
    Given HC Admin "<MedunnaUrl>" anasayfasinda
    Then  HC Admin login butonuna tiklar
    Then HC Admin sing in tiklar
    Then HC Admin "<username>" ve "<password>" girer
    And HC Admin sing in butonununa tiklar
    And HC Admin  tems& Titles butonunu tiklar
    And HC Admin acilan sekmeden Tests items sekmesini tiklar
    And HC "Tests items" basligi gorur
    And HC Admin Create a new Tests Items butuna tiklar
    And HC Admin "<Name>", "<Description>", "<Price>", "<Default Min. Value>", "<Default Max. Value>" doldurur
    And HC Admin save butonuna tiklar
    Then HC Admin 'A new tests items is created with identifier' gorur
    And HC admin hesap butonundan sing out butonu ile sayfayi kapatir
    Examples: test_items
      | Name              | Description | Price | Default Min. Value | Default Max. Value |    |
      |glukoz team4412| kan testi 4412  | 25692  | 15092              |   0.9092         |    |


  @US017TC02
  Scenario Outline: TC_002_Admin_test_Items_guncelleyebilir
    Given HC Admin "<MedunnaUrl>" anasayfasinda
    Then  HC Admin login butonuna tiklar
    Then HC Admin sing in tiklar
    Then HC Admin "<username>" ve "<password>" girer
    And HC Admin sing in butonununa tiklar
    And HC Admin  tems& Titles butonunu tiklar
    And HC Admin acilan sekmeden Tests items sekmesini tiklar
    And HC "Tests items" basligi gorur
    And HC Admin edit butonuna tiklar
    And HC Admin "<Name>", "<Description>", "<Price>", "<Default Min. Value>", "<Default Max. Value>" gunceller
    Then HC Admin 'A new tests items is created with identifier' gorur
    And HC admin hesap butonundan sing out butonu ile sayfayi kapatir
    Examples: test_items guncelle
      | Name               | Description     | Price | Default Min. Value | Default Max. Value |    |
      | glukoz team555| kan testi523      | 2517   |   15017             |   0.9017            |    |



  @US017TC03
  Scenario:  TC_003_Admin_test_ogelerini_goruntuleyebilir
    Given HC Admin "<MedunnaUrl>" anasayfasinda
    Then  HC Admin login butonuna tiklar
    Then HC Admin sing in tiklar
    Then HC Admin "<username>" ve "<password>" girer
    And HC Admin sing in butonununa tiklar
    And HC Admin  tems& Titles butonunu tiklar
    And HC Admin acilan sekmeden Tests items sekmesini tiklar
    And HC "Tests items" basligi gorur
    And HC Admin view butonuna tiklar
    Then HC Admin name,descriptions,price,default min,default max ve ceated date gorur
    And HC admin hesap butonundan sing out butonu ile sayfayi kapatir


  @US017TC04
  Scenario: TC_004_Admin_test_ogelerini_silebilir
    Given HC Admin "<MedunnaUrl>" anasayfasinda
    Then  HC Admin login butonuna tiklar
    Then HC Admin sing in tiklar
    Then HC Admin "<username>" ve "<password>" girer
    And HC Admin sing in butonununa tiklar
    And HC Admin  tems& Titles butonunu tiklar
    And HC Admin acilan sekmeden Tests items sekmesini tiklar
    And HC "Tests items" basligi gorur
    And HC Admin delete butonuna tiklar
    And HC Admin acilan sayfada tekrardan delete butonuna tiklar
    Then HC Admin   A test items is delete with identifier' yazisini gorur
    And HC admin hesap butonundan sing out butonu ile sayfayi kapatir

