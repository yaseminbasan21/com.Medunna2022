Feature: US010_Doktor (Physician) randevular

  @us10Get, @smoke
  Scenario Outline: TC03_API ile randevulari doğrulayin
    Given  MedunnaApi Endpointinden randevulari goruntuler
    And MedunnaApi Endpointinden Randevulari Goruntuleme Isleminin Status Codeunun 200 Oldugunu Dogrular
    And Medunna Api Endpointinden id numarali mesaji Okur ve mesajin "<patientid>", "<startdate>", "<enddate>" ve "<status>" bilgilerine sahip oldugunu dogrular.

    Examples:
    |patientid |startdate           |enddate             |status |
    |155802    |2022-08-15T00:00:00Z|2022-08-15T01:00:00Z|PENDING|