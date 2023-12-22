Feature: Bir yonetici (admin) olarak vadeli kredileri goruntulemek ve islem yapabilmek icin Due Loans sayfasinin olmasini istiyorum.

  Scenario: TC_01 Loans menu basligi altindaki "Due Loans" sayfa linkine tiklandiginda "Due Loans" sayfasina erisilmelidir.
    * Browser acilir
    * "urladmin"e gidilir
    * Anasayfa sağ barda bulunan Loans butonuna tiklar
    * Loans barin altinda Due Loans butonuna tiklar "Due Loans" sayfasi test edilir
    * browser kapatilir

    Scenario: TC_02 Due Loans sayfasinda Due Installment Loans Tablosu (S.N., Loan No.|Plan, User, Amount, Installment Amount, Installment, Created | Next Installment, Status bilgileri ile) goruntulenmelidir.
      * Browser acilir
      * "urladmin"e gidilir
      * Anasayfa sağ barda bulunan Loans butonuna tiklar
      * Loans barin altinda Due Loans butonuna tiklar "Due Loans" sayfasi test edilir
      * Due Installment Loans Tablosu goruntulenmelidir
      * browser kapatilir

      Scenario: TC_03 Due Loans sayfasindaki Due Installment Loans tablosu uzerinde "Loan No ve Start Date - End Date" bilgileri ile arama yapilabilmelidir.
        * Browser acilir
        * "urladmin"e gidilir
        * Anasayfa sağ barda bulunan Loans butonuna tiklar
        * Loans barin altinda Due Loans butonuna tiklar "Due Loans" sayfasi test edilir
        * Due Installment Loans tablosu uzerinde "Loan No ve Start Date - End Date" bilgileri ile arama yapilir
        * browser kapatilir


