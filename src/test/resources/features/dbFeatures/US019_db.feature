
Feature:US019_db Admin olarak; Yeni Staff (Personel) Oluşturma / Güncelleme / Görüntüleme ve Silme

  Scenario: Kullanici admin olarak staff bilgilerini db olarak dogrulayabilmeli
    Given Kullanici database ile medunnaya baglanir
    When staff datalarina erisir
    And kullanici database den gelen bilgileri dogrular
