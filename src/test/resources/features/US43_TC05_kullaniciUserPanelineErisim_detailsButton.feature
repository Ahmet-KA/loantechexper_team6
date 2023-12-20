Feature: Listeden seçilen herhangi bir kullanıcıya ait bilgilere ulaşmak için
  'Details' butonu ile User Detail sayfasina ulasilmasi

  Scenario: User Detail sayfasina ulasma testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Manage User link'ine tiklanir
    Then Active users link'ine tiklanir
    Then Details butonuna tiklanir
    And User Detail – kullanici adi text’inin gorundugu dogrulanir
    And sayfa kapatiliir