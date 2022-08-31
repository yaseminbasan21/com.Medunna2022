Feature: US016_Oda Oluşturma / Görüntüleme / Güncelleme /Silme (Admin)

  Scenario: TC012_DB ile oda bilgilerini doğrulayın
    Given Kullanici Database Ile Baglanti Kurar
    And Kullanici Room Tablosunu Goruntuler
    And Kullanici Room Tablosunun oda bilgilerini icerdigini dogrular

