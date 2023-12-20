
Feature: User detail sayfasinda Notification butonu aktif olmali
  Scenario: Notification butonu aktiflik testi


    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Manage User link'ine tiklanir
    Then Active users link'ine tiklanir
    Then Details butonuna tiklanir
    Then notifications butonuna tiklanir
    And sayfa kapatiliir