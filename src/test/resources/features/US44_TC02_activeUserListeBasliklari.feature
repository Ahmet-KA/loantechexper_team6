Feature: 'Active Users' linkine tıklandığında liste başlıkları görüntülenebilmelidir.
  Scenario: Active users liste basliklari goruntuleme testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Manage User link'ine tiklanir
    Then Active users link'ine tiklanir
    Then User, Email-Phone, Country, Joined At, Balance ve Action başlıklarının gorundugu dogrulanır.
    And sayfa kapatiliir