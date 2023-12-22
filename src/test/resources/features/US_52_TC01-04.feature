Feature: US0052 Kullanici Loantechexperdaki yonetici panelinde kullanicilarin para yatirma islemlerini kontrol eder

  Scenario: TC01 Kullanıcı yonetici dashboarddaki deposits menusune tiklar

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan deposits basligina tiklar
    Then kullanici sayfayi kapatir

  Scenario: TC02 Kullanıcı yonetici dashboarddaki deposits menusunden approved deposits linkine tiklar

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan deposits basligina tiklar
    And acilan menuden approved deposits basligina tiklar
    Then kullanici sayfayi kapatir

  Scenario: TC03 Kullanıcı yonetici dashboarddaki approved deposits sayfasindan kullanici aratir ve islem detaylarina bakar

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan deposits basligina tiklar
    And acilan menuden approved deposits basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan details butonuna tiklar
    Then kullanici sayfayi kapatir

  Scenario: TC04 Kullanıcı yonetici dashboarddaki aratilan kullanicinin approved deposits islem detaylarinin tumunu goruntuler

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan deposits basligina tiklar
    And acilan menuden approved deposits basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan details butonuna tiklar
    And details sayfasindaki icerigi goruntuler
    Then kullanici sayfayi kapatir