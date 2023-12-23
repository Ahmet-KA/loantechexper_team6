Feature: Details sayfasindaki Kullanici Kredi Formu penceresinden kullanici kredi formu statusu goruntulenmelidir.
  Scenario: Kullanici kredi formus status goruntuleme testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Loans menusune tiklanir
    Then Running Loans menusune tiklanir.
    Then Details sekmesine tiklanir
    Then Status'un goruntulendigi dogrulanir
    And sayfa kapatiliir