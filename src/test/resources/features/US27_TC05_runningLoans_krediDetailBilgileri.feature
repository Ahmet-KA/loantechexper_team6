Feature: Running Loans tablosunda bulunan Action basligi altinda secilen kredinin Details bilgilerine erisilebilmelidir.
  Scenario: Running Loans- Kredi Detail erisim testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Loans menusune tiklanir
    Then Running Loans menusune tiklanir.
    Then Details sekmesine tiklanir
    Then Loan details text'inin goruntulendigi dogrulanir
    And sayfa kapatiliir