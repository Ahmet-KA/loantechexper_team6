  @US_021
  Feature: Bir Kullanıcı (User) olarak Anasayfaya erişebilmeliyim.

    Scenario:  Kayıtlı kullanıcı verilen Url ile browserdan web sitesine erisilebilir olmali

      * Kayıtlı kullanıcı olarak "url" adresine gidilir.
      * İlgili url'e erişim sağlandıgı doğrulanır.
      * Browser kapatilir.

    Scenario: Ana sayfa üst barinda email,telefon,adres bilgileri bulunmalıdır.

      * Kayıtlı kullanıcı olarak "url" adresine gidilir.
      * Ana sayfa üst barinda email,telefon,adres bilgileri bulundugu dogrulanır.
      * Browser kapatilir.

    Scenario: Ana sayfa üst barindaki başlıklara (Home, About, Plans,Blogs,Contact,Login Icon,Get Started Icon ) tıklandığında ilgili sayfaya geçiş yapılabilmeli

      * Kayıtlı kullanıcı olarak "url" adresine gidilir.
      * Ana sayfa üst barinda site logosu ve menü basliklari (Home, About, Plans,Blogs,Contact,Login Icon,Get Started Icon ) görünür ve aktif oldugu dogrulanır.
      * Browser kapatilir.


    Scenario: Anasayfa üst barındaki logoya tıklandığında anasayfaya geçiş yapılabilmeli
    Ana sayfa üst barindaki başlıklara (Home, About, Plans,Blogs,Contact,Login Icon,Get Started Icon ) tıklandığında ilgili sayfaya geçiş yapılabilmeli

      * Kayıtlı kullanıcı olarak "url" adresine gidilir.
      * Ana sayfa üst barindaki başlıklara (Home, About, Plans,Blogs,Contact,Login Icon,Get Started Icon ) tıklandığında ilgili sayfaya geçiş yapılabildiği dogrulanır.
      * Browser kapatilir.





