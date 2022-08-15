@US14
Feature: US_014 Edit_Inpatient_Islemleri

  Scenario: TC_001_My_Inpatients_Sayfasindan_Hasta_Bilgilerini_Gorulur
    Given doktorHaticee "MedunnaUrl" anasayfasinda
    Then  doktorHaticee login butonuna tiklar
    Then doktorHaticee sing in tiklar
    Then doktorHaticee username ve password girer
    And doktorHaticee sing in butonununa tiklar
    And doktorHatice MY PAGES butonuna tiklar
    When My Inpatients butonuna tiklar
    Then In Patiens basligi gorulur
    And doktorHaticee yatan hastalarin tum bilgilerini gorur


  Scenario: TC_002_Statusu_Guncellenir

    And doktorHatice edit butonuna tiklar
    And Create or edit a in Patient basligi gorulur
    And statusu sekmesine tiklar unapproved,discharged,still staying,cancelled birini secebilir

  Scenario: TC_003_Rezerve_Edilmis_Odayi_guncelleme

    Then doktorHatice rezerve edilmis odayi gunceller
    And doktorHaticee sayfayi kapatir







