@US012
Feature:Test

  Scenario: TC01 Physician(Doctor) test isteyebilmeli
    Given Doktor Medunna url'sine gider
    And  Doktor giriş yapar
    And  Doktor Sayfalarım bölümüne gider
    And  Randevularım'a tıklar
    And  Doktor hasta randevusunda düzenle butonuna tıklar
    And  Doktor test iste sekmesine tıklar.
    And  Doktor Glucose, Urea, Creatinine, Sodium,Potassium, Total protein, Albumin, Hemoglobin degerlerini secer
    And  Doktor kaydet butonuna tıklar
