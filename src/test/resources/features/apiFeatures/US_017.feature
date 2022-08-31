
  Feature: US_017_Admin test items(oge) olusturabilir

    Scenario: TC_005_API_ile_doğrulayabilir_ve_API_ile_test_items_olusturabilir
      Given  HC Medunna Api Endpointinden test ıtems ı goruntuler
      Then HC Medunna Api Endpointinden test items i Status Codeunun 200 Oldugunu Dogrular
      And HC Admin test items olusturur
      And HC Admin gelen datayi dogrular







