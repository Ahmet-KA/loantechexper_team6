Feature: Installments sayfasinda taksitler S.N., Installment Date, Given On, Delay, Charge bilgileri ile goruntulenmelidir.
  Scenario: Installment taksit bilgileri goruntuleme testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Loans menusune tiklanir
    Then Running Loans menusune tiklanir.
    Then Running Loans Installment sekmesine tiklanir
    Then S.N., Installment Date, Given On, Delay, Charge  bilgilerinin goruntulendigi dogrulanir
    And sayfa kapatiliir