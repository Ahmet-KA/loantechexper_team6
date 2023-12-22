Feature:  Send notification sayfasinda Submit Buton görünür olmali
  Scenario: Submit butonu goruntuleme testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Manage User link'ine tiklanir
    Then Active users link'ine tiklanir
    Then Details butonuna tiklanir
    Then notifications butonuna tiklanir
    Then send notification butonuna tiklanir
    Then submit butonunun goruntulendigi dogrulanir
    And sayfa kapatiliir