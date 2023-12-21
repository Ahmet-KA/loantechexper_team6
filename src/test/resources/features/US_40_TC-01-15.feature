Feature: US0040 Kullanici Loantechexperdaki yonetici panelinde kullanicilarin odeme yonetim islemlerini goruntuleyip kontrol eder

  Scenario: TC01 Kullanıcı yonetici dashboarddaki manage users menusune tiklar

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    Then kullanici sayfayi kapatir

  Scenario: TC02 Kullanıcı yonetici dashboarddaki manage users menusunden active users linkine tiklar

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    Then kullanici sayfayi kapatir

  Scenario: TC03 Kullanıcı yonetici dashboarddaki active users sayfasindan kullanici aratir ve islem detaylarina bakar

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan detailse tiklar
    Then kullanici sayfayi kapatir

  Scenario: TC04 Kullanıcı yonetici aratilan kullanicinin withdraw islem detaylarinin tumunu goruntuler

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan detailse tiklar
    And details sayfasindaki view withdraw all butonuna basar
    Then kullanici sayfayi kapatir

  Scenario: TC05 Kullanıcı yonetici aratilan kullanicinin withdraw history tablosunu ve basliklarini goruntuler

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan detailse tiklar
    And details sayfasindaki view withdraw all butonuna basar
    And liste ve liste basliklarini goruntuler
    Then kullanici sayfayi kapatir

  Scenario: TC06 Kullanıcı yonetici aratilan kullanicinin withdraw historyde bulunan basliklara tiklar

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan detailse tiklar
    And details sayfasindaki view withdraw all butonuna basar
    And Approved,Rejected ve Pending withdrawals butonlarini sirasiyla tiklar
    Then kullanici sayfayi kapatir

  Scenario: TC07 Kullanıcı yonetici aratilan kullanicinin  Approved Withdrawals sayfasina gider

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan detailse tiklar
    And details sayfasindaki view withdraw all butonuna basar
    And Approved withdrawals sayfasina gider
    Then kullanici sayfayi kapatir

  Scenario: TC08 Kullanıcı yonetici Approved Withdrawals sayfasinda aratilan kullanicinin islemlerini goruntuler

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan detailse tiklar
    And details sayfasindaki view withdraw all butonuna basar
    And Approved withdrawals sayfasina gider
    And search boxa gecmisini goruntulemek istedigi kullaniciyi girer
    And details butonuna tiklar ve detay sayfasini acar
    Then kullanici sayfayi kapatir

  Scenario: TC09 Kullanıcı yonetici Approved Withdrawals sayfasinda aratilan kullanicinin islemlerinin detaylarini goruntuler

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan detailse tiklar
    And details sayfasindaki view withdraw all butonuna basar
    And Approved withdrawals sayfasina gider
    And search boxa gecmisini goruntulemek istedigi kullaniciyi girer
    And details butonuna tiklar ve detay sayfasini acar
    And kullanicinin islem detaylarini goruntuler
    Then kullanici sayfayi kapatir

  Scenario: TC10 Kullanıcı yonetici Pending Withdrawals sayfasinda aratilan kullanicinin islemlerini goruntuler

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan detailse tiklar
    And details sayfasindaki view withdraw all butonuna basar
    And Pending withdrawals sayfasina gider
    And aramak istedigi kullanicinin ismini yazar ve islemlerini goruntuler
    Then kullanici sayfayi kapatir

  Scenario: TC11 Kullanıcı yonetici Pending Withdrawals sayfasinda aratilan kullanicinin islemlerinin detaylarini goruntuler

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan detailse tiklar
    And details sayfasindaki view withdraw all butonuna basar
    And Pending withdrawals sayfasina gider
    And aramak istedigi kullanicinin ismini yazar ve islemlerini goruntuler
    And details butonuna tiklar ve detay sayfasini acar
    And Detay sayfasindaki butonlari ve islem detaylarini goruntuler
    Then kullanici sayfayi kapatir

  Scenario: TC12 Kullanıcı yonetici Pending Withdrawals sayfasinda aratilan kullanicinin reject islemini yapar

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan detailse tiklar
    And details sayfasindaki view withdraw all butonuna basar
    And Pending withdrawals sayfasina gider
    And aramak istedigi kullanicinin ismini yazar ve islemlerini goruntuler
    And details butonuna tiklar ve detay sayfasini acar
    And Reject butonuna tiklar
    And Gerekli bilgileri girer
    And Submit butonuna tiklar
    And Withdrawal Rejected Successfully yazisini goruntuler
    Then kullanici sayfayi kapatir

  Scenario: TC13 Kullanıcı yonetici Pending Withdrawals sayfasinda aratilan kullanicinin approve islemini yapar

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan detailse tiklar
    And details sayfasindaki view withdraw all butonuna basar
    And Pending withdrawals sayfasina gider
    And aramak istedigi kullanicinin ismini yazar ve islemlerini goruntuler
    And details butonuna tiklar ve detay sayfasini acar
    And approve butonuna tiklar
    And Withdrawal Aprroved Successfully yazisini goruntuler
    Then kullanici sayfayi kapatir

  Scenario: TC14 Kullanıcı yonetici Rejected Withdrawals sayfasinda aratilan kullanicinin islemlerini goruntuler

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan detailse tiklar
    And details sayfasindaki view withdraw all butonuna basar
    And Rejected withdrawals sayfasina gider
    And aratilan kullanicinin bilgilerini goruntuler
    Then kullanici sayfayi kapatir

  Scenario: TC15 Kullanıcı yonetici Rejected Withdrawals sayfasinda aratilan kullanicinin islemlerinin detaylarini goruntuler

    Given Kullanici loantechAdmin sayfasina gider
    And yonetici bilgileriyle giris yapar
    And Dashboarddan manage users basligina tiklar
    And acilan menuden active users basligina tiklar
    And search boxa aramak istedigi kullanici ismini girer
    And cikan sonuclardan detailse tiklar
    And details sayfasindaki view withdraw all butonuna basar
    And Rejected withdrawals sayfasina gider
    And aratilan kullanicinin bilgilerini goruntuler
    And details butonuna tiklar ve detay sayfasini acar
    And kullanicinin islem detaylarini goruntuler
    Then kullanici sayfayi kapatir