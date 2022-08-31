Feature: user_registration

  Scenario: TC_01_Yeni bir kullanıcı bilgisi görme
    Given Kullanici  Medunna adresine gider
    Then  Ardından Admin oturum açar
    And   Admin, Yönetimler'e ve ardından Kullanıcı Yönetimi'ne tıklar.
    And   Admin, Görüntüle düğmesine tıklar
    And   Admin, kullanıcının sayfadaki bilgilerini doğrular
    And  Ardından Admin uygulamayı kapatır


  Scenario: TC_02_Kullanıcıya yeni bir rol verilmesi
    Given Kullanici  Medunna adresine gider
    Then  Ardından Admin oturum açar
    And    Admin, Yönetimler'e ve ardından Kullanıcı Yönetimi'ne tıklar.
    And  Admin Düzenle düğmesine tıklar
    And  Admin kullanıcıya rol atar
    And  Admin Kaydet düğmesine tıklar
    And  Ardından Admin uygulamayı kapatır

  Scenario: TC_03_ Kullanıcıyı etkinleştirilir
    Given Kullanici  Medunna adresine gider
    Then  Ardından Admin oturum açar
    And    Admin, Yönetimler'e ve ardından Kullanıcı Yönetimi'ne tıklar.
    And  Admin Düzenle düğmesine tıklar
    And  Admin, kullanıcının durumunu etkinleştirir
    And  Ardından Admin uygulamayı kapatır

  @delete_user
  Scenario: TC_04_deleting_a_user

    Then Verilen kullanıcı register sayfasında
    And Verilen kullanıcı "ssn" olarak geçerli bir SSN numarası girer
    And Ve kullanıcı "ad" olarak geçerli bir ad girer
    And Ve kullanıcı "soyadı" olarak geçerli bir soyadı girer
    And Ve kullanıcı "kullanıcı adı" olarak bir kullanıcı adı girer
    And Ve kullanıcı "e-posta" olarak geçerli bir e-posta adresi girer
    And Ve kullanıcı "şifre" olarak yeni bir şifre girer ve şifreyi "şifre" olarak onaylar.
    And Ve kullanıcı kayıt düğmesine tıklar
    And Ardından kullanıcı kayıt başarılı mesajını görmelidir
    Given Kullanici  Medunna login adresine gider
    Then  Ardından Admins oturum açar
    And   Admin, Yönetimler'e ve ardından Kullanıcıs Yönetimi'ne tıklar.
    And Ve Adminkullanıcıyı siler
    And  Ardından Admin uygulamayı kapatır
