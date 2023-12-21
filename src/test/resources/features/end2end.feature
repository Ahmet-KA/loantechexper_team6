
  Feature:

    Scenario: [TC_09 > US_016] Submit butonuna tiklandiginda 'You have requested 'enterAmount' USD , Please pay 'payableAmount' USD for successful payment' yazisinin goruntulendigi dogrulanir

      * Kullanici anasayfaya gider "userNameMrt" ve "userPassword" ile login olur
      * Kullanici Deposit Methods sayfasina gider
      * Select Gateway dropdown menusunden "Manual" secer
      * Amount textbox'ina "enterAmount" girer
      * Submit butonuna tiklar
      * 'You have requested 'enterAmount' USD , Please pay 'payable' USD for successful payment' yazisinin goruldugunu dogrular
      * Sayfayi kapatir

    Scenario:

      *