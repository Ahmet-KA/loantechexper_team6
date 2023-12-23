Feature: Bir yonetici (Admin) olarak tum kullanicilara bildirim gonderebilmek istiyorum

  Background:
    * Verilen Url'ye gidebilmeli
    * Username ve password girilir ve login butonuna tiklanmasi saglanir


  Scenario: Yonetici dashboarda'da Notification to All linki goruntulenebilir ve aktif olmalidir
    * Manage Users butonuna tiklanir
    * Notification to All Linki butonunun gorunur ve aktif oldugu test edilir
    * Sayfa kapatilirh

  Scenario: admin/users/send-notification sayfasinda "Being Sent" basligi altinda filtreleme ikonu bulunmali
            Yonetici isterse tum kullanicilara isterse de secebilecegi kullanicalara konu basligive mesaj iceren belirli baslama tarihi ve period belirleyip mesaj gonderebilmelidir
    * Manage Users butonuna tiklanir
    * Notification to All butonuna tiklanir
    * Being Sent basligi altindaki filtreleme ikonu goruntulenir
    * Secilen kullaniciya mesaj gonderilir
    * Sayfa kapatilirh


  Scenario: Basarili bir gonderme islemini belirten uyari mesaji almalidir
    * Manage Users butonuna tiklanir
    * Notification to All butonuna tiklanir
    * Being Sent basligi altindaki filtreleme ikonu goruntulenir
    * Secilen kullaniciya mesaj gonderilir
    * Done mesaji goruntulenir
    * Sayfa kapatilirh


