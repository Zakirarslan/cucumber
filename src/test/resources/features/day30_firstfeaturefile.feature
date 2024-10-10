@google_search @smoke
     Feature:google_search
     Background: navigating_to_google
       Given user is on the google homepage
@iphone
      Scenario: TC_01_iphone_search
      And user search for iphone
      Then  verify the result contains iphone
      And close the application
@teapot
    Scenario: TC_02_teapot_search

     And user search for teapots
     Then  verify the result contains teapot
     And close the application


  # ******** FEATURE FILE **********
# Feature file: Defines the scenarios and test steps in plain English
# All feature files should have .feature extension
# All feature files are written in Gherkin language
# Feature files are used to write test scenarios / test steps
# All feature files must start with Feature keyword
# One feature file can ONLY have one Feature Keyword
# Scenario keyword is used to create test cases
# One feature file can have MANY Scenario
# Each test step should be written in Gherkin language => Given, When, Then, And, But, *

