Feature: US001 Kayıt olmak için SSN, Firstname ve Lastname bilgileri girililebilmelidir.

  Scenario: TC05 Swagger kullanarak tüm kayıt bilgilerini alın ve doğrulayın

    Given Kullanici tum kullanicilarin bilgileri icin endpoint olusturur
    Then Kullanici tum kayitlar icin get request yapar
    And Kullanici status code'un 200 oldugunu testeder

  Scenario: TC06 API kullanarak kayıtlı kişiler oluşturun ve doğrulayın

    Given Kullanici yeni kullanici eklemek icin endpoint olusturur
    Then Kullanici api ile bir kullanici olusturur
    Then Kullanici tum kayitlar icin get request yapar
    And Kullanici kayit yaptigi kullanicinin var oldugunu dogrular