Feature: To Edit User profile in Demo Cyclos classic payment software Application and do functions

  Scenario: Edit User Profile
    Given User is on Demo Cyclos classic Homepage
    When User click the Signin
    And User proides valid credentials LoginName and Password
    And User click Personal field
    And User click edit option
    And User enter Website
      | Website        |
      | leafground.com |
    And User choose Gender
    And User choose Business type
    Then User click save and should able to see edit success message
