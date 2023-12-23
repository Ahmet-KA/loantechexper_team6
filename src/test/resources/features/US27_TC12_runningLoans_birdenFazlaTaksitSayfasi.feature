Feature: Installments sayfasinda taksitler 20'den fazlaysa bir sonraki sayfada listelenmeye devam etmelidir.
  Scenario: installment taksit sayfasi ikinci sayfaya gecme testi
    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Loans menusune tiklanir
    Then Running Loans menusune tiklanir.
    Then Running Loans Installment sekmesine tiklanir
    Then Sayfayi asagi kaydirir
    Then Taksitler yirmiden fazlaysa ikinci Sayfaya tiklar.
