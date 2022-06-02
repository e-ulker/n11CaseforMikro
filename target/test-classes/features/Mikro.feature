Feature: n11 automation case

  @mikro
  Scenario:Adding/deleting favourite product
    When user navigates to "https://www.n11.com/" page
    Then verify that the page title is "n11.com - Hayat Sana Gelir"
    When user clicks "Giriş Yap" button
    And user logs in with Facebook
    Then verify that username "Erva Ulker" is visible under My Account
    When user searches for "Iphone"
    Then verify that user sees the results for "Iphone"
    And click the page "2"
    Then verify for "ıphone" results are opened in page "2"
    When user adds the product number "3" on the page to Favourites
    And user clicks to "Favorilerim / Listelerim" button
    Then verify open the "istek-listelerim" page
    Then verify displayed the "Favorilerim / Listelerim" title
    And click the favorilerim button
    Then verify that page title starts with "Favorilerim"
    When user deletes the product from the favorites
    Then verify that "Ürününüz listeden silindi." message is displayed
    When user clicks to "Çıkış Yap" button
    Then verify user log out





































