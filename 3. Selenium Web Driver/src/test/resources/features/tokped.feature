@tokped
Feature: find product and do scrolling
  Scenario: find product and do scrolling
    Given user already on tokopedia page
    When user search "sepatu" and click search
    Then user redirect to list product page
    And user do scrolling on page