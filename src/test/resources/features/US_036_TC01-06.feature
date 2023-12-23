Feature: Bir yonetici (Admin) olarak Loan Plans sayfasina erisip kredi planlari islemlerini yonetebilmek istiyorum

  Background:
    * Verilen Url ile giris saglanir
    * Username ve password girilir ve login butonuna tiklanilmasi saglanir

  Scenario: Yonetici, kredi planlari sayfasina Loan Plans linki ile erisebilmelidir
    * Loan plans butonuna erisilmesi saglanir
    * Sayfa kapatilirh

  Scenario: admin/plans/loans sayfasinda, sistemde kayitli olan mevcut kredi planlarini listelemelidir
            Her bir kredi plani, baslik, faiz orani, vade suresi,kredi limiti gibi temel bilgilerle birlikte goruntulenmelidir
    * Loan plans butonuna tiklanir
    * Kredi planlari goruntulenir
    * Sayfa kapatilirh

  Scenario: Yonetici,yeni bir kredi plani ekleyebilmelidir
            Eklenen kredi planinin baslik, faiz orani, vade suresi, kredi limiti gibi gerekli bilgileri icermesi gerekmelidir
    * Loan plans butonuna tiklanir
    * Add New butonuna tiklanir
    * Gerekli bilgiler girilir
    * Submit butonuna tiklanir
    * Plan added successfully mesaji goruntulenir
    * Sayfa kapatilirh

  Scenario: Yonetici, mevcut kredi planlarinin bilgilerini guncelleyebilmelidir. Guncellenen bilgilerin gecerli olup olmadigi kontrol edilmelidir
    * Loan plans butonuna tiklanir
    * Edit butonuna tiklanir
    * Gerekli duzenlemeler yapilir
    * Plan updated successfully mesaji goruntulenir
    * Sayfa kapatilirh

  Scenario: Yonetici, mevcut bir kredi planını sistemden kaldirabilmelidir
    * Loan plans butonuna tiklanir
    * Mevcut bir kredi plani sistemden kaldirilir
    * Status changed successfully mesaji goruntulenir
    * Sayfa kapatilirh

  Scenario: Sistemde beklenmeyen bir hata meydana geldiginde, kullaniciya anlasilir bir hata mesaji gosterilmelidir
            Hatali girislerde kullanici uygun hata mesajlari ile bilgilendirilmelidir
    * Loan plans butonuna tiklanir
    * Add New butonuna tiklanir
    * Hatali giris yapilir
    * Kullanici uygun hata mesaji ile bilgilendirilir
    * Sayfa kapatilirh

