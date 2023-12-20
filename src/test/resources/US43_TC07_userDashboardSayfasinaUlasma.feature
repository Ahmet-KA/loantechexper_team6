
  Feature: Log in as a user butonu na tıklandığında User Dashboard 'User dashboard' sayfasına yönlendirmelidir.
    Scenario: User Dashboard sayfasina ulasma testi

      Given Admin ana sayfayya gidilir
      Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
      Then Log in butonuna giris tikklanir
      Then Manage User link'ine tiklanir
      Then Active users link'ine tiklanir
      Then Details butonuna tiklanir
      Then Log in as a user butonuna tiklaniir
      Then Dashboard yazisinin goruntulendigi dogrulaniir
      And sayfa kapatiliir

