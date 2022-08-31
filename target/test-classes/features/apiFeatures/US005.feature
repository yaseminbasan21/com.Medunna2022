Feature:US005_Hastalar randevu olusturabilmelidir


  Scenario:TC03_API kullanarak randevular olusturulabilmeli.
    Given Medunnaa Api Endpointinden randevulari goruntuler
    Then Medunnaa Api Endpointinden Randevulari Goruntuleme Isleminin Status Codeunun 201 Oldugunu Dogrular
    And Medunnaa Request deger ile Response'un ayni oldugunu dogrular.