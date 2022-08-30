@US019
Feature: US_019 Admin olarak; Yeni Staff (Personel) Oluşturma / Güncelleme / Görüntüleme ve Silme

  Scenario: TC_001 Admin SSN kullanarak; kayıtlı kişiler arasında Staff arayabilir.
    Given kullanici medunna anasayfasinda
    When kullanici giris ikonuna tiklar
    And kullanici Signin'a tiklar
    And kullanici "admin" olarak gecerli bir username ve "adminPassword" password girer
    And kullanici admin olarak itemsTitles a tiklar
    And kullanici admin olarak acilan DDM den Staff a tiklar
    And kullanici admin olarak Create a new Staff butonuna tiklar
    And kullanici admin olarak Use Search kutucugunu isaretleyip SSN kutusuna cagiracagi staff in SSN numarasini girer
    Then kullanici admin olarak Search User butonuna tiklar

  Scenario: Tüm bilgileri doldurulmalıdır
    Given kullanici admin olarak guncellemek istedigi bilgileri ilgili kutulara doldurur


  Scenario: TC_002 Admin kayıtlı kişilerden bir kullanıcı seçebilir.
    Given kullanici admin olarak bilgilerini duzenlemek istedigi Staff in uzerine gelip edit i tiklar


  Scenario: TC_004 Admin, personeli silebilmeli.
    Given kullanici admin olarak bilgilerini silmek istedigi Staff in uzerine gelip Delete ye tiklar
    When kullanici admin olarak Confirm delete operation dan tekrar Delete ye tiklar
    And kullanici sayfayi kapatir