@US011
Feature:My Appointments Physician (Doctor) tarafından düzenlenebilmelidir.

  Background: TCler
    Given Doktor Medunna url'sine gider.
    Then Doktor giris yapar..
    Then Doktor Sayfalarım bolumune gider.
    Then Randevularım'a tiklar.
    Then Doktor randevudaki Duzenle butonuna tiklar.
    Then Doktor Randevu Oluştur veya Duzenle yazısını gorur.
  Scenario: TC01
    And Doktor hastanin ID bilgisini kontrol eder.
  Scenario: TC02
    And Doktor hastanın RANDEVU baslangıc tarihi bilgisini kontrol eder.
  Scenario: TC03
    And Doktor hastanın RANDEVU bıtıs tarihi bilgisini kontrol eder.
  Scenario: TC04
    And Doktor hastanın STATUS durumunun bilgisini kontrol eder
  Scenario: TC05
    And Hastanın doktor bilgisi dogrulanır
  Scenario: TC06
    And Doktor gerekli alanları doldurur, anamnez, tedavi, teshis.Doktor, istege baglı alanlari recete ve açiklama ile doldurur.
  Scenario: TC07
    And Doktor hastanın STATUS durumunu PENDING olarak degistirir.
  Scenario: TC08
    And Doktor hastanın STATUS durumunu COMPLETED  olarak degistirir.
  Scenario: TC09
    And Doktor hastanın STATUS durumunu CANCELLED olarak degistirir.
    And Sayfa kapatilir.