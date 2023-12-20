Feature: Send notification butonuna tiklandiginda acilan sayfada Subject text box
  zorunlu alan olmali
  Scenario: Send notification-subject box zorunlu alan testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Manage User link'ine tiklanir
    Then Active users link'ine tiklanir
    Then Details butonuna tiklanir
    Then notifications butonuna tiklanir
    Then send notification butonuna tiklanir
    Then submit butonununa tiklanir
    Then notification sent successfully mesajinin goruntulenmedigi dogrulanir
    And sayfa kapatiliir