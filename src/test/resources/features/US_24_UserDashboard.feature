  @US_024
  Feature: Bir kullanıcı (User )olarak Anasayfada yaptıgım ödemeleri,para çekme işlemlerini ve toplam kredilerimi görüp yönetebilmeliyim


    Scenario: Anasayfada (Successful Deposits,Successful Withdrawals,Total Loan) başlıkları görünür olmalı.
    Başlıkların altında(Toplam tutar,Submitted,Pending,Rejected) edilen tutarlar ve kredi adetleri görüntülenebilmelidir.

      * Kayıtlı kullanıcı olarak "url" adresine gidilir.
      * Anasayfada login buton tıklanır ve kayıtlı kullanıcı "userName" ve "userPassword" girilerek login olunur.
      * Dashboard sayfasinda(Successful Deposits,Successful Withdrawals,Total Loan) başlıkları görünür olmalı.Başlıkların altında(Toplam tutar,Submitted,Pending,Rejected) edilen tutarlar ve kredi adetleri görüntülenebilmelidir.
      * Browser kapatilir.
