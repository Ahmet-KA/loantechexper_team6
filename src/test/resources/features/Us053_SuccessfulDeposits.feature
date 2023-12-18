Feature: Bir yonetici (admin) olarak basariyla gerceklesen deposit islemlerini goruntuleyebilmek icin Succesfully Deposit sayfasinin olmasini istiyorum.

  Scenario: TC_01 Deposits menu basligi altindaki "Successful Deposits" sayfa linkine tiklandiginda "admin/deposit/successful" sayfasina erisilmelidir.
    * "urladmin"e gidilir
    * Sol yan barda bulunan Deposits butonuna basilir
    * Sol yan barda bulunan Successful Deposits butonuna basilir
    * admin deposit successful sayfanin erisilebildigi  dogrulanir
    * browser kapatilir

  Scenario: TC_02 Sayfada Successful Deposits listesi görüntülenmeli,listede başlıkları 'Gateway,Initiated,'User','Amount','Conversion','Status','Action' başlıkları ve altındaki bilgiler görünür olmalıdır.
    * "urladmin"e gidilir
    * Sol yan barda bulunan Deposits butonuna basilir
    * Sol yan barda bulunan Successful Deposits butonuna basilir
    * Successful Deposits listesinin ve iceriginin goruntulendigi test edilir
    * browser kapatilir

  Scenario: TC_03 Approved olan deposit'in detayına ulaşmak için 'Details' buton görünür ve aktif olmalıdır.
    * "urladmin"e gidilir
    * Sol yan barda bulunan Deposits butonuna basilir
    * Sol yan barda bulunan Successful Deposits butonuna basilir
    * Listedeki Details butonun gorunur ve aktif oldugu test edilir
    * browser kapatilir

  Scenario: TC_04 Listeden seçilen para çekme işleminin detay sayfasında 'Date,Trx Number,Username,Method,Amount,Charge,After Charge,Rate,Payable,Status' bilgileri görüntülenmelidir.
    * "urladmin"e gidilir
    * Sol yan barda bulunan Deposits butonuna basilir
    * Sol yan barda bulunan Successful Deposits butonuna basilir
    * Details butonuna basilir ve bilgilerin gorunur oldugu test edilir
    * browser kapatilir

