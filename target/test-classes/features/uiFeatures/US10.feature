
Feature: US010_Kullanıcı, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.

     @us1001, @smoke
    Scenario: TC01_Kullanıcı,randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.
      Given "medunnaUrl" e gidilir.
      Then Sign in butonu tiklanir.
      And Kullanici kayitli oldugu "DoktorUserName" i girmelidir.
      And Kullanici kayitli "DoktorPassword" u girmelidir
      And SignIn butonu tiklanir.
      And Acilan sayfada girilen kullanici isminin gorunur oldugu test edilir.
      And MY PAGES butonuna tiklar ve menuden My Appointment secenegini tiklar.
      And Acilan sayfada Appointments yazisinin gorunur oldugu test edilir.
      And Acilan sayfada randevu listesi ve zaman dilimlerinin gorunur oldugu test edilir.
      And Sayfa kapatilir.

    @us1002, @smoke
    Scenario: TC02_Kullanıcı "patient id, start date, end date, status" bilgilerini görebilmeli
      Given "medunnaUrl" e gidilir.
      Then Sign in butonu tiklanir.
      Given Kullanici kayitli oldugu "DoktorUserName" i girmelidir.
      And Kullanici kayitli "DoktorPassword" u girmelidir
      And SignIn butonu tiklanir.
      And Acilan sayfada girilen kullanici isminin gorunur oldugu test edilir.
      And MY PAGES butonuna tiklar ve menuden My Appointment secenegini tiklar.
      And Acilan sayfada Appointments yazisinin gorunur oldugu test edilir.
      And Acilan sayfada patient id, start date, end date ve status bilgilerinin gorunur oldugu test edilir.
      And Sayfa kapatilir.