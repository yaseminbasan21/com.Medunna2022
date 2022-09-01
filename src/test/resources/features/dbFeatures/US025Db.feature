@US_025
  Feature: DB ile randevu alma

    @us025DB
    Scenario: TC025_DB kullanarak randevuları doğrulanabilmeli.
      Given Database baglantisi kurulur.
      Then Table tablosundann selectRow satirlari getirilir.
      And Appointments tablosunun columnData icerdigi dogrulanir.