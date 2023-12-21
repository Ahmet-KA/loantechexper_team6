

Feature: Admin, sitede aktif kullanıcıları gorup Deposit islemlerini yonetebilmeli
  Background:
    Given kullanici browserı acar
    And  ilgili "adminUrl" e gider
    And gecerli "username" ve "password" ile sisteme giris yapar
    And sol tarafta bulunan Manage Users menusune tiklar


  Scenario: TC01-Admin panelde active users linkinin gorunurlugu ve aktifliği testi

    And Manage Users altinda Active Users basliginin gorunebilir ve aktif oldugunu  dogrular
    And sayfayı kapatır


  Scenario: TC02-Active users liste basliklari gorunurlugu testi

    And acilan menude Active Users basligina tiklar
    And sayfada Active Users listesinin oldugunu ve  liste baslıklarının goruntulendigini dogrular
    And sayfayı kapatır


  Scenario: TC03-Active users listesindeki  Details butonu testi

    And acilan menude Active Users basligina tiklar
    And Active Users sayfasındaki search kutusuna "isim" girer ve ara butonuna tıklar
    And acilan listedeki ilk satirin sonunda yer alan Details butonunun gorunur ve aktif oldugunu dogrular
    And satir sonundaki Details butonuna tiklar
    And acilan sayfa basliginin User Detail-Username oldugunu dogrular
    And sayfayı kapatır


  Scenario: TC04-User Detail sayfasındaki View All Deposit ikonu testi

    And acilan menude Active Users basligina tiklar
    And Active Users sayfasındaki search kutusuna "isim" girer ve ara butonuna tıklar
    And satir sonundaki Details butonuna tiklar
    And acilan sayfada User Detail basliginin altında Deposited bolumundeki View All iconunun gorunur ve aktif oldugunu dogrular
    And Deposited bolumundeki View All iconuna tıklar
    And acilan sayfa basliginin Deposit History oldugunu dogrular
    And sayfayı kapatır


  Scenario: TC05-Deposit History sayfasında liste basliklarini goruntuleme testi

    And acilan menude Active Users basligina tiklar
    And Active Users sayfasındaki search kutusuna "isim" girer ve ara butonuna tıklar
    And satir sonundaki Details butonuna tiklar
    And Deposited bolumundeki View All iconuna tıklar
    And acilan sayfada kisiye ait Deposit History listesinin ve liste baslıklarının goruntulendigini dogrular
    And sayfayı kapatır

  @activeUser
  Scenario: TC06-Deposit History sayfasındaki Details butonu testi

    And acilan menude Active Users basligina tiklar
    And Active Users sayfasındaki search kutusuna "isim" girer ve ara butonuna tıklar
    And satir sonundaki Details butonuna tiklar
    And Deposited bolumundeki View All iconuna tıklar
    And acilan sayfada kisi satirinda Details butonunun gorunur ve aktif oldugunu dogrular
    And kisiye ait satırda Details butonuna tiklar
    And acilan sayfada requested bilgi yazısının goruntulendigini dogrular
    And sayfayı kapatır


 Scenario: TC07- Kullanici Deposit Details sayfasında deposit card bilgileri kontrolu testi

    And acilan menude Active Users basligina tiklar
    And Active Users sayfasındaki search kutusuna "isim" girer ve ara butonuna tıklar
    And satir sonundaki Details butonuna tiklar
    And Deposited bolumundeki View All iconuna tıklar
    And kisiye ait satırda Details butonuna tiklar
    And acilan sayfada Deposit Cardın goruntulendigini dogrular
    And ayrica Deposit Card icerisinde baslik ve degerlerinin goruntulendigini dogrular
    And sayfayı kapatır


  Scenario: TC08- Kullanıcıya ait Deposit History sayfasındaki baslık ve degerlerin goruntulenmesi testi

    And acilan menude Active Users basligina tiklar
    And satir sonundaki Details butonuna tiklar
    And Deposited bolumundeki View All iconuna tıklar
    And acilan sayfada Successful Deposit baslik ve degerinin goruntulendigini dogrular
    And acilan sayfada Pending Deposit baslik ve degerinin goruntulendigini dogrular
    And acilan sayfada Rejected Deposit baslik ve degerinin goruntulendigini dogrular
    And acilan sayfada Initiated Deposit baslik ve degerinin goruntulendigini dogrular
    And sayfayı kapatır


  Scenario: TC09- User  Deposit History sayfasında Successfull Deposit  linki  testi

    * acilan menude Active Users basligina tiklar
    * satir sonundaki Details butonuna tiklar
    * Deposited bolumundeki View All iconuna tıklar
    * acilan sayfada Successful Deposit basliginin aktif oldugunu dogrular
    * Successfull Deposit basligina tiklar
    * acilan sayfa basliginin Successfull Deposit oldugunu dogrular
    * Successfull deposit sayfasinda tarih filtreleme ve search butonlarinin aktif oldugunu dogrular
    * sayfayı kapatır


  Scenario: TC10- User  Deposit History sayfasında Pending Deposit linki testi

    * acilan menude Active Users basligina tiklar
    * Active Users sayfasındaki search kutusuna "isim" girer ve ara butonuna tıklar
    * satir sonundaki Details butonuna tiklar
    * Deposited bolumundeki View All iconuna tıklar
    * acilan sayfada Pending Deposit basliginin aktif oldugunu dogrular
    * Pending Deposit basligina tiklar
    * acilan sayfa basliginin Pending Deposit oldugunu dogrular
    * Pending deposit sayfasinda listedeki Details butonunun gorunur ve aktif oldugunu dogrular
    * sayfayı kapatır


  Scenario: TC11- Pending Deposits - İslem detayları sayfasında approve/reject butonları test

    * acilan menude Active Users basligina tiklar
    * search kutusuna "isim" yazıp ara butonuna tıklar
    * satir sonundaki Details butonuna tiklar
    * Deposited bolumundeki View All iconuna tıklar
    * Pending Deposit basligina tiklar
    * search kutusuna "isim" yazıp ara butonuna tıklar
    * kisiye ait satırda Details butonuna tiklar
    * acilan islem detay sayfasında approve ve reject butonlarının gorunur ve aktif oldugunu dogrular
    * sayfayı kapatır


  Scenario: TC12- Pending deposit reject islemi testi

    * acilan menude Active Users basligina tiklar
    * satir sonundaki Details butonuna tiklar
    * Deposited bolumundeki View All iconuna tıklar
    * Pending Deposit basligina tiklar
    * search kutusuna "isim" yazıp ara butonuna tıklar
    * kisiye ait satırda Details butonuna tiklar
    * acilan islem detay sayfasında reject butonuna tiklar
    * acilan sayfada Reject Deposit Confirmation basliginin gorundugunu dogrular
    * Reason for Rejection kutusuna "reject_bilgi" girer ve submit butonuna tiklar
    * Deposit request rejected successfully yazisinin gorundugunu dogrular
    * sayfayı kapatır


  Scenario: TC13- Pending deposit approve islemi testi

    * acilan menude Active Users basligina tiklar
    * satir sonundaki Details butonuna tiklar
    * Deposited bolumundeki View All iconuna tıklar
    * Pending Deposit basligina tiklar
    * search kutusuna "isim" yazıp ara butonuna tıklar
    * kisiye ait satırda Details butonuna tiklar
    * acilan islem detay sayfasında approve butonuna tiklar ve cıkan alertte yes butonuna tıklar
    * Deposit request approved successfully yazisinin gorundugunu dogrular
    * sayfayı kapatır



