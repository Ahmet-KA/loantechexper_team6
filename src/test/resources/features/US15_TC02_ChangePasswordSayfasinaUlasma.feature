Feature: User Dashboard'da Change Password linki ile Change Password sayfasina ulasildigi dogrulanir.

  Scenario: Change Password butonu testi
    Given ana sayfaya gidilir
    Then allow Cookies tiklanir
    Then ana sayfa Log in butonuna tiklanir
    Then Gecerli "glyUserKullaniciAdi" ve "glyUserPassword" girilir
    Then log in butonuna tiklanir
    Then User Dashboard sayfasindaki Change Password butonuna tiklanir
    And Change dasboard sayfasina ulasildigi dogrulanir.