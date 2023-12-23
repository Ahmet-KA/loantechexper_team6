Feature: Ziyaretçi  olarak kayıt olabilmek için bir sayfa bulunmasını istiyorum

  Scenario: TC_01 Anasayfada Get Started Buton Link Görünür ve aktif olmali
    * Browser acilir
    * "url"e gidilir
    * Anasayfada getStrated butonu test edilir
    * browser kapatilir

  Scenario: TC_02 GetStarted butonuna basildiginda register sayfasina yonlendirmeli
    * Browser acilir
    * "url"e gidilir
    * Anasayfada getstrated butona tiklar ve register sayfasina yonlendirdigi test edilir
    * browser kapatilir

  Scenario: TC_03 Kayıt formu kayıt sayfasında görünür olmalıdır
    * Browser acilir
    * "url"e gidilir
    * Anasayfada getstrated butona tiklar ve register sayfasindaki kayit formu gorunurlugu test edilir
    * browser kapatilir

  Scenario: TC_04 Kullanici Adi, E-posta Adresi, Ülke Açılır Listesi, Cep Telefonu Numarasi, sifre, sifreyi Onayla metin kutulari formda gorunur olmalidir.
    * Browser acilir
    * "url"e gidilir
    * Anasayfada getstrated butona tiklar ve register sayfasindaki kayit formu gorunurlugu test edilir
    * Kayit formu bilgileri gorunur oldugu test edilir
    * browser kapatilir

  Scenario: TC_05 kullanici bilgileri forma girilir
    * Browser acilir
    * "url"e gidilir
    * Anasayfada getstrated butona tiklar ve register sayfasindaki kayit formu doldurulur
    * browser kapatilir

  Scenario: TC_06 Register butonuna tıklanarak kullanıcı kayıt formu gönderilip kaydı tamamlamak için User Data sayfasına yönlendirmeli
    * Browser acilir
    * "url"e gidilir
    * Anasayfada getstrated butona tiklar ve register sayfasindaki kayit formu doldurulur
    * User Data sayfasinin acildigi test edilir
    * User Data formun gorunur ve aktif oldugu test edilir
    * form ici bilgiler girilir
    * Kayit basarili mesaji goruntulenir
    * browser kapatilir

