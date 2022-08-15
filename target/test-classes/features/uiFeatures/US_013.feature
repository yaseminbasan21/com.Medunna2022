
@US13
Feature: US_013 Doktor_Test_Result_Islemleri


  Scenario: TC_001_Doktor_Result_Islemleri_Yapabilmeli
    Given doktorHatice "MedunnaUrl" anasayfasinda
    Then login butonuna tiklar
    And doktorHatice sing in tiklar
    And doktorHatice username ve password girer
    Then doktorHatice sing in butonununa tiklar
    Then My pages butonunu tiklar
    Then My Appointments sekmesini tiklar
    And hasta bilgilerinden edit butonunan tiklar
    And doktorHatice acilan sayfada Show Test Result butonuna tiklar
    And doktorHatice tests sayfasinda View Results butonuna tiklar
    Then doktorHatice test sonuc sayfasini gorur

  Scenario: TC_002_Doktor Request_Inpatient_yapabilmeli
    Then doktorHatice Request Inpatient secenegini tiklar
    Then doktorHatice sayfayi kapatir






