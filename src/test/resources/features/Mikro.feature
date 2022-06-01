Feature: n11 case

  @mikro
  Scenario:N11 login
 #   Given user goes to "https://www.n11.com/" pagee
 #   Then verify user in homepage
 #   When user clicks "Giriş Yap" button
 #   And click Facebook ile giriş yap button for login with facebook account


 #   And user logs in with "ekay62682@gmail.com" andd "e123456k"
 #   Then verify user login in the webpage
 #   When user write "Iphone" in searchBox
 #   Then user should see the "Iphone" results

  #Scenario: caseler devamı
  #  When the user goes to "https://www.n11.com/" pagee
  #  Then verify user in homepage
  #  And user clicks "Giriş Yap" button
  #  And user logs in with "elifulker1521@gmail.com" andd "e123456u"
  #  When user write "Iphone" in searchBox
  #  Then user should see the "Iphone" results

  @mikro
  Scenario: caseler devamı
    When user goes to "https://www.n11.com/" pagee
    Then verify user in homepage
    When user clicks "Giriş Yap" button
    And click Facebook ile giriş yap button for login with facebook account
    Then verify user login in the webpage
    When user write "Iphone" in searchBox
    Then user should see the "Iphone" results
    And click the page "2"
    Then verify for "ıphone" results are opened in page "2"
    When user add "3"th product in favorite
    And user clicks to "Favorilerim / Listelerim" button
    Then verify open the "istek-listelerim" page
    Then verify displayed the "Favorilerim / Listelerim" title
    And click the favorilerim button
    Then verify user in Favorilerim page
    When user delete the product
    Then verify the product is deleted




















  #assertfalse favorilerimin boş olduğunu kontrol et


















  #Scenario: verifying expected environment //tc18
   # Given click "Add Mention" icon
   # Then add mention window is displayed
   # And  inside the window There are no items message is displayed
   # And  Recent, Employees and departments options are visible