@US16
Feature:US016_Oda Oluşturma / Görüntüleme / Güncelleme /Silme (Admin)

  Scenario: TC01_Admin, yatan hastalar için yeni oda oluşturabilir.
    Given "medunnaUrl" e gidilir, ikon ve Sign in butonu tiklanir.
    And Gecerli kullanici bilgisi "admin_username" ve "admin_password" girilir ve Signin tiklanir.
    And Acilan sayfada girilen kullanici isminin gorunur oldugu test edilir.
    And Items&Titles basligi ve Room tiklanir.
    And Create a new Room butonu tiklanir ve acilan sayfada Create or edit a Room yazisinin gorunur oldugu dogrulanir.

  Scenario Outline: TC02_Oda oluşturulurken Room Number mutlaka olmalı,Room Type; TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE olmalı
            #TC03_Oda için "Status" ayarlanabilir olmalı.
            #TC04_Fiyat eklenebilir olmalı ve boş bırakılamamalı.
            #TC05_"Description" isteğe bağlı olarak doldurulmalı.
            #TC06_"""Created Date"" Gün/Ay/Yıl şeklinde olmalı ve geçmiş tarih seçilememeli.

    Given "medunnaUrl" e gidilir, ikon ve Sign in butonu tiklanir.
    And Gecerli kullanici bilgisi "admin_username" ve "admin_password" girilir ve Signin tiklanir.
    And Acilan sayfada girilen kullanici isminin gorunur oldugu test edilir.
    And Items&Titles basligi ve Room tiklanir.
    And Create a new Room butonu tiklanir ve acilan sayfada Create or edit a Room yazisinin gorunur oldugu dogrulanir.
    And Room number textbox'ina gecerli deger girilir, gecersiz deger girildiginde This field should be a number. uyarisi alinir.
    And Room Type TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE olarak secilir.
    And Status butonunun secilebilir oldugu test edilir.
    And Price textbox'i bos birakilir ve This field is required. uyarisi aldigi goruntulenir.
    And Price textbox'ina gecersiz deger girilir ve This field should be at least . uyarisi aldigi goruntulenir
    And Price textbox'ina gecerli deger girilir ve gecerli deger girildigi dogrulanir.
    And Description textbox'i bos birakilir ve bos birakildigi dogrulanir
    And Created Date icin tarih bilgisi "<date>" seklinde gunayyil girilir.
    And Created Date icin girilen tarih bilgisinin gunayyil (aygunyil) seklinde oldugu test edilir.
    And Oda basarili bir sekilde kaydedilir ve dogrulanir.

    Examples:
    |date|
    |03.09.2022|

   Scenario: TC07_Kullanici Created Date alani icin gecmis tarih girdiginde randevu olusturulmamalidir
     Given "medunnaUrl" e gidilir, ikon ve Sign in butonu tiklanir.
     And Gecerli kullanici bilgisi "admin_username" ve "admin_password" girilir ve Signin tiklanir.
     And Acilan sayfada girilen kullanici isminin gorunur oldugu test edilir.
     And Items&Titles basligi ve Room tiklanir.
     And Create a new Room butonu tiklanir ve acilan sayfada Create or edit a Room yazisinin gorunur oldugu dogrulanir.
     And Room Number, Room Type, Status, Price, Description kisimlari istenilen sekilde doldurulur.
     And Created Date gecmis bir tarih bilgisi ile doldurulur ve Save butonuna basildiginda 'A new Room is created with identifier' mesajinin gorunmedigi dogrulanir.


  Scenario: TC08_Admin aynı tür odaları görebilir.
      Given "medunnaUrl" e gidilir, ikon ve Sign in butonu tiklanir.
      And Gecerli kullanici bilgisi "admin_username" ve "admin_password" girilir ve Signin tiklanir.
      And Acilan sayfada girilen kullanici isminin gorunur oldugu test edilir.
      And Items&Titles basligi ve Room tiklanir.
      And Acilan sayfada Room Type tiklanir ve ayni tur olan odalarin gorunur oldugu dogrulanir.

      Scenario: TC09_Admin mevcut odaları düzenleyebilir ve güncelleyebilir.
        Given "medunnaUrl" e gidilir, ikon ve Sign in butonu tiklanir.
        And Gecerli kullanici bilgisi "admin_username" ve "admin_password" girilir ve Signin tiklanir.
        And Acilan sayfada girilen kullanici isminin gorunur oldugu test edilir.
        And Items&Titles basligi ve Room tiklanir.
        And Olusturulan oda bulunur ve edit tiklanir, gerekli guncellemeler yapilir ve save butonu tiklanir.
        And Basarili sekilde guncelleme yapildigi cikan A Message is updated with identifier yazisi ile dogrulanir.

        Scenario: TC10_Odalar Admin tarafından silinebilir.
          Given "medunnaUrl" e gidilir, ikon ve Sign in butonu tiklanir.
          And Gecerli kullanici bilgisi "admin_username" ve "admin_password" girilir ve Signin tiklanir.
          And Acilan sayfada girilen kullanici isminin gorunur oldugu test edilir.
          And Items&Titles basligi ve Room tiklanir.
          And Olusturulan oda bulunur ve delete tiklanir.
          And Silme isleminin basarili sekilde gerceklestigi  A Message is deleted with identifier mesaji ile dogrulanir.



























































































