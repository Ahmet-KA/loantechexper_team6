Feature: Yanlis confirm password bilgisi ile  Change Password isleminin gerçekeltirilemediği test edilir
  Scenario: Yanlıs confirm password bilgisi ile  Change Password  Testi

    Given ana sayfaya gidilir
    Then allow Cookies tiklanir
    Then ana sayfa Log in butonuna tiklanir
    Then Gecerli "glyUserKullaniciAdi" ve "glyUserPassword" girilir
    Then log in butonuna tiklanir
    Then User Dashboard sayfasindaki Change Password butonuna tiklanir
    Then Current Password alanina "glyUserPassword" girilir
    Then Password alanina "glyUserPassword" girilir
    Then Confirm Passwoord alanina yanlis "glyYanlisPassword" girilir
    Then CPSubmit butonuna tiklanir
    And CP the password confirmation does not match uyarisinin  gorundugu dogrulanir