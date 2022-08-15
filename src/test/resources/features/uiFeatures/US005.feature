Feature: US_05 Hastalar (patients), hastahaneden randevu (Appointment) oluşturabilmelidir

  @Smoke
  Scenario: TC_01 Kullanıcı Hasta randevusunu oluşturur.

    Given Kullanıcı Medunna sitesine gider
    When  Kullanıcı  Make an Appointment butonuna tıklar.
    And Kullanıcı geçerli bir isim girer.
    And Kullanıcı geçerli bir soyisim girer.
    And Kullanıcı geçerli bir SSN girer
    And Kullanıcı geçerli bir e mail girer.
    And Kullanıcı geçerli bir numara girer.
    And Kullanıcı randevu oluştur butonua tıklar.
    And Kullanıcı randevu oluşturuldu yazısını görür.

  @Smoke
  Scenario:TC_02 Kullanıcı hastane randevusunu görür

    Given Kullanıcı Medunna sitesine gider
    When Kullanıcı giriş butonuna tıklar.
    When Kullanıcı sign in giriş butonuna tıklar
    When  Kullanıcı username girer
    When Kullanıcı password girer.
    When Kullanıcı giriş sign in butonuna tıklar.
    When Kullanıcı My Pages butonuna tıklar
    When Kullanıcı My Appointments butonuna tıklar
    When Kullanıcı oluşturduğu hasta randevusunu görür.
