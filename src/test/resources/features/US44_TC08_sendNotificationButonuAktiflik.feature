Feature: Notification-log sayfasında 'Send Notification' butonu  aktif olmalıdır.
  Scenario:send notification aktiflik testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Manage User link'ine tiklanir
    Then Active users link'ine tiklanir
    Then Details butonuna tiklanir
    Then notifications butonuna tiklanir
    Then send notification butonuna tiklanir
    And sayfa kapatiliir

