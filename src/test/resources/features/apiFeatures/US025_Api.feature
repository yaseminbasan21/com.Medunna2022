@US_025
  Feature:US25 Randevu Alma

    Scenario: TC02 API kullanılarak  randevular görülebilmeli
      Given  Medunna Endpointinden randevulari goruntuler
      Then Medunna Api Endpointinden Randevulari Goruntuleme Isleminin Status Codeunun 201 Oldugunu Dogrular