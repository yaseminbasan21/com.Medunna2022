@US028
  Feature:
    Scenario:US028 Yeni Bir Ulke Olusturma
   Given Kullanici URL Adresine Gider.
    Then Kullanici Singin Butonuna Tıklar  Username  ve Sifre Girilir Sing Butonuna Tıklanir Admin olarak Giris Yapiir
    Then Kullanici  "Items&Titles" Butonuna Tiklar
    Then Kullanici Acilan  Menuden "Country" Secenegine Tiklanir
    Then Kullanici Acilan  Menuden A New Country Secenegine Tiklanir
    Then Kullanici Acilan  Menuden Ulke İsmi Girilir Save Butonuna Tiklanir
    Then Kullanici Yeni Bir Ulke Olustu Yesil Yazisini Gorur
    Then Kullanici Olusturulan Yeni Ulke İsmi İle Bulunur ve Delete Butonuna Tiklanir
    Then Kullanici Silenen Ulkenin Silindi  Yesil Yaziyi Gorur
    Then Kullanici  "Items&Titles" Butonuna Tiklar
    Then Kullanici Acilan  Menuden "City" Secenegine Tiklanir
    Then Kullanici Acilan  Menuden A New City Butonuna Tiklanir
    Then Kullanici Olusturulan Ulkeyi Bulur ve Yeni Sehir Yazilir Save Butonuna Tiklanir
    Then Kullanici Sehir Eklendi Yesil Yaziyi Gormelidir
