@f16
Feature: Kayitli bir kullanici (User ) olarak Mevduatlarimi gorebilmek ve islem yapabilmek istiyorum

  Background: Kayitli kullanici bilgileriyle login olur
    * Kullanici anasayfaya gider "userNameMrt" ve "userPassword" ile login olur


  Scenario: [TC_01 > US_016] Dashboard sayfasinda Deposit butonu bulundugu dogrulanir
    * Dashboard sayfasinda Deposit butonu bulundugunu dogrular
    * Sayfayi kapatir


  Scenario: [TC_02 > US_016] Deposit butona tiklandiginda Deposit Methods sayfasina ulasildigi dogrulanir
    * Kullanici Deposit Methods sayfasina gider
    * Deposit Methods sayfasina ulastigini dogrular
    * Sayfayi kapatir


  Scenario: [TC_03 > US_016] Deposit Methods sayfasinda Deposit History butonunun bulundugu dogrulanir
    * Kullanici Deposit Methods sayfasina gider
    * Deposit History butonunun bulundugunu dogrular
    * Sayfayi kapatir


  Scenario: [TC_04 > US_016] Deposit History butonuna tiklandiginda Deposit History sayfasina yonlendirildigi dogrulanir
    * Kullanici Deposit Methods sayfasina gider
    * Deposit History butonuna tiklar
    * Deposit History sayfasina gectigini dogrular
    * Sayfayi kapatir


  Scenario:[TC_05 > US_016] Deposit History sayfasindaki islem akordiyon tablosunun goruntulendigi dogrulanir
    * Kullanici Deposit Methods sayfasina gider
    * Deposit History butonuna tiklar
    * Deposit History sayfasinda islem akordiyon tablosunu gordugunu dogrular
    * Sayfayi kapatir


  Scenario: [TC_06 > US_016] Deposit Methods sayfasindaki Select Gateway secilebildigi dogrulanir
    * Kullanici Deposit Methods sayfasina gider
    * Select Gateway dropdown menusunden "Manual" secer
    * "Manual" in secilebildidigini dogrular
    * Sayfayi kapatir


  Scenario: [TC_07 > US_016] Deposit Methods sayfasindaki Amount textbox'ina min(100) - max(5000) deger araliginda bir deger girilebildigi dogrulanir
    * Kullanici Deposit Methods sayfasina gider
    * Select Gateway dropdown menusunden "Manual" secer
    * Amount textbox'ina "enterAmount" girer
    * Submit butonuna tiklar
    * Uygun deger girildigini dogrular
    * Sayfayi kapatir


  Scenario: [TC_08 > US_016] Limit-Charge-Payable degerleri goruntulendigi dogrulanir
    * Kullanici Deposit Methods sayfasina gider
    * Select Gateway dropdown menusunden "Manual" secer
    * Amount textbox'ina "enterAmount" girer
    * Limit-Charge-Payable degerlerinin goruldugunu dogrular
    * Sayfayi kapatir


  Scenario: [TC_09 > US_016] Submit butonuna tiklandiginda 'You have requested 'enterAmount' USD , Please pay 'payableAmount' USD for successful payment' yazisinin goruntulendigi dogrulanir
    * Kullanici Deposit Methods sayfasina gider
    * Select Gateway dropdown menusunden "Manual" secer
    * Amount textbox'ina "enterAmount" girer
    * Submit butonuna tiklar
    * 'You have requested 'enterAmount' USD , Please pay 'payable' USD for successful payment' yazisinin goruldugunu dogrular
    * Sayfayi kapatir


  Scenario: [TC_10 > US_016] PAY NOW butonuna tiklandiginda Deposit History sayfasina gecildigi dogrulanir
    * Kullanici Deposit Methods sayfasina gider
    * Select Gateway dropdown menusunden "Manual" secer
    * Amount textbox'ina "enterAmount" girer
    * Submit butonuna tiklar
    * PAY NOW butonuna tiklar
    * Deposit History sayfasina gecildigi dogrular
    * Sayfayi kapatir


  Scenario: [TC_11 > US_016] "Deposit History" sayfasina gecildiginde 'You have deposit request has been taken' yazisinin ve islem tablosunda yapilan islemin goruntulendigi dogrulanir
    * Kullanici Deposit Methods sayfasina gider
    * Select Gateway dropdown menusunden "Manual" secer
    * Amount textbox'ina "enterAmount" girer
    * Submit butonuna tiklar
    * PAY NOW butonuna tiklar
    * islem tablosunda yapilan islemin goruntulendigi dogrular
    * You have deposit request has been taken, yazisini gordugunu dogrular
    * Sayfayi kapatir


  Scenario: [TC_12 > US_016] Deposit Now butonuna tiklandiginda Deposit Methods sayfasina gecildigi dogrulanir
    * Kullanici Deposit Methods sayfasina gider
    * Select Gateway dropdown menusunden "Manual" secer
    * Amount textbox'ina "enterAmount" girer
    * Submit butonuna tiklar
    * PAY NOW butonuna tiklar
    * Deposit Now butonuna tiklar
    * Deposit Methods sayfasina gecildigini dogrular
    * Sayfayi kapatir