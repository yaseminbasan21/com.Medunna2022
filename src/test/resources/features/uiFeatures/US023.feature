@us23
Feature: Fatura Ödemesi (Staff)

  Scenario: TC_001 Kullanıcı (Staff) fatura oluşturabilmelidir

    Given Kullanicilar Medunna sayfasina gider ve giris yaparlar
    Then Hasta My Pages sekmesinden Make an Appointment butonuna tiklar
    And Hasta Phone ve Date kisimlarini doldurur ve send butonuna basar
    Then Staff MY PAGES den Search Patient butonuna tiklar
    And Staff Patient SSN: text boxina hastanin SSN numarasi girer
    And Staff Show Appointments butonuna tiklar
    And Staff Edit butonuna tiklar
    And Staff Status kismini PENDING yapar ve Physician kismini 208866:doktor hakki:NUCLEAR_MEDICINE olarak doldurur
    And Staff Save butonuna tiklar
    Then Doktor My Page sekmesinden My Appointments butonuna tiklar
    And Doktor Edit butonuna tiklar
    And Doktor Request A Test butonuna tiklar
    And Doktor yapilacak testleri secer ve save butonuna tiklar
    And Doktor status kismini COMPLETED yapar ve diger bilgileri doldurur ve save butonuna tiklar
    Then Staff  Patient SSN: text boxina hastanin SSN numarasi girer
    And Staff Show Appointments butonuna tiklar
    And Staff Payment butonuna tiklar
    And Staff Creat Invoice butonuna tiklar
    And Staff  Save butonuna tiklar
    And Staff basari mesajinin varligini test eder
    Then Hasta My Page sekmesinden My Appointments butonuna basar
    And Hasta Show Invoice butonuna tiklar ve fatura bilgilerinin gorundugunu test eder

  Scenario: TC_002 Bu portalda, hastanın fatura oluşturabilmesi için durumu tamamlandı veya İptal edildi olması gerekir.

    Given Kullanici Medunna sayfasina gider
    Then Staff staff hesabi ile siteye giris yapar
    And Staff MY PAGES sekmesinden Search Patient butonuna tiklar
    Then Staff Patient SSN: text boxina SSN numarasi girer
    And Staff hastada gorunen Show Appointments butonuna tiklar
    And Staff Completed ve canceled statusune sahip randevularin Payment kisminin gorundugunu test eder

  Scenario: TC_003 Kullanıcı, Muayene ücreti, test ürün fiyatları gibi tüm faturaları görüntüleyebilir ve hasta için yeni bir fatura oluşturabilir.

    Given Kullanici Medunna sayfasina gider
    Then Staff staff hesabi ile siteye giris yapar
    And Staff MY PAGES sekmesinden Search Patient butonuna tiklar
    Then Staff Patient SSN text boxina SSN numarasi girer
    And Staff hastada gorunen Show Appointments butonuna tiklar
    And Staff Payment buttonuna tiklar
    And Staff Exam fee: kisminin gorunurlugunu test eder
    And Staff Test Item Fee kisminin gorunurlugunu test eder

  Scenario: TC_004 Kullanıcı daha sonra hastaya gönderilen faturayı görebilir

    Given Kullanici Medunna sayfasina gider
    Then Staff staff hesabi ile siteye giris yapar
    And Staff MY PAGES sekmesinden Search Patient butonuna tiklar
    Then Staff Patient SSN text boxina SSN numarasi girer
    And Staff hastada gorunen Show Appointments butonuna tiklar
    And Staff daha once olusturulan faturanin gorunurlugunu test eder
