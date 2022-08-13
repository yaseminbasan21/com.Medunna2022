Feature: US007_Hastalar randevu tarihi oluşturabilmelidir

  Scenario: TC06_DB kullanarak randevuları doğrulanabilmeli.
    Given Database ile baglanti kurulur.
    Then table tablosundan selectRow satirlari getirilir.
    And Appointments tablosunun column sutununun columnData icerdigi dogrulanir.