Feature:US007_Hastalar randevu tarihi oluşturabilmelidir

  Scenario:TC01_Kullanıcı geçerli tarih girmelidir. (güncel tarihi veya gelecekteki tarihleri seçebilmelidir)
    Given "medunnaUrl" e gidilir.
    Then Sign in butonu tiklanir.
    And Kullanici kayitli oldugu "HastaUserName" i girmelidir.
    And Kullanici kayitli "HastaPassword" u girmelidir
    And SignIn butonu tiklanir.
    And Acilan sayfada girilen kullanici isminin gorunur oldugu test edilir.
    And MY PAGES(PATIENT)  butonuna tiklar ve menu'den Make An Appointment secenegini tiklar.
    And Acilan sayfada Make an Appointment yazisinin gorunur oldugu test edilir.
    And Firstname, Lastname,SSN,Email ve Phone textbox'ini gecerli bir deger ile doldurur.
    And Appointment DateTime icin guncel tarih bilgisi girilir.
    And Date textbox'inda yer alan tarihin girilen tarih ile ayni oldugu test edilir.
    And Send an Appointment Request butonunu tiklar.
    And Randevunun basarili bir sekilde kaydedildigini cikan popup ile dogrular.
    And Sayfa kapatilir.

    Scenario: TC02_Kullanici date alani icin gecmis tarih girdiginde randevu olusturulmamalidir.
      Given "medunnaUrl" e gidilir.
      Then Sign in butonu tiklanir.
      And Kullanici kayitli oldugu "HastaUserName" i girmelidir.
      And Kullanici kayitli "HastaPassword" u girmelidir
      And SignIn butonu tiklanir.
      And Acilan sayfada girilen kullanici isminin gorunur oldugu test edilir.
      And MY PAGES(PATIENT)  butonuna tiklar ve menu'den Make An Appointment secenegini tiklar.
      And Acilan sayfada Make an Appointment yazisinin gorunur oldugu test edilir.
      And Firstname, Lastname,SSN,Email ve Phone textbox'ini gecerli bir deger ile doldurur.
      And Date textbox'ini gecmis bir tarih ile doldurur.
      And Date textboxinin altinda Appointment date can not be past date! uyarisinin gorundugunu dogrular.
      And Send an Appointment Request butonuna basildiginda kayit yapilmadigi gorulur.

    Scenario: TC03_Kullanici date alani icin ileri tarihli bir deger girdiginde randevu olusturulmalidir
      Given "medunnaUrl" e gidilir.
      Then Sign in butonu tiklanir.
      And Kullanici kayitli oldugu "HastaUserName" i girmelidir.
      And Kullanici kayitli "HastaPassword" u girmelidir
      And SignIn butonu tiklanir.
      And Acilan sayfada girilen kullanici isminin gorunur oldugu test edilir.
      And MY PAGES(PATIENT)  butonuna tiklar ve menu'den Make An Appointment secenegini tiklar.
      And Acilan sayfada Make an Appointment yazisinin gorunur oldugu test edilir.
      And Firstname, Lastname,SSN,Email ve Phone textbox'ini gecerli bir deger ile doldurur.
      And Date textbox'ini ileri bir tarih ile doldurur.
      And Send an Appointment Request butonuna basildiginda Appointment registration saved yazisi gorulmeli.

    Scenario Outline: TC04_Tarih sırası gün/ay/yıl (ay/gün/yıl) şeklinde olmalıdır.
      Given "medunnaUrl" e gidilir.
      Then Sign in butonu tiklanir.
      And Kullanici kayitli oldugu "HastaUserName" i girmelidir.
      And Kullanici kayitli "HastaPassword" u girmelidir
      And SignIn butonu tiklanir.
      And Acilan sayfada girilen kullanici isminin gorunur oldugu test edilir.
      And MY PAGES(PATIENT)  butonuna tiklar ve menu'den Make An Appointment secenegini tiklar.
      And Acilan sayfada Make an Appointment yazisinin gorunur oldugu test edilir.
      And Tarih bilgisi alani "<date>" seklinde girilir ve gunayyil seklinde oldugu test edilir.

      Examples:
      |date|
      |06.15.2023|
      |01.17.2040|







