Feature: Bir yonetici (admin) olarak kullanicilara sunulacak withdrawals methodlarini yonetebilecegim bir sayfanin olmasini istiyorum

  Background:
    * Verilen Url'ye gidilir
    * Username ve password girilir ve login butonuna tiklanirr

  Scenario: Admin panelde side bar uzerinde Withdrawals menu basligi altinda Withdrawal Methods sayfasina erisebilmelidir
    * Withdrawal Methods sayfasinin erisilir oldugu dogrulanir
    * Sayfa kapatilirh

  Scenario: Sayfadaki Withdrawal Methods tablosunda odeme methodlari (Method,Currency,Charge,Withdraw Limit,Status bilgileri ile) goruntulenmelidir
    * Withdrawal Methods butonuna tiklanir
    * Odeme methodlari goruntulenir
    * Sayfa kapatilirh

  Scenario: Withdrawal Methods tablosunda secilen methodu duzenleyebilmek icin Action basligi altindan edit sayfasina erisilebilmelidir
    * Withdrawal Methods butonuna tiklanir
    * Edit sayfasinin erisilir oldugu dogrulanir
    * Sayfa kapatilirh

  Scenario: Edit sayfasinda Withdraw method gecerli bilgiler girilerek Update edilebilmelidir
    * Withdrawal Methods butonuna tiklanir
    * Edit sayfasina gecerli bilgiler girilir ve Submit butonuna tiklanir
    * Sayfa kapatilirh

  Scenario: Withdrawal Methods tablosundaki action basligi altinda secilen methodun gorunurlugu kontrol edilebilmeli
    * Withdrawal Methods butonuna tiklanir
    * Methodun gorunurlugu kontrol edilir
    * Sayfa kapatilirh

  Scenario: Withdrawal Methods sayfasinda yeni bir method create edilebilmelidir
    * Withdrawal Methods butonuna tiklanir
    * Method create edilir
    * Sayfa kapatilirh