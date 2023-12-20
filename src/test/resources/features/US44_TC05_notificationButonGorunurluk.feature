
Feature: User detail sayfasinda Notification butonu gorunur olmali
  Scenario: Notification butonu gorunurluk testi


Given Admin ana sayfayya gidilir
Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
Then Log in butonuna giris tikklanir
Then Manage User link'ine tiklanir
Then Active users link'ine tiklanir
Then Details butonuna tiklanir
    Then Notification text'inin gorundugu dogrulanir
    And sayfa kapatiliir