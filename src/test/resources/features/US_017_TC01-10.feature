Feature: US0017 Kullanici Loantechexperdaki user withdraw islemlerini yapar

  Scenario: TC01 Kullanici loantechexper user dashboarddaki withdraw butonunu goruntuler
    Given Kullanici loantechUrl anasayfasina gider
    And Kullanici login butonuna tiklar
    And username ve password bilgilerini girer
    And dashboarddaki withdraw butonunu gorur
    And kullanici sayfayi kapatir

  Scenario: TC02 Kullanici loantechexper user dashboarddaki withdraw butonuna tiklar
    Given Kullanici loantechUrl anasayfasina gider
    And Kullanici login butonuna tiklar
    And username ve password bilgilerini girer
    And dashboarddaki withdraw butonuna tiklar
    And kullanici sayfayi kapatir

  Scenario: TC03 Kullanici loantechexper withdraw sayfasinda method secer
    Given Kullanici loantechUrl anasayfasina gider
    And Kullanici login butonuna tiklar
    And username ve password bilgilerini girer
    And dashboarddaki withdraw butonuna tiklar
    And method kismindan select gateway'e tiklar ve "Method 5 Updated" i secer
    And kullanici sayfayi kapatir


  Scenario: TC04 Kullanici loantechexper withdraw sayfasinda miktar girer
    Given Kullanici loantechUrl anasayfasina gider
    And Kullanici login butonuna tiklar
    And username ve password bilgilerini girer
    And dashboarddaki withdraw butonuna tiklar
    And method kismindan select gateway'e tiklar ve "Method 5 Updated" i secer
    And amount box'a "300.00 USD - 8000.00 USD" arasinda bir deger girer
    And kullanici sayfayi kapatir

  Scenario: TC05 Kullanici loantechexperda withdraw islemi gonderir
    Given Kullanici loantechUrl anasayfasina gider
    And Kullanici login butonuna tiklar
    And username ve password bilgilerini girer
    And dashboarddaki withdraw butonuna tiklar
    And method kismindan select gateway'e tiklar ve "Method 5 Updated" i secer
    And amount box'a "300.00 USD - 8000.00 USD" arasinda bir deger girer
    Then submit butonuna basar
    And kullanici sayfayi kapatir

  Scenario: TC06 Kullanici loantechexperda withdraw islemini kaydeder
    Given Kullanici loantechUrl anasayfasina gider
    And Kullanici login butonuna tiklar
    And username ve password bilgilerini girer
    And dashboarddaki withdraw butonuna tiklar
    And method kismindan select gateway'e tiklar ve "Method 5 Updated" i secer
    And amount box'a "300.00 USD - 8000.00 USD" arasinda bir deger girer
    Then submit butonuna basar
    Then tekrar submit butonuna basar
    And kullanici sayfayi kapatir

  Scenario: TC07 Kullanici loantechexperda withdraw log sayfasina gider ve islemlerini goruntuler
    Given Kullanici loantechUrl anasayfasina gider
    And Kullanici login butonuna tiklar
    And username ve password bilgilerini girer
    And dashboarddaki withdraw butonuna tiklar
    And withdraw log a tiklar ve accordion table i gorur
    And kullanici sayfayi kapatir

  Scenario: TC08 Kullanici loantechexperda withdraw log sayfasina gider ve islemlerinin detaylarini goruntuler
    Given Kullanici loantechUrl anasayfasina gider
    And Kullanici login butonuna tiklar
    And username ve password bilgilerini girer
    And dashboarddaki withdraw butonuna tiklar
    And withdraw log a tiklar ve accordion table i gorur
    And accordion table a tiklar ve detaylari gorur
    And kullanici sayfayi kapatir

  Scenario: TC09 Kullanici loantechexperda withdraw log sayfasina gider ve withdraw money butonuna tiklar
    Given Kullanici loantechUrl anasayfasina gider
    And Kullanici login butonuna tiklar
    And username ve password bilgilerini girer
    And dashboarddaki withdraw butonuna tiklar
    And withdraw log a tiklar
    And withdraw money e tiklar
    And kullanici sayfayi kapatir

  Scenario: TC010 Kullanici loantechexperda withdraw money sayfasina gider ve withdraw log butonuna tiklar
    Given Kullanici loantechUrl anasayfasina gider
    And Kullanici login butonuna tiklar
    And username ve password bilgilerini girer
    And dashboarddaki withdraw butonuna tiklar
    And withdraw log a tiklar
    And withdraw money e tiklar
    And withdraw log a tiklar
    And kullanici sayfayi kapatir


