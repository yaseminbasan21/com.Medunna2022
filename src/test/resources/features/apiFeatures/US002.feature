Feature: Kayıt olmak için email and username bilgileri girilebilmelidir.

  Scenario: UI ile olusturulan kullanıcı adı api kullanılarak doğrulanmalıdır

    Given Kullanici yeni kullanici eklemek icin endpoint olusturur
    Then Kullanici api ile bir kullanici olusturur
    And Kullanici olusturulan user'in ve request yapilan user'in usernamelerini karsilastirir