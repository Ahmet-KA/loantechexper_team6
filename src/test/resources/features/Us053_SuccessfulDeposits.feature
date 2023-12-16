Feature: Bir yonetici (admin) olarak basariyla gerceklesen deposit islemlerini goruntuleyebilmek icin Succesfully Deposit sayfasinin olmasini istiyorum.

  Scenario: Deposits menu basligi altindaki "Successful Deposits" sayfa linkine tiklandiginda "admin/deposit/successful" sayfasina erisilmelidir.
    * "urladmin"e gidilir
    * Sol yan barda bulunan Deposits butonuna basilir
    * Sol yan barda bulunan Successful Deposits butonuna basilir
    * admin deposit successful sayfanin erisilebildigi  dogrulanir
    * browser kapatilir

  Scenario: Sayfada Successful Deposits listesi görüntülenmeli,listede başlıkları 'Gateway,Initiated,'User','Amount','Conversion','Status','Action' başlıkları ve altındaki bilgiler görünür olmalıdır.
    * "urladmin"e gidilir
