Feature: Bir ziyaretci olarak Ana Sayfa üst barinda site ici erisimleri kolaylastiracak menü basliklarininin olmasini istiyorum.


  Scenario: TC_01 Ana sayfa üst barinda email,telefon,adres bilgileri bulunmalı
    * Browser acilir
    * "url"e gidilir
    * ust barda email,telefon,adres gorunur
    * browser kapatilir


  Scenario: TC_02 Ana sayfa üst barinda site logosu ve menü basliklari (Home, About, Plans,Blogs,Contact,Login Icon,Get Started Icon ) görünür ve aktif olmalı
    * Browser acilir
    * "url"e gidilir
    * Anasayfa ust barinda site logosu ve menu basliklari gorunur ve aktif oldugunu test eder
    * browser kapatilir


  Scenario: TC_03 Anasayfa üst barındaki logoya tıklandığında anasayfaya geçiş yapılabilmeli
    * Browser acilir
    * "url"e gidilir
    * Anasayfa ust barinda logoya tiklar Acilan sayfanin ansayfa oldugunu test eder
    * browser kapatilir

  Scenario: TC_04 Ana sayfa üst barindaki başlıklara (Home, About, Plans,Blogs,Contact,Login Icon,Get Started Icon ) tıklandığında ilgili sayfaya geçiş yapılabilmeli
    * Browser acilir
    * "url"e gidilir
    * Anasayfa ust barindaki basliklara tiklandiginda ilgili sayfaya gecisi test edilir
    * browser kapatilir



