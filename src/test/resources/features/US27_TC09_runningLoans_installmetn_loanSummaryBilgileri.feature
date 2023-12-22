Feature: •	Installments sayfasinda Loan summary bilgileri (Loan Number, Plan, Loan Amount,  Per Installment,
  Total Installment, Given Installment,  Receivable, Delay Charge) goruntulenmelidir.
  Scenario: Loan summary bilgileri goruntuleme testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Loans menusune tiklanir
    Then Running Loans menusune tiklanir.
    Then Running Loans Installment sekmesine tiklanir
    Then Loan Number, Plan, Loan Amount,  Per Installment,Total Installment, Given Installment,  Receivable, Delay Charge bilgilerinin goruntulendigi dogrulanir
    And sayfa kapatiliir