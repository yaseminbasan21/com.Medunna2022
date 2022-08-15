Feature:US007_Hastalar randevu tarihi oluşturabilmelidir

  @US07Post, @smoke
  Scenario:TC05_API kullanarak randevular olusturulabilmeli.
    Given Medunna Api Endpointinden randevulari goruntuler
    Then Medunna Api Endpointinden Randevulari Goruntuleme Isleminin Status Codeunun 201 Oldugunu Dogrular
    And Request deger ile Response'un ayni oldugunu dogrular.