@f25
Feature:Bir yonetici (admin) olarak kullanici kredi islemlerini yonetebilecegim sayfalara erismek icin
  admin panel uzerinde Loans menusunun olmasini istiyorum.

  Background: Admin testleri icin giris islemleri
    * Admin anasayfaya gidilir
    * Admin "userNameMrt" ve "password" ile giris yapilir

  Scenario: [TC_01 > US_025] Admin panel side bar uzerinde “Loans” menu basligi goruntulendigi dogrulanir
    * Sol panelde Loans menu basligini goruntuler ve sayfayi kapatir


  Scenario: [TC_02 > US_025] Loans menu basligi altinda “Pending Loans, Running Loans, Due Loans, Paid Loans, Rejected Loans, All Loans” sayfa basliklarinin goruntulendigi dogrulanir
    * Loans menu altinda “Pending Loans, Running Loans, Due Loans, Paid Loans, Rejected Loans, All Loans"  sayfa basliklarini goruntuler ve sayfayi kapatir

  Scenario: [TC_03 > US_025] Loans menu basligi altindaki “Pending Loans” menusune tiklandiginda ilgili sayfaya yonlendirme yaptigi dogrulanir
    * “Pending Loans” menusune tiklandiginda ilgili sayfaya yonlendirme yapidigi gorulur ve sayfa kapatilir

  Scenario: [TC_04 > US_025] Loans menu basligi altindaki “Running Loans” menusune tiklandiginda ilgili sayfaya yonlendirme yaptigi dogrulanir
    * “Running Loans” menusune tiklandiginda ilgili sayfaya yonlendirme yapidigi gorulur ve sayfa kapatilir

  Scenario: [TC_05 > US_025] Loans menu basligi altindaki “Due Loans” menusune tiklandiginda da  ilgili sayfaya yonlendirme yaptigi dogrulanir
    * “Due Loans” menusune tiklandiginda da  ilgili sayfaya yonlendirme yapidigi gorulur ve sayfa kapatilir

  Scenario: [TC_06 > US_025] Loans menu basligi altindaki “Paid Loans” menusune tiklandiginda ilgili sayfaya yonlendirme yaptigi dogrulanir
    * “Paid Loans” menusune tiklandiginda ilgili sayfaya yonlendirme yapidigi gorulur ve sayfa kapatilir

  Scenario: [TC_07 > US_025] Loans menu basligi altindaki “Rejected Loans” menusune tiklandiginda  ilgili sayfaya yonlendirme yaptigi dogrulanir
    * “Rejected Loans” menusune tiklandiginda  ilgili sayfaya yonlendirme yapidigi gorulur ve sayfa kapatilir

  Scenario: [TC_08 > US_025] Loans menu basligi altindaki “All Loans” menusune tiklandiginda ilgili sayfaya yonlendirme yaptigi dogrulanir
    * “All Loans” menusune tiklandiginda ilgili sayfaya yonlendirme yapidigi gorulur ve sayfa kapatilir