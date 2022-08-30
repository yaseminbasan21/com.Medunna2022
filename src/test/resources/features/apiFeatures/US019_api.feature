
Feature: Admin olarak; Yeni Staff (Personel) Oluşturma / Güncelleme / Görüntüleme ve Silme

  Scenario Outline: TC05_API kullanarak staff listasi goruntulenebilmeli
    Given Medunna Api Endpointinden staffleri goruntuler
    Then Medunna Api Endpointinden staffleri goruntuleme Isleminin Status Codeunun 200 Oldugunu Dogrular
    And Medunna Api Endpointinden id numarali mesaji Okur ve mesajin "<firstName>", "<lastName>" ve "<phone>" bilgilerine sahip oldugunu dogrular.

    Examples:
      | firstName | lastName   | phone        |
      | Sharee    | Runolfsson | 545-656-4332 |
