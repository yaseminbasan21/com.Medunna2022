Feature: Hasta Test sonuçları (Staff)

  Scenario: Kullanıcı (Staff) hastanın SSN id ile arama yapabilir.

  Given Kullanici Medunna sayfasina gider
  Then Staff staff hesabi ile siteye giris yapar
  And Staff MY PAGES sekmesinden Search Patient butonuna tiklar
  Then Staff Patient SSN: text boxina bir SSN numarasi girer
  And Staff aranan hastanin varligini kontrol eder

  Scenario: Kullanıcı (Staff) test sonuçlarını görebilmelidir.

    Given Kullanici Medunna sayfasina gider
    Then Staff staff hesabi ile siteye giris yapar
    And Staff MY PAGES sekmesinden Search Patient butonuna tiklar
    Then Staff Patient SSN: text boxina bir SSN numarasi girer
    And 1sn bekler
    And Staff hastada gorunen Show Appointments butonuna tiklar
    Then Staff Show Tests butonuna tiklar
    And Staff Tests sayfasinin acildigini kontrol eder
    And Staff testin gorunurlugunu test eder
    Then Staff View Results butonuna tiklar
    And Staff Test sonuclarinin gorunurlugunu test eder

  Scenario:  Kullanıcı (Staff) "ID, Date, Result, description, Created date, ..." gibi sonuç bilgilerini görebilmeli ve
  güncelleyebilmelidir.

    Given Kullanici Medunna sayfasina gider
    Then Staff staff hesabi ile siteye giris yapar
    And Staff MY PAGES sekmesinden Search Patient butonuna tiklar
    Then Staff Patient SSN: text boxina bir SSN numarasi girer
    And 1sn bekler
    Then Staff hastada gorunen Edit butonuna tiklar
    And 1sn bekler
    And Staff bilgilerin gorunur oldugunu test eder
    Then Staff bilgileri degistirip Save butonuna tiklar
    And 2sn bekler
    And Staff basari mesajinin gorunurlugunu kontrol eder
    And Staff bilgilerin degistigini kontrol eder
    Then Staff bilgileri eski haline geri getirir
