
Feature: Butona Tıklandığında notification-log sayfasina yönlendirmelidir.
  (Bu baslıkta bir sayfa yok, send notification text'i  var.)
  Scenario: notification log sayfasina yonlendirme testi
    send notification butonu goruntuleme testi

Given Admin ana sayfayya gidilir
Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
Then Log in butonuna giris tikklanir
Then Manage User link'ine tiklanir
Then Active users link'ine tiklanir
Then Details butonuna tiklanir
Then notifications butonuna tiklanir
Then send notification text'inin gorundugu dogrulanir
And sayfa kapatiliir