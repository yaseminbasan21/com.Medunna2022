@US011
Feature:My Appointments Physician (Doctor) tarafından düzenlenebilmelidir.
  Scenario: TC1-9
    Given Doktor Medunna url'sine gider.
    Then Doktor giris yapar..
    Then Doktor Sayfalarım bolumune gider.
    Then Randevularım'a tiklar.
    Then Doktor randevudaki Duzenle butonuna tiklar.
    Then Doktor Randevu Oluştur veya Duzenle yazısını gorur.
    And Doktor hastanin ID bilgisini kontrol eder.
    And Doktor hastanın RANDEVU baslangıc tarihi bilgisini kontrol eder.
    And Doktor hastanın RANDEVU bıtıs tarihi bilgisini kontrol eder.
    And Doktor hastanın STATUS durumunun bilgisini kontrol eder
    And Hastanın doktor bilgisi dogrulanır
    And Doktor gerekli alanları doldurur, anamnez, tedavi, teshis.Doktor, istege baglı alanlari recete ve açiklama ile doldurur.
    And Doktor hastanın STATUS durumunu PENDING olarak degistirir.
    And Doktor hastanın STATUS durumunu COMPLETED  olarak degistirir.
    And Doktor hastanın STATUS durumunu CANCELLED olarak degistirir.
    And Sayfa kapatilir..