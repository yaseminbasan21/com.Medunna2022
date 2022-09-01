@US_024
Feature:US024 My Appointments (Randevular) (Patient)

  Background: ortak adimlar
    Given Hasta Medunna sayfasına gider
    And  Hasta girise tiklar
    And  Hasta sign in sekmesine tiklar
    Then Hasta username girer
    Then Hasta password girer
    And  Hasta sign in butonuna tiklar
    Then Hasta giris yapildigini dogrular
    And  Hasta my pages'e tiklar
    And  Hasta My Appointments tiklar
    Then Hasta randevu listesini gorur
    Then Hasta from kismina tarih girer
    Then Hasta to kismina tarih girer

  @TestSonucu
  Scenario:TC_001-002-003 Randevu listesini goruntuleme
    And  Hasta Show Tests 'e tiklar
    And  Hasta view  Results'a tiklar
    Then Hasta Test sonuclarinda id,name,test,default max ve min value,date and description bolumlerini gorur


  @FaturaGoruntuleme
  Scenario: TC_004 Hasta faturasini gorebilme
    And   Hasta Show Invoice 'e tiklar
    Then  Hasta faturayi gordugunu dogrular
    And Sayfayi kapatir

