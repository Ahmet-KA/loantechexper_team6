Feature: US0017 Kullanici Loantechexperdan guvenli cikis yapar

  Scenario: TC01 Kullanici loantechexper adresine kullanici bilgileriyle giris yapip logout butonunu goruntuler

    Given Kullanici loantechUrl anasayfasina gider
    And Kullanici login butonuna tiklar
    And username ve password bilgilerini girer
    And logout butonunu gorur
    Then kullanici sayfayi kapatir

  Scenario: TC02 Kullanici loantechexper adresine kullanici bilgileriyle giris yapip logout butonuna tıklar anasayfaya döner

    Given Kullanici loantechUrl anasayfasina gider
    And Kullanici login butonuna tiklar
    And username ve password bilgilerini girer
    And logout butonuna tiklar
    And Anasayfaya doner ve You have been logged out. yazisini goruntuler
    Then kullanici sayfayi kapatir
