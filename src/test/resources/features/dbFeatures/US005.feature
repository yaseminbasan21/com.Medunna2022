Feature: US005_Hastalar randevu  oluşturabilmelidir

  Scenario: TC04_DB kullanarak randevuları doğrulanabilmeli.
    Given US05 için Database ile baglanti kurulur.
    Then US05 table tablosundan selectRow satirlari getirilir.
    And US05 Appointments tablosunun column sutununun columnData icerdigi dogrulanir.