Feature:  Send notification sayfasinda Submit butonuna tiklandiktan sonra "notification sent successfully"
  mesajının goruntulenmesi
  Scenario: Submit butonu testi

    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Manage User link'ine tiklanir
    Then Active users link'ine tiklanir
    Then Details butonuna tiklanir
    Then notifications butonuna tiklanir
    Then send notification butonuna tiklanir
    Then Subject textbox doldurulur
    Then Message textbox doldurulur
    Then submit butonununa tiklanir
    Then mesaj gonderildi text'inin goruntulendigi dogrulanir
    And sayfa kapatiliir