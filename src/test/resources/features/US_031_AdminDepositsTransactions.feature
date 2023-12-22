Feature:[US031] Bir admin olarak kullanici deposite islemlerini kontrol etmek ve yurutmek icin
  admin panelde Deposit islemleri menusunun olmasini istiyorum

  Background: Admin testleri icin giris islemleri
    * Admin anasayfaya gidilir
    * Admin "adminNameB" ve "password" ile giris yapilir


    Scenario:Admin panel side bar uzerinde Deposits menu basligi goruntulenmeli
      * Deposits menu basligini goruntuler
      * Sayfayi kapatir


    Scenario: Deposits menu basligi altinda Pending Deposits, Approved Deposits,Successfull Deposits, Rejected Deposits,
    Initiated Deposits, All Deposits sayfa basliklari goruntulenmeli
      * Deposits menu basligini tiklar
      * Deposits menu basligi altindaki sayfa basliklari goruntuler
      * Sayfayi kapatir

   @Burhan
   Scenario: Deposits menu basligi altindaki sayfa basliklari ilgili sayfalara yonlendirmeli
      * Deposits menu basligini tiklar
      * Deposits menu basligi altindaki sayfalara yonlendirir
      * Sayfayi kapatir
