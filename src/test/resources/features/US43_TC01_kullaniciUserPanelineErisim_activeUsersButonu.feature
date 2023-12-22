
Feature: Admin Dashboard sayfasında bulunan Nawbar'da 'Manage Users'
  linki altında 'Active Users' butonu görünür ve aktif olmalıdır.
  Scenario: Admin dashboard sayfasinda Active Users butonu gorunurluk testi
    Given Admin ana sayfayya gidilir
    Then Gecerli "glyUserKullaniciAdi" ve "adminsmypsswrd" girisi yapilir
    Then Log in butonuna giris tikklanir
    Then Manage User link'ine tiklanir
    Then Active users link'ine tiklanir
    Then Active User text'inin goruntulendigi dogrulaniir
