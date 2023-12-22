
Feature:Kayıtlı bir kullanıcı (User) olarak işlemlerimi görüntüleyebileceğim bir sayfa olmasını istiyorum

  Background: Kayitli kullanici bilgileriyle login olur
    * Kullanici anasayfaya gider "userNameRcr" ve "userPassword" ile login olur

  Scenario: [TC_01 > US_019] Dashboard sayfasındaki Navbar'da "Transactions" linki gorunurlugu ve islevselligi dogrulanir
    * Dasboard sayfasinda Transactions linki gorulur ve aktifligini dogrular
    * sayfayi kapatir

  Scenario:  [TC_02 > US_019] Transactions linki tıklandığında "My Transactions History" sayfasına yönlendirmeli

    * Transactions linkine tiklanir
    * My Transactions History yazisinin goruntulendigi dogrulanır
    * Sayfayi kapatir


  Scenario:   [TC_03 > US_019] Sayfada Transactions Number  Search Box ,Type altindaki (All,Plus,Minus) menuler
  ,remark altindaki (Any, Application fee, Balance add,Deposit, Loan taken, Withdraw, Withdraw reject) görünür
  ve aktif olmali,filtreleme yapılabililmeli

    * Transactions linkine tiklanir
    * Sayfada Transactions Number  Search Box ,Type,Remark goruntulenir
    * Type altindaki All,Plus,Minus menuler ve remark altindaki Any, Application fee, Balance add,Deposit, Loan taken, Withdraw, Withdraw reject goruntulenir
    * sayfayi kapatir

