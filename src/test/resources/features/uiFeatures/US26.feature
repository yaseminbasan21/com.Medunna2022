Feature: US_026 İletişim Mesajı


  @US26_TC01
  Scenario: Kullanıcı Contact Portal'a erişebilir
  Given Kullanıcı "medunnaUrl" adresine gider.
  Then Giriş hesap butonunun ardından sign in butonuna tıklar.
  Then Kullanıcı geçerli bir username girer.
  Then Kullanıcı geçerli bir password girer.
  Then Kullanıcı giriş sign in butonuna tıklar.
  Then Kullanıcı CONTACT butonuna tıklar.
  Then Kullanıcı Contact Portal'a erişir.
  And Sayfayı kapatır

  @US26_TC02
  Scenario Outline: Kullanıcı ilgili bölümlere data girebilmeli ve mesaj gönderebilmelidir
    Given Kullanıcı "medunnaUrl" adresine gider.
    Then Giriş hesap butonunun ardından sign in butonuna tıklar.
    Then Kullanıcı geçerli bir username girer.
    Then Kullanıcı geçerli bir password girer.
    Then Kullanıcı giriş sign in butonuna tıklar.
    Then Kullanıcı CONTACT butonuna tıklar.
    Then Kullanıcı Name kutusunu görüntüler ve bir "<name>" girer.
    Then Kullanıcı Email kutusunu görüntüler ve bir "<email>" girer.
    Then Kullanıcı Subject kutusunu görüntüler ve bir "<subject>" girer.
    Then Kullanıcı Message kutusunu görüntüler ve bir "<message>" girer.
    Then Kullanıcı Send butonuna tıklar.
    Then Kullanıcı "Your message has been received" yazısını görüntüler.
    And Sayfayı kapatır

    Examples:
    | name        | email                     | subject       | message                       |
    | serife      | serifeyasemin00@gmail.com | Temizlik      | Temizlik                      |
    | mete        | metebasan00@gmail.com     | Randevu       | Randevu icin tesekkurler      |
