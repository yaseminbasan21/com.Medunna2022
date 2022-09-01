@US_025
Feature:US25 Randevu Alma


  Scenario: Giris yapilarak Randevu alma
    Given Hasta Medunna sayfasına gider
    And  Hasta girise tiklar
    And  Hasta sign in sekmesine tiklar
    Then Hasta username girer
    Then Hasta password girer
    And  Hasta sign in butonuna tiklar
    Then Hasta giris yapildigini dogrular
    And  Hasta my pages'e tiklar
    And   Hasta Make an Appointment tiklar
    Then  Hasta acilan sayfada bilgileri doldurur
    And   Hasta Send an Appointment Request tiklar
    Then  Hasta randevu aldigini dogrular
    Then Sayfayi kapatir
