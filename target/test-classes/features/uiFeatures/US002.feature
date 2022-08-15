Feature: Kayıt olmak için email and username bilgileri girilebilmelidir.

  @US002
  Scenario:TC01 Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "Username" olmalıdır

    Given Kullanici Medunna sayfasina gider
    When Kullanici register sayfasina gider
    And Kullanici Username kismini bos birakir
    And Kullanici "Your username is required." yazisinin gorundugunu kontrol eder

  @US002
  Scenario: TC03 Email adresi "@" ve "." karakterleri olmadan doldurulamamalıdır.

    Given Kullanici Medunna sayfasina gider
    When Kullanici register sayfasina gider
    And Kullanici Email kismini "@" ve "." olmadan doldurur
    And Kullanici "This field is invalid" yazisinin gorundugunu kontrol eder
    And Kullanici Email kismini "@" olmadan doldurur
    And Kullanici "This field is invalid" yazisinin gorundugunu kontrol eder
    And Kullanici Email kismini "." olmadan doldurur
    And Kullanici "This field is invalid" yazisinin gorundugunu kontrol eder
    And Kullanici Email kismini "@" ve "." kullanarak doldurur
    And Kullanici "This field is invalid" yazisinin gorunmedigini kontrol eder

  @US002
  Scenario: TC04 e-mail boş bırakılamaz

    Given Kullanici Medunna sayfasina gider
    When Kullanici register sayfasina gider
    And Kullanici Email kismini bos birakir
    And Kullanici "Your email is required." yazisinin gorundugunu kontrol eder