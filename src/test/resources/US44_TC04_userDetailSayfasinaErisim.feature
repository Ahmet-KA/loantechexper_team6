
Feature: Listeden seçilen herhangi bir kullanıcıya ait bilgilere ulaşmak için
  'Details' butonun aktif olmalıdır.
  Scenario: Details butonu aktiflik testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Manage User link'ine tiklanir
    Then Active users link'ine tiklanir
    Then Details butonuna tiklanir
    And sayfa kapatiliir