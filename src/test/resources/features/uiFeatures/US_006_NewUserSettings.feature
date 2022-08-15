Feature: US_006 Kullanıcı ayarları düzenlenebilir olmalıdır

  Background: Kullanıcı,Kullanıcı ayarları sayfasına gider
    Given Kullanıcı "medunnaUrl" adresine gider.
    Then Giriş hesap butonunun ardından sign in butonuna tıklar.
    Then Kullanıcı geçerli bir username girer.
    Then Kullanıcı geçerli bir password girer.
    Then Kullanıcı sign in butonuna tıklar ve hesabına giriş yapar.
    Then Kullanıcı,kullanıcı hesap butonunun ardından settings butonuna tıklar.

  @US_006_1
  Scenario:Kullanıcı ayarlarının görünürlük testi
    Then Kullanıcı,metin için kullanıcı ayarları yazısını görür.
    Then Kullanıcı ayarlarındaki Firstname, Lastname ve Email kutusunda yazan kullanıcı bilgilerinin kullanıcıya ait olduğunu görüntüler.
    And Sayfayı kapatır


  @US_006_2_pozitifTest
  Scenario Outline:Kullanıcı güncelleme yapabilmelidir
    Then Firstname kutusu görüntülenmeli ve "<firstname>" olarak güncellenmelidir
    Then Lastname kutusu görüntülenmeli ve "<lastname>" olarak güncellenmelidir.
    Then Email kutusu görüntülenmeli ve "<email>" olarak güncellenmelidir.
    Then Kullanıcı Save butonuna tıklamalıdır.
    Then Kullanıcı Settings saved! yazısını görüntüleyebilmelidir.
    And Sayfayı kapatır

    Examples:
      | firstname | lastname | email               |
      | mete      | kaya     | mete000@gmail.com   |
      | mete      | basan    | mete00@gmail.com    |
      | elif      | yazar    | elifyazar@gmail.com |

  @US_006_3_negatifTest
  Scenario:Kullanıcı geçerli bilgileri girmeden güncelleme yapamamalıdır
    Then Kullanıcı firstname kutusunu boş bırakır
    Then kullanıcı Your first name is required. yazısını görmelidir
    Then Kullanıcı lastname kutusunu boş bırakır
    Then Kullanıcı Your last name is required. yazısını görmelidir.
    Then Kullanıcı email kutusunu boş bırakır
    Then Your email is required. yazısını görmelidir
    And Sayfayı kapatır

  @US_006_4_negatifTest
  Scenario Outline:Kullanıcı hatalı bir email ile güncelleme yapamamalıdır
    Then Kullanıcı geçerli bir firstname girer "mete"
    Then Kullanıcı geçerli bir lastname girer "basan"
    Then Kullanıcı hatalı bir email girer "<email>"
    And Sayfayı kapatır

    Examples:
      | email        |
      | mete         |
      | mete00       |
      | mete00@gmail |
