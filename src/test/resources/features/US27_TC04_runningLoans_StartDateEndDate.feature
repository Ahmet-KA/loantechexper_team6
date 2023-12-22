Feature: Running Loans sayfasindaki Running Loans tablosu uzerinde "Start Date - End Date” bilgisi ile arama yapilabilmelidir.
  Scenario: Running Loans- "Start Date - End Date" ile arama yapma testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Loans menusune tiklanir
    Then Running Loans menusune tiklanir.
    Then start date - end date alanina tiklanir
    Then baslangic tarihi secilir
    Then bitis tarihi secilir
    Then kendi search butonuna tiklanir
    And sayfa kapatiliir