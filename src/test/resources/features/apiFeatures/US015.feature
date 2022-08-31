Feature: test api

  @Api
  @GetApiPatients
  Scenario: Hasta bilgilerini doğrulama api testi
    Given Kullanıcı hasta bilgileri için get request yapar
    And Kullanıcı gelen datayı deserialize eder
    Then Kullanıcı hasta datalarını kaydeder ve doğrular

