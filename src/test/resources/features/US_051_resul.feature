
Feature:Bir yonetici (admin) olarak bekleyen deposit
  isteklerini yonetebilmek icin Pending Deposit sayfasinin olmasini istiyorum.



  Scenario: Deposits menu basligi altindaki "Pending Deposits" sayfa linkine
  tiklanmali "admin/deposit/pending" sayfasina erisilmelidir.

    * adminUrl sayfasina  gidilir
    * sol tarafta bulunan Deposit linkine tiklar
    * acilan menu basliklarinda Pending Deposit linkine tiklanir
    * ilgili sayfaya  erisildigi dogrulanir


  Scenario: Sayfada Pending Deposits listesi görüntülenmeli,listede başlıkları
  kullanıcı adı,miktar,başlatılma tarihi gibi temel bilgiler içermelidir.

    * adminUrl sayfasina  gidilir
    * sol tarafta bulunan Deposit linkine tiklar
    * acilan menu basliklarinda Pending Deposit linkine tiklanir
    * Pending Deposits listesi goruntulenir
    * listede başlıkları kullanıcı adı,miktar,başlatılma tarihi gibi bilgiler icerdigi dogrulanir.

    Scenario: Kullanıcının Deposit isteğinin detaylarına ulaşabilmek onaylamak
    ya da reddetmek için sayfada 'Details' butonu görünür ve aktif olmalıdır.

      * adminUrl sayfasina  gidilir
      * sol tarafta bulunan Deposit linkine tiklar
      * acilan menu basliklarinda Pending Deposit linkine tiklanir
      * Listedeki Details butonun gorunur ve aktif oldugu test edilir


      Scenario: Deposit detaylarına girildiğinde Approve/Reject butonları görünür
      ve aktif olmalı onaylandığında ya da reddedildiğinde uyarı mesajı görülmeli ve Pending Deposits
      listesinden  kaldırıldığı görüntülenmeli

        * adminUrl sayfasina  gidilir
        * sol tarafta bulunan Deposit linkine tiklar
        * acilan menu basliklarinda Pending Deposit linkine tiklanir
        * ilgili details butonuna tıklar ve Approve,Reject butonunu goruntuler
        * Approve tiklandiginda uyari mesajini gorur ve listeden kaldirildigini goruntuler







