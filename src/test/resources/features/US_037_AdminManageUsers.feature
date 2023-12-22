@us037_1
Feature: Bir Yönetici (Admin) olarak sitede aktif kullanıcıları görüp,Balance işlemlerini yönetebileceğim bir sayfa olmasını istiyorum.


  Scenario: Admin Dashboard sayfasında bulunan Nawbar'da 'Manage Users' linki altında 'Active Users' Linki görünür ve aktif olmalıdır.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a tıklanır ve altında Active users linki görüntülentiği dogrulanir.
    * Browser kapatilir.


  Scenario: Active Users' linkine tıklandığında 'Active Users Listesi' ve liste başlıkları görüntülenebilmelidir.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Açılan Active users sayfasında liste başlıklarının görüntülendiği doğrulanır
    * Browser kapatilir.

  Scenario: Listeden seçilen herhangi bir kullanıcıya ait bilgilere ulaşmak için 'Details' butonu görünür ve aktif olmalıdır.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Active users listesi üzerinde details button görünür oldugu dogrulanır.
    * Browser kapatilir.

  Scenario: Active users listesi üzerindeki Details butona tıklandıgında 'User Detail - Username' sayfasına yönlendirmelidir.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Liste üzerinde details butona tıklandıgında user details sayfasına yönlendirildiği dogrulanır.
    * Browser kapatilir.

  Scenario: User Detail sayfasında 'Balance' başlığı altında 'view all' ikonunu görünür ve aktif olmalıdır.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Active users listesi üzerinde details butona tıklanır.
    * User Detail sayfasında Balance başlığı altında view all ikonunu görünür ve aktif oldugu dogrulanır.
    * Browser kapatilir.

  Scenario: Balance' başlığı altında 'view all' İkona tıklandığında 'Transaction Logs' sayfasına yönlendirmelidir.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Active users listesi üzerinde details butona tıklanır.
    * User Detail sayfasında Balance başlığı altında view all ikonuna tıklanır ve transaction log sayfasına yönlendirildiği doğrulanır.
    * Browser kapatilir.

  Scenario: Açılan Transaction Logs sayfasında liste ve liste başlıkları görünür olmalıdır.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Active users listesi üzerinde details butona tıklanır.
    * User Detail sayfasında Balance başlığı altında view all ikonuna tıklanır.
    * Açılan İşlem Günlükleri sayfasında liste ve liste başlıklarının görünür oldugu dogrulanır
    * Browser kapatilir.

  Scenario: Transaction Logs Sayfadaki Liste içinde arama yapmak için filtre simgelerinin görünür ve etkin olması gerekir.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Active users sayfasında username-email search kısmına "userName" girilir ve entera basılır.
    * Active users listesi üzerinde details butona tıklanır.
    * User Detail sayfasında Balance başlığı altında view all ikonuna tıklanır.
    * Sayfadaki Liste içinde arama yapmak için filtre simgelerinin görünür ve etkin oldukları dogrulanır.
    * Browser kapatilir.


  Scenario: User Details Sayfasında Bakiye Ekle Butonu görünür ve aktif olmalıdır.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Active users sayfasında username-email search kısmına "userName" girilir ve entera basılır.
    * Active users listesi üzerinde details butona tıklanır.
    * Kullanıcı Detay Sayfasında 'Bakiye Ekle' Butonu görünür ve aktif oldugu dogrulanır.
    * Browser kapatilir.


  Scenario: User Details Sayfasında Add balance Butonuna tıklandıgında bakiye ekle sayfasına yönlendirmelidir.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Active users sayfasında username-email search kısmına "userName" girilir ve entera basılır.
    * Active users listesi üzerinde details butona tıklanır.
    * User Detail sayfasında Add balance butonuna tıklanır
    * Add balance sayfasına yönlendirdiği dogrulanır.
    * Browser kapatilir.


  Scenario: Add Balance sayfasındaki Amount ve Remark text boxlar görüntülenebilmeli ve karakter girilebilmelidir.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Active users sayfasında username-email search kısmına "userName" girilir ve entera basılır.
    * Active users listesi üzerinde details butona tıklanır.
    * User Detail sayfasında Add balance butonuna tıklanır
    * Add Balance sayfasındaki Tutar ve Açıklama metin kutularının aktif olarak kullanıldıgı dogrulanır.
    * Browser kapatilir.


  Scenario: Add balance sayfasinda submit butonu görünür ve aktif olmalıdır. Tıklandığında '$x başarıyla eklendi' metni görüntülenmelidir.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Active users sayfasında username-email search kısmına "userName" girilir ve entera basılır.
    * Active users listesi üzerinde details butona tıklanır.
    * User Detail sayfasında Add balance butonuna tıklanır
    * Sayfadaki Gönder Butonu görünür ve aktif olmalıdır. Tıklandığında $x başarıyla eklendi metninin görüntülendiği doğrulanır.
    * Browser kapatilir.

  Scenario: User Details Sayfasında 'Subtract Balance' Butonu görünür ve aktif olmalıdır.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Active users sayfasında username-email search kısmına "userName" girilir ve entera basılır.
    * Active users listesi üzerinde details butona tıklanır.
    * Kullanıcı Detay Sayfasında Subtract Balance Butonu görünür ve aktif oldugu dogrulanır.
    * Browser kapatilir.


  Scenario: User Derails tıklandığında Subtract Balance sayfasına yönlendirmelidir.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Active users sayfasında username-email search kısmına "userName" girilir ve entera basılır.
    * Active users listesi üzerinde details butona tıklanır.
    * User Detail sayfasında Subtract Balance butonuna tıklanır
    * Subtract Balance sayfasına yönlendirdiği dogrulanır.
    * Browser kapatilir.


  Scenario: Subtract Balance sayfasındaki Amount ve Remark text boxlar görüntülenebilmeli ve karakter girilebilmelidir.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Active users sayfasında username-email search kısmına "userName" girilir ve entera basılır.
    * Active users listesi üzerinde details butona tıklanır.
    * User Detail sayfasında Subtract Balance butonuna tıklanır
    * Subtract Balance sayfasındaki Tutar ve Açıklama metin kutularının aktif olarak kullanıldıgı dogrulanır.
    * Browser kapatilir.


  Scenario: Subtract Balance Sayfadaki 'Submit Buton' görünür ve aktif olmalıdır.Tıklandığında '$x subtracted successfully' yazısı görüntülenebilmelidir.

    * Admin kullanıcı olarak "urlAdmin" adresine gidilir.
    * Açılan admin login sayfasında admin "userName" ve "adminPassword" girilir ve login button tıklanır.
    * Açılan dashboard sayfasında soldaki menüden manage users'a ardından Active user'sa tıklanır
    * Active users sayfasında username-email search kısmına "userName" girilir ve entera basılır.
    * Active users listesi üzerinde details butona tıklanır.
    * User Detail sayfasında Subtract Balance butonuna tıklanır
    * Sayfadaki Gönder Butonu görünür ve aktif olmalıdır. Tıklandığında $x subtracted successfully metninin görüntülendiği doğrulanır.
    * Browser kapatilir.






































































