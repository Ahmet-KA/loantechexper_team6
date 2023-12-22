Feature: Geçerli sayfada 'Login as User' butonu görüntülenebilir olmalıdır.
  Scenario: log in as a user butonu goruntuleme test

Given Admin ana sayfayya gidilir
Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
Then Log in butonuna giris tikklanir
Then Manage User link'ine tiklanir
Then Active users link'ine tiklanir
Then Details butonuna tiklanir
And ‘Log in as a user’ butonunun goruntulendigi dogrulanir
    And sayfa kapatiliir