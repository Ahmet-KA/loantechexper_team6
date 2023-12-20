Feature: US1501 User Dashboar'da Change Password butonunun gorundugu dogrulanır

  Scenario: Change Password butonunun gorunurluk testi
    Given ana sayfaya gidilir
    Then allow Cookies tiklanir
    Then ana sayfa Log in butonuna tiklanir
    Then Gecerli "glyUserKullaniciAdi" ve "glyUserPassword" girilir
    Then log in butonuna tiklanir
    And change Password linkinin goruntulendigi dogrulanir


