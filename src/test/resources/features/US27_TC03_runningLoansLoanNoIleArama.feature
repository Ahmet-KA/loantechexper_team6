
Feature: Running Loans sayfasindaki Running Loans tablosu uzerinde "Loan No” bilgisi ile arama yapilabilmelidir.
  Scenario: Running Loans- Loan no ile arama yapma testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Loans menusune tiklanir
    Then Running Loans menusune tiklanir.
    Then Loan No alanina numara girilir
    Then search butonuna tiklanir
    And sayfa kapatiliir