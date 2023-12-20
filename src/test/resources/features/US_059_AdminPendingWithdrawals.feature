@US_59
Feature: Bir yonetici (admin) olarak bekleyen withdrawals isteklerini yonetebilmek icin Pending Withdrawals sayfasinin olmasini istiyorum.

  Background:
    * Admin anasayfaya gidilir
    * Admin "userNameMrt" ve "password" ile giris yapilir


  Scenario: [TC_01 > US_059] Admin panelde side bar uzerinde “Withdrawals” menu basligi altinda Pending Withdrawals sayfasina erisildigi dogrulanir
    * Sol yan barda bulunan Withdrawals menusune tiklar
    * Withdrawals menusu altindaki Pending Withdrawals menusune tiklar
    * Pending Withdrawals sayfasina erisildigini dogrular
    * Sayfayi kapatir


  Scenario: [TC_02 > US_059] Pending Withdrawals sayfasinda  Pending Withdrawals listesinin goruntulendigi dogrulanir
    * Sol yan barda bulunan Withdrawals menusune tiklar
    * Withdrawals menusu altindaki Pending Withdrawals menusune tiklar
    * Pending Withdrawals listesinin goruntulendigini dogrular
    * Sayfayi kapatir


  Scenario: [TC_03 > US_059] Pending Withdrawals sayfasindaki listede ‘Gateway, initiated’, User’, ‘Amount', ‘Conversion', ‘Status', 'Action' basliklari ve altindaki bilgilerin gorunur oldugu dogrulanir
    * Sol yan barda bulunan Withdrawals menusune tiklar
    * Withdrawals menusu altindaki Pending Withdrawals menusune tiklar
    * Pending Withdrawals sayfasindaki liste basliklarinin gorunurlugunu dogrular
    * Pending Withdrawals sayfasindaki liste bilgilerinin gorunurlugunu dogrular
    * Sayfayi kapatir


  Scenario: [TC_04 > US_059] Pending Withdrawals sayfasinda Action basligi altindaki 'Details' sayfasina erisildigi dogrulanir
    * Sol yan barda bulunan Withdrawals menusune tiklar
    * Withdrawals menusu altindaki Pending Withdrawals menusune tiklar
    * Details butonunu tiklar
    * Details sayfasina erisildigini dogrular
    * Sayfayi kapatir


  Scenario: [TC_05 > US_059] Details sayfasinda beklemede olan odeme isleminin detaylarinin goruntulendigi dogrulanir
    * Sol yan barda bulunan Withdrawals menusune tiklar
    * Withdrawals menusu altindaki Pending Withdrawals menusune tiklar
    * Details butonunu tiklar
    * Details sayfasinda beklemede olan odeme isleminin detaylarinin goruntulendigi dogrular
    * Sayfayi kapatir


  Scenario: [TC_06 > US_059] Details sayfasinda beklemede olan odeme isleminin onaylanabildigi /reddedilebildigi dogrulanir
    * Sol yan barda bulunan Withdrawals menusune tiklar
    * Withdrawals menusu altindaki Pending Withdrawals menusune tiklar
    * Details butonunu tiklar
    * Onaylama ve reddetme butonlarinin gorunurlugunu ve aktifligini dogrular
    * Sayfayi kapatir


  Scenario: [TC_07 > US_059] Details sayfasinda beklemede olan odeme isleminin statusu update edilebildigi dogrulanir
    * Sol yan barda bulunan Withdrawals menusune tiklar
    * Withdrawals menusu altindaki Pending Withdrawals menusune tiklar
    * Details butonunu tiklar
    * Onaylama veya reddetme butonuna tiklar
    * Acilan box'a isleme dair aciklama girer ve submite tiklar
    * Odeme isleminin statusunun update edilebildigi dogrular
    * Sayfayi kapatir


  Scenario: [TC_08 > US_059] Pending Withdrawals tablosu uzerinde "Username/Transaction" bilgileri ile arama yapilabildigi dogrulanir
    * Sol yan barda bulunan Withdrawals menusune tiklar
    * Withdrawals menusu altindaki Pending Withdrawals menusune tiklar
    * SearcBox'a "aranacakIsim" yazar ve arama butonuna tiklar
    * Username ile arama yapilabildigini dogrular
    * Sayfayi kapatir


  Scenario: [TC_09 > US_059] Pending Withdrawals tablosu uzerinde “Start Date - End Date" bilgileri ile arama yapilabildigi dogrulanir
    * Sol yan barda bulunan Withdrawals menusune tiklar
    * Withdrawals menusu altindaki Pending Withdrawals menusune tiklar
    * DateSearcBox'a "startDate" ve "endDate" yazar ve arama butonuna tiklar
    * Date ile arama yapilabildigini dogrular
    * Sayfayi kapatir
