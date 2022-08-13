Feature: US010_Doktor (Physician) randevular

  Scenario: DB ile randevuları doğrulayın
    Given database ile baglanti kurulur.
    And Table tablosundan selectRow satirlari getirilir.
    And appointments tablosunun column sutununun columnData icerdigi dogrulanir.

