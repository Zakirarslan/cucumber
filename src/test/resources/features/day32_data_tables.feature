@data_table
  Feature:  blue_rentals
    Scenario: TC01_admin_login
      Given user navigates to 'https://www.bluerentalcars.com/login'
      When  user enters admin email and password
      |admin_email|password|
      |jack1@gmail.com|12345|
      And   user clicks on login button(bluerentalcars)
      Then  verify login is successful
      And   close the application