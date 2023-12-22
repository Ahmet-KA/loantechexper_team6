Feature:Loans menu basligi altindaki "Running Loans" sayfa linkine tiklandiginda
  "Running Loans" sayfasina erisilmelidir.
  Scenario: Running Loans Sayfa Erisim Testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Loans menusune tiklanir
    Then Running Loans menusune tiklanir.
    Then Running Loans menusune ulasildigi dogrulanir.
    And sayfa kapatiliir

