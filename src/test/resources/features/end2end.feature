  @end2end
  Feature:end2end

    Scenario: [TC_09 > US_016] Submit butonuna tiklandiginda 'You have requested 'enterAmount' USD , Please pay 'payableAmount' USD for successful payment' yazisinin goruntulendigi dogrulanir

      * Kullanici anasayfaya gider "userNameMrt" ve "userPassword" ile login olur
      * Kullanici Deposit Methods sayfasina gider
      * Select Gateway dropdown menusunden "Manual" secer
      * Amount textbox'ina "enterAmount" girer
      * Submit butonu tiklar
      * 'You have requested 'enterAmount' USD , Please pay 'payable' USD for successful payment' yazisinin goruldugunu dogrular
      * Sayfayi kapatir

    Scenario: TC06 Kullanici loantechexperda withdraw islemini kaydeder

      Given Kullanici loantechUrl anasayfasina gider
      And Kullanici login butonuna tiklar
      And username ve password bilgilerini girer
      And dashboarddaki withdraw butonuna tiklar
      And method kismindan select gateway'e tiklar ve "Method 5 Updated" i secer
      And amount box'a "300.00 USD - 8000.00 USD" arasinda bir deger girer
      Then submit butonuna basar
      Then tekrar submit butonuna basar
      And withdraw money e tiklar
      And withdraw log a tiklar ve accordion table i gorur
      And accordion table a tiklar ve detaylari gorur
      And kullanici sayfayi kapatir