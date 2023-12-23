
Feature: Bir Kullanici olarak Anasayfada Loan Planlara ulasabilecegim bir sayfa olmasını istiyorum

  Background:
    * Kullanici verilen Url'ye giderh
    * Kullanici login butonuna tiklarh
    * Username ve password girer ve giris dugmesine tiklarh
    * Anasayfaya giderh

  Scenario: Anasayfa ustbarinda Plans linki altinda loan cardlar goruntulenmelidir
    * Plans butonuna tiklanirh
    * Loan cardlar goruntulenirh
    * Sayfa kapatilirh

  Scenario: Basic Loan buton tiklandiğinda acilan cardlarda Basic Loan 1,Test_Loan,Car Loan  basliklari goruntulenmelidir
    * Plans butonuna tiklanirh
    * Basic Loan butonuna tiklarh
    * Loan basliklari goruntulenirh
    * Sayfa kapatilirh

  Scenario: Apply Now Butonu Gorunur ve aktif olmalidir.Tiklandiginda "Apply for 'Secilen card ismi ' "sayfasi acilmalidir
    * Plans butonuna tiklanirh
    * Basic Loan butonuna tiklarh
    * Apply Now butonu gorunur ve aktiftirh
    * Apply Now butonuna tiklanirh
    * Apply for Basic Loan 1 sayfasi acilirh
    * Sayfa kapatilirh

  Scenario: Amount textbox'a digit minimum ve maximum deger araliginda deger girilmelidir
    * Plans butonuna tiklanirh
    * Basic Loan butonuna tiklarh
    * Apply Now butonuna tiklanirh
    * Amount textbox'a minimum ve maximum deger araliginda deger girilirh
    * Sayfa kapatilirh

  Scenario: 'Confirm' butona tiklandiginda 'Application Form' sayfasina gecis yapilmalidir
    * Plans butonuna tiklanirh
    * Basic Loan butonuna tiklarh
    * Apply Now butonuna tiklanirh
    * Amount textbox'a minimum ve maximum deger araliginda deger girilirh
    * Confirm butonuna tiklanirh
    * Application Form sayfasina gecis yaparh
    * Sayfa kapatilirh

  Scenario: 'Apply' buton tiklanabilir ve aktif olmalidir
    * Plans butonuna tiklanirh
    * Basic Loan butonuna tiklarh
    * Apply Now butonuna tiklanirh
    * Amount textbox'a minimum ve maximum deger araliginda deger girilirh
    * Confirm butonuna tiklanirh
    * Application Form sayfasina gecis yaparh
    * Apply butonu tiklanir ve aktiftirh
    * Sayfa kapatilirh

  Scenario: Apply buton tiklandiginda "Loan application submitted successfully" mesajı gorunmelidir
    * Plans butonuna tiklanirh
    * Basic Loan butonuna tiklarh
    * Apply Now butonuna tiklanirh
    * Amount textbox'a minimum ve maximum deger araliginda deger girilirh
    * Confirm butonuna tiklanirh
    * Application Form sayfasina gecis yaparh
    * Apply butonuna tiklanirh
    * Loan application submitted succesfully mesajinin gorundugu dogrulanirh
    * Sayfa kapatilirh
