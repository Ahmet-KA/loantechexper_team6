
Feature: 'Active Users' linkine tıklandığında 'Active Users Listesi'  görüntülenebilmelidir.
  Scenario: Active User listesi goruntuleme testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Manage User link'ine tiklanir
    Then Active users link'ine tiklanir
    Then Details butonunun goruntulendigi dogrulanir
    And sayfa kapatiliir