Feature: Bank Customers

  Scenario: Check and verify number of customers
    Given user navigates to the login page
    And selects the Bank Manager Login CTA
    And selects the Customers CTA
    And the user sees the table with the customer records
    When the user deletes a record
    Then the user verifies that the records are with one less