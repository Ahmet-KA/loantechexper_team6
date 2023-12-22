Feature: Installments sayfasindan Running Loans sayfasina donus yapilabilmelidir.
  Scenario: Installment sayfasindan Running Loan sayfasina donus testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Loans menusune tiklanir
    Then Running Loans menusune tiklanir.
    Then Running Loans Installment sekmesine tiklanir
    Then Running Loans sayfasina donus yapilir
    And sayfa kapatiliir