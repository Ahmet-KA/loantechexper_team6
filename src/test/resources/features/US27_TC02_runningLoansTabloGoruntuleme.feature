Feature:•	Running Loans sayfasinda Running Loans Tablosu (S.N., Loan No.|Plan,
  User, Amount, Installment Amount, Installment, Created | Next Installment,
  Status bilgileri ile) goruntulenmelidir.
  Scenario: Running Loans Tablo goruntuleme testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Loans menusune tiklanir
    Then Running Loans menusune tiklanir.
    Then S.N., Loan No.|Plan, User, Amount, Installment Amount, Installment,Created | Next Installment, Status basliklarinin goruntulendigi dogrulanir.
    And sayfa kapatiliir
