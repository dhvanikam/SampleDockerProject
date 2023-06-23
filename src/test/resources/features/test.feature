Feature: Launch URL

  Scenario: Verifying user able to launch URL
    Given The user is given URL
    When The user launch the URL as "http://www.google.com"
    Then The user shoul able to navigate to website URL "http://www.google.com"