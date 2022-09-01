Feature: US_018_Admin olarak; Yeni Physicians Olustur / Guncelle / Goruntule ve Sil

  Background: Ortak adimlar
    Given Kullanici medunna sayfasinda
    When Kullanici logoya tiklar
    Then Kullanici ilk signin butonuna tiklar
    And Kullanici kullanici adi girer
    And Kullanici sifre girer
    And Kullanici ikinci signin butonuna tiklar


  @smTes
  Scenario: TC001 Admin, doktorların bilgilerini görebilmelidir.

    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    Then admin butun doktorlarin bilgilerinin goruldugunu test eder

  @smTes
  Scenario: TC002 Admin, SSN kimligine gore kayitli bir kisiyi secebilir/arayabilir.

    And admin administration sekmesine basar
    And admin user management sekmesine basar
    And admin create a new user sekmesine basar
    And admin login "Kazimovic" firstname "Kazimovic" lastname "Kazimovic" mail "kazimovic@gmail.com" SSN "466-22-4479" rol olarak doktor girer
    And admin save tusuna basar
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin create a new physician sekmesine basar
    Then admin kayitli SSN "466-22-4479" girer ve dogrulama mesajinin geldigini test eder


  @smTes
  Scenario: TC003 Admin Doktorların bilgilerini "Edit Butonu" üzerinden düzenleyebilir.

    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin edit butona tiklar
    And admin tarih "12.12.1968" girer
    And admin telefon "5355557575" girer
    And admin adres "Washington STREET" girer
    And admin cinsiyet "OTHER" belirler
    And admin uzmanlik "Psychiatry" belirler
    And admin kan grubu "A+" secer
    And admin description "Doctor Doctor" girer
    And admin fotograf yukler
    And admin "3600" dolar ucret belirler
    And admin "sunu:123-23-2323" kullanici girer
    And admin country "Barbados" secer
    And admin save tusuna basar
    Then edit icin dogrulama mesajinin gorundugunu test eder


  @smTes
  Scenario: TC004 Kisilerin "firstname, lastname birth date .." bilgileri doldurulabilmeli.

    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin create a new physician sekmesine basar
    Then admin kayitli SSN "466-22-4479" girer ve dogrulama mesajinin geldigini test eder
    And admin use search check box tiklar
    And admin tarih "13.03.1978" girer
    And admin telefon "5656666666" girer
    And admin adres "Menderes mah." girer
    And admin cinsiyet "FEMALE" belirler
    And admin uzmanlik "Surgery" belirler
    And admin kan grubu "A+" secer
    And admin description "Yeni Kayit" girer
    And admin fotograf yukler
    And admin "333" dolar ucret belirler
    And admin "sunu:123-23-2323" kullanici girer
    And admin country "Bulgaria" secer
    And admin save tusuna basar
    Then create icin dogrulama mesajinin gorundugunu test eder

  Scenario: TC005 Admin Doktor icin bir uzmanlik alani secebilmeli.

    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin create a new physician sekmesine basar
    Then admin kayitli SSN "466-22-4479" girer ve dogrulama mesajinin geldigini test eder
    And admin use search check box tiklar
    And admin tarih "03.03.1988" girer
    And admin telefon "5656666666" girer
    And admin uzmanlik "Surgery" belirler
    And admin "300" dolar ucret belirler
    And admin save tusuna basar
    Then create icin dogrulama mesajinin gorundugunu test eder

  Scenario: TC006 Admin, doktorun profil resmini saglayabilir.

    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin create a new physician sekmesine basar
    Then admin kayitli SSN "466-22-4479" girer ve dogrulama mesajinin geldigini test eder
    And admin use search check box tiklar
    And admin tarih "03.03.1988" girer
    And admin telefon "5656666666" girer
    And admin fotograf yukler
    And admin "3000" dolar ucret belirler
    And admin save tusuna basar
    Then create icin dogrulama mesajinin gorundugunu test eder

  Scenario: TC007 Admin, doktorun Muayene ucretini girebilmelidir. (Exam fee)

    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin create a new physician sekmesine basar
    Then admin kayitli SSN "466-22-4479" girer ve dogrulama mesajinin geldigini test eder
    And admin use search check box tiklar
    And admin tarih "03.03.1988" girer
    And admin telefon "5656666666" girer
    And admin "33000" dolar ucret belirler
    And admin save tusuna basar
    Then create icin dogrulama mesajinin gorundugunu test eder

  Scenario: TC008 Admin, mevcut kullanıcılar arasından doktoru seçmelidir.

    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin create a new physician sekmesine basar
    Then admin kayitli SSN "466-22-4479" girer ve dogrulama mesajinin geldigini test eder
    And admin use search check box tiklar
    And admin tarih "03.03.1988" girer
    And admin telefon "5656666666" girer
    And admin "3000" dolar ucret belirler
    And admin "sunu:123-23-2323" kullanici girer
    And admin save tusuna basar
    Then create icin dogrulama mesajinin gorundugunu test eder


  @smTes
  Scenario: TC009 Admin mevcut doktorlari silebilir.

    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin delete butona tiklar
    And admin cikan uyari mesajinda delete butonuna basar
    Then delete icin dogrulama mesajinin gorundugunu test eder