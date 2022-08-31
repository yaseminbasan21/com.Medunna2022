Feature: US016_Oda Oluşturma / Görüntüleme / Güncelleme /Silme (Admin)


  Scenario Outline: TC011_API ile oda oluşturma, okuma, güncellme ve silme doğrulanmali.
    Given Kullanici Medunna endpointine gider.
    And Kullanici Goruntuleme Isleminin Status Code'unun 200 Oldugunu Dogrular
    And Kullanici New Room Olusturur
    And Kullanici Olusturma Isleminin Status Code'unun 201 Oldugunu Dogrular
    And Kullanici Olusturdugu Room'u Gunceller
    And Kullanici Update Isleminin Status Code'unun 200 Oldugunu Dogrular
    And Kullanici Olusturdugu "<id>" numarali Room'u Siler
    And Kullanici Delete Isleminin Status Code'unun 204 Oldugunu Dogrular

    Examples:
    |id|
    |249733|
    #249732






