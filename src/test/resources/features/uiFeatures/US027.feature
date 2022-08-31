@US027
 Feature:Admin mesaj portalina gidebilmelidir

   Scenario: US027_TC00-04 Admin mesaj portalina gidebilir
    Given Kullanici URL Adresine Gider
    Then Kullanici Singin Butonuna Tıklar  Username,Sifre Girilir Sing Butonuna Tiklanir Admin olarak Giris Yapiir
    Then Kullanici Acilan  Menuden Messages Secenegine Tiklar
    Then Kullanici  Items&Titles Butonuna Tiklar
    And Kullanici Messages Sayfasinin Acildigini Dogrular
    Then Kullanici Messages Sayfasında  ID Basliginin Gorundugunu  Dogrular
    Then Kullanici Messages Sayfasında Email Basliginin Gorundugunu Dogrular
    Then Kullanici Messages Sayfasında Name Basliginin Gorundugunu Dogrular
    Then ID Baslıgını Tiklar Mesaj Listesi Siralanir ve Son Mesaja Kadar Liste Kaydirilir
    Then Kullanici Yeni Mesaj Olusturur
    Then Kullanici İsim Email Baslik ve Mesaj İcerigi Girer Save Tiklar
    Then Kullanici A New Mesaj Yazisini Gorur ve Dogrulanir
     Then Kullanici İD Basligina Tiklar Mesaj Listesi Sıralanir
    Then Kullanici İlk MesajIn Edit Butonuna Tiklar Mesaja Ekleme Yapilir
      And  Kullinici Save Butonuna Tiklar Yesil Yazi grunur
    Then Kullanici İD Basligina Tiklar Mesaj Listesi Sıralanir
    Then Kullanici İlk Mesajın Delete Butonuna Tiklar Mesajı Siler



