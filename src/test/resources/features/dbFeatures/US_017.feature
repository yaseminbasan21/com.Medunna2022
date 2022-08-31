

  Feature:US017_Admin test items(oge) bilgilerini dogrulayabilmelidir

    Scenario: TC_006_DB_kullanilarak_test_items(oge)_dogrulanabilmeli
      Given HC Database ile baglanti kururlur
      Then HC Admin Test items  bilgilerini sorgulama yapar
      And HC Admin test items tablosunun column sutununun columnData icerdigi dogrulanir.






