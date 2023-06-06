Feature: Testing functionality of login feature

  Background:
    Given User launched the website already by using url "https://www.linkedin.com/" in chrome browser


  Scenario: User should be logged in successfully using valid credentials
    Given User enters username as "*******@gmail.com" and password as "*******"
    When User clicks login button
    Then User should navigate to main feed page with title as "Feed | LinkedIn"
    And Username should be displayed correctly


#  Scenario Outline: User shouldn't be logged in when using invalid credentials
#    Given User enters username as "<username>" and password as "<password>"
#    When User clicks login button
#    Then User shouldn't navigate to main feed page
#
#    Examples:
#      | username        | password |
#      | one@gmail.com   | password |
#      | two@gmail.com   | password |
#      | three@gmail.com | password |
#      | four@gmail.com  | password |
#      | five@gmail.com  | password |