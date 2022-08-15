Feature: Kayit olmak icin SSN, Firstname ve Lastname bilgileri girililebilmelidir.

  @US001
  Scenario: TC01 Gecerli bir SSN, 3. ve 5. rakamdan sonra "-" icermeli ve 9 rakamdan olusmalidir.

    Given Kullanici Medunna sayfasina gider
    When Kullanici register sayfasina gider
    Then Kullanici SSN kismina 3. ve 5. rakamdan sonra "-" isareti olmadan 9 haneli bir sayi girer
    And Kullanici "Your SSN is invalid" yazisinin gorundugunu kontrol eder
    Then Kullanici SSN kismina 3. ve 5. rakamdan sonra "-" isareti koyarak sekiz haneli bir sayi girer
    And Kullanici "Your SSN is invalid" yazisinin gorundugunu kontrol eder
    Then Kullanici SSN kismina 3. ve 5. rakamdan sonra "-" isareti koyarak dokuz haneli bir sayi girer
    And Kullanici "Your SSN is invalid" ve "Your SSN is required." yazilarinin gorunmedigini kontrol eder

  @US001
  Scenario: TC02 SSN bos birakilamaz

    Given Kullanici Medunna sayfasina gider
    When Kullanici register sayfasina gider
    Then Kullanici SSN kismini bos birakir
    And Kullanici "Your SSN is required." yazisinin gorundugunu kontrol eder

  @US001
  Scenario: TC03 Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "First Name" olmalıdır

    Given Kullanici Medunna sayfasina gider
    When Kullanici register sayfasina gider
    And Kullanici Firstname kismini bos birakir
    And Kullanici "Your FirstName is required." yazisinin gorundugunu kontrol eder
    And Kullanici Firstname kismina rastgele bir karakter girer
    And Kullanici "Your FirstName is required." yazisinin gorunmedigini kontrol eder

  @US001
  Scenario: TC04 Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "Last Name" olmalıdır
    Given Kullanici Medunna sayfasina gider
    When Kullanici register sayfasina gider
    And Kullanici Last Name kismini bos birakir
    And Kullanici "Your LastName is required." yazisinin gorundugunu kontrol eder
    And Kullanici lastname kismina rastgele bir karakter girer
    And Kullanici "Your LastName is required." yazisinin gorunmedigini kontrol eder