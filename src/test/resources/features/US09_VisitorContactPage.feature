Feature:  [US09] Bir ziyaretci olarak  sirket ile iletisime geçebilmek için sitede, içerisinde iletisim bilgilerinin oldugu Contact
  sayfasinin olmasini istiyorum

  Background: Ziyaretci anasayfaya ulasir
    * Ziyaretci anasayfaya gider

    Scenario: Anasayfa menu basligindan Contact basligi tiklandiginda 'Contact Us' sayfasina erisilebilmeli
    * Contact Us menusunun oldugunu dogrular
    * Contact Us linki tiklar, ilgili sayfaya erisildigini dogrular.
    * Sayfayi kapatir


  Scenario: Anasayfa Footer Bolumunde Important Link Basligi altinda 'Contact Us'linki gorunur ve
  aktif olmali ,tikladiginda 'Contact Us'sayfasina yonlendirmeli
    * Cookiesi kapatir
    * Contact Us link textinin gorunur oldugunu dogrular
    * Contact Us link textine tiklar, aktif oldugunu ve Contact Us sayfasina yonlendirdigini dogrular
    * Sayfayi kapatir

  Scenario: Contact Us sayfasinda sirket konumunu gosteren haritada adres bilgisi
  (105 Evergreen Ave, Brooklyn, NY 11206, Amerika Birlesik Devletleri) gorunur olmali
    * Contact Us linki tiklar
    * Cookiesi kapatir
    * Sirket konumunu gosteren haritada adres bilgisinin gorunur oldugunu dogrular
    * Sayfayi kapatir

  Scenario: Contact Us sayfasinda sirkete ait email,telefon ve adres iletisim bilgileri gorunur olmali
    * Cookiesi kapatir
    * Contact Us linki tiklar
    * Sirkete ait email, telefon ve adres iletisim bilgileri gorunur olmali
    * Sayfayi kapatir

  @Burhan
  Scenario: Contact Us sayfasinda sirkete mesaj gonderilebilecek Form gorunur olmali
  (Name Box,MailBox,Subject TextBox,Message Text Box,Send Message Buton) ve doldurulup sirkete mesaj gonderilebilmeli
    * Cookiesi kapatir
    * Contact Us linki tiklar
    * Sirkete mesaj gonderilecek form gorunur olmali ve mesaj gonderilebilmeli
    * Sayfayi kapatir
