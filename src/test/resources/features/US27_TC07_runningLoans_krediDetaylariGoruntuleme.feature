Feature: Details sayfasinda kredi detaylarina (Plan, Date of Application, Loan Number,Amount,  Per Installment,
  Total Installment, Given Installment,  Total Payable, Profit, Status bilgilerine ) erisilebilmelidir.
  Scenario: Running Loans- Details Syafasi - Kredi Detail erisim testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Loans menusune tiklanir
    Then Running Loans menusune tiklanir.
    Then Details sekmesine tiklanir
    Then Plan, Date of Application, Loan Number, Amount, Per Installment, Total Installment, Given Installment,  Total Payable, Profit, Status textlerinin goruntulendigi dogrulanir
    And sayfa kapatiliir