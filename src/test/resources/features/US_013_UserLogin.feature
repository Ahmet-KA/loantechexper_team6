Feature: US_013 Kayıtlı bir kullanıcı(User) olarak kendime ait panele login olabilmek için anasayfadan login sayfasına eişimin olmasını istiyorum.

  @HomePageLoginButtonVisibility
  Scenario: Giriş düğmesi ana sayfada görünür ve aktif olmalıdır.

    * Kayitli kullanici olarak "qa.loantechexper.com" adresine gidilir.
    * Anasayfada login button gorunurlugu ve aktifligi dogrulanır.
    * Browser kapatilir.

  @LoginButtonClick
  Scenario: Ana sayfadaki Login buttona tikladiginizda, sizi login sayfasına yonlendirmelidir.

    * Kayitli kullanici olarak "qa.loantechexper.com" adresine gidilir.
    * Login button tiklanir ve login sayfasina yonlendirildigi dogrulanır.
    * Browser kapatilir.


  Scenario: Login form login sayfasinda gorunur olmalidir.

    * Kayitli kullanici olarak "qa.loantechexper.com" adresine gidilir.
    * Login button tiklanir ve login formun gorunurlugu dogrulanir.
    * Browser kapatilir.

  @smoke
  Scenario: Login Form içerisinde Username textbox/Password textbox /Remember Me checkbox/Forgot password? link elementi/Login Buton görünür ve aktif olmalı

    * Kayitli kullanici olarak "qa.loantechexper.com" adresine gidilir.
    * Login button tiklanir ve Login form üzerinde username,password textbox,remember me checkbox,forgotpassword linki ve login button gorunur ve aktif olmalidir.
    * Browser kapatilir.

  @smoke1
  Scenario: Kullanıcı adı ve şifre metin kutusu alanları erişilebilir olmalıdır.

    * Kayitli kullanici olarak "qa.loantechexper.com" adresine gidilir.
    * Login buton tıklanır ve Giriş Formunda kullanıcı adı ve şifre textbox ların erişilebilir oldugu doğrulanır
    * Browser kapatilir.

  @smoke2
  Scenario: Remember Me checkbox seçilebilir olmalıdır.Seçilirse, önceden kaydedilmiş kullanıcı adı ve şifre görünmelidir.

    * Kayitli kullanici olarak "qa.loantechexper.com" adresine gidilir.
    * Login button tıklanır ve Login form üzerinde bulunan username ve password alanlarına kayıtlı "kullanıcı adı" ve "şifre" girilir.
    * Remember me checkboxın seçilebilir oldugu doğrulanır ve click yapılır.
    * Login buton tıklanarak giriş yapılır.
    * Açılan sayfada logout tıklanır ve sistemden çıkış yapılır.
    * Açılan login sayfasında kullanıcı adı ve şifre alanlarının dolu olarak geldiği ve remember me checkboxın seçili oldugu doğrulanır.
    * Browser kapatilir.

  @smoke3
  Scenario: Doğru kullanıcı adı ve şifre ile sisteme giriş yapabilirsiniz ve gösterge tablosu sayfası görüntülenmelidir.

    * Kayitli kullanici olarak "qa.loantechexper.com" adresine gidilir.
    * Anasayfada login button tıklanır
    * Açılan login sayfasında kayıtlı "kullanıcı adı" ve "şifre" girilir.
    * Login sayfasındaki login buton tıklanır.
    * User dashboard sayfasına yönlendirildiği doğrulanır.
    * Browser kapatilir.

  @smoke4
  Scenario: Hatalı veya eksik giriş yapıldığında 'Bu kimlik bilgileri kayıtlarımızla eşleşmiyor' uyarısı alınmalıdır.

    * Kayitli kullanici olarak "qa.loantechexper.com" adresine gidilir.
    * Anasayfada login button tıklanır
    * Açılan login sayfasında kayıtlı olmayan "kullanıcı adı" ve "şifre" girilir.
    * Login sayfasındaki login buton tıklanır.
    * These credentials do not match our records. uyarısının alındıgı doğrulanır
    * Browser kapatilir.

  @smoke5
  Scenario: Forgot password? Bağlantı öğesine tıklandığında, E-postayı Doğrula sayfasına yönlendirilmelidir.

    * Kayitli kullanici olarak "qa.loantechexper.com" adresine gidilir.
    * Anasayfada login button tıklanır
    * Login form üzerinde bulunan Forgot  password linke tıklanır
    * Email doğrulama sayfasına yönlendirildiği doğrulanır
    * Browser kapatilir.

  @smoke6
  Scenario: Email doğrulama sayfasında sifre sıfırlama işlemi için ilgili textboxın görünür ve aktif oldugu kontrol edilir.

    * Kayitli kullanici olarak "qa.loantechexper.com" adresine gidilir.
    * Anasayfada login button tıklanır
    * Login form üzerinde bulunan Forgot  password linke tıklanır
    * Email doğrulama sayfasında email textboxın görünür oldugu doğrulanır.
    * Browser kapatilir.

  @smoke7
  Scenario: Email doğrulama sayfasında sifre sıfırlama işlemi için ilgili textboxın görünür ve aktif oldugu kontrol edilir.

    * Kayitli kullanici olarak "qa.loantechexper.com" adresine gidilir.
    * Anasayfada login button tıklanır
    * Login form üzerinde bulunan Forgot  password linke tıklanır
    * Yönlendirilen email doğrulama sayfasında İlgili alana Email girişi yapıılır ve submit butona tıklanır
    * Parola sıfırlama e-postası başarıyla gönderildi uyarısının alındıgı doğrulanır
    * Browser kapatilir.







































