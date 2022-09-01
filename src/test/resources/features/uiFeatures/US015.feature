Feature: Admin tarafından hasta oluşturma ve düzenleme

  @US15_TC01
  Scenario: Yeni hastalar yalnızca Admin tarafından oluşturulabilir
    Given Kullanıcı "medunnaUrl" adresine gider.
    Then Giriş hesap butonunun ardından sign in butonuna tıklar.
    Then Admin geçerli bir username girer.
    Then Admin geçerli bir password girer.
    Then Admin giriş sign in butonuna tıklar.
    Then Admin Items&Titles butonuna tıklar.
    Then Admin Patient butonuna tıklar.
    Then Admin Create a new Patient butonuna tıklar.
    Then Admin geçerli hasta bilgilerini girer.
    Then Admin Save butonuna tıklar ve A new Patient is created yazısını görüntüler.
    And Sayfayı kapatır
    #

  @US15_TC02
  Scenario:Admin hasta bilgilerini görebilir.
    Given Kullanıcı "medunnaUrl" adresine gider.
    Then Giriş hesap butonunun ardından sign in butonuna tıklar.
    Then Admin geçerli bir username girer.
    Then Admin geçerli bir password girer.
    Then Admin giriş sign in butonuna tıklar.
    Then Admin Items&Titles butonuna tıklar.
    Then Admin Patient butonuna tıklar.
    Then Admin Patients başlığını ve Patients başlığı altında hasta bilgilerini görebilmelidir.
    And Sayfayı kapatır

  @US15_TC03
  Scenario:Admin hasta bilgilerini güncelleyebilir olmalıdır
    Given Kullanıcı "medunnaUrl" adresine gider.
    Then Giriş hesap butonunun ardından sign in butonuna tıklar.
    Then Admin geçerli bir username girer.
    Then Admin geçerli bir password girer.
    Then Admin giriş sign in butonuna tıklar.
    Then Admin Items&Titles butonuna tıklar.
    Then Admin Patient butonuna tıklar.
    Then Admin Edit butonuna tıklar.
    Then Admin tüm hasta bilgilerini görür.
    And Sayfayı kapatır


  @US15_TC04
  Scenario: Hastaya doktoru sadece admin atayabilir.
    Given Kullanıcı "medunnaUrl" adresine gider.
    Then Giriş hesap butonunun ardından sign in butonuna tıklar.
    Then Admin geçerli bir username girer.
    Then Admin geçerli bir password girer.
    Then Admin giriş sign in butonuna tıklar.
    Then Admin Items&Titles butonuna tıklar.
    Then Admin Appointment butonuna tıklar.
    Then Admin Appointments'ları görür.
    Then Admin ilgili hastanın Edit butonuna tıklar.
    Then Admin Physician butonuna tıklar ve hastaya doktor atar.
    Then Admin Save butonuna tıklar.
    And Sayfayı kapatır

  @US15_TC05
  Scenario:Admin hastanın Country ve State/City bilgilerini görebilmeli boş bırakmamalıdır
    Given Kullanıcı "medunnaUrl" adresine gider.
    Then Giriş hesap butonunun ardından sign in butonuna tıklar.
    Then Admin geçerli bir username girer.
    Then Admin geçerli bir password girer.
    Then Admin giriş sign in butonuna tıklar.
    Then Admin Items&Titles butonuna tıklar.
    Then Admin Patient butonuna tıklar.
    Then Admin Create a new Patient butonuna tıklar.
    Then Admin Country ve State butonlarını görür.
    Then Admin geçerli hasta bilgilerini girer ve Country olarak USA seçer.
    Then Admin State olarak California seçer.
    Then Admin Save butonuna tıklar ve A new Patient is created yazısını görüntüler.
    And Sayfayı kapatır

  @US15_TC05
  Scenario:Admin State seçmiyor  (bug)
    Given Kullanıcı "medunnaUrl" adresine gider.
    Then Giriş hesap butonunun ardından sign in butonuna tıklar.
    Then Admin geçerli bir username girer.
    Then Admin geçerli bir password girer.
    Then Admin giriş sign in butonuna tıklar.
    Then Admin Items&Titles butonuna tıklar.
    Then Admin Patient butonuna tıklar.
    Then Admin Create a new Patient butonuna tıklar.
    Then Admin Country ve State butonlarını görür.
    Then Admin geçerli hasta bilgilerini girer ve Country olarak Fas seçer.
    Then Admin State bilgisi girmez ve Save butonuna tıklar.
    Then Admin A new Patient is created yazısını görüntüleyememelidir.
    And Sayfayı kapatır

  @US15_TC06
  Scenario: Admin herhangi bir hastayı silebilir (bug)
    Given Kullanıcı "medunnaUrl" adresine gider.
    Then Giriş hesap butonunun ardından sign in butonuna tıklar.
    Then Admin geçerli bir username girer.
    Then Admin geçerli bir password girer.
    Then Admin giriş sign in butonuna tıklar.
    Then Admin Items&Titles butonuna tıklar.
    Then Admin Patient butonuna tıklar.
    Then Admin hastayı silmek için Delete butonuna tıklar.
    Then Admin onay kutusunun Delete butonuna tıklar ve hastayı siler.
    And Sayfayı kapatır
