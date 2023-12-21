Feature:  [US09] Bir ziyaretci olarak  şirket ile iletişime geçebilmek için sitede, içerisinde iletişim bilgilerinin olduğu Contact
  sayfasının olmasını istiyorum

  @Burhan
  Scenario: Anasayfa menü başlığından Contact başlığı tıklandığında 'Contact Us' sayfasına erişilebilmeli
    * Ziyaretci anasayfaya gider
    * Contact Us menusunun oldugunu dogrular
    * Contact Us linki tiklar, ilgili sayfaya erisildigini dogrular.
    * Sayfayi kapatir
  Scenario: Anasayfa Footer Bölümünde Important Link Başlığı altında 'Contact Us'Linki görünür ve aktif olmalı ,tıklandığında 'Contact Us'sayfasına yönlendirmeli
    *
  Scenario: Contact Us sayfasında şirket konumunu gösteren haritada adres bilgisi(105 Evergreen Ave, Brooklyn, NY 11206, Amerika Birleşik Devletleri) görünür olmalı.
  Scenario: Contact Us sayfasında Şirkete ait email,telefon ve adres iletişim bilgileri görünür olmalı.
  Scenario: Contact Us sayfasında Şirkete mesaj gönderilebilecek Form görünür olmalı.(Name Box,MailBox,Subject TextBox,Message Text Box,Send Message Buton) görünür olmalı ve doldurulup şirkete mesaj gönderilebilmeli
